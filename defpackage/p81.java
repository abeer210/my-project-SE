package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: p81  reason: default package */
public final class p81 implements mb1 {
    private final o81 a;
    private int b;
    private int c;
    private int d = 0;

    private p81(o81 o81) {
        m91.e(o81, C0201.m82(34830));
        o81 o812 = o81;
        this.a = o812;
        o812.c = this;
    }

    public static p81 O(o81 o81) {
        p81 p81 = o81.c;
        if (p81 != null) {
            return p81;
        }
        return new p81(o81);
    }

    private final Object P(wc1 wc1, Class<?> cls, y81 y81) throws IOException {
        switch (s81.a[wc1.ordinal()]) {
            case 1:
                return Boolean.valueOf(p());
            case 2:
                return L();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(C());
            case 5:
                return Integer.valueOf(s());
            case 6:
                return Long.valueOf(v());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(z());
            case 9:
                return Long.valueOf(F());
            case 10:
                R(2);
                return V(hb1.b().a(cls), y81);
            case 11:
                return Integer.valueOf(y());
            case 12:
                return Long.valueOf(u());
            case 13:
                return Integer.valueOf(q());
            case 14:
                return Long.valueOf(t());
            case 15:
                return M();
            case 16:
                return Integer.valueOf(G());
            case 17:
                return Long.valueOf(I());
            default:
                throw new RuntimeException(C0201.m82(34831));
        }
    }

    private final void Q(List<String> list, boolean z) throws IOException {
        int o;
        int o2;
        if ((this.b & 7) != 2) {
            throw v91.g();
        } else if (!(list instanceof ca1) || z) {
            do {
                list.add(z ? M() : k());
                if (!this.a.D()) {
                    o = this.a.o();
                } else {
                    return;
                }
            } while (o == this.b);
            this.d = o;
        } else {
            ca1 ca1 = (ca1) list;
            do {
                ca1.Z(L());
                if (!this.a.D()) {
                    o2 = this.a.o();
                } else {
                    return;
                }
            } while (o2 == this.b);
            this.d = o2;
        }
    }

    private final void R(int i) throws IOException {
        if ((this.b & 7) != i) {
            throw v91.g();
        }
    }

    private static void S(int i) throws IOException {
        if ((i & 7) != 0) {
            throw v91.i();
        }
    }

    private static void T(int i) throws IOException {
        if ((i & 3) != 0) {
            throw v91.i();
        }
    }

    private final void U(int i) throws IOException {
        if (this.a.E() != i) {
            throw v91.b();
        }
    }

    private final <T> T V(lb1<T> lb1, y81 y81) throws IOException {
        int x = this.a.x();
        o81 o81 = this.a;
        if (o81.a < o81.b) {
            int i = o81.i(x);
            T e = lb1.e();
            this.a.a++;
            lb1.h(e, this, y81);
            lb1.c(e);
            this.a.f(0);
            o81 o812 = this.a;
            o812.a--;
            o812.j(i);
            return e;
        }
        throw v91.h();
    }

    private final <T> T W(lb1<T> lb1, y81 y81) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T e = lb1.e();
            lb1.h(e, this, y81);
            lb1.c(e);
            if (this.b == this.c) {
                return e;
            }
            throw v91.i();
        } finally {
            this.c = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb1
    public final <T> void A(List<T> list, lb1<T> lb1, y81 y81) throws IOException {
        int o;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(W(lb1, y81));
                if (!this.a.D() && this.d == 0) {
                    o = this.a.o();
                } else {
                    return;
                }
            } while (o == i);
            this.d = o;
            return;
        }
        throw v91.g();
    }

    @Override // defpackage.mb1
    public final void B(List<Integer> list) throws IOException {
        int o;
        int o2;
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            int i = this.b & 7;
            if (i == 2) {
                int x = this.a.x();
                T(x);
                int E = this.a.E() + x;
                do {
                    o91.e(this.a.z());
                } while (this.a.E() < E);
            } else if (i == 5) {
                do {
                    o91.e(this.a.z());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int x2 = this.a.x();
                T(x2);
                int E2 = this.a.E() + x2;
                do {
                    list.add(Integer.valueOf(this.a.z()));
                } while (this.a.E() < E2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.z()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final int C() throws IOException {
        R(0);
        return this.a.y();
    }

    @Override // defpackage.mb1
    public final void D(List<Long> list) throws IOException {
        int o;
        int o2;
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ja1.N(this.a.C());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    ja1.N(this.a.C());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.C()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Long.valueOf(this.a.C()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final boolean E() throws IOException {
        int i;
        if (this.a.D() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.g(i);
    }

    @Override // defpackage.mb1
    public final long F() throws IOException {
        R(0);
        return this.a.q();
    }

    @Override // defpackage.mb1
    public final int G() throws IOException {
        R(0);
        return this.a.x();
    }

    @Override // defpackage.mb1
    public final int H() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.o();
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == this.c) ? C0188.f24 : i2 >>> 3;
    }

    @Override // defpackage.mb1
    public final long I() throws IOException {
        R(0);
        return this.a.p();
    }

    @Override // defpackage.mb1
    public final void J(List<Integer> list) throws IOException {
        int o;
        int o2;
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    o91.e(this.a.B());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    o91.e(this.a.B());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.B()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Integer.valueOf(this.a.B()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final <T> T K(lb1<T> lb1, y81 y81) throws IOException {
        R(2);
        return (T) V(lb1, y81);
    }

    @Override // defpackage.mb1
    public final c81 L() throws IOException {
        R(2);
        return this.a.w();
    }

    @Override // defpackage.mb1
    public final String M() throws IOException {
        R(2);
        return this.a.v();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb1
    public final <K, V> void N(Map<K, V> map, ma1<K, V> ma1, y81 y81) throws IOException {
        R(2);
        int i = this.a.i(this.a.x());
        Object obj = ma1.b;
        Object obj2 = ma1.d;
        while (true) {
            try {
                int H = H();
                if (H == Integer.MAX_VALUE || this.a.D()) {
                    map.put(obj, obj2);
                } else {
                    String r6 = C0201.m82(34832);
                    if (H == 1) {
                        obj = P(ma1.a, null, null);
                    } else if (H != 2) {
                        try {
                            if (!E()) {
                                throw new v91(r6);
                            }
                        } catch (u91 unused) {
                            if (!E()) {
                                throw new v91(r6);
                            }
                        }
                    } else {
                        obj2 = P(ma1.c, ma1.d.getClass(), y81);
                    }
                }
            } finally {
                this.a.j(i);
            }
        }
        map.put(obj, obj2);
    }

    @Override // defpackage.mb1
    public final int a() {
        return this.b;
    }

    @Override // defpackage.mb1
    public final void b(List<Long> list) throws IOException {
        int o;
        int o2;
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ja1.N(this.a.q());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    ja1.N(this.a.q());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.q()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Long.valueOf(this.a.q()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void c(List<Long> list) throws IOException {
        int o;
        int o2;
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    ja1.N(this.a.p());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    ja1.N(this.a.p());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void d(List<Integer> list) throws IOException {
        int o;
        int o2;
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    o91.e(this.a.y());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    o91.e(this.a.y());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.y()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Integer.valueOf(this.a.y()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void e(List<Integer> list) throws IOException {
        int o;
        int o2;
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    o91.e(this.a.x());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    o91.e(this.a.x());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.x()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Integer.valueOf(this.a.x()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void f(List<Float> list) throws IOException {
        int o;
        int o2;
        if (list instanceof h91) {
            h91 h91 = (h91) list;
            int i = this.b & 7;
            if (i == 2) {
                int x = this.a.x();
                T(x);
                int E = this.a.E() + x;
                do {
                    h91.d(this.a.b());
                } while (this.a.E() < E);
            } else if (i == 5) {
                do {
                    h91.d(this.a.b());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int x2 = this.a.x();
                T(x2);
                int E2 = this.a.E() + x2;
                do {
                    list.add(Float.valueOf(this.a.b()));
                } while (this.a.E() < E2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.b()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void g(List<Long> list) throws IOException {
        int o;
        int o2;
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    ja1.N(this.a.s());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int x = this.a.x();
                S(x);
                int E = this.a.E() + x;
                do {
                    ja1.N(this.a.s());
                } while (this.a.E() < E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int x2 = this.a.x();
                S(x2);
                int E2 = this.a.E() + x2;
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.E() < E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void h(List<Integer> list) throws IOException {
        int o;
        int o2;
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    o91.e(this.a.r());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    o91.e(this.a.r());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void i(List<Boolean> list) throws IOException {
        int o;
        int o2;
        if (list instanceof a81) {
            a81 a81 = (a81) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a81.b(this.a.u());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int E = this.a.E() + this.a.x();
                do {
                    a81.b(this.a.u());
                } while (this.a.E() < E);
                U(E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.u()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int E2 = this.a.E() + this.a.x();
                do {
                    list.add(Boolean.valueOf(this.a.u()));
                } while (this.a.E() < E2);
                U(E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void j(List<Integer> list) throws IOException {
        int o;
        int o2;
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            int i = this.b & 7;
            if (i == 2) {
                int x = this.a.x();
                T(x);
                int E = this.a.E() + x;
                do {
                    o91.e(this.a.t());
                } while (this.a.E() < E);
            } else if (i == 5) {
                do {
                    o91.e(this.a.t());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                int x2 = this.a.x();
                T(x2);
                int E2 = this.a.E() + x2;
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.E() < E2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final String k() throws IOException {
        R(2);
        return this.a.c();
    }

    @Override // defpackage.mb1
    public final void l(List<String> list) throws IOException {
        Q(list, false);
    }

    @Override // defpackage.mb1
    public final void m(List<c81> list) throws IOException {
        int o;
        if ((this.b & 7) == 2) {
            do {
                list.add(L());
                if (!this.a.D()) {
                    o = this.a.o();
                } else {
                    return;
                }
            } while (o == this.b);
            this.d = o;
            return;
        }
        throw v91.g();
    }

    @Override // defpackage.mb1
    public final void n(List<Double> list) throws IOException {
        int o;
        int o2;
        if (list instanceof u81) {
            u81 u81 = (u81) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u81.e(this.a.a());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int x = this.a.x();
                S(x);
                int E = this.a.E() + x;
                do {
                    u81.e(this.a.a());
                } while (this.a.E() < E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.a.a()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int x2 = this.a.x();
                S(x2);
                int E2 = this.a.E() + x2;
                do {
                    list.add(Double.valueOf(this.a.a()));
                } while (this.a.E() < E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final void o(List<String> list) throws IOException {
        Q(list, true);
    }

    @Override // defpackage.mb1
    public final boolean p() throws IOException {
        R(0);
        return this.a.u();
    }

    @Override // defpackage.mb1
    public final int q() throws IOException {
        R(0);
        return this.a.B();
    }

    @Override // defpackage.mb1
    public final <T> T r(lb1<T> lb1, y81 y81) throws IOException {
        R(3);
        return (T) W(lb1, y81);
    }

    @Override // defpackage.mb1
    public final double readDouble() throws IOException {
        R(1);
        return this.a.a();
    }

    @Override // defpackage.mb1
    public final float readFloat() throws IOException {
        R(5);
        return this.a.b();
    }

    @Override // defpackage.mb1
    public final int s() throws IOException {
        R(5);
        return this.a.t();
    }

    @Override // defpackage.mb1
    public final long t() throws IOException {
        R(0);
        return this.a.C();
    }

    @Override // defpackage.mb1
    public final long u() throws IOException {
        R(1);
        return this.a.A();
    }

    @Override // defpackage.mb1
    public final long v() throws IOException {
        R(1);
        return this.a.s();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb1
    public final <T> void w(List<T> list, lb1<T> lb1, y81 y81) throws IOException {
        int o;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(V(lb1, y81));
                if (!this.a.D() && this.d == 0) {
                    o = this.a.o();
                } else {
                    return;
                }
            } while (o == i);
            this.d = o;
            return;
        }
        throw v91.g();
    }

    @Override // defpackage.mb1
    public final void x(List<Long> list) throws IOException {
        int o;
        int o2;
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    ja1.N(this.a.A());
                    if (!this.a.D()) {
                        o2 = this.a.o();
                    } else {
                        return;
                    }
                } while (o2 == this.b);
                this.d = o2;
            } else if (i == 2) {
                int x = this.a.x();
                S(x);
                int E = this.a.E() + x;
                do {
                    ja1.N(this.a.A());
                } while (this.a.E() < E);
            } else {
                throw v91.g();
            }
        } else {
            int i2 = this.b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.A()));
                    if (!this.a.D()) {
                        o = this.a.o();
                    } else {
                        return;
                    }
                } while (o == this.b);
                this.d = o;
            } else if (i2 == 2) {
                int x2 = this.a.x();
                S(x2);
                int E2 = this.a.E() + x2;
                do {
                    list.add(Long.valueOf(this.a.A()));
                } while (this.a.E() < E2);
            } else {
                throw v91.g();
            }
        }
    }

    @Override // defpackage.mb1
    public final int y() throws IOException {
        R(5);
        return this.a.z();
    }

    @Override // defpackage.mb1
    public final int z() throws IOException {
        R(0);
        return this.a.r();
    }
}
