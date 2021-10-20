package com.google.android.gms.measurement.internal;

public final class m3 {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final /* synthetic */ k3 d;

    public m3(k3 k3Var, int i, boolean z, boolean z2) {
        this.d = k3Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str, Object obj) {
        this.d.A(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void b(String str, Object obj, Object obj2) {
        this.d.A(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void c(String str, Object obj, Object obj2, Object obj3) {
        this.d.A(this.a, this.b, this.c, str, obj, obj2, obj3);
    }

    public final void d(String str) {
        this.d.A(this.a, this.b, this.c, str, null, null, null);
    }
}
