package defpackage;

import java.io.IOException;

/* renamed from: fj1  reason: default package */
public final class fj1 extends bp1<fj1> {
    private String c = null;
    private Boolean d = null;
    private wi1 e;
    private Long f = null;
    private Long g = null;
    private Long h = null;
    private String i = null;

    public fj1() {
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
                this.d = Boolean.valueOf(yo1.k());
            } else if (l == 24) {
                int a = yo1.a();
                int m = yo1.m();
                if (m == 0 || m == 1 || m == 2 || m == 3) {
                    this.e = wi1.b(m);
                } else {
                    yo1.j(a);
                    i(yo1, l);
                }
            } else if (l == 32) {
                this.f = Long.valueOf(yo1.n());
            } else if (l == 40) {
                this.g = Long.valueOf(yo1.n());
            } else if (l == 48) {
                this.h = Long.valueOf(yo1.n());
            } else if (l == 58) {
                this.i = yo1.b();
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
        Boolean bool = this.d;
        if (bool != null) {
            zo1.i(2, bool.booleanValue());
        }
        wi1 wi1 = this.e;
        if (!(wi1 == null || wi1 == null)) {
            zo1.p(3, wi1.a());
        }
        Long l = this.f;
        if (l != null) {
            zo1.t(4, l.longValue());
        }
        Long l2 = this.g;
        if (l2 != null) {
            zo1.t(5, l2.longValue());
        }
        Long l3 = this.h;
        if (l3 != null) {
            zo1.t(6, l3.longValue());
        }
        String str2 = this.i;
        if (str2 != null) {
            zo1.d(7, str2);
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
        Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            h2 += zo1.e(2) + 1;
        }
        wi1 wi1 = this.e;
        if (!(wi1 == null || wi1 == null)) {
            h2 += zo1.s(3, wi1.a());
        }
        Long l = this.f;
        if (l != null) {
            h2 += zo1.m(4, l.longValue());
        }
        Long l2 = this.g;
        if (l2 != null) {
            h2 += zo1.m(5, l2.longValue());
        }
        Long l3 = this.h;
        if (l3 != null) {
            h2 += zo1.m(6, l3.longValue());
        }
        String str2 = this.i;
        return str2 != null ? h2 + zo1.h(7, str2) : h2;
    }
}
