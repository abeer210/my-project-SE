package com.huawei.hms.support.api.a.c;

import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: HMSLocationLog */
public class b {
    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String r1 = C0201.m82(17434);
        sb.append(r1);
        sb.append(str);
        sb.append(r1);
        sb.append(str2);
        return sb.toString();
    }

    public static void b(String str, String str2, String str3) {
        HMSLog.i(str, a(str2, str3));
    }

    public static void c(String str, String str2, String str3) {
        HMSLog.w(str, a(str2, str3));
    }

    public static void d(String str, String str2, String str3) {
        HMSLog.e(str, a(str2, str3));
    }

    public static void a(String str, String str2, String str3) {
        HMSLog.d(str, a(str2, str3));
    }
}
