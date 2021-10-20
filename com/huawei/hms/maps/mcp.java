package com.huawei.hms.maps;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import vigqyno.C0201;

public final class mcp {
    private static final Pattern a = Pattern.compile(C0201.m82(30783));

    private static String a(String str) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.d(str, a(str2));
        }
    }

    public static void b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.i(str, a(str2));
        }
    }

    public static void c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.w(str, a(str2));
        }
    }

    public static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Log.e(str, a(str2));
        }
    }
}
