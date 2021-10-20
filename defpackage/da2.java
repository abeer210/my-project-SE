package defpackage;

/* renamed from: da2  reason: default package */
/* compiled from: BoundingBox */
public final class da2 {
    private final c72 a;
    private final v62 b;
    private final v62 c;
    private final v62 d;
    private final v62 e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public da2(c72 c72, v62 v62, v62 v622, v62 v623, v62 v624) throws o62 {
        boolean z = false;
        boolean z2 = v62 == null || v622 == null;
        z = (v623 == null || v624 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                v62 = new v62(0.0f, v623.d());
                v622 = new v62(0.0f, v624.d());
            } else if (z) {
                v623 = new v62((float) (c72.l() - 1), v62.d());
                v624 = new v62((float) (c72.l() - 1), v622.d());
            }
            this.a = c72;
            this.b = v62;
            this.c = v622;
            this.d = v623;
            this.e = v624;
            this.f = (int) Math.min(v62.c(), v622.c());
            this.g = (int) Math.max(v623.c(), v624.c());
            this.h = (int) Math.min(v62.d(), v623.d());
            this.i = (int) Math.max(v622.d(), v624.d());
            return;
        }
        throw o62.a();
    }

    public static da2 j(da2 da2, da2 da22) throws o62 {
        if (da2 == null) {
            return da22;
        }
        return da22 == null ? da2 : new da2(da2.a, da2.b, da2.c, da22.d, da22.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    public da2 a(int i2, int i3, boolean z) throws o62 {
        v62 v62;
        v62 v622;
        v62 v623;
        v62 v624;
        v62 v625 = this.b;
        v62 v626 = this.c;
        v62 v627 = this.d;
        v62 v628 = this.e;
        if (i2 > 0) {
            v62 v629 = z ? v625 : v627;
            int d2 = ((int) v629.d()) - i2;
            if (d2 < 0) {
                d2 = 0;
            }
            v62 v6210 = new v62(v629.c(), (float) d2);
            if (z) {
                v622 = v6210;
            } else {
                v62 = v6210;
                v622 = v625;
                if (i3 <= 0) {
                    v62 v6211 = z ? this.c : this.e;
                    int d3 = ((int) v6211.d()) + i3;
                    if (d3 >= this.a.g()) {
                        d3 = this.a.g() - 1;
                    }
                    v62 v6212 = new v62(v6211.c(), (float) d3);
                    if (z) {
                        v624 = v6212;
                    } else {
                        v623 = v6212;
                        v624 = v626;
                        return new da2(this.a, v622, v624, v62, v623);
                    }
                } else {
                    v624 = v626;
                }
                v623 = v628;
                return new da2(this.a, v622, v624, v62, v623);
            }
        } else {
            v622 = v625;
        }
        v62 = v627;
        if (i3 <= 0) {
        }
        v623 = v628;
        return new da2(this.a, v622, v624, v62, v623);
    }

    public v62 b() {
        return this.c;
    }

    public v62 c() {
        return this.e;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.h;
    }

    public v62 h() {
        return this.b;
    }

    public v62 i() {
        return this.d;
    }

    public da2(da2 da2) {
        this.a = da2.a;
        this.b = da2.h();
        this.c = da2.b();
        this.d = da2.i();
        this.e = da2.c();
        this.f = da2.f();
        this.g = da2.d();
        this.h = da2.g();
        this.i = da2.e();
    }
}
