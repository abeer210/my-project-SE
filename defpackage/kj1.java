package defpackage;

import java.io.IOException;

/* renamed from: kj1  reason: default package */
public final class kj1 extends bp1<kj1> {
    private yi1 c;
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Long g = null;

    public kj1() {
        this.a = -1;
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 8) {
                int a = yo1.a();
                int m = yo1.m();
                if (m == 0 || m == 1 || m == 2 || m == 3) {
                    this.c = yi1.b(m);
                } else {
                    yo1.j(a);
                    i(yo1, l);
                }
            } else if (l == 16) {
                this.d = Long.valueOf(yo1.n());
            } else if (l == 24) {
                this.e = Long.valueOf(yo1.n());
            } else if (l == 32) {
                this.g = Long.valueOf(yo1.n());
            } else if (l == 40) {
                this.f = Long.valueOf(yo1.n());
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        yi1 yi1 = this.c;
        if (!(yi1 == null || yi1 == null)) {
            zo1.p(1, yi1.a());
        }
        Long l = this.d;
        if (l != null) {
            zo1.t(2, l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            zo1.t(3, l2.longValue());
        }
        Long l3 = this.g;
        if (l3 != null) {
            zo1.t(4, l3.longValue());
        }
        Long l4 = this.f;
        if (l4 != null) {
            zo1.t(5, l4.longValue());
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        yi1 yi1 = this.c;
        if (!(yi1 == null || yi1 == null)) {
            h += zo1.s(1, yi1.a());
        }
        Long l = this.d;
        if (l != null) {
            h += zo1.m(2, l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            h += zo1.m(3, l2.longValue());
        }
        Long l3 = this.g;
        if (l3 != null) {
            h += zo1.m(4, l3.longValue());
        }
        Long l4 = this.f;
        return l4 != null ? h + zo1.m(5, l4.longValue()) : h;
    }
}
