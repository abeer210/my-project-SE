package defpackage;

/* renamed from: o72  reason: default package */
/* compiled from: WhiteRectangleDetector */
public final class o72 {
    private final c72 a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public o72(c72 c72) throws o62 {
        this(c72, 10, c72.l() / 2, c72.g() / 2);
    }

    private v62[] a(v62 v62, v62 v622, v62 v623, v62 v624) {
        float c2 = v62.c();
        float d2 = v62.d();
        float c3 = v622.c();
        float d3 = v622.d();
        float c4 = v623.c();
        float d4 = v623.d();
        float c5 = v624.c();
        float d5 = v624.d();
        if (c2 < ((float) this.c) / 2.0f) {
            return new v62[]{new v62(c5 - 1.0f, d5 + 1.0f), new v62(c3 + 1.0f, d3 + 1.0f), new v62(c4 - 1.0f, d4 - 1.0f), new v62(c2 + 1.0f, d2 - 1.0f)};
        }
        return new v62[]{new v62(c5 + 1.0f, d5 + 1.0f), new v62(c3 + 1.0f, d3 - 1.0f), new v62(c4 - 1.0f, d4 + 1.0f), new v62(c2 - 1.0f, d2 - 1.0f)};
    }

    private boolean b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.a.d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.a.d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private v62 d(float f2, float f3, float f4, float f5) {
        int c2 = n72.c(n72.a(f2, f3, f4, f5));
        float f6 = (float) c2;
        float f7 = (f4 - f2) / f6;
        float f8 = (f5 - f3) / f6;
        for (int i = 0; i < c2; i++) {
            float f9 = (float) i;
            int c3 = n72.c((f9 * f7) + f2);
            int c4 = n72.c((f9 * f8) + f3);
            if (this.a.d(c3, c4)) {
                return new v62((float) c3, (float) c4);
            }
        }
        return null;
    }

    public v62[] c() throws o62 {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = this.f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.c) {
                    z8 = b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.b) {
                    z10 = b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z2 = z9;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z2 = true;
                        z7 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z2) {
                z6 = true;
            }
        }
        z = true;
        if (z || !z6) {
            throw o62.a();
        }
        int i6 = i2 - i;
        v62 v62 = null;
        v62 v622 = null;
        int i7 = 1;
        while (v622 == null && i7 < i6) {
            v622 = d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (v622 != null) {
            v62 v623 = null;
            int i8 = 1;
            while (v623 == null && i8 < i6) {
                v623 = d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (v623 != null) {
                v62 v624 = null;
                int i9 = 1;
                while (v624 == null && i9 < i6) {
                    v624 = d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (v624 != null) {
                    while (v62 == null && i5 < i6) {
                        v62 = d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (v62 != null) {
                        return a(v62, v622, v624, v623);
                    }
                    throw o62.a();
                }
                throw o62.a();
            }
            throw o62.a();
        }
        throw o62.a();
    }

    public o72(c72 c72, int i, int i2, int i3) throws o62 {
        this.a = c72;
        this.b = c72.g();
        int l = c72.l();
        this.c = l;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.d = i5;
        int i6 = i2 + i4;
        this.e = i6;
        int i7 = i3 - i4;
        this.g = i7;
        int i8 = i3 + i4;
        this.f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.b || i6 >= l) {
            throw o62.a();
        }
    }
}
