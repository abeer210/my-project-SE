package defpackage;

import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: sz0  reason: default package */
public final class sz0 extends yy0<sz0> implements Cloneable {
    public long c = 0;
    public long d = 0;
    private String e;
    public int f;
    private String g;
    private tz0[] h;
    private byte[] i;
    private hz0 j;
    public byte[] k;
    private String l;
    private String m;
    private pz0 n;
    private String o;
    public long p;
    private qz0 q;
    public byte[] u;
    private String v;
    private int[] w;
    private iz0 x;
    public boolean y;

    public sz0() {
        String r0 = C0201.m82(13002);
        this.e = r0;
        this.f = 0;
        this.g = r0;
        this.h = tz0.g();
        byte[] bArr = gz0.e;
        this.i = bArr;
        this.j = null;
        this.k = bArr;
        this.l = r0;
        this.m = r0;
        this.n = null;
        this.o = r0;
        this.p = 180000;
        this.q = null;
        this.u = bArr;
        this.v = r0;
        this.w = gz0.a;
        this.x = null;
        this.y = false;
        this.b = null;
        this.a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final sz0 clone() {
        try {
            sz0 sz0 = (sz0) super.clone();
            tz0[] tz0Arr = this.h;
            if (tz0Arr != null && tz0Arr.length > 0) {
                sz0.h = new tz0[tz0Arr.length];
                int i2 = 0;
                while (true) {
                    tz0[] tz0Arr2 = this.h;
                    if (i2 >= tz0Arr2.length) {
                        break;
                    }
                    if (tz0Arr2[i2] != null) {
                        sz0.h[i2] = (tz0) tz0Arr2[i2].clone();
                    }
                    i2++;
                }
            }
            hz0 hz0 = this.j;
            if (hz0 != null) {
                sz0.j = hz0;
            }
            pz0 pz0 = this.n;
            if (pz0 != null) {
                sz0.n = (pz0) pz0.clone();
            }
            qz0 qz0 = this.q;
            if (qz0 != null) {
                sz0.q = (qz0) qz0.clone();
            }
            int[] iArr = this.w;
            if (iArr != null && iArr.length > 0) {
                sz0.w = (int[]) iArr.clone();
            }
            iz0 iz0 = this.x;
            if (iz0 != null) {
                sz0.x = iz0;
            }
            return sz0;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final void a(wy0 wy0) throws IOException {
        long j2 = this.c;
        if (j2 != 0) {
            wy0.u(1, j2);
        }
        String str = this.e;
        String r1 = C0201.m82(13003);
        if (str != null && !str.equals(r1)) {
            wy0.c(2, this.e);
        }
        tz0[] tz0Arr = this.h;
        int i2 = 0;
        if (tz0Arr != null && tz0Arr.length > 0) {
            int i3 = 0;
            while (true) {
                tz0[] tz0Arr2 = this.h;
                if (i3 >= tz0Arr2.length) {
                    break;
                }
                tz0 tz0 = tz0Arr2[i3];
                if (tz0 != null) {
                    wy0.b(3, tz0);
                }
                i3++;
            }
        }
        if (!Arrays.equals(this.i, gz0.e)) {
            wy0.d(4, this.i);
        }
        if (!Arrays.equals(this.k, gz0.e)) {
            wy0.d(6, this.k);
        }
        pz0 pz0 = this.n;
        if (pz0 != null) {
            wy0.b(7, pz0);
        }
        String str2 = this.l;
        if (str2 != null && !str2.equals(r1)) {
            wy0.c(8, this.l);
        }
        hz0 hz0 = this.j;
        if (hz0 != null) {
            wy0.o(9, hz0);
        }
        int i4 = this.f;
        if (i4 != 0) {
            wy0.l(11, i4);
        }
        String str3 = this.m;
        if (str3 != null && !str3.equals(r1)) {
            wy0.c(13, this.m);
        }
        String str4 = this.o;
        if (str4 != null && !str4.equals(r1)) {
            wy0.c(14, this.o);
        }
        long j3 = this.p;
        if (j3 != 180000) {
            wy0.j(15, 0);
            wy0.w(wy0.v(j3));
        }
        qz0 qz0 = this.q;
        if (qz0 != null) {
            wy0.b(16, qz0);
        }
        long j4 = this.d;
        if (j4 != 0) {
            wy0.u(17, j4);
        }
        if (!Arrays.equals(this.u, gz0.e)) {
            wy0.d(18, this.u);
        }
        int[] iArr = this.w;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.w;
                if (i2 >= iArr2.length) {
                    break;
                }
                wy0.l(20, iArr2[i2]);
                i2++;
            }
        }
        iz0 iz0 = this.x;
        if (iz0 != null) {
            wy0.o(23, iz0);
        }
        String str5 = this.v;
        if (str5 != null && !str5.equals(r1)) {
            wy0.c(24, this.v);
        }
        boolean z = this.y;
        if (z) {
            wy0.k(25, z);
        }
        String str6 = this.g;
        if (str6 != null && !str6.equals(r1)) {
            wy0.c(26, this.g);
        }
        super.a(wy0);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final int d() {
        int[] iArr;
        int d2 = super.d();
        long j2 = this.c;
        if (j2 != 0) {
            d2 += wy0.m(1, j2);
        }
        String str = this.e;
        String r6 = C0201.m82(13004);
        if (str != null && !str.equals(r6)) {
            d2 += wy0.h(2, this.e);
        }
        tz0[] tz0Arr = this.h;
        int i2 = 0;
        if (tz0Arr != null && tz0Arr.length > 0) {
            int i3 = 0;
            while (true) {
                tz0[] tz0Arr2 = this.h;
                if (i3 >= tz0Arr2.length) {
                    break;
                }
                tz0 tz0 = tz0Arr2[i3];
                if (tz0 != null) {
                    d2 += wy0.g(3, tz0);
                }
                i3++;
            }
        }
        if (!Arrays.equals(this.i, gz0.e)) {
            d2 += wy0.i(4, this.i);
        }
        if (!Arrays.equals(this.k, gz0.e)) {
            d2 += wy0.i(6, this.k);
        }
        pz0 pz0 = this.n;
        if (pz0 != null) {
            d2 += wy0.g(7, pz0);
        }
        String str2 = this.l;
        if (str2 != null && !str2.equals(r6)) {
            d2 += wy0.h(8, this.l);
        }
        hz0 hz0 = this.j;
        if (hz0 != null) {
            d2 += ru0.N(9, hz0);
        }
        int i4 = this.f;
        if (i4 != 0) {
            d2 += wy0.y(11) + wy0.z(i4);
        }
        String str3 = this.m;
        if (str3 != null && !str3.equals(r6)) {
            d2 += wy0.h(13, this.m);
        }
        String str4 = this.o;
        if (str4 != null && !str4.equals(r6)) {
            d2 += wy0.h(14, this.o);
        }
        long j3 = this.p;
        if (j3 != 180000) {
            d2 += wy0.y(15) + wy0.x(wy0.v(j3));
        }
        qz0 qz0 = this.q;
        if (qz0 != null) {
            d2 += wy0.g(16, qz0);
        }
        long j4 = this.d;
        if (j4 != 0) {
            d2 += wy0.m(17, j4);
        }
        if (!Arrays.equals(this.u, gz0.e)) {
            d2 += wy0.i(18, this.u);
        }
        int[] iArr2 = this.w;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            while (true) {
                iArr = this.w;
                if (i2 >= iArr.length) {
                    break;
                }
                i5 += wy0.z(iArr[i2]);
                i2++;
            }
            d2 = d2 + i5 + (iArr.length * 2);
        }
        iz0 iz0 = this.x;
        if (iz0 != null) {
            d2 += ru0.N(23, iz0);
        }
        String str5 = this.v;
        if (str5 != null && !str5.equals(r6)) {
            d2 += wy0.h(24, this.v);
        }
        if (this.y) {
            d2 += wy0.y(25) + 1;
        }
        String str6 = this.g;
        return (str6 == null || str6.equals(r6)) ? d2 : d2 + wy0.h(26, this.g);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final /* synthetic */ dz0 e() throws CloneNotSupportedException {
        return (sz0) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0 = (sz0) obj;
        if (this.c != sz0.c || this.d != sz0.d) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (sz0.e != null) {
                return false;
            }
        } else if (!str.equals(sz0.e)) {
            return false;
        }
        if (this.f != sz0.f) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (sz0.g != null) {
                return false;
            }
        } else if (!str2.equals(sz0.g)) {
            return false;
        }
        if (!cz0.c(this.h, sz0.h) || !Arrays.equals(this.i, sz0.i)) {
            return false;
        }
        hz0 hz0 = this.j;
        if (hz0 == null) {
            if (sz0.j != null) {
                return false;
            }
        } else if (!hz0.equals(sz0.j)) {
            return false;
        }
        if (!Arrays.equals(this.k, sz0.k)) {
            return false;
        }
        String str3 = this.l;
        if (str3 == null) {
            if (sz0.l != null) {
                return false;
            }
        } else if (!str3.equals(sz0.l)) {
            return false;
        }
        String str4 = this.m;
        if (str4 == null) {
            if (sz0.m != null) {
                return false;
            }
        } else if (!str4.equals(sz0.m)) {
            return false;
        }
        pz0 pz0 = this.n;
        if (pz0 == null) {
            if (sz0.n != null) {
                return false;
            }
        } else if (!pz0.equals(sz0.n)) {
            return false;
        }
        String str5 = this.o;
        if (str5 == null) {
            if (sz0.o != null) {
                return false;
            }
        } else if (!str5.equals(sz0.o)) {
            return false;
        }
        if (this.p != sz0.p) {
            return false;
        }
        qz0 qz0 = this.q;
        if (qz0 == null) {
            if (sz0.q != null) {
                return false;
            }
        } else if (!qz0.equals(sz0.q)) {
            return false;
        }
        if (!Arrays.equals(this.u, sz0.u)) {
            return false;
        }
        String str6 = this.v;
        if (str6 == null) {
            if (sz0.v != null) {
                return false;
            }
        } else if (!str6.equals(sz0.v)) {
            return false;
        }
        if (!cz0.a(this.w, sz0.w)) {
            return false;
        }
        iz0 iz0 = this.x;
        if (iz0 == null) {
            if (sz0.x != null) {
                return false;
            }
        } else if (!iz0.equals(sz0.x)) {
            return false;
        }
        if (this.y != sz0.y) {
            return false;
        }
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            return this.b.equals(sz0.b);
        }
        az0 az02 = sz0.b;
        return az02 == null || az02.a();
    }

    /* Return type fixed from 'yy0' to match base method */
    @Override // defpackage.yy0
    public final /* synthetic */ sz0 f() throws CloneNotSupportedException {
        return (sz0) clone();
    }

    public final int hashCode() {
        long j2 = this.c;
        long j3 = this.d;
        int hashCode = (((((sz0.class.getName().hashCode() + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31 * 31;
        String str = this.e;
        int i2 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f) * 31;
        String str2 = this.g;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int i3 = 1237;
        int f2 = ((((((hashCode2 + hashCode3) * 31 * 31) + 1237) * 31) + cz0.f(this.h)) * 31) + Arrays.hashCode(this.i);
        hz0 hz0 = this.j;
        int hashCode4 = ((((f2 * 31) + (hz0 == null ? 0 : hz0.hashCode())) * 31) + Arrays.hashCode(this.k)) * 31;
        String str3 = this.l;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        pz0 pz0 = this.n;
        int hashCode7 = ((hashCode6 * 31) + (pz0 == null ? 0 : pz0.hashCode())) * 31;
        String str5 = this.o;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j4 = this.p;
        qz0 qz0 = this.q;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (qz0 == null ? 0 : qz0.hashCode())) * 31) + Arrays.hashCode(this.u)) * 31;
        String str6 = this.v;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        iz0 iz0 = this.x;
        int d2 = (((((hashCode9 + hashCode10) * 31 * 31) + cz0.d(this.w)) * 31 * 31) + (iz0 == null ? 0 : iz0.hashCode())) * 31;
        if (this.y) {
            i3 = 1231;
        }
        int i4 = (d2 + i3) * 31;
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            i2 = this.b.hashCode();
        }
        return i4 + i2;
    }
}
