package defpackage;

import java.util.Map;

/* renamed from: va2  reason: default package */
/* compiled from: Decoder */
public final class va2 {
    private final r72 a = new r72(p72.l);

    private void a(byte[] bArr, int i) throws i62 {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (s72 unused) {
            throw i62.a();
        }
    }

    private f72 c(ra2 ra2, Map<j62, ?> map) throws k62, i62 {
        ab2 e = ra2.e();
        wa2 d = ra2.d().d();
        sa2[] b = sa2.b(ra2.c(), e, d);
        int i = 0;
        for (sa2 sa2 : b) {
            i += sa2.c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (sa2 sa22 : b) {
            byte[] a2 = sa22.a();
            int c = sa22.c();
            a(a2, c);
            int i3 = 0;
            while (i3 < c) {
                bArr[i2] = a2[i3];
                i3++;
                i2++;
            }
        }
        return ua2.a(bArr, e, d, map);
    }

    public f72 b(c72 c72, Map<j62, ?> map) throws k62, i62 {
        i62 e;
        ra2 ra2 = new ra2(c72);
        k62 k62 = null;
        try {
            return c(ra2, map);
        } catch (k62 e2) {
            e = null;
            k62 = e2;
            try {
                ra2.f();
                ra2.g(true);
                ra2.e();
                ra2.d();
                ra2.b();
                f72 c = c(ra2, map);
                c.m(new za2(true));
                return c;
            } catch (i62 | k62 unused) {
                if (k62 != null) {
                    throw k62;
                }
                throw e;
            }
        } catch (i62 e3) {
            e = e3;
            ra2.f();
            ra2.g(true);
            ra2.e();
            ra2.d();
            ra2.b();
            f72 c2 = c(ra2, map);
            c2.m(new za2(true));
            return c2;
        }
    }
}
