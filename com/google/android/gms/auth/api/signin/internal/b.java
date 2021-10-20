package com.google.android.gms.auth.api.signin.internal;

import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class b {
    private static int b;
    private int a = 1;

    static {
        C0201.m83(b.class, 565);
    }

    public b a(Object obj) {
        this.a = (b * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.a;
    }

    public final b c(boolean z) {
        this.a = (b * this.a) + (z ? 1 : 0);
        return this;
    }
}
