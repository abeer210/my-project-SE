package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: r13  reason: default package */
/* compiled from: DERBitString */
public class r13 extends d03 {
    public r13(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static r13 v(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new r13(bArr2, b);
        }
        throw new IllegalArgumentException(C0201.m82(9059));
    }

    public static r13 w(Object obj) {
        if (obj == null || (obj instanceof r13)) {
            return (r13) obj;
        }
        if (obj instanceof o23) {
            o23 o23 = (o23) obj;
            return new r13(o23.a, o23.b);
        } else if (obj instanceof byte[]) {
            try {
                return (r13) u03.k((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(C0201.m82(9060) + e.toString());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(9061) + obj.getClass().getName());
        }
    }

    public static r13 x(b13 b13, boolean z) {
        u03 r = b13.r();
        if (z || (r instanceof r13)) {
            return w(r);
        }
        return v(((q03) r).s());
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        byte[] q = d03.q(this.a, this.b);
        int length = q.length + 1;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) u();
        System.arraycopy(q, 0, bArr, 1, length - 1);
        s03.g(3, bArr);
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length + 1) + 1 + this.a.length + 1;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public r13(byte[] bArr) {
        this(bArr, 0);
    }

    public r13(g03 g03) throws IOException {
        super(g03.b().f(C0201.m82(9058)), 0);
    }
}
