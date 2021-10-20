package defpackage;

import vigqyno.C0201;

/* renamed from: db3  reason: default package */
/* compiled from: Permutation */
public class db3 {
    private int[] a;

    public db3(byte[] bArr) {
        int length = bArr.length;
        String r1 = C0201.m82(21409);
        if (length > 4) {
            int e = bb3.e(bArr, 0);
            int a2 = ab3.a(e - 1);
            if (bArr.length == (e * a2) + 4) {
                this.a = new int[e];
                for (int i = 0; i < e; i++) {
                    this.a[i] = bb3.f(bArr, (i * a2) + 4, a2);
                }
                if (!b(this.a)) {
                    throw new IllegalArgumentException(r1);
                }
                return;
            }
            throw new IllegalArgumentException(r1);
        }
        throw new IllegalArgumentException(r1);
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] >= length || zArr[iArr[i]]) {
                return false;
            }
            zArr[iArr[i]] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.a.length;
        int a2 = ab3.a(length - 1);
        byte[] bArr = new byte[((length * a2) + 4)];
        bb3.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            bb3.b(this.a[i], bArr, (i * a2) + 4, a2);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof db3)) {
            return false;
        }
        return za3.b(this.a, ((db3) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = C0201.m82(21410) + this.a[0];
        for (int i = 1; i < this.a.length; i++) {
            str = str + C0201.m82(21411) + this.a[i];
        }
        return str + C0201.m82(21412);
    }
}
