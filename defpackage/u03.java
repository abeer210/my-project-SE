package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: u03  reason: default package */
/* compiled from: ASN1Primitive */
public abstract class u03 extends o03 {
    public static u03 k(byte[] bArr) throws IOException {
        l03 l03 = new l03(bArr);
        try {
            u03 s = l03.s();
            if (l03.available() == 0) {
                return s;
            }
            throw new IOException(C0201.m82(20306));
        } catch (ClassCastException unused) {
            throw new IOException(C0201.m82(20307));
        }
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this;
    }

    @Override // defpackage.o03
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g03) && g(((g03) obj).b());
    }

    public abstract boolean g(u03 u03);

    public abstract void i(s03 s03) throws IOException;

    public abstract int j() throws IOException;

    public abstract boolean l();

    public u03 o() {
        return this;
    }

    public u03 p() {
        return this;
    }
}
