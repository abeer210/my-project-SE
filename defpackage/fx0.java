package defpackage;

import defpackage.kv0;

/* renamed from: fx0  reason: default package */
public final class fx0 implements ow0 {
    private final qw0 a;
    private final gx0 b;

    public fx0(qw0 qw0, String str, Object[] objArr) {
        this.a = qw0;
        this.b = new gx0(qw0.getClass(), str, objArr);
    }

    public final int a() {
        return this.b.e;
    }

    public final gx0 b() {
        return this.b;
    }

    public final int c() {
        return this.b.h;
    }

    public final int d() {
        return this.b.i;
    }

    public final int e() {
        return this.b.j;
    }

    public final int f() {
        return this.b.m;
    }

    public final int[] g() {
        return this.b.n;
    }

    public final int h() {
        return this.b.l;
    }

    public final int i() {
        return this.b.k;
    }

    @Override // defpackage.ow0
    public final qw0 n() {
        return this.a;
    }

    @Override // defpackage.ow0
    public final int o() {
        return (this.b.d & 1) == 1 ? kv0.e.i : kv0.e.j;
    }

    @Override // defpackage.ow0
    public final boolean p() {
        return (this.b.d & 2) == 2;
    }
}
