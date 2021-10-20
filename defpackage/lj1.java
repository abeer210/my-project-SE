package defpackage;

import java.io.IOException;

/* renamed from: lj1  reason: default package */
public final class lj1 extends bp1<lj1> {
    public String c = null;
    public Long d = null;
    public bj1 e = null;
    public String f = null;
    public hj1 g = null;
    private cj1 h = null;

    public lj1() {
        this.a = -1;
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 10) {
                this.c = yo1.b();
            } else if (l == 16) {
                this.d = Long.valueOf(yo1.n());
            } else if (l == 26) {
                if (this.e == null) {
                    this.e = new bj1();
                }
                yo1.d(this.e);
            } else if (l == 50) {
                this.f = yo1.b();
            } else if (l == 130) {
                if (this.g == null) {
                    this.g = new hj1();
                }
                yo1.d(this.g);
            } else if (l == 138) {
                if (this.h == null) {
                    this.h = new cj1();
                }
                yo1.d(this.h);
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        String str = this.c;
        if (str != null) {
            zo1.d(1, str);
        }
        Long l = this.d;
        if (l != null) {
            zo1.t(2, l.longValue());
        }
        bj1 bj1 = this.e;
        if (bj1 != null) {
            zo1.c(3, bj1);
        }
        String str2 = this.f;
        if (str2 != null) {
            zo1.d(6, str2);
        }
        hj1 hj1 = this.g;
        if (hj1 != null) {
            zo1.c(16, hj1);
        }
        cj1 cj1 = this.h;
        if (cj1 != null) {
            zo1.c(17, cj1);
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h2 = super.h();
        String str = this.c;
        if (str != null) {
            h2 += zo1.h(1, str);
        }
        Long l = this.d;
        if (l != null) {
            h2 += zo1.m(2, l.longValue());
        }
        bj1 bj1 = this.e;
        if (bj1 != null) {
            h2 += zo1.g(3, bj1);
        }
        String str2 = this.f;
        if (str2 != null) {
            h2 += zo1.h(6, str2);
        }
        hj1 hj1 = this.g;
        if (hj1 != null) {
            h2 += zo1.g(16, hj1);
        }
        cj1 cj1 = this.h;
        return cj1 != null ? h2 + zo1.g(17, cj1) : h2;
    }
}
