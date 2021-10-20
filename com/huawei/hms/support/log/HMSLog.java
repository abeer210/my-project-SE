package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.base.log.a;
import vigqyno.C0201;

public class HMSLog {
    private static final a a = new a();

    private static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String r1 = C0201.m82(20106);
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return C0201.m82(20107) + packageInfo.versionName + C0201.m82(20108) + packageInfo.versionCode + C0201.m82(20109);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return r1;
    }

    public static void d(String str, String str2) {
        a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        a.a(4, str, str2);
    }

    public static void init(Context context, int i, String str) {
        a.a(context, i, str);
        StringBuilder sb = new StringBuilder();
        String r0 = C0201.m82(20114);
        sb.append(r0);
        sb.append('\n');
        sb.append(C0201.m82(20115));
        sb.append(a(context));
        sb.append('\n');
        sb.append(r0);
        a.a(str, sb.toString());
    }

    public static boolean isErrorEnable() {
        return a.a(6);
    }

    public static boolean isInfoEnable() {
        return a.a(4);
    }

    public static boolean isWarnEnable() {
        return a.a(5);
    }

    public static void w(String str, String str2) {
        a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        a.a(6, str, str2, th);
    }

    public static void e(String str, long j, String str2) {
        a aVar = a;
        aVar.a(6, str, C0201.m82(20110) + j + C0201.m82(20111) + str2);
    }

    public static void e(String str, long j, String str2, Throwable th) {
        a aVar = a;
        aVar.a(6, str, C0201.m82(20112) + j + C0201.m82(20113) + str2, th);
    }
}
