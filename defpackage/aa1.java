package defpackage;

/* renamed from: aa1  reason: default package */
public class aa1 {
    private volatile wa1 a;
    private volatile c81 b;

    static {
        y81.d();
    }

    private final wa1 a(wa1 wa1) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = wa1;
                        this.b = c81.b;
                    } catch (v91 unused) {
                        this.a = wa1;
                        this.b = c81.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final wa1 b(wa1 wa1) {
        wa1 wa12 = this.a;
        this.b = null;
        this.a = wa1;
        return wa12;
    }

    public final c81 c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = c81.b;
            } else {
                this.b = this.a.c();
            }
            return this.b;
        }
    }

    public final int d() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.a();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa1)) {
            return false;
        }
        aa1 aa1 = (aa1) obj;
        wa1 wa1 = this.a;
        wa1 wa12 = aa1.a;
        if (wa1 == null && wa12 == null) {
            return c().equals(aa1.c());
        }
        if (wa1 != null && wa12 != null) {
            return wa1.equals(wa12);
        }
        if (wa1 != null) {
            return wa1.equals(aa1.a(wa1.e()));
        }
        return a(wa12.e()).equals(wa12);
    }

    public int hashCode() {
        return 1;
    }
}
