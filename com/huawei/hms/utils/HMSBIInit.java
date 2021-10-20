package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hianalytics.hms.HiAnalyticsConf;
import com.huawei.hms.stats.a;
import vigqyno.C0201;

public class HMSBIInit {
    private static final String TAG = null;

    static {
        C0201.m83(HMSBIInit.class, 260);
    }

    public static <T> T checkNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public void init(Context context, boolean z, boolean z2, boolean z3, String str) {
        checkNonNull(context, C0201.m82(13006));
        new HiAnalyticsConf.Builder(context).setEnableImei(z).setEnableUDID(z2).setEnableSN(z3).setCollectURL(0, str).create();
    }

    public boolean isInit() {
        return a.b();
    }

    public void refresh(Context context, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        checkNonNull(context, C0201.m82(13007));
        new HiAnalyticsConf.Builder(context).setEnableImei(z).setEnableUDID(z2).setEnableSN(z3).setCollectURL(0, str).refresh(z4);
    }
}
