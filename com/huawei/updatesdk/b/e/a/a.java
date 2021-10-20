package com.huawei.updatesdk.b.e.a;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import vigqyno.C0201;

public final class a {
    private static final String a = null;
    private static String b;

    static {
        C0201.m83(a.class, 659);
    }

    public static String a() {
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            String packageName = com.huawei.updatesdk.a.b.a.a.c().a().getPackageName();
            PackageInfo packageInfo = com.huawei.updatesdk.a.b.a.a.c().a().getPackageManager().getPackageInfo(com.huawei.updatesdk.a.b.a.a.c().a().getPackageName(), 0);
            if (packageInfo != null) {
                packageName = packageName + packageInfo.versionName;
            }
            String str2 = Build.BRAND;
            if (TextUtils.isEmpty(str2)) {
                str2 = C0201.m82(21433);
            }
            a(packageName + C0201.m82(21434) + str2);
            return b;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.b.a.a.a.b(a, C0201.m82(21435) + e.toString());
            return null;
        }
    }

    private static void a(String str) {
        b = str;
    }
}
