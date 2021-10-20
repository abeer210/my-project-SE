package defpackage;

import vigqyno.C0201;

/* renamed from: c92  reason: default package */
/* compiled from: ExpandedPair */
public final class c92 {
    private final w82 a;
    private final w82 b;
    private final x82 c;

    public c92(w82 w82, w82 w822, x82 x82, boolean z) {
        this.a = w82;
        this.b = w822;
        this.c = x82;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public x82 b() {
        return this.c;
    }

    public w82 c() {
        return this.a;
    }

    public w82 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92 = (c92) obj;
        if (!a(this.a, c92.a) || !a(this.b, c92.b) || !a(this.c, c92.c)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.b == null;
    }

    public int hashCode() {
        return (e(this.a) ^ e(this.b)) ^ e(this.c);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(C0201.m82(11842));
        sb.append(this.a);
        sb.append(C0201.m82(11843));
        sb.append(this.b);
        sb.append(C0201.m82(11844));
        x82 x82 = this.c;
        if (x82 == null) {
            obj = C0201.m82(11845);
        } else {
            obj = Integer.valueOf(x82.c());
        }
        sb.append(obj);
        sb.append(C0201.m82(11846));
        return sb.toString();
    }
}
