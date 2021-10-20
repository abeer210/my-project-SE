package com.dynatrace.android.agent;

import android.content.Context;
import defpackage.n20;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* compiled from: AdkSettings */
public final class b {
    private static final String j = (u.b + C0201.m82(2572));
    public static String k;
    public static String l;
    public static String m;
    private static b n = new b();
    public AtomicBoolean a = new AtomicBoolean(false);
    public AtomicBoolean b = new AtomicBoolean(true);
    public int c = 1;
    public k20 d = null;
    public boolean e = false;
    public boolean f = false;
    private Context g;
    private b20 h;
    private volatile n20 i;

    static {
        String r0 = C0201.m82(2573);
        k = r0;
        l = r0;
        m = r0;
    }

    private b() {
        n20.b bVar = new n20.b();
        bVar.D(1);
        i(bVar.r());
    }

    public static String a() {
        return C0201.m82(2574);
    }

    public static b d() {
        return n;
    }

    public b20 b() {
        return this.h;
    }

    public Context c() {
        return this.g;
    }

    public n20 e() {
        return this.i;
    }

    public q20 f() {
        return this.i.C();
    }

    public void g(boolean z) {
        this.b.set(z);
        this.d.n(z);
    }

    public void h(b20 b20, Context context) {
        this.h = b20;
        this.e = b20.o;
        this.f = b20.p;
        if (context != null && this.g != context.getApplicationContext()) {
            Context applicationContext = context.getApplicationContext();
            this.g = applicationContext;
            String charSequence = applicationContext.getApplicationInfo().loadLabel(this.g.getPackageManager()).toString();
            l = charSequence;
            l = s30.o(charSequence, 250);
            m = this.g.getPackageName();
            k20 a2 = k20.a(this.g, new o20(b20.a));
            this.d = a2;
            this.b.set(a2.c());
        }
    }

    public void i(n20 n20) {
        if (u.c) {
            String str = j;
            s30.r(str, C0201.m82(2575) + n20);
        }
        this.i = n20;
    }
}
