package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import vigqyno.C0201;

/* renamed from: kx0  reason: default package */
public final class kx0 {
    private static final Class<?> a = C();
    private static final ay0<?, ?> b = w(false);
    private static final ay0<?, ?> c = w(true);
    private static final ay0<?, ?> d = new cy0();

    public static ay0<?, ?> A() {
        return c;
    }

    public static ay0<?, ?> B() {
        return d;
    }

    private static Class<?> C() {
        try {
            return Class.forName(C0201.m82(21748));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName(C0201.m82(21749));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lv0) {
            lv0 lv0 = (lv0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.C0(lv0.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.C0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void F(int i, List<Long> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.t(i, list, z);
        }
    }

    public static int G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lv0) {
            lv0 lv0 = (lv0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.D0(lv0.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.D0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void H(int i, List<Long> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.r(i, list, z);
        }
    }

    public static void I(Class<?> cls) {
        Class<?> cls2;
        if (!kv0.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0201.m82(21750));
        }
    }

    public static int J(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lv0) {
            lv0 lv0 = (lv0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.E0(lv0.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.E0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void K(int i, List<Long> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.j(i, list, z);
        }
    }

    public static int L(List<?> list) {
        return list.size() << 2;
    }

    public static void M(int i, List<Integer> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.d(i, list, z);
        }
    }

    public static int N(List<?> list) {
        return list.size() << 3;
    }

    public static void O(int i, List<Integer> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.m(i, list, z);
        }
    }

    public static int P(List<?> list) {
        return list.size();
    }

    public static void Q(int i, List<Integer> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.v(i, list, z);
        }
    }

    public static void R(int i, List<Integer> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.k(i, list, z);
        }
    }

    public static void S(int i, List<Integer> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.n(i, list, z);
        }
    }

    public static void T(int i, List<Integer> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.e(i, list, z);
        }
    }

    public static void U(int i, List<Boolean> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.b(i, list, z);
        }
    }

    public static int V(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * ru0.B0(i));
    }

    public static int W(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * ru0.B0(i));
    }

    public static int X(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + (size * ru0.B0(i));
    }

    public static int Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * ru0.B0(i));
    }

    public static int Z(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * ru0.B0(i));
    }

    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ew0) {
            ew0 ew0 = (ew0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.e0(ew0.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.e0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int a0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * ru0.B0(i));
    }

    private static <UT, UB> UB b(int i, int i2, UB ub, ay0<UT, UB> ay0) {
        if (ub == null) {
            ub = ay0.f();
        }
        ay0.a(ub, i, (long) i2);
        return ub;
    }

    public static int b0(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * ru0.B0(i));
    }

    public static <UT, UB> UB c(int i, List<Integer> list, ov0<?> ov0, UB ub, ay0<UT, UB> ay0) {
        if (ov0 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (ov0.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) b(i, intValue, ub, ay0);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (ov0.a(intValue2) == null) {
                    ub = (UB) b(i, intValue2, ub, ay0);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int c0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ru0.t0(i, 0);
    }

    public static void d(int i, List<String> list, vy0 vy0) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.A(i, list);
        }
    }

    public static int d0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ru0.k0(i, 0);
    }

    public static void e(int i, List<?> list, vy0 vy0, ix0 ix0) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.H(i, list, ix0);
        }
    }

    public static int e0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ru0.P(i, true);
    }

    public static void f(int i, List<Double> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.w(i, list, z);
        }
    }

    public static <T, FT extends ev0<FT>> void g(xu0<FT> xu0, T t, T t2) {
        bv0<FT> b2 = xu0.b(t2);
        if (!b2.b()) {
            xu0.d(t).i(b2);
        }
    }

    public static <T> void h(lw0 lw0, T t, T t2, long j) {
        hy0.i(t, j, lw0.e(hy0.M(t, j), hy0.M(t2, j)));
    }

    public static <T, UT, UB> void i(ay0<UT, UB> ay0, T t, T t2) {
        ay0.g(t, ay0.i(ay0.k(t), ay0.k(t2)));
    }

    public static int j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ew0) {
            ew0 ew0 = (ew0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.h0(ew0.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.h0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void k(int i, List<fu0> list, vy0 vy0) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.x(i, list);
        }
    }

    public static void l(int i, List<?> list, vy0 vy0, ix0 ix0) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.G(i, list, ix0);
        }
    }

    public static void m(int i, List<Float> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.y(i, list, z);
        }
    }

    public static int n(int i, Object obj, ix0 ix0) {
        return obj instanceof xv0 ? ru0.d(i, (xv0) obj) : ru0.A(i, (qw0) obj, ix0);
    }

    public static int o(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int B0 = ru0.B0(i) * size;
        if (list instanceof zv0) {
            zv0 zv0 = (zv0) list;
            while (i2 < size) {
                Object m = zv0.m(i2);
                B0 += m instanceof fu0 ? ru0.C((fu0) m) : ru0.q0((String) m);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                B0 += obj instanceof fu0 ? ru0.C((fu0) obj) : ru0.q0((String) obj);
                i2++;
            }
        }
        return B0;
    }

    public static int p(int i, List<?> list, ix0 ix0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B0 = ru0.B0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            B0 += obj instanceof xv0 ? ru0.e((xv0) obj) : ru0.D((qw0) obj, ix0);
        }
        return B0;
    }

    public static int q(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ew0) {
            ew0 ew0 = (ew0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.l0(ew0.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.l0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void r(int i, List<Long> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.i(i, list, z);
        }
    }

    public static boolean s(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    public static int t(int i, List<fu0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B0 = size * ru0.B0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            B0 += ru0.C(list.get(i2));
        }
        return B0;
    }

    public static int u(int i, List<qw0> list, ix0 ix0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ru0.O(i, list.get(i3), ix0);
        }
        return i2;
    }

    public static int v(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lv0) {
            lv0 lv0 = (lv0) list;
            i = 0;
            while (i2 < size) {
                i += ru0.H0(lv0.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += ru0.H0(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static ay0<?, ?> w(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (ay0) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void x(int i, List<Long> list, vy0 vy0, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            vy0.u(i, list, z);
        }
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static ay0<?, ?> z() {
        return b;
    }
}
