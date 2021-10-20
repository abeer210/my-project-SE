package defpackage;

import androidx.core.util.d;
import vigqyno.C0201;

/* renamed from: nc  reason: default package */
/* compiled from: MutablePair */
public class nc<T> {
    public T a;
    public T b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!a(dVar.a, this.a) || !a(dVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return C0201.m82(33285) + String.valueOf(this.a) + C0201.m82(33286) + String.valueOf(this.b) + C0201.m82(33287);
    }
}
