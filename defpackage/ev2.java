package defpackage;

import java.io.Serializable;
import vigqyno.C0201;

/* renamed from: ev2  reason: default package */
/* compiled from: Tuples.kt */
public final class ev2<A, B, C> implements Serializable {
    private final A a;
    private final B b;
    private final C c;

    public ev2(A a2, B b2, C c2) {
        this.a = a2;
        this.b = b2;
        this.c = c2;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final C c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev2)) {
            return false;
        }
        ev2 ev2 = (ev2) obj;
        return ow2.a(this.a, ev2.a) && ow2.a(this.b, ev2.b) && ow2.a(this.c, ev2.c);
    }

    public int hashCode() {
        A a2 = this.a;
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.c;
        if (c2 != null) {
            i = c2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((Object) this.a);
        String r1 = C0201.m82(21108);
        sb.append(r1);
        sb.append((Object) this.b);
        sb.append(r1);
        sb.append((Object) this.c);
        sb.append(')');
        return sb.toString();
    }
}
