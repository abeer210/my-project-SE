package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: d03  reason: default package */
/* compiled from: ASN1BitString */
public abstract class d03 extends u03 implements a13 {
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;
    public final int b;

    public d03(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException(C0201.m82(29070));
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException(C0201.m82(29068));
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException(C0201.m82(29069));
        } else {
            this.a = hb3.d(bArr);
            this.b = i;
        }
    }

    public static byte[] q(byte[] bArr, int i) {
        byte[] d = hb3.d(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            d[length] = (byte) ((255 << i) & d[length]);
        }
        return d;
    }

    public static d03 r(int i, InputStream inputStream) throws IOException {
        if (i >= 1) {
            int read = inputStream.read();
            int i2 = i - 1;
            byte[] bArr = new byte[i2];
            if (i2 != 0) {
                if (sb3.c(inputStream, bArr) != i2) {
                    throw new EOFException(C0201.m82(29071));
                } else if (read > 0 && read < 8) {
                    int i3 = i2 - 1;
                    if (bArr[i3] != ((byte) (bArr[i3] & (255 << read)))) {
                        return new o23(bArr, read);
                    }
                }
            }
            return new r13(bArr, read);
        }
        throw new IllegalArgumentException(C0201.m82(29072));
    }

    @Override // defpackage.a13
    public String c() {
        StringBuffer stringBuffer = new StringBuffer(C0201.m82(29073));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new s03(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(c[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(c[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new t03(C0201.m82(29074) + e.getMessage(), e);
        }
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof d03)) {
            return false;
        }
        d03 d03 = (d03) u03;
        if (this.b != d03.b || !hb3.a(s(), d03.s())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.o03
    public int hashCode() {
        return this.b ^ hb3.h(s());
    }

    @Override // defpackage.u03
    public u03 o() {
        return new r13(this.a, this.b);
    }

    @Override // defpackage.u03
    public u03 p() {
        return new o23(this.a, this.b);
    }

    public byte[] s() {
        return q(this.a, this.b);
    }

    public byte[] t() {
        if (this.b == 0) {
            return hb3.d(this.a);
        }
        throw new IllegalStateException(C0201.m82(29075));
    }

    public String toString() {
        return c();
    }

    public int u() {
        return this.b;
    }
}
