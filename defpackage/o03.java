package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: o03  reason: default package */
/* compiled from: ASN1Object */
public abstract class o03 implements g03 {
    @Override // defpackage.g03
    public abstract u03 b();

    public byte[] e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new s03(byteArrayOutputStream).j(this);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g03)) {
            return false;
        }
        return b().equals(((g03) obj).b());
    }

    public byte[] f(String str) throws IOException {
        if (str.equals(C0201.m82(29087))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new c23(byteArrayOutputStream).j(this);
            return byteArrayOutputStream.toByteArray();
        } else if (!str.equals(C0201.m82(29088))) {
            return e();
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new p23(byteArrayOutputStream2).j(this);
            return byteArrayOutputStream2.toByteArray();
        }
    }

    public int hashCode() {
        return b().hashCode();
    }
}
