package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: i03  reason: default package */
/* compiled from: ASN1Enumerated */
public class i03 extends u03 {
    private static i03[] b = new i03[12];
    private final byte[] a;

    public i03(byte[] bArr) {
        if (kb3.c(C0201.m82(27655)) || !m03.t(bArr)) {
            this.a = hb3.d(bArr);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(27656));
    }

    public static i03 q(byte[] bArr) {
        if (bArr.length > 1) {
            return new i03(bArr);
        }
        if (bArr.length != 0) {
            int i = bArr[0] & 255;
            i03[] i03Arr = b;
            if (i >= i03Arr.length) {
                return new i03(hb3.d(bArr));
            }
            i03 i03 = i03Arr[i];
            if (i03 != null) {
                return i03;
            }
            i03 i032 = new i03(hb3.d(bArr));
            i03Arr[i] = i032;
            return i032;
        }
        throw new IllegalArgumentException(C0201.m82(27657));
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof i03)) {
            return false;
        }
        return hb3.a(this.a, ((i03) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(10, this.a);
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }
}
