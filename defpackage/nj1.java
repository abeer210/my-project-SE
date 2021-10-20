package defpackage;

import java.io.IOException;

/* renamed from: nj1  reason: default package */
public final class nj1 extends bp1<nj1> {
    private static volatile nj1[] g;
    public ej1 c = null;
    public Integer d = null;
    public ij1 e = null;
    private dj1 f = null;

    public nj1() {
        this.a = -1;
    }

    public static nj1[] j() {
        if (g == null) {
            synchronized (fp1.b) {
                if (g == null) {
                    g = new nj1[0];
                }
            }
        }
        return g;
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
                    this.c = new ej1();
                }
                yo1.d(this.c);
            } else if (l == 16) {
                this.d = Integer.valueOf(yo1.m());
            } else if (l == 130) {
                if (this.e == null) {
                    this.e = new ij1();
                }
                yo1.d(this.e);
            } else if (l == 138) {
                if (this.f == null) {
                    this.f = new dj1();
                }
                yo1.d(this.f);
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        ej1 ej1 = this.c;
        if (ej1 != null) {
            zo1.c(1, ej1);
        }
        Integer num = this.d;
        if (num != null) {
            zo1.p(2, num.intValue());
        }
        ij1 ij1 = this.e;
        if (ij1 != null) {
            zo1.c(16, ij1);
        }
        dj1 dj1 = this.f;
        if (dj1 != null) {
            zo1.c(17, dj1);
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        ej1 ej1 = this.c;
        if (ej1 != null) {
            h += zo1.g(1, ej1);
        }
        Integer num = this.d;
        if (num != null) {
            h += zo1.s(2, num.intValue());
        }
        ij1 ij1 = this.e;
        if (ij1 != null) {
            h += zo1.g(16, ij1);
        }
        dj1 dj1 = this.f;
        return dj1 != null ? h + zo1.g(17, dj1) : h;
    }
}
