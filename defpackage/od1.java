package defpackage;

import java.util.Arrays;

/* renamed from: od1  reason: default package */
public final class od1 {
    public final int a;
    public final byte[] b;

    public od1(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof od1)) {
            return false;
        }
        od1 od1 = (od1) obj;
        return this.a == od1.a && Arrays.equals(this.b, od1.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
