package defpackage;

import java.util.Arrays;

/* renamed from: jp1  reason: default package */
public final class jp1 {
    public final int a;
    public final byte[] b;

    public jp1(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1 = (jp1) obj;
        return this.a == jp1.a && Arrays.equals(this.b, jp1.b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
