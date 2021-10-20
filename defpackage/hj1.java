package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: hj1  reason: default package */
public final class hj1 extends bp1<hj1> {
    public Integer c;
    public Integer d;
    public Integer e;
    public Boolean f = null;
    public Boolean g = null;
    public Float h = null;

    public hj1() {
        this.a = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    private final hj1 j(yo1 yo1) throws IOException {
        int m;
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 8) {
                try {
                    int m2 = yo1.m();
                    if (m2 < 0 || m2 > 3) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(m2);
                        sb.append(C0201.m82(10341));
                    } else {
                        this.c = Integer.valueOf(m2);
                    }
                } catch (IllegalArgumentException unused) {
                    yo1.j(yo1.a());
                    i(yo1, l);
                }
            } else if (l == 16) {
                try {
                    int m3 = yo1.m();
                    if (m3 < 0 || m3 > 3) {
                        StringBuilder sb2 = new StringBuilder(40);
                        sb2.append(m3);
                        sb2.append(C0201.m82(10340));
                    } else {
                        this.d = Integer.valueOf(m3);
                    }
                } catch (IllegalArgumentException unused2) {
                    yo1.j(yo1.a());
                    i(yo1, l);
                }
            } else if (l == 24) {
                try {
                    m = yo1.m();
                    if (m < 0 || m > 2) {
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append(m);
                        sb3.append(C0201.m82(10339));
                    } else {
                        this.e = Integer.valueOf(m);
                    }
                } catch (IllegalArgumentException unused3) {
                    yo1.j(yo1.a());
                    i(yo1, l);
                }
            } else if (l == 32) {
                this.f = Boolean.valueOf(yo1.k());
            } else if (l == 40) {
                this.g = Boolean.valueOf(yo1.k());
            } else if (l == 53) {
                this.h = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
        StringBuilder sb32 = new StringBuilder(46);
        sb32.append(m);
        sb32.append(C0201.m82(10339));
        throw new IllegalArgumentException(sb32.toString());
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        j(yo1);
        return this;
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        Integer num = this.c;
        if (num != null) {
            zo1.p(1, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            zo1.p(2, num2.intValue());
        }
        Integer num3 = this.e;
        if (num3 != null) {
            zo1.p(3, num3.intValue());
        }
        Boolean bool = this.f;
        if (bool != null) {
            zo1.i(4, bool.booleanValue());
        }
        Boolean bool2 = this.g;
        if (bool2 != null) {
            zo1.i(5, bool2.booleanValue());
        }
        Float f2 = this.h;
        if (f2 != null) {
            zo1.b(6, f2.floatValue());
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h2 = super.h();
        Integer num = this.c;
        if (num != null) {
            h2 += zo1.s(1, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            h2 += zo1.s(2, num2.intValue());
        }
        Integer num3 = this.e;
        if (num3 != null) {
            h2 += zo1.s(3, num3.intValue());
        }
        Boolean bool = this.f;
        if (bool != null) {
            bool.booleanValue();
            h2 += zo1.e(4) + 1;
        }
        Boolean bool2 = this.g;
        if (bool2 != null) {
            bool2.booleanValue();
            h2 += zo1.e(5) + 1;
        }
        Float f2 = this.h;
        if (f2 == null) {
            return h2;
        }
        f2.floatValue();
        return h2 + zo1.e(6) + 4;
    }
}
