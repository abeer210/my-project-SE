package com.huawei.hms.framework.network.grs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.BasePlugin;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.PluginInterceptor;
import java.io.IOException;
import java.util.Locale;
import vigqyno.C0201;

public class GrsManager implements BasePlugin {
    private static final int GRS_KEY_INDEX = 0;
    private static final int GRS_PATH_INDEX = 0;
    private static final String GRS_SCHEMA = null;
    private static final int GRS_SERVICE_INDEX = 0;
    private static final int MAX_GRS_SPLIT = 0;
    private static final String SEPARATOR = null;
    private static final String TAG = null;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile GrsManager instance;
    private GrsConfig grsConfig;
    private f grsInterceptor;

    static {
        C0201.m83(GrsManager.class, 544);
    }

    private GrsManager() {
    }

    public static GrsManager getInstance() {
        if (instance == null) {
            synchronized (GrsManager.class) {
                if (instance == null) {
                    instance = new GrsManager();
                }
            }
        }
        return instance;
    }

    private String getServiceNameUrl(String str, String str2) {
        return GrsApi.synGetGrsUrl(str, str2);
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith(C0201.m82(27224));
    }

    private String[] parseGRSSchema(String str) {
        return StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf(C0201.m82(27225)) + 6).split(C0201.m82(27226), 3);
    }

    public PluginInterceptor getInterceptor() {
        if (this.grsInterceptor == null) {
            this.grsInterceptor = new f();
        }
        return this.grsInterceptor;
    }

    public boolean initGrs(Context context, GrsConfig grsConfig2) {
        GrsConfig grsConfig3 = this.grsConfig;
        if (grsConfig3 != null && grsConfig3.equal(grsConfig2)) {
            return true;
        }
        this.grsConfig = grsConfig2;
        GrsBaseInfo grsBaseInfo = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        GrsConfig grsConfig4 = this.grsConfig;
        if (grsConfig4 != null) {
            grsBaseInfo = grsConfig4.getGrsBaseInfo(applicationContext);
        }
        GrsApi.grsSdkInit(applicationContext, grsBaseInfo);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    public String parseGrs(String str) {
        String str2;
        String str3;
        String str4;
        String r0 = C0201.m82(27227);
        if (str.endsWith(r0)) {
            str = StringUtils.substring(str, str.indexOf(C0201.m82(27228)), str.length() - 1);
        }
        String[] parseGRSSchema = parseGRSSchema(str);
        if (parseGRSSchema.length == 1) {
            str3 = parseGRSSchema[0];
            str4 = C0201.m82(27229);
        } else if (parseGRSSchema.length >= 2) {
            str3 = parseGRSSchema[0];
            str4 = parseGRSSchema[1];
        } else {
            Logger.i(C0201.m82(27230), C0201.m82(27231));
            str2 = C0201.m82(27232);
            if (!TextUtils.isEmpty(str2)) {
                throw new IOException(C0201.m82(27233));
            } else if (parseGRSSchema.length <= 2) {
                return str2;
            } else {
                if (str2.endsWith(r0)) {
                    return str2 + parseGRSSchema[2];
                }
                return str2 + r0 + parseGRSSchema[2];
            }
        }
        str2 = getServiceNameUrl(str3, str4);
        if (!TextUtils.isEmpty(str2)) {
        }
    }
}
