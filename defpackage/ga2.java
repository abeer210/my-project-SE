package defpackage;

import java.util.Formatter;
import vigqyno.C0201;

/* renamed from: ga2  reason: default package */
/* compiled from: DetectionResult */
public final class ga2 {
    private final ba2 a;
    private final ha2[] b;
    private da2 c;
    private final int d;

    public ga2(ba2 ba2, da2 da2) {
        this.a = ba2;
        int a2 = ba2.a();
        this.d = a2;
        this.c = da2;
        this.b = new ha2[(a2 + 2)];
    }

    private void a(ha2 ha2) {
        if (ha2 != null) {
            ((ia2) ha2).g(this.a);
        }
    }

    private static boolean b(ea2 ea2, ea2 ea22) {
        if (ea22 == null || !ea22.g() || ea22.a() != ea2.a()) {
            return false;
        }
        ea2.i(ea22.c());
        return true;
    }

    private static int c(int i, int i2, ea2 ea2) {
        if (ea2 == null || ea2.g()) {
            return i2;
        }
        if (!ea2.h(i)) {
            return i2 + 1;
        }
        ea2.i(i);
        return 0;
    }

    private int d() {
        int f = f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.d + 1; i++) {
            ea2[] d2 = this.b[i].d();
            for (int i2 = 0; i2 < d2.length; i2++) {
                if (d2[i2] != null && !d2[i2].g()) {
                    e(i, i2, d2);
                }
            }
        }
        return f;
    }

    private void e(int i, int i2, ea2[] ea2Arr) {
        ea2 ea2 = ea2Arr[i2];
        ea2[] d2 = this.b[i - 1].d();
        ha2[] ha2Arr = this.b;
        int i3 = i + 1;
        ea2[] d3 = ha2Arr[i3] != null ? ha2Arr[i3].d() : d2;
        ea2[] ea2Arr2 = new ea2[14];
        ea2Arr2[2] = d2[i2];
        ea2Arr2[3] = d3[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            ea2Arr2[0] = ea2Arr[i5];
            ea2Arr2[4] = d2[i5];
            ea2Arr2[5] = d3[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            ea2Arr2[8] = ea2Arr[i6];
            ea2Arr2[10] = d2[i6];
            ea2Arr2[11] = d3[i6];
        }
        if (i2 < ea2Arr.length - 1) {
            int i7 = i2 + 1;
            ea2Arr2[1] = ea2Arr[i7];
            ea2Arr2[6] = d2[i7];
            ea2Arr2[7] = d3[i7];
        }
        if (i2 < ea2Arr.length - 2) {
            int i8 = i2 + 2;
            ea2Arr2[9] = ea2Arr[i8];
            ea2Arr2[12] = d2[i8];
            ea2Arr2[13] = d3[i8];
        }
        while (i4 < 14 && !b(ea2, ea2Arr2[i4])) {
            i4++;
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        ha2[] ha2Arr = this.b;
        if (!(ha2Arr[0] == null || ha2Arr[this.d + 1] == null)) {
            ea2[] d2 = ha2Arr[0].d();
            ea2[] d3 = this.b[this.d + 1].d();
            for (int i = 0; i < d2.length; i++) {
                if (!(d2[i] == null || d3[i] == null || d2[i].c() != d3[i].c())) {
                    for (int i2 = 1; i2 <= this.d; i2++) {
                        ea2 ea2 = this.b[i2].d()[i];
                        if (ea2 != null) {
                            ea2.i(d2[i].c());
                            if (!ea2.g()) {
                                this.b[i2].d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    private int h() {
        ha2[] ha2Arr = this.b;
        if (ha2Arr[0] == null) {
            return 0;
        }
        ea2[] d2 = ha2Arr[0].d();
        int i = 0;
        for (int i2 = 0; i2 < d2.length; i2++) {
            if (d2[i2] != null) {
                int c2 = d2[i2].c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.d + 1 && i3 < 2; i4++) {
                    ea2 ea2 = this.b[i4].d()[i2];
                    if (ea2 != null) {
                        i3 = c(c2, i3, ea2);
                        if (!ea2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    private int i() {
        ha2[] ha2Arr = this.b;
        int i = this.d;
        if (ha2Arr[i + 1] == null) {
            return 0;
        }
        ea2[] d2 = ha2Arr[i + 1].d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2.length; i3++) {
            if (d2[i3] != null) {
                int c2 = d2[i3].c();
                int i4 = 0;
                for (int i5 = this.d + 1; i5 > 0 && i4 < 2; i5--) {
                    ea2 ea2 = this.b[i5].d()[i3];
                    if (ea2 != null) {
                        i4 = c(c2, i4, ea2);
                        if (!ea2.g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.a.b();
    }

    public int l() {
        return this.a.c();
    }

    public da2 m() {
        return this.c;
    }

    public ha2 n(int i) {
        return this.b[i];
    }

    public ha2[] o() {
        a(this.b[0]);
        a(this.b[this.d + 1]);
        int i = 928;
        while (true) {
            int d2 = d();
            if (d2 > 0 && d2 < i) {
                i = d2;
            }
        }
        return this.b;
    }

    public void p(da2 da2) {
        this.c = da2;
    }

    public void q(int i, ha2 ha2) {
        this.b[i] = ha2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        throw r2;
     */
    public String toString() {
        ha2[] ha2Arr = this.b;
        ha2 ha2 = ha2Arr[0];
        if (ha2 == null) {
            ha2 = ha2Arr[this.d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < ha2.d().length; i++) {
            formatter.format(C0201.m82(35670), Integer.valueOf(i));
            for (int i2 = 0; i2 < this.d + 2; i2++) {
                ha2 ha22 = this.b[i2];
                String r8 = C0201.m82(35671);
                if (ha22 == null) {
                    formatter.format(r8, new Object[0]);
                } else {
                    ea2 ea2 = this.b[i2].d()[i];
                    if (ea2 == null) {
                        formatter.format(r8, new Object[0]);
                    } else {
                        formatter.format(C0201.m82(35672), Integer.valueOf(ea2.c()), Integer.valueOf(ea2.e()));
                    }
                }
            }
            formatter.format(C0201.m82(35673), new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
