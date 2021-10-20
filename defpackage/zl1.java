package defpackage;

/* renamed from: zl1  reason: default package */
public class zl1 {
    private volatile tm1 a;
    private volatile bk1 b;

    static {
        wk1.d();
    }

    private final tm1 c(tm1 tm1) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = tm1;
                        this.b = bk1.b;
                    } catch (sl1 unused) {
                        this.a = tm1;
                        this.b = bk1.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final bk1 a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = bk1.b;
            } else {
                this.b = this.a.a();
            }
            return this.b;
        }
    }

    public final int b() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.f();
        }
        return 0;
    }

    public final tm1 d(tm1 tm1) {
        tm1 tm12 = this.a;
        this.b = null;
        this.a = tm1;
        return tm12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1 = (zl1) obj;
        tm1 tm1 = this.a;
        tm1 tm12 = zl1.a;
        if (tm1 == null && tm12 == null) {
            return a().equals(zl1.a());
        }
        if (tm1 != null && tm12 != null) {
            return tm1.equals(tm12);
        }
        if (tm1 != null) {
            return tm1.equals(zl1.c(tm1.e()));
        }
        return c(tm12.e()).equals(tm12);
    }

    public int hashCode() {
        return 1;
    }
}
