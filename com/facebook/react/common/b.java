package com.facebook.react.common;

import android.net.Uri;
import vigqyno.C0201;

/* compiled from: DebugServerException */
public class b extends RuntimeException {
    public b(String str, Throwable th) {
        super(str, th);
    }

    public static b a(String str, String str2, String str3, Throwable th) {
        String replace = C0201.m82(20517).replace(C0201.m82(20518), String.valueOf(Uri.parse(str).getPort()));
        return new b(str2 + replace + str3, th);
    }

    public static b b(String str, String str2, Throwable th) {
        return a(str, str2, C0201.m82(20519), th);
    }
}
