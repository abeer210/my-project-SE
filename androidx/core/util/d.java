package androidx.core.util;

import vigqyno.C0201;

/* compiled from: Pair */
public class d<F, S> {
    public final F a;
    public final S b;

    public d(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> d<A, B> a(A a2, B b2) {
        return new d<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.a, this.a) || !c.a(dVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return C0201.m82(7902) + String.valueOf(this.a) + C0201.m82(7903) + String.valueOf(this.b) + C0201.m82(7904);
    }
}
