package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import vigqyno.C0201;

/* renamed from: da3  reason: default package */
/* compiled from: BCNHPrivateKey */
public class da3 implements Key, PrivateKey {
    private final s83 a;

    public da3(e43 e43) throws IOException {
        this.a = new s83(a(q03.q(e43.j()).s()));
    }

    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = jb3.g(bArr, i * 2);
        }
        return sArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof da3)) {
            return false;
        }
        return hb3.c(this.a.a(), ((da3) obj).a.a());
    }

    public final String getAlgorithm() {
        return C0201.m82(23990);
    }

    public byte[] getEncoded() {
        try {
            o43 o43 = new o43(c83.f);
            short[] a2 = this.a.a();
            byte[] bArr = new byte[(a2.length * 2)];
            for (int i = 0; i != a2.length; i++) {
                jb3.k(a2[i], bArr, i * 2);
            }
            return new e43(o43, new a23(bArr)).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(23991);
    }

    public int hashCode() {
        return hb3.k(this.a.a());
    }
}
