package defpackage;

/* renamed from: xv0  reason: default package */
public class xv0 {
    private volatile qw0 a;
    private volatile fu0 b;

    static {
        wu0.b();
    }

    private final qw0 b(qw0 qw0) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = qw0;
                        this.b = fu0.b;
                    } catch (qv0 unused) {
                        this.a = qw0;
                        this.b = fu0.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final int a() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.f();
        }
        return 0;
    }

    public final qw0 c(qw0 qw0) {
        qw0 qw02 = this.a;
        this.b = null;
        this.a = qw0;
        return qw02;
    }

    public final fu0 d() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? fu0.b : this.a.a();
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0 = (xv0) obj;
        qw0 qw0 = this.a;
        qw0 qw02 = xv0.a;
        return (qw0 == null && qw02 == null) ? d().equals(xv0.d()) : (qw0 == null || qw02 == null) ? qw0 != null ? qw0.equals(xv0.b(qw0.g())) : b(qw02.g()).equals(qw02) : qw0.equals(qw02);
    }

    public int hashCode() {
        return 1;
    }
}
