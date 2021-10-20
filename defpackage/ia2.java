package defpackage;

import vigqyno.C0201;

/* renamed from: ia2  reason: default package */
/* compiled from: DetectionResultRowIndicatorColumn */
public final class ia2 extends ha2 {
    private final boolean c;

    public ia2(da2 da2, boolean z) {
        super(da2);
        this.c = z;
    }

    private void h(ba2 ba2) {
        da2 a = a();
        v62 h = this.c ? a.h() : a.i();
        v62 b = this.c ? a.b() : a.c();
        int e = e((int) b.d());
        ea2[] d = d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = e((int) h.d()); e2 < e; e2++) {
            if (d[e2] != null) {
                ea2 ea2 = d[e2];
                ea2.j();
                int c2 = ea2.c() - i;
                if (c2 == 0) {
                    i2++;
                } else {
                    if (c2 == 1) {
                        i3 = Math.max(i3, i2);
                        i = ea2.c();
                    } else if (ea2.c() >= ba2.c()) {
                        d[e2] = null;
                    } else {
                        i = ea2.c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    private void l(ea2[] ea2Arr, ba2 ba2) {
        for (int i = 0; i < ea2Arr.length; i++) {
            ea2 ea2 = ea2Arr[i];
            if (ea2Arr[i] != null) {
                int e = ea2.e() % 30;
                int c2 = ea2.c();
                if (c2 > ba2.c()) {
                    ea2Arr[i] = null;
                } else {
                    if (!this.c) {
                        c2 += 2;
                    }
                    int i2 = c2 % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != ba2.a()) {
                                ea2Arr[i] = null;
                            }
                        } else if (e / 3 != ba2.b() || e % 3 != ba2.d()) {
                            ea2Arr[i] = null;
                        }
                    } else if ((e * 3) + 1 != ba2.e()) {
                        ea2Arr[i] = null;
                    }
                }
            }
        }
    }

    private void m() {
        ea2[] d = d();
        for (ea2 ea2 : d) {
            if (ea2 != null) {
                ea2.j();
            }
        }
    }

    public void g(ba2 ba2) {
        ea2[] d = d();
        m();
        l(d, ba2);
        da2 a = a();
        v62 h = this.c ? a.h() : a.i();
        v62 b = this.c ? a.b() : a.c();
        int e = e((int) h.d());
        int e2 = e((int) b.d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (e < e2) {
            if (d[e] != null) {
                ea2 ea2 = d[e];
                int c2 = ea2.c() - i;
                if (c2 == 0) {
                    i2++;
                } else {
                    if (c2 == 1) {
                        i3 = Math.max(i3, i2);
                        i = ea2.c();
                    } else if (c2 < 0 || ea2.c() >= ba2.c() || c2 > e) {
                        d[e] = null;
                    } else {
                        if (i3 > 2) {
                            c2 *= i3 - 2;
                        }
                        boolean z = c2 >= e;
                        for (int i4 = 1; i4 <= c2 && !z; i4++) {
                            z = d[e - i4] != null;
                        }
                        if (z) {
                            d[e] = null;
                        } else {
                            i = ea2.c();
                        }
                    }
                    i2 = 1;
                }
            }
            e++;
        }
    }

    public ba2 i() {
        ea2[] d = d();
        ca2 ca2 = new ca2();
        ca2 ca22 = new ca2();
        ca2 ca23 = new ca2();
        ca2 ca24 = new ca2();
        for (ea2 ea2 : d) {
            if (ea2 != null) {
                ea2.j();
                int e = ea2.e() % 30;
                int c2 = ea2.c();
                if (!this.c) {
                    c2 += 2;
                }
                int i = c2 % 3;
                if (i == 0) {
                    ca22.b((e * 3) + 1);
                } else if (i == 1) {
                    ca24.b(e / 3);
                    ca23.b(e % 3);
                } else if (i == 2) {
                    ca2.b(e + 1);
                }
            }
        }
        if (ca2.a().length == 0 || ca22.a().length == 0 || ca23.a().length == 0 || ca24.a().length == 0 || ca2.a()[0] <= 0 || ca22.a()[0] + ca23.a()[0] < 3 || ca22.a()[0] + ca23.a()[0] > 90) {
            return null;
        }
        ba2 ba2 = new ba2(ca2.a()[0], ca22.a()[0], ca23.a()[0], ca24.a()[0]);
        l(d, ba2);
        return ba2;
    }

    public int[] j() {
        int c2;
        ba2 i = i();
        if (i == null) {
            return null;
        }
        h(i);
        int c3 = i.c();
        int[] iArr = new int[c3];
        ea2[] d = d();
        for (ea2 ea2 : d) {
            if (ea2 != null && (c2 = ea2.c()) < c3) {
                iArr[c2] = iArr[c2] + 1;
            }
        }
        return iArr;
    }

    public boolean k() {
        return this.c;
    }

    @Override // defpackage.ha2
    public String toString() {
        return C0201.m82(22336) + this.c + '\n' + super.toString();
    }
}
