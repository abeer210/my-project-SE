package defpackage;

import defpackage.ob0;
import vigqyno.C0201;

/* renamed from: mb0  reason: default package */
/* compiled from: DefaultImageFormatChecker */
public class mb0 implements ob0.a {
    private static final byte[] b;
    private static final int c;
    private static final byte[] d;
    private static final int e;
    private static final byte[] f = qb0.a(C0201.m82(35052));
    private static final byte[] g = qb0.a(C0201.m82(35053));
    private static final byte[] h;
    private static final int i;
    private static final byte[] j;
    private static final int k;
    private static final String[] l = {C0201.m82(35055), C0201.m82(35056), C0201.m82(35057), C0201.m82(35058), C0201.m82(35059), C0201.m82(35060)};
    private static final int m = qb0.a(C0201.m82(35061) + l[0]).length;
    public final int a = x50.a(21, 20, c, e, 6, i, k, m);

    static {
        byte[] bArr = {-1, -40, -1};
        b = bArr;
        c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        d = bArr2;
        e = bArr2.length;
        byte[] a2 = qb0.a(C0201.m82(35054));
        h = a2;
        i = a2.length;
        byte[] bArr3 = {0, 0, 1, 0};
        j = bArr3;
        k = bArr3.length;
    }

    private static ob0 c(byte[] bArr, int i2) {
        z50.b(k70.h(bArr, 0, i2));
        if (k70.g(bArr, 0)) {
            return nb0.f;
        }
        if (k70.f(bArr, 0)) {
            return nb0.g;
        }
        if (!k70.c(bArr, 0, i2)) {
            return ob0.b;
        }
        if (k70.b(bArr, 0)) {
            return nb0.j;
        }
        if (k70.d(bArr, 0)) {
            return nb0.i;
        }
        return nb0.h;
    }

    private static boolean d(byte[] bArr, int i2) {
        byte[] bArr2 = h;
        if (i2 < bArr2.length) {
            return false;
        }
        return qb0.c(bArr, bArr2);
    }

    private static boolean e(byte[] bArr, int i2) {
        if (i2 < 6) {
            return false;
        }
        if (qb0.c(bArr, f) || qb0.c(bArr, g)) {
            return true;
        }
        return false;
    }

    private static boolean f(byte[] bArr, int i2) {
        if (i2 < m || bArr[3] < 8) {
            return false;
        }
        String[] strArr = l;
        for (String str : strArr) {
            if (qb0.b(bArr, bArr.length, qb0.a(C0201.m82(35062) + str), m) > -1) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(byte[] bArr, int i2) {
        byte[] bArr2 = j;
        if (i2 < bArr2.length) {
            return false;
        }
        return qb0.c(bArr, bArr2);
    }

    private static boolean h(byte[] bArr, int i2) {
        byte[] bArr2 = b;
        return i2 >= bArr2.length && qb0.c(bArr, bArr2);
    }

    private static boolean i(byte[] bArr, int i2) {
        byte[] bArr2 = d;
        return i2 >= bArr2.length && qb0.c(bArr, bArr2);
    }

    @Override // defpackage.ob0.a
    public int a() {
        return this.a;
    }

    @Override // defpackage.ob0.a
    public final ob0 b(byte[] bArr, int i2) {
        z50.g(bArr);
        if (k70.h(bArr, 0, i2)) {
            return c(bArr, i2);
        }
        if (h(bArr, i2)) {
            return nb0.a;
        }
        if (i(bArr, i2)) {
            return nb0.b;
        }
        if (e(bArr, i2)) {
            return nb0.c;
        }
        if (d(bArr, i2)) {
            return nb0.d;
        }
        if (g(bArr, i2)) {
            return nb0.e;
        }
        if (f(bArr, i2)) {
            return nb0.k;
        }
        return ob0.b;
    }
}
