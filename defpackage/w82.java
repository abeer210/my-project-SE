package defpackage;

import vigqyno.C0201;

/* renamed from: w82  reason: default package */
/* compiled from: DataCharacter */
public class w82 {
    private final int a;
    private final int b;

    public w82(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w82)) {
            return false;
        }
        w82 w82 = (w82) obj;
        if (this.a == w82.a && this.b == w82.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ this.b;
    }

    public final String toString() {
        return this.a + C0201.m82(29138) + this.b + ')';
    }
}
