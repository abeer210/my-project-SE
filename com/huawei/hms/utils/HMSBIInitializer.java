package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.hms.HiAnalyticsConf;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.stats.a;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

public class HMSBIInitializer {
    private static final String ADDRESS_GROUP = null;
    private static final String INNER_SERVICE_HA_ISSUE = null;
    private static final Object LOCK_OBJECT = new Object();
    private static final String META_BI_SETTING = null;
    private static final String SERVICES_PACKAGE = null;
    private static final String TAG = null;
    private static HMSBIInitializer instance;
    private HiAnalyticsConf.Builder builder;
    private final Context context;
    private AtomicBoolean inInit = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    public class GRSTask extends AsyncTask<String, Integer, Void> {
        private GRSTask() {
        }

        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.doInitBI(strArr[0]);
            return null;
        }
    }

    static {
        C0201.m83(HMSBIInitializer.class, 325);
    }

    private HMSBIInitializer(Context context2) {
        this.context = context2;
        this.builder = new HiAnalyticsConf.Builder(context2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void doInitBI(String str) {
        HMSLog.i(C0201.m82(25023), C0201.m82(25024));
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.context, grsBaseInfo).ayncGetGrsUrl(C0201.m82(25025), C0201.m82(25026), new IQueryUrlCallBack() {
            /* class com.huawei.hms.utils.HMSBIInitializer.AnonymousClass1 */

            @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
            public void onCallBackFail(int i) {
                HMSLog.e(C0201.m82(27488), C0201.m82(27487) + i);
                HMSBIInitializer.this.inInit.set(false);
            }

            @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    HMSBIInitializer.this.builder.setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(0, str).setCollectURL(1, str).setAppID(C0201.m82(27489)).create();
                    HMSLog.i(C0201.m82(27490), C0201.m82(27491));
                }
                HMSBIInitializer.this.inInit.set(false);
            }
        });
    }

    public static HMSBIInitializer getInstance(Context context2) {
        synchronized (LOCK_OBJECT) {
            if (instance == null) {
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    instance = new HMSBIInitializer(applicationContext);
                } else {
                    instance = new HMSBIInitializer(context2);
                }
            }
        }
        return instance;
    }

    public void initBI() {
        boolean b = a.b();
        String r2 = C0201.m82(25028);
        HMSLog.i(r2, C0201.m82(25027) + b);
        if (!b && !AnalyticsSwitchHolder.isAnalyticsDisabled(this.context) && this.inInit.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.context);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if (C0201.m82(25029).equalsIgnoreCase(issueCountryCode) || TextUtils.isEmpty(issueCountryCode)) {
                HMSLog.e(r2, C0201.m82(25030));
                this.inInit.set(false);
                return;
            }
            new GRSTask().execute(issueCountryCode);
        }
    }

    public boolean isInit() {
        return a.b();
    }
}
