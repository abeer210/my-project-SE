package com.huawei.hms.framework.common.hianalytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.v2.HiAnalytics;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import vigqyno.C0201;

public class HianalyticsHelper {
    private static final String EVENT_ID = null;
    private static final String HWID_HA_SERVICE_TAG = null;
    private static final String TAG = null;
    private static final int TYPE_MAINTF = 0;
    private static final String USER_EXPERIENCE_INVOLVED = null;
    private static final int USER_EXPERIENCE_ON = 0;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile HianalyticsHelper instance;
    private HiAnalyticsInstance hInstance = null;
    private String haTag = C0201.m82(39037);
    private boolean hasHianalytics;
    private ExecutorService reportExecutor = ExecutorsUtils.newSingleThreadExecutor(C0201.m82(39038));

    static {
        C0201.m83(HianalyticsHelper.class, 338);
    }

    private HianalyticsHelper() {
        try {
            HiAnalytics.getInitFlag();
            this.hasHianalytics = true;
        } catch (Throwable unused) {
            Logger.w(C0201.m82(39039), C0201.m82(39040));
            this.hasHianalytics = false;
        }
    }

    public static HianalyticsHelper getInstance() {
        if (instance == null) {
            synchronized (HianalyticsHelper.class) {
                if (instance == null) {
                    instance = new HianalyticsHelper();
                }
            }
        }
        return instance;
    }

    public ExecutorService getReportExecutor() {
        return this.reportExecutor;
    }

    public boolean isEnableReport(Context context) {
        if (!this.hasHianalytics) {
            return false;
        }
        return isEnableReportNoSeed(context);
    }

    public boolean isEnableReportNoSeed(Context context) {
        String r5;
        boolean z = this.hasHianalytics;
        String r1 = C0201.m82(39041);
        if (!z) {
            r5 = C0201.m82(39042);
        } else if (context == null) {
            r5 = C0201.m82(39043);
        } else if (Settings.Secure.getInt(context.getContentResolver(), C0201.m82(39044), -1) != 1) {
            r5 = C0201.m82(39045);
        } else if (HiAnalytics.getInitFlag()) {
            return true;
        } else {
            if (this.hInstance == null) {
                this.hInstance = HiAnalyticsManager.getInstanceByTag(this.haTag);
            }
            return this.hInstance != null;
        }
        Logger.i(r1, r5);
        return false;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
        onEvent(linkedHashMap, C0201.m82(39046));
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
        if (this.hasHianalytics && linkedHashMap != null) {
            Logger.v(C0201.m82(39047), C0201.m82(39048), linkedHashMap);
            if (HiAnalytics.getInitFlag()) {
                HiAnalytics.onEvent(1, str, linkedHashMap);
                return;
            }
            HiAnalyticsInstance hiAnalyticsInstance = this.hInstance;
            if (hiAnalyticsInstance != null) {
                hiAnalyticsInstance.onEvent(1, str, linkedHashMap);
            }
        }
    }

    public void setHaTag(String str) {
        this.haTag = str;
    }
}
