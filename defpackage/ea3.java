package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import vigqyno.C0201;

/* renamed from: ea3  reason: default package */
/* compiled from: BCNHPublicKey */
public class ea3 implements Key, PublicKey {
    private final t83 a;

    public ea3(t43 t43) {
        this.a = new t83(t43.j().s());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ea3)) {
            return false;
        }
        return hb3.a(this.a.a(), ((ea3) obj).a.a());
    }

    public final String getAlgorithm() {
        return C0201.m82(10960);
    }

    public byte[] getEncoded() {
        try {
            return new t43(new o43(c83.f), this.a.a()).e();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return C0201.m82(10961);
    }

    public int hashCode() {
        return hb3.h(this.a.a());
    }
}
