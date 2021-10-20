package defpackage;

import java.io.IOException;

/* renamed from: oj1  reason: default package */
public final class oj1 extends bp1<oj1> {
    private fj1 c = null;
    public lj1 d = null;
    public jj1 e = null;
    private Integer f = null;

    public oj1() {
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
                if (this.c == null) {
                    this.c = new fj1();
                }
                yo1.d(this.c);
            } else if (l == 18) {
                if (this.d == null) {
                    this.d = new lj1();
                }
                yo1.d(this.d);
            } else if (l == 26) {
                if (this.e == null) {
                    this.e = new jj1();
                }
                yo1.d(this.e);
            } else if (l == 32) {
                this.f = Integer.valueOf(yo1.m());
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        fj1 fj1 = this.c;
        if (fj1 != null) {
            zo1.c(1, fj1);
        }
        lj1 lj1 = this.d;
        if (lj1 != null) {
            zo1.c(2, lj1);
        }
        jj1 jj1 = this.e;
        if (jj1 != null) {
            zo1.c(3, jj1);
        }
        Integer num = this.f;
        if (num != null) {
            zo1.p(4, num.intValue());
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        fj1 fj1 = this.c;
        if (fj1 != null) {
            h += zo1.g(1, fj1);
        }
        lj1 lj1 = this.d;
        if (lj1 != null) {
            h += zo1.g(2, lj1);
        }
        jj1 jj1 = this.e;
        if (jj1 != null) {
            h += zo1.g(3, jj1);
        }
        Integer num = this.f;
        return num != null ? h + zo1.s(4, num.intValue()) : h;
    }
}
