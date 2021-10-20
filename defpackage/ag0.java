package defpackage;

import android.net.Uri;

/* renamed from: ag0  reason: default package */
/* compiled from: FetchState */
public class ag0 {
    private final sf0<af0> a;
    private final sg0 b;
    private long c = 0;
    private int d;
    private nd0 e;

    public ag0(sf0<af0> sf0, sg0 sg0) {
        this.a = sf0;
        this.b = sg0;
    }

    public sf0<af0> a() {
        return this.a;
    }

    public sg0 b() {
        return this.b;
    }

    public String c() {
        return this.b.t();
    }

    public long d() {
        return this.c;
    }

    public ug0 e() {
        return this.b.f();
    }

    public int f() {
        return this.d;
    }

    public nd0 g() {
        return this.e;
    }

    public Uri h() {
        return this.b.c().q();
    }

    public void i(long j) {
        this.c = j;
    }

    public void j(int i) {
        this.d = i;
    }

    public void k(nd0 nd0) {
        this.e = nd0;
    }
}
