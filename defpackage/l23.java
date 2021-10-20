package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: l23  reason: default package */
/* compiled from: DERUniversalString */
public class l23 extends u03 implements a13 {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] a;

    public l23(byte[] bArr) {
        this.a = hb3.d(bArr);
    }

    @Override // defpackage.a13
    public String c() {
        StringBuffer stringBuffer = new StringBuffer(C0201.m82(10160));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new s03(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(b[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(b[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new t03(C0201.m82(10161));
        }
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof l23)) {
            return false;
        }
        return hb3.a(this.a, ((l23) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(28, q());
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public byte[] q() {
        return hb3.d(this.a);
    }

    public String toString() {
        return c();
    }
}
