package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import vigqyno.C0201;

/* renamed from: m03  reason: default package */
/* compiled from: ASN1Integer */
public class m03 extends u03 {
    private final byte[] a;

    public m03(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
    }

    public static m03 q(Object obj) {
        if (obj == null || (obj instanceof m03)) {
            return (m03) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (m03) u03.k((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(C0201.m82(3227) + e.toString());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(3228) + obj.getClass().getName());
        }
    }

    public static m03 r(b13 b13, boolean z) {
        u03 r = b13.r();
        if (z || (r instanceof m03)) {
            return q(r);
        }
        return new m03(q03.q(b13.r()).s());
    }

    public static boolean t(byte[] bArr) {
        if (bArr.length > 1) {
            if (bArr[0] == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            return bArr[0] == -1 && (bArr[1] & 128) != 0;
        }
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof m03)) {
            return false;
        }
        return hb3.a(this.a, ((m03) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(2, this.a);
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public BigInteger s() {
        return new BigInteger(this.a);
    }

    public String toString() {
        return s().toString();
    }

    public m03(byte[] bArr) {
        this(bArr, true);
    }

    public m03(byte[] bArr, boolean z) {
        if (kb3.c(C0201.m82(3225)) || !t(bArr)) {
            this.a = z ? hb3.d(bArr) : bArr;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(3226));
    }
}
