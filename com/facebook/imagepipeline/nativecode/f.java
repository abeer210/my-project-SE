package com.facebook.imagepipeline.nativecode;

import vigqyno.C0201;

/* compiled from: WebpTranscoderFactory */
public class f {
    private static e a;

    static {
        try {
            a = (e) Class.forName(C0201.m82(32672)).newInstance();
        } catch (Throwable unused) {
        }
    }

    public static e a() {
        return a;
    }
}
