package defpackage;

import vigqyno.C0201;

/* renamed from: zq2  reason: default package */
/* compiled from: COSInteger */
public final class zq2 extends cr2 {
    private static final zq2[] d = new zq2[357];
    public static final zq2 e = H(0);
    public static final zq2 f = H(1);
    public static final zq2 g = H(2);
    public static final zq2 h = H(3);
    private final long c;

    private zq2(long j) {
        this.c = j;
    }

    public static zq2 H(long j) {
        if (-100 > j || j > 256) {
            return new zq2(j);
        }
        int i = ((int) j) + 100;
        zq2[] zq2Arr = d;
        if (zq2Arr[i] == null) {
            zq2Arr[i] = new zq2(j);
        }
        return d[i];
    }

    @Override // defpackage.cr2
    public int A() {
        return (int) this.c;
    }

    @Override // defpackage.cr2
    public long E() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zq2) && ((zq2) obj).A() == A();
    }

    public int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >> 32));
    }

    @Override // defpackage.cr2
    public float r() {
        return (float) this.c;
    }

    public String toString() {
        return C0201.m82(16699) + this.c + C0201.m82(16700);
    }
}
