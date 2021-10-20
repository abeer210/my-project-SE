package defpackage;

import java.io.IOException;

/* renamed from: pz0  reason: default package */
public final class pz0 extends yy0<pz0> implements Cloneable {
    private String[] c;
    private String[] d;
    private int[] e = gz0.a;
    private long[] f;
    private long[] g;

    public pz0() {
        String[] strArr = gz0.c;
        this.c = strArr;
        this.d = strArr;
        long[] jArr = gz0.b;
        this.f = jArr;
        this.g = jArr;
        this.b = null;
        this.a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final pz0 clone() {
        try {
            pz0 pz0 = (pz0) super.clone();
            String[] strArr = this.c;
            if (strArr != null && strArr.length > 0) {
                pz0.c = (String[]) strArr.clone();
            }
            String[] strArr2 = this.d;
            if (strArr2 != null && strArr2.length > 0) {
                pz0.d = (String[]) strArr2.clone();
            }
            int[] iArr = this.e;
            if (iArr != null && iArr.length > 0) {
                pz0.e = (int[]) iArr.clone();
            }
            long[] jArr = this.f;
            if (jArr != null && jArr.length > 0) {
                pz0.f = (long[]) jArr.clone();
            }
            long[] jArr2 = this.g;
            if (jArr2 != null && jArr2.length > 0) {
                pz0.g = (long[]) jArr2.clone();
            }
            return pz0;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final void a(wy0 wy0) throws IOException {
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    wy0.c(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.d;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.d;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    wy0.c(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.e;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.e;
                if (i4 >= iArr2.length) {
                    break;
                }
                wy0.l(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.f;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.f;
                if (i5 >= jArr2.length) {
                    break;
                }
                wy0.u(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.g;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.g;
                if (i >= jArr4.length) {
                    break;
                }
                wy0.u(5, jArr4[i]);
                i++;
            }
        }
        super.a(wy0);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final int d() {
        long[] jArr;
        int[] iArr;
        int d2 = super.d();
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += wy0.r(str);
                }
                i2++;
            }
            d2 = d2 + i3 + (i4 * 1);
        }
        String[] strArr3 = this.d;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.d;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += wy0.r(str2);
                }
                i5++;
            }
            d2 = d2 + i6 + (i7 * 1);
        }
        int[] iArr2 = this.e;
        if (iArr2 != null && iArr2.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.e;
                if (i8 >= iArr.length) {
                    break;
                }
                i9 += wy0.z(iArr[i8]);
                i8++;
            }
            d2 = d2 + i9 + (iArr.length * 1);
        }
        long[] jArr2 = this.f;
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                jArr = this.f;
                if (i10 >= jArr.length) {
                    break;
                }
                i11 += wy0.x(jArr[i10]);
                i10++;
            }
            d2 = d2 + i11 + (jArr.length * 1);
        }
        long[] jArr3 = this.g;
        if (jArr3 == null || jArr3.length <= 0) {
            return d2;
        }
        int i12 = 0;
        while (true) {
            long[] jArr4 = this.g;
            if (i >= jArr4.length) {
                return d2 + i12 + (jArr4.length * 1);
            }
            i12 += wy0.x(jArr4[i]);
            i++;
        }
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final /* synthetic */ dz0 e() throws CloneNotSupportedException {
        return (pz0) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0 = (pz0) obj;
        if (!cz0.c(this.c, pz0.c) || !cz0.c(this.d, pz0.d) || !cz0.a(this.e, pz0.e) || !cz0.b(this.f, pz0.f) || !cz0.b(this.g, pz0.g)) {
            return false;
        }
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            return this.b.equals(pz0.b);
        }
        az0 az02 = pz0.b;
        return az02 == null || az02.a();
    }

    /* Return type fixed from 'yy0' to match base method */
    @Override // defpackage.yy0
    public final /* synthetic */ pz0 f() throws CloneNotSupportedException {
        return (pz0) clone();
    }

    public final int hashCode() {
        int hashCode = (((((((((((pz0.class.getName().hashCode() + 527) * 31) + cz0.f(this.c)) * 31) + cz0.f(this.d)) * 31) + cz0.d(this.e)) * 31) + cz0.e(this.f)) * 31) + cz0.e(this.g)) * 31;
        az0 az0 = this.b;
        return hashCode + ((az0 == null || az0.a()) ? 0 : this.b.hashCode());
    }
}
