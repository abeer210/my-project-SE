package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import vigqyno.C0201;

/* renamed from: kn1  reason: default package */
public final class kn1 {
    private static final Class<?> a = B();
    private static final bo1<?, ?> b = G(false);
    private static final bo1<?, ?> c = G(true);
    private static final bo1<?, ?> d = new do1();

    public static bo1<?, ?> A() {
        return d;
    }

    private static Class<?> B() {
        try {
            return Class.forName(C0201.m82(3387));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> C() {
        try {
            return Class.forName(C0201.m82(3388));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(int i, List<Integer> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.d(i, list, z);
        }
    }

    public static void E(int i, List<Integer> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.m(i, list, z);
        }
    }

    public static void F(int i, List<Integer> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.v(i, list, z);
        }
    }

    private static bo1<?, ?> G(boolean z) {
        try {
            Class<?> C = C();
            if (C == null) {
                return null;
            }
            return (bo1) C.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void H(int i, List<Integer> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.k(i, list, z);
        }
    }

    public static void I(int i, List<Integer> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.n(i, list, z);
        }
    }

    public static void J(int i, List<Integer> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.e(i, list, z);
        }
    }

    public static void K(int i, List<Boolean> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.b(i, list, z);
        }
    }

    public static int L(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return O(list) + (list.size() * qk1.u(i));
    }

    public static int M(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * qk1.u(i));
    }

    public static int N(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return S(list) + (size * qk1.u(i));
    }

    public static int O(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.t0(gm1.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.t0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int P(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * qk1.u(i));
    }

    public static int Q(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.y0(gm1.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.y0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int R(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return W(list) + (size * qk1.u(i));
    }

    public static int S(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.B0(gm1.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.B0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int T(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * qk1.u(i));
    }

    public static int U(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.N(ll1.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.N(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int V(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * qk1.u(i));
    }

    public static int W(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.v(ll1.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.v(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * qk1.E0(i, 0);
    }

    public static int Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.w(ll1.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int Z(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * qk1.o0(i, 0);
    }

    public static <UT, UB> UB a(int i, int i2, UB ub, bo1<UT, UB> bo1) {
        if (ub == null) {
            ub = bo1.n();
        }
        bo1.a(ub, i, (long) i2);
        return ub;
    }

    public static int a0(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            i = 0;
            while (i2 < size) {
                i += qk1.x(ll1.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += qk1.x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static <UT, UB> UB b(int i, List<Integer> list, pl1<?> pl1, UB ub, bo1<UT, UB> bo1) {
        if (pl1 == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = list.get(i3).intValue();
            if (pl1.a(intValue) != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue));
                }
                i2++;
            } else {
                ub = (UB) a(i, intValue, ub, bo1);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static int b0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * qk1.T(i, true);
    }

    public static <UT, UB> UB c(int i, List<Integer> list, ql1 ql1, UB ub, bo1<UT, UB> bo1) {
        if (ql1 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (ql1.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, bo1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!ql1.a(intValue2)) {
                    ub = (UB) a(i, intValue2, ub, bo1);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int c0(List<?> list) {
        return list.size() << 2;
    }

    public static void d(int i, List<String> list, xo1 xo1) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.A(i, list);
        }
    }

    public static int d0(List<?> list) {
        return list.size() << 3;
    }

    public static void e(int i, List<?> list, xo1 xo1, in1 in1) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.L(i, list, in1);
        }
    }

    public static int e0(List<?> list) {
        return list.size();
    }

    public static void f(int i, List<Double> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.w(i, list, z);
        }
    }

    public static <T, FT extends dl1<FT>> void g(xk1<FT> xk1, T t, T t2) {
        bl1<FT> g = xk1.g(t2);
        if (!g.b()) {
            xk1.h(t).i(g);
        }
    }

    public static <T> void h(om1 om1, T t, T t2, long j) {
        ho1.g(t, j, om1.e(ho1.L(t, j), ho1.L(t2, j)));
    }

    public static <T, UT, UB> void i(bo1<UT, UB> bo1, T t, T t2) {
        bo1.k(t, bo1.m(bo1.q(t), bo1.q(t2)));
    }

    public static void j(int i, List<bk1> list, xo1 xo1) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.x(i, list);
        }
    }

    public static void k(int i, List<?> list, xo1 xo1, in1 in1) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.J(i, list, in1);
        }
    }

    public static void l(int i, List<Float> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.y(i, list, z);
        }
    }

    public static int m(int i, Object obj, in1 in1) {
        if (obj instanceof zl1) {
            return qk1.d(i, (zl1) obj);
        }
        return qk1.D(i, (tm1) obj, in1);
    }

    public static int n(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int u = qk1.u(i) * size;
        if (list instanceof bm1) {
            bm1 bm1 = (bm1) list;
            while (i4 < size) {
                Object m = bm1.m(i4);
                if (m instanceof bk1) {
                    i3 = qk1.F((bk1) m);
                } else {
                    i3 = qk1.K0((String) m);
                }
                u += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof bk1) {
                    i2 = qk1.F((bk1) obj);
                } else {
                    i2 = qk1.K0((String) obj);
                }
                u += i2;
                i4++;
            }
        }
        return u;
    }

    public static int o(int i, List<?> list, in1 in1) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = qk1.u(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zl1) {
                i2 = qk1.e((zl1) obj);
            } else {
                i2 = qk1.G((tm1) obj, in1);
            }
            u += i2;
        }
        return u;
    }

    public static void p(int i, List<Long> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.i(i, list, z);
        }
    }

    public static int q(int i, List<bk1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u = size * qk1.u(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            u += qk1.F(list.get(i2));
        }
        return u;
    }

    public static int r(int i, List<tm1> list, in1 in1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += qk1.S(i, list.get(i3), in1);
        }
        return i2;
    }

    public static void s(int i, List<Long> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.u(i, list, z);
        }
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void u(int i, List<Long> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.t(i, list, z);
        }
    }

    public static void v(int i, List<Long> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.r(i, list, z);
        }
    }

    public static void w(int i, List<Long> list, xo1 xo1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            xo1.j(i, list, z);
        }
    }

    public static void x(Class<?> cls) {
        Class<?> cls2;
        if (!kl1.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0201.m82(3389));
        }
    }

    public static bo1<?, ?> y() {
        return b;
    }

    public static bo1<?, ?> z() {
        return c;
    }
}
