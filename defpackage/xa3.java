package defpackage;

import vigqyno.C0201;

/* renamed from: xa3  reason: default package */
/* compiled from: GF2mField */
public class xa3 {
    private int a = 0;
    private int b;

    public xa3(byte[] bArr) {
        int length = bArr.length;
        String r1 = C0201.m82(36952);
        if (length == 4) {
            int d = bb3.d(bArr);
            this.b = d;
            if (fb3.c(d)) {
                this.a = fb3.a(this.b);
                return;
            }
            throw new IllegalArgumentException(r1);
        }
        throw new IllegalArgumentException(r1);
    }

    private static String i(int i) {
        if (i == 0) {
            return C0201.m82(36953);
        }
        String r0 = ((byte) (i & 1)) == 1 ? C0201.m82(36954) : C0201.m82(36955);
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                r0 = r0 + C0201.m82(36956) + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return r0;
    }

    public int a(int i, int i2) {
        return i ^ i2;
    }

    public String b(int i) {
        String r0 = C0201.m82(36957);
        for (int i2 = 0; i2 < this.a; i2++) {
            r0 = (((byte) i) & 1) == 0 ? C0201.m82(36958) + r0 : C0201.m82(36959) + r0;
            i >>>= 1;
        }
        return r0;
    }

    public int c(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = f(i);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = h(i3, i);
            }
            i = h(i, i);
            i2 >>>= 1;
        }
        return i3;
    }

    public int d() {
        return this.a;
    }

    public byte[] e() {
        return bb3.c(this.b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof xa3)) {
            xa3 xa3 = (xa3) obj;
            if (this.a == xa3.a && this.b == xa3.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int f(int i) {
        return c(i, (1 << this.a) - 2);
    }

    public boolean g(int i) {
        int i2 = this.a;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public int h(int i, int i2) {
        return fb3.d(i, i2, this.b);
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return C0201.m82(36960) + this.a + C0201.m82(36961) + i(this.b) + C0201.m82(36962);
    }
}
