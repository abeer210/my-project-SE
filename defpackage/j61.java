package defpackage;

import java.io.IOException;

/* renamed from: j61  reason: default package */
public final class j61 extends gd1<j61> {
    private static volatile j61[] g;
    public String c = null;
    public Boolean d = null;
    public Boolean e = null;
    public Integer f = null;

    public j61() {
        this.b = null;
        this.a = -1;
    }

    public static j61[] g() {
        if (g == null) {
            synchronized (kd1.b) {
                if (g == null) {
                    g = new j61[0];
                }
            }
        }
        return g;
    }

    @Override // defpackage.md1
    public final /* synthetic */ md1 a(bd1 bd1) throws IOException {
        while (true) {
            int i = bd1.i();
            if (i == 0) {
                return this;
            }
            if (i == 10) {
                this.c = bd1.b();
            } else if (i == 16) {
                this.d = Boolean.valueOf(bd1.j());
            } else if (i == 24) {
                this.e = Boolean.valueOf(bd1.j());
            } else if (i == 32) {
                this.f = Integer.valueOf(bd1.l());
            } else if (!super.f(bd1, i)) {
                return this;
            }
        }
    }

    @Override // defpackage.gd1, defpackage.md1
    public final void b(ed1 ed1) throws IOException {
        String str = this.c;
        if (str != null) {
            ed1.e(1, str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            ed1.f(2, bool.booleanValue());
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            ed1.f(3, bool2.booleanValue());
        }
        Integer num = this.f;
        if (num != null) {
            ed1.l(4, num.intValue());
        }
        super.b(ed1);
    }

    @Override // defpackage.gd1, defpackage.md1
    public final int c() {
        int c2 = super.c();
        String str = this.c;
        if (str != null) {
            c2 += ed1.k(1, str);
        }
        Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            c2 += ed1.g(2) + 1;
        }
        Boolean bool2 = this.e;
        if (bool2 != null) {
            bool2.booleanValue();
            c2 += ed1.g(3) + 1;
        }
        Integer num = this.f;
        return num != null ? c2 + ed1.q(4, num.intValue()) : c2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j61)) {
            return false;
        }
        j61 j61 = (j61) obj;
        String str = this.c;
        if (str == null) {
            if (j61.c != null) {
                return false;
            }
        } else if (!str.equals(j61.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (j61.d != null) {
                return false;
            }
        } else if (!bool.equals(j61.d)) {
            return false;
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            if (j61.e != null) {
                return false;
            }
        } else if (!bool2.equals(j61.e)) {
            return false;
        }
        Integer num = this.f;
        if (num == null) {
            if (j61.f != null) {
                return false;
            }
        } else if (!num.equals(j61.f)) {
            return false;
        }
        id1 id1 = this.b;
        if (id1 != null && !id1.b()) {
            return this.b.equals(j61.b);
        }
        id1 id12 = j61.b;
        return id12 == null || id12.b();
    }

    public final int hashCode() {
        int hashCode = (j61.class.getName().hashCode() + 527) * 31;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        id1 id1 = this.b;
        if (id1 != null && !id1.b()) {
            i = this.b.hashCode();
        }
        return hashCode5 + i;
    }
}
