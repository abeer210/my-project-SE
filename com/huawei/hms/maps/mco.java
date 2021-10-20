package com.huawei.hms.maps;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import vigqyno.C0201;

public final class mco {
    private static StringBuffer a = new StringBuffer();
    private static final Pattern b = Pattern.compile(C0201.m82(30872));

    private static String a(long j) {
        return new SimpleDateFormat(C0201.m82(30873)).format(new Date(j));
    }

    private static String a(String str) {
        if (str == null) {
            return C0201.m82(30874);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 0;
        if (stackTrace.length > 5) {
            i = stackTrace[5].getLineNumber();
        }
        return C0201.m82(30875) + str + C0201.m82(30876) + i;
    }

    public static void a(String str, String str2) {
        mcp.a(a(str), str2);
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void b(String str, String str2) {
        mcp.b(a(str), str2);
    }

    public static void c(String str, String str2) {
        mcp.c(a(str), str2);
        e(str, b(str2));
    }

    public static void d(String str, String str2) {
        mcp.d(a(str), str2);
        e(str, b(str2));
    }

    private static void e(String str, String str2) {
        StringBuffer stringBuffer;
        if (TextUtils.isEmpty(str)) {
            str = C0201.m82(30877);
        }
        int length = a.length();
        String r1 = C0201.m82(30878);
        String r2 = C0201.m82(30879);
        if (length == 0) {
            stringBuffer = a;
        } else {
            stringBuffer = a;
            stringBuffer.append(C0201.m82(30880));
        }
        stringBuffer.append(a(System.currentTimeMillis()));
        stringBuffer.append(r2);
        stringBuffer.append(str);
        stringBuffer.append(r1);
        stringBuffer.append(str2);
        if (a.length() > 3072) {
            a.setLength(0);
        }
    }
}
