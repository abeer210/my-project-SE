package defpackage;

import android.content.Context;
import android.net.Uri;
import vigqyno.C0201;

/* renamed from: f71  reason: default package */
public final class f71 {
    private final Uri a;
    private final String b;
    private final String c;

    public f71(Uri uri) {
        this(null, uri, C0201.m82(25519), C0201.m82(25520), false, false, false, false, null);
    }

    public final y61<Double> b(String str, double d) {
        return y61.f(this, str, -3.0d);
    }

    public final y61<Boolean> c(String str, boolean z) {
        return y61.i(this, str, z);
    }

    public final y61<Long> f(String str, long j) {
        return y61.g(this, str, j);
    }

    public final y61<String> g(String str, String str2) {
        return y61.h(this, str, str2);
    }

    private f71(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, j71<Context, Boolean> j71) {
        this.a = uri;
        this.b = str2;
        this.c = str3;
    }
}
