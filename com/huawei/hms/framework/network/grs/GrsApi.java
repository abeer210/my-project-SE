package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class GrsApi {
    private static final String TAG = null;
    private static GrsClient grsClient;

    static {
        C0201.m83(GrsApi.class, 705);
    }

    public static void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.w(C0201.m82(27244), C0201.m82(27245));
            return;
        }
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else {
            grsClient2.ayncGetGrsUrl(str, str2, iQueryUrlCallBack);
        }
    }

    public static void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(C0201.m82(27246), C0201.m82(27247));
            return;
        }
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else {
            grsClient2.ayncGetGrsUrls(str, iQueryUrlsCallBack);
        }
    }

    public static void clearSp() {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 == null) {
            Logger.w(C0201.m82(27248), C0201.m82(27249));
        } else {
            grsClient2.clearSp();
        }
    }

    public static boolean forceExpire() {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 != null) {
            return grsClient2.forceExpire();
        }
        Logger.w(C0201.m82(27250), C0201.m82(27251));
        return false;
    }

    @Deprecated
    public static CountryCodeBean getCountryCode(Context context, boolean z) {
        return a.a(context, z);
    }

    public static int grsSdkInit(Context context, GrsBaseInfo grsBaseInfo) {
        grsClient = new GrsClient(context, grsBaseInfo);
        return 0;
    }

    public static String synGetGrsUrl(String str, String str2) {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 != null && str != null && str2 != null) {
            return grsClient2.synGetGrsUrl(str, str2);
        }
        Logger.w(C0201.m82(27252), C0201.m82(27253));
        return null;
    }

    public static Map<String, String> synGetGrsUrls(String str) {
        GrsClient grsClient2 = grsClient;
        if (grsClient2 != null && str != null) {
            return grsClient2.synGetGrsUrls(str);
        }
        Logger.w(C0201.m82(27254), C0201.m82(27255));
        return new HashMap();
    }
}
