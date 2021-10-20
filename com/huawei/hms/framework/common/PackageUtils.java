package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.PackageManager;
import vigqyno.C0201;

public class PackageUtils {
    private static final String TAG = null;

    static {
        C0201.m83(PackageUtils.class, 628);
    }

    public static String getVersionName(Context context) {
        String r0 = C0201.m82(1467);
        if (context == null) {
            return r0;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.w(C0201.m82(1468), r0, e);
            return r0;
        }
    }
}
