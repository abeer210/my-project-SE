package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: ka3  reason: default package */
/* compiled from: BCSphincs256PublicKey */
public class ka3 implements PublicKey, Key {
    private final p03 a;
    private final x83 b;

    public ka3(t43 t43) {
        this.a = f83.g(t43.g().k()).i().g();
        this.b = new x83(t43.j().s());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3 = (ka3) obj;
        if (!this.a.equals(ka3.a) || !hb3.a(this.b.a(), ka3.b.a())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return C0201.m82(13043);
    }

    public byte[] getEncoded() {
        try {
            return new t43(new o43(c83.e, new f83(new o43(this.a))), this.b.a()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(13044);
    }

    public int hashCode() {
        return this.a.hashCode() + (hb3.h(this.b.a()) * 37);
    }
}
