package defpackage;

import java.io.IOException;

/* renamed from: gj1  reason: default package */
public final class gj1 extends bp1<gj1> {
    private static volatile gj1[] k;
    public String c = null;
    private String d = null;
    private String[] e = kp1.b;
    private xi1 f;
    public String g = null;
    public Long h = null;
    public Long i = null;
    public nj1[] j = nj1.j();

    public gj1() {
        this.a = -1;
    }

    public static gj1[] j() {
        if (k == null) {
            synchronized (fp1.b) {
                if (k == null) {
                    k = new gj1[0];
                }
            }
        }
        return k;
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
            } else if (l == 18) {
                this.d = yo1.b();
            } else if (l == 26) {
                int a = kp1.a(yo1, 26);
                String[] strArr = this.e;
                int length = strArr == null ? 0 : strArr.length;
                int i2 = a + length;
                String[] strArr2 = new String[i2];
                if (length != 0) {
                    System.arraycopy(this.e, 0, strArr2, 0, length);
                }
                while (length < i2 - 1) {
                    strArr2[length] = yo1.b();
                    yo1.l();
                    length++;
                }
                strArr2[length] = yo1.b();
                this.e = strArr2;
            } else if (l == 32) {
                int a2 = yo1.a();
                int m = yo1.m();
                if (m == 0 || m == 1 || m == 2 || m == 3) {
                    this.f = xi1.b(m);
                } else {
                    yo1.j(a2);
                    i(yo1, l);
                }
            } else if (l == 42) {
                this.g = yo1.b();
            } else if (l == 48) {
                this.h = Long.valueOf(yo1.n());
            } else if (l == 56) {
                this.i = Long.valueOf(yo1.n());
            } else if (l == 66) {
                int a3 = kp1.a(yo1, 66);
                nj1[] nj1Arr = this.j;
                int length2 = nj1Arr == null ? 0 : nj1Arr.length;
                int i3 = a3 + length2;
                nj1[] nj1Arr2 = new nj1[i3];
                if (length2 != 0) {
                    System.arraycopy(this.j, 0, nj1Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    nj1Arr2[length2] = new nj1();
                    yo1.d(nj1Arr2[length2]);
                    yo1.l();
                    length2++;
                }
                nj1Arr2[length2] = new nj1();
                yo1.d(nj1Arr2[length2]);
                this.j = nj1Arr2;
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
        String str2 = this.d;
        if (str2 != null) {
            zo1.d(2, str2);
        }
        String[] strArr = this.e;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    zo1.d(3, str3);
                }
                i3++;
            }
        }
        xi1 xi1 = this.f;
        if (!(xi1 == null || xi1 == null)) {
            zo1.p(4, xi1.a());
        }
        String str4 = this.g;
        if (str4 != null) {
            zo1.d(5, str4);
        }
        Long l = this.h;
        if (l != null) {
            zo1.t(6, l.longValue());
        }
        Long l2 = this.i;
        if (l2 != null) {
            zo1.t(7, l2.longValue());
        }
        nj1[] nj1Arr = this.j;
        if (nj1Arr != null && nj1Arr.length > 0) {
            while (true) {
                nj1[] nj1Arr2 = this.j;
                if (i2 >= nj1Arr2.length) {
                    break;
                }
                nj1 nj1 = nj1Arr2[i2];
                if (nj1 != null) {
                    zo1.c(8, nj1);
                }
                i2++;
            }
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
        String str2 = this.d;
        if (str2 != null) {
            h2 += zo1.h(2, str2);
        }
        String[] strArr = this.e;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    i5++;
                    i4 += zo1.x(str3);
                }
                i3++;
            }
            h2 = h2 + i4 + (i5 * 1);
        }
        xi1 xi1 = this.f;
        if (!(xi1 == null || xi1 == null)) {
            h2 += zo1.s(4, xi1.a());
        }
        String str4 = this.g;
        if (str4 != null) {
            h2 += zo1.h(5, str4);
        }
        Long l = this.h;
        if (l != null) {
            h2 += zo1.m(6, l.longValue());
        }
        Long l2 = this.i;
        if (l2 != null) {
            h2 += zo1.m(7, l2.longValue());
        }
        nj1[] nj1Arr = this.j;
        if (nj1Arr != null && nj1Arr.length > 0) {
            while (true) {
                nj1[] nj1Arr2 = this.j;
                if (i2 >= nj1Arr2.length) {
                    break;
                }
                nj1 nj1 = nj1Arr2[i2];
                if (nj1 != null) {
                    h2 += zo1.g(8, nj1);
                }
                i2++;
            }
        }
        return h2;
    }
}
