package com.google.firebase.components;

import com.google.android.gms.common.internal.u;

/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final class n {
    private final Class<?> a;
    private final int b;
    private final int c;

    private n(Class<?> cls, int i, int i2) {
        u.l(cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public static n e(Class<?> cls) {
        return new n(cls, 1, 0);
    }

    public static n f(Class<?> cls) {
        return new n(cls, 2, 0);
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.c == 0;
    }

    public boolean c() {
        return this.b == 1;
    }

    public boolean d() {
        return this.b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && this.b == nVar.b && this.c == nVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
