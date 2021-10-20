package defpackage;

import java.io.IOException;

/* renamed from: jj1  reason: default package */
public final class jj1 extends bp1<jj1> {
    public kj1 c = null;
    private zi1 d;
    public gj1[] e = gj1.j();

    public jj1() {
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
                    this.c = new kj1();
                }
                yo1.d(this.c);
            } else if (l == 18) {
                this.d = (zi1) yo1.c(zi1.s());
            } else if (l == 26) {
                int a = kp1.a(yo1, 26);
                gj1[] gj1Arr = this.e;
                int length = gj1Arr == null ? 0 : gj1Arr.length;
                int i = a + length;
                gj1[] gj1Arr2 = new gj1[i];
                if (length != 0) {
                    System.arraycopy(this.e, 0, gj1Arr2, 0, length);
                }
                while (length < i - 1) {
                    gj1Arr2[length] = new gj1();
                    yo1.d(gj1Arr2[length]);
                    yo1.l();
                    length++;
                }
                gj1Arr2[length] = new gj1();
                yo1.d(gj1Arr2[length]);
                this.e = gj1Arr2;
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        kj1 kj1 = this.c;
        if (kj1 != null) {
            zo1.c(1, kj1);
        }
        zi1 zi1 = this.d;
        if (zi1 != null) {
            zo1.q(2, zi1);
        }
        gj1[] gj1Arr = this.e;
        if (gj1Arr != null && gj1Arr.length > 0) {
            int i = 0;
            while (true) {
                gj1[] gj1Arr2 = this.e;
                if (i >= gj1Arr2.length) {
                    break;
                }
                gj1 gj1 = gj1Arr2[i];
                if (gj1 != null) {
                    zo1.c(3, gj1);
                }
                i++;
            }
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        kj1 kj1 = this.c;
        if (kj1 != null) {
            h += zo1.g(1, kj1);
        }
        zi1 zi1 = this.d;
        if (zi1 != null) {
            h += qk1.R(2, zi1);
        }
        gj1[] gj1Arr = this.e;
        if (gj1Arr != null && gj1Arr.length > 0) {
            int i = 0;
            while (true) {
                gj1[] gj1Arr2 = this.e;
                if (i >= gj1Arr2.length) {
                    break;
                }
                gj1 gj1 = gj1Arr2[i];
                if (gj1 != null) {
                    h += zo1.g(3, gj1);
                }
                i++;
            }
        }
        return h;
    }
}
