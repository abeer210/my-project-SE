package defpackage;

import java.io.IOException;

/* renamed from: i61  reason: default package */
public final class i61 extends gd1<i61> {
    public Long c = null;
    public String d = null;
    private Integer e = null;
    public t51[] f = new t51[0];
    public j61[] g = j61.g();
    public h61[] h = h61.g();
    private String i = null;
    public Boolean j = null;

    public i61() {
        this.b = null;
        this.a = -1;
    }

    @Override // defpackage.md1
    public final /* synthetic */ md1 a(bd1 bd1) throws IOException {
        while (true) {
            int i2 = bd1.i();
            if (i2 == 0) {
                return this;
            }
            if (i2 == 8) {
                this.c = Long.valueOf(bd1.m());
            } else if (i2 == 18) {
                this.d = bd1.b();
            } else if (i2 == 24) {
                this.e = Integer.valueOf(bd1.l());
            } else if (i2 == 34) {
                int a = nd1.a(bd1, 34);
                t51[] t51Arr = this.f;
                int length = t51Arr == null ? 0 : t51Arr.length;
                int i3 = a + length;
                t51[] t51Arr2 = new t51[i3];
                if (length != 0) {
                    System.arraycopy(this.f, 0, t51Arr2, 0, length);
                }
                while (length < i3 - 1) {
                    t51Arr2[length] = (t51) bd1.c(t51.F());
                    bd1.i();
                    length++;
                }
                t51Arr2[length] = (t51) bd1.c(t51.F());
                this.f = t51Arr2;
            } else if (i2 == 42) {
                int a2 = nd1.a(bd1, 42);
                j61[] j61Arr = this.g;
                int length2 = j61Arr == null ? 0 : j61Arr.length;
                int i4 = a2 + length2;
                j61[] j61Arr2 = new j61[i4];
                if (length2 != 0) {
                    System.arraycopy(this.g, 0, j61Arr2, 0, length2);
                }
                while (length2 < i4 - 1) {
                    j61Arr2[length2] = new j61();
                    bd1.d(j61Arr2[length2]);
                    bd1.i();
                    length2++;
                }
                j61Arr2[length2] = new j61();
                bd1.d(j61Arr2[length2]);
                this.g = j61Arr2;
            } else if (i2 == 50) {
                int a3 = nd1.a(bd1, 50);
                h61[] h61Arr = this.h;
                int length3 = h61Arr == null ? 0 : h61Arr.length;
                int i5 = a3 + length3;
                h61[] h61Arr2 = new h61[i5];
                if (length3 != 0) {
                    System.arraycopy(this.h, 0, h61Arr2, 0, length3);
                }
                while (length3 < i5 - 1) {
                    h61Arr2[length3] = new h61();
                    bd1.d(h61Arr2[length3]);
                    bd1.i();
                    length3++;
                }
                h61Arr2[length3] = new h61();
                bd1.d(h61Arr2[length3]);
                this.h = h61Arr2;
            } else if (i2 == 58) {
                this.i = bd1.b();
            } else if (i2 == 64) {
                this.j = Boolean.valueOf(bd1.j());
            } else if (!super.f(bd1, i2)) {
                return this;
            }
        }
    }

    @Override // defpackage.gd1, defpackage.md1
    public final void b(ed1 ed1) throws IOException {
        Long l = this.c;
        int i2 = 0;
        if (l != null) {
            long longValue = l.longValue();
            ed1.d(1, 0);
            ed1.j(longValue);
        }
        String str = this.d;
        if (str != null) {
            ed1.e(2, str);
        }
        Integer num = this.e;
        if (num != null) {
            ed1.l(3, num.intValue());
        }
        t51[] t51Arr = this.f;
        if (t51Arr != null && t51Arr.length > 0) {
            int i3 = 0;
            while (true) {
                t51[] t51Arr2 = this.f;
                if (i3 >= t51Arr2.length) {
                    break;
                }
                t51 t51 = t51Arr2[i3];
                if (t51 != null) {
                    ed1.p(4, t51);
                }
                i3++;
            }
        }
        j61[] j61Arr = this.g;
        if (j61Arr != null && j61Arr.length > 0) {
            int i4 = 0;
            while (true) {
                j61[] j61Arr2 = this.g;
                if (i4 >= j61Arr2.length) {
                    break;
                }
                j61 j61 = j61Arr2[i4];
                if (j61 != null) {
                    ed1.b(5, j61);
                }
                i4++;
            }
        }
        h61[] h61Arr = this.h;
        if (h61Arr != null && h61Arr.length > 0) {
            while (true) {
                h61[] h61Arr2 = this.h;
                if (i2 >= h61Arr2.length) {
                    break;
                }
                h61 h61 = h61Arr2[i2];
                if (h61 != null) {
                    ed1.b(6, h61);
                }
                i2++;
            }
        }
        String str2 = this.i;
        if (str2 != null) {
            ed1.e(7, str2);
        }
        Boolean bool = this.j;
        if (bool != null) {
            ed1.f(8, bool.booleanValue());
        }
        super.b(ed1);
    }

    @Override // defpackage.gd1, defpackage.md1
    public final int c() {
        int c2 = super.c();
        Long l = this.c;
        if (l != null) {
            long longValue = l.longValue();
            c2 += ed1.g(1) + ((-128 & longValue) == 0 ? 1 : (-16384 & longValue) == 0 ? 2 : (-2097152 & longValue) == 0 ? 3 : (-268435456 & longValue) == 0 ? 4 : (-34359738368L & longValue) == 0 ? 5 : (-4398046511104L & longValue) == 0 ? 6 : (-562949953421312L & longValue) == 0 ? 7 : (-72057594037927936L & longValue) == 0 ? 8 : (longValue & Long.MIN_VALUE) == 0 ? 9 : 10);
        }
        String str = this.d;
        if (str != null) {
            c2 += ed1.k(2, str);
        }
        Integer num = this.e;
        if (num != null) {
            c2 += ed1.q(3, num.intValue());
        }
        t51[] t51Arr = this.f;
        int i2 = 0;
        if (t51Arr != null && t51Arr.length > 0) {
            int i3 = 0;
            while (true) {
                t51[] t51Arr2 = this.f;
                if (i3 >= t51Arr2.length) {
                    break;
                }
                t51 t51 = t51Arr2[i3];
                if (t51 != null) {
                    c2 += r81.a0(4, t51);
                }
                i3++;
            }
        }
        j61[] j61Arr = this.g;
        if (j61Arr != null && j61Arr.length > 0) {
            int i4 = 0;
            while (true) {
                j61[] j61Arr2 = this.g;
                if (i4 >= j61Arr2.length) {
                    break;
                }
                j61 j61 = j61Arr2[i4];
                if (j61 != null) {
                    c2 += ed1.c(5, j61);
                }
                i4++;
            }
        }
        h61[] h61Arr = this.h;
        if (h61Arr != null && h61Arr.length > 0) {
            while (true) {
                h61[] h61Arr2 = this.h;
                if (i2 >= h61Arr2.length) {
                    break;
                }
                h61 h61 = h61Arr2[i2];
                if (h61 != null) {
                    c2 += ed1.c(6, h61);
                }
                i2++;
            }
        }
        String str2 = this.i;
        if (str2 != null) {
            c2 += ed1.k(7, str2);
        }
        Boolean bool = this.j;
        if (bool == null) {
            return c2;
        }
        bool.booleanValue();
        return c2 + ed1.g(8) + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i61)) {
            return false;
        }
        i61 i61 = (i61) obj;
        Long l = this.c;
        if (l == null) {
            if (i61.c != null) {
                return false;
            }
        } else if (!l.equals(i61.c)) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (i61.d != null) {
                return false;
            }
        } else if (!str.equals(i61.d)) {
            return false;
        }
        Integer num = this.e;
        if (num == null) {
            if (i61.e != null) {
                return false;
            }
        } else if (!num.equals(i61.e)) {
            return false;
        }
        if (!kd1.a(this.f, i61.f) || !kd1.a(this.g, i61.g) || !kd1.a(this.h, i61.h)) {
            return false;
        }
        String str2 = this.i;
        if (str2 == null) {
            if (i61.i != null) {
                return false;
            }
        } else if (!str2.equals(i61.i)) {
            return false;
        }
        Boolean bool = this.j;
        if (bool == null) {
            if (i61.j != null) {
                return false;
            }
        } else if (!bool.equals(i61.j)) {
            return false;
        }
        id1 id1 = this.b;
        if (id1 != null && !id1.b()) {
            return this.b.equals(i61.b);
        }
        id1 id12 = i61.b;
        return id12 == null || id12.b();
    }

    public final int hashCode() {
        int hashCode = (i61.class.getName().hashCode() + 527) * 31;
        Long l = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + kd1.b(this.f)) * 31) + kd1.b(this.g)) * 31) + kd1.b(this.h)) * 31;
        String str2 = this.i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        id1 id1 = this.b;
        if (id1 != null && !id1.b()) {
            i2 = this.b.hashCode();
        }
        return hashCode6 + i2;
    }
}
