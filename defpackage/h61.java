package defpackage;

import java.io.IOException;

/* renamed from: h61  reason: default package */
public final class h61 extends gd1<h61> {
    private static volatile h61[] h;
    public Integer c = null;
    public o51[] d = new o51[0];
    public l51[] e = new l51[0];
    private Boolean f = null;
    private Boolean g = null;

    public h61() {
        this.b = null;
        this.a = -1;
    }

    public static h61[] g() {
        if (h == null) {
            synchronized (kd1.b) {
                if (h == null) {
                    h = new h61[0];
                }
            }
        }
        return h;
    }

    @Override // defpackage.md1
    public final /* synthetic */ md1 a(bd1 bd1) throws IOException {
        while (true) {
            int i = bd1.i();
            if (i == 0) {
                return this;
            }
            if (i == 8) {
                this.c = Integer.valueOf(bd1.l());
            } else if (i == 18) {
                int a = nd1.a(bd1, 18);
                o51[] o51Arr = this.d;
                int length = o51Arr == null ? 0 : o51Arr.length;
                int i2 = a + length;
                o51[] o51Arr2 = new o51[i2];
                if (length != 0) {
                    System.arraycopy(this.d, 0, o51Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    o51Arr2[length] = (o51) bd1.c(o51.N());
                    bd1.i();
                    length++;
                }
                o51Arr2[length] = (o51) bd1.c(o51.N());
                this.d = o51Arr2;
            } else if (i == 26) {
                int a2 = nd1.a(bd1, 26);
                l51[] l51Arr = this.e;
                int length2 = l51Arr == null ? 0 : l51Arr.length;
                int i3 = a2 + length2;
                l51[] l51Arr2 = new l51[i3];
                if (length2 != 0) {
                    System.arraycopy(this.e, 0, l51Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    l51Arr2[length2] = (l51) bd1.c(l51.U());
                    bd1.i();
                    length2++;
                }
                l51Arr2[length2] = (l51) bd1.c(l51.U());
                this.e = l51Arr2;
            } else if (i == 32) {
                this.f = Boolean.valueOf(bd1.j());
            } else if (i == 40) {
                this.g = Boolean.valueOf(bd1.j());
            } else if (!super.f(bd1, i)) {
                return this;
            }
        }
    }

    @Override // defpackage.gd1, defpackage.md1
    public final void b(ed1 ed1) throws IOException {
        Integer num = this.c;
        if (num != null) {
            ed1.l(1, num.intValue());
        }
        o51[] o51Arr = this.d;
        int i = 0;
        if (o51Arr != null && o51Arr.length > 0) {
            int i2 = 0;
            while (true) {
                o51[] o51Arr2 = this.d;
                if (i2 >= o51Arr2.length) {
                    break;
                }
                o51 o51 = o51Arr2[i2];
                if (o51 != null) {
                    ed1.p(2, o51);
                }
                i2++;
            }
        }
        l51[] l51Arr = this.e;
        if (l51Arr != null && l51Arr.length > 0) {
            while (true) {
                l51[] l51Arr2 = this.e;
                if (i >= l51Arr2.length) {
                    break;
                }
                l51 l51 = l51Arr2[i];
                if (l51 != null) {
                    ed1.p(3, l51);
                }
                i++;
            }
        }
        Boolean bool = this.f;
        if (bool != null) {
            ed1.f(4, bool.booleanValue());
        }
        Boolean bool2 = this.g;
        if (bool2 != null) {
            ed1.f(5, bool2.booleanValue());
        }
        super.b(ed1);
    }

    @Override // defpackage.gd1, defpackage.md1
    public final int c() {
        int c2 = super.c();
        Integer num = this.c;
        if (num != null) {
            c2 += ed1.q(1, num.intValue());
        }
        o51[] o51Arr = this.d;
        int i = 0;
        if (o51Arr != null && o51Arr.length > 0) {
            int i2 = 0;
            while (true) {
                o51[] o51Arr2 = this.d;
                if (i2 >= o51Arr2.length) {
                    break;
                }
                o51 o51 = o51Arr2[i2];
                if (o51 != null) {
                    c2 += r81.a0(2, o51);
                }
                i2++;
            }
        }
        l51[] l51Arr = this.e;
        if (l51Arr != null && l51Arr.length > 0) {
            while (true) {
                l51[] l51Arr2 = this.e;
                if (i >= l51Arr2.length) {
                    break;
                }
                l51 l51 = l51Arr2[i];
                if (l51 != null) {
                    c2 += r81.a0(3, l51);
                }
                i++;
            }
        }
        Boolean bool = this.f;
        if (bool != null) {
            bool.booleanValue();
            c2 += ed1.g(4) + 1;
        }
        Boolean bool2 = this.g;
        if (bool2 == null) {
            return c2;
        }
        bool2.booleanValue();
        return c2 + ed1.g(5) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h61)) {
            return false;
        }
        h61 h61 = (h61) obj;
        Integer num = this.c;
        if (num == null) {
            if (h61.c != null) {
                return false;
            }
        } else if (!num.equals(h61.c)) {
            return false;
        }
        if (!kd1.a(this.d, h61.d) || !kd1.a(this.e, h61.e)) {
            return false;
        }
        Boolean bool = this.f;
        if (bool == null) {
            if (h61.f != null) {
                return false;
            }
        } else if (!bool.equals(h61.f)) {
            return false;
        }
        Boolean bool2 = this.g;
        if (bool2 == null) {
            if (h61.g != null) {
                return false;
            }
        } else if (!bool2.equals(h61.g)) {
            return false;
        }
        id1 id1 = this.b;
        if (id1 != null && !id1.b()) {
            return this.b.equals(h61.b);
        }
        id1 id12 = h61.b;
        return id12 == null || id12.b();
    }

    public final int hashCode() {
        int hashCode = (h61.class.getName().hashCode() + 527) * 31;
        Integer num = this.c;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + kd1.b(this.d)) * 31) + kd1.b(this.e)) * 31;
        Boolean bool = this.f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        id1 id1 = this.b;
        if (id1 != null && !id1.b()) {
            i = this.b.hashCode();
        }
        return hashCode4 + i;
    }
}
