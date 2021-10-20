package defpackage;

import java.util.Map;

/* renamed from: db2  reason: default package */
/* compiled from: Detector */
public class db2 {
    private final c72 a;
    private w62 b;

    public db2(c72 c72) {
        this.a = c72;
    }

    private float b(v62 v62, v62 v622) {
        float j = j((int) v62.c(), (int) v62.d(), (int) v622.c(), (int) v622.d());
        float j2 = j((int) v622.c(), (int) v622.d(), (int) v62.c(), (int) v62.d());
        if (Float.isNaN(j)) {
            return j2 / 7.0f;
        }
        return Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    private static int c(v62 v62, v62 v622, v62 v623, float f) throws o62 {
        int c = ((n72.c(v62.b(v62, v622) / f) + n72.c(v62.b(v62, v623) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw o62.a();
    }

    private static l72 d(v62 v62, v62 v622, v62 v623, v62 v624, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (v624 != null) {
            f2 = v624.c();
            f = v624.d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (v622.c() - v62.c()) + v623.c();
            f = (v622.d() - v62.d()) + v623.d();
            f3 = f4;
        }
        return l72.b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, v62.c(), v62.d(), v622.c(), v622.d(), f2, f, v623.c(), v623.d());
    }

    private static c72 h(c72 c72, l72 l72, int i) throws o62 {
        return j72.b().d(c72, i, i, l72);
    }

    private float i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        db2 db2;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                db2 = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                db2 = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == db2.a.d(i18, i19)) {
                if (i17 == 2) {
                    return n72.b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return n72.b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    private float j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.a.l()) {
            f = ((float) ((this.a.l() - 1) - i)) / ((float) (i6 - i));
            i6 = this.a.l() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.a.g()) {
            f2 = ((float) ((this.a.g() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.a.g() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    public final float a(v62 v62, v62 v622, v62 v623) {
        return (b(v62, v622) + b(v62, v623)) / 2.0f;
    }

    public final h72 e(Map<j62, ?> map) throws o62, k62 {
        w62 w62;
        if (map == null) {
            w62 = null;
        } else {
            w62 = (w62) map.get(j62.NEED_RESULT_POINT_CALLBACK);
        }
        this.b = w62;
        return g(new fb2(this.a, w62).f(map));
    }

    public final bb2 f(float f, int i, int i2, float f2) throws o62 {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.a.l() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.a.g() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new cb2(this.a, max, max2, min, min2, f, this.b).c();
            }
            throw o62.a();
        }
        throw o62.a();
    }

    public final h72 g(gb2 gb2) throws o62, k62 {
        eb2 b2 = gb2.b();
        eb2 c = gb2.c();
        eb2 a2 = gb2.a();
        float a3 = a(b2, c, a2);
        if (a3 >= 1.0f) {
            int c2 = c(b2, c, a2, a3);
            ab2 g = ab2.g(c2);
            int e = g.e() - 7;
            bb2 bb2 = null;
            if (g.d().length > 0) {
                float c3 = (c.c() - b2.c()) + a2.c();
                float d = (c.d() - b2.d()) + a2.d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b2.c() + ((c3 - b2.c()) * f));
                int d2 = (int) (b2.d() + (f * (d - b2.d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        bb2 = f(a3, c4, d2, (float) i);
                        break;
                    } catch (o62 unused) {
                    }
                }
            }
            return new h72(h(this.a, d(b2, c, a2, bb2, c2), c2), bb2 == null ? new v62[]{a2, b2, c} : new v62[]{a2, b2, c, bb2});
        }
        throw o62.a();
    }
}
