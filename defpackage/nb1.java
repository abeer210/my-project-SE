package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import vigqyno.C0201;

/* renamed from: nb1  reason: default package */
public final class nb1 {
    private static final Class<?> a = Y();
    private static final ec1<?, ?> b = O(false);
    private static final ec1<?, ?> c = O(true);
    private static final ec1<?, ?> d = new gc1();

    public static void A(Class<?> cls) {
        Class<?> cls2;
        if (!l91.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(C0201.m82(33064));
        }
    }

    public static void B(int i, List<Integer> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.d(i, list, z);
        }
    }

    public static void C(int i, List<Integer> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.m(i, list, z);
        }
    }

    public static void D(int i, List<Integer> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.v(i, list, z);
        }
    }

    public static void E(int i, List<Integer> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.k(i, list, z);
        }
    }

    public static void F(int i, List<Integer> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.n(i, list, z);
        }
    }

    public static void G(int i, List<Integer> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.e(i, list, z);
        }
    }

    public static void H(int i, List<Boolean> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.b(i, list, z);
        }
    }

    public static int I(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return Q(list) + (list.size() * r81.H(i));
    }

    public static int J(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return S(list) + (size * r81.H(i));
    }

    public static int K(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * r81.H(i));
    }

    public static int L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b0(list) + (size * r81.H(i));
    }

    public static int M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c0(list) + (size * r81.H(i));
    }

    public static int N(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d0(list) + (size * r81.H(i));
    }

    private static ec1<?, ?> O(boolean z) {
        try {
            Class<?> Z = Z();
            if (Z == null) {
                return null;
            }
            return (ec1) Z.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int P(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i(list) + (size * r81.H(i));
    }

    public static int Q(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            i = 0;
            while (i2 < size) {
                i += r81.T(ja1.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.T(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * r81.D0(i, 0);
    }

    public static int S(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            i = 0;
            while (i2 < size) {
                i += r81.U(ja1.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.U(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int T(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * r81.y0(i, 0);
    }

    public static int U(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ja1) {
            ja1 ja1 = (ja1) list;
            i = 0;
            while (i2 < size) {
                i += r81.V(ja1.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.V(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static ec1<?, ?> V() {
        return b;
    }

    public static ec1<?, ?> W() {
        return c;
    }

    public static ec1<?, ?> X() {
        return d;
    }

    private static Class<?> Y() {
        try {
            return Class.forName(C0201.m82(33065));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> Z() {
        try {
            return Class.forName(C0201.m82(33066));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <UT, UB> UB a(int i, int i2, UB ub, ec1<UT, UB> ec1) {
        if (ub == null) {
            ub = ec1.p();
        }
        ec1.a(ub, i, (long) i2);
        return ub;
    }

    public static int a0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * r81.d0(i, true);
    }

    public static <UT, UB> UB b(int i, List<Integer> list, r91 r91, UB ub, ec1<UT, UB> ec1) {
        if (r91 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (r91.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, ec1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!r91.a(intValue2)) {
                    ub = (UB) a(i, intValue2, ub, ec1);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int b0(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            i = 0;
            while (i2 < size) {
                i += r81.O(o91.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.O(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void c(int i, List<String> list, cd1 cd1) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.A(i, list);
        }
    }

    public static int c0(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            i = 0;
            while (i2 < size) {
                i += r81.I(o91.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.I(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void d(int i, List<?> list, cd1 cd1, lb1 lb1) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.G(i, list, lb1);
        }
    }

    public static int d0(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            i = 0;
            while (i2 < size) {
                i += r81.J(o91.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.J(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void e(int i, List<Double> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.w(i, list, z);
        }
    }

    public static <T, FT extends d91<FT>> void f(a91<FT> a91, T t, T t2) {
        b91<FT> h = a91.h(t2);
        if (!h.a.isEmpty()) {
            a91.i(t).h(h);
        }
    }

    public static <T> void g(pa1 pa1, T t, T t2, long j) {
        kc1.g(t, j, pa1.e(kc1.D(t, j), kc1.D(t2, j)));
    }

    public static <T, UT, UB> void h(ec1<UT, UB> ec1, T t, T t2) {
        ec1.j(t, ec1.l(ec1.q(t), ec1.q(t2)));
    }

    public static int i(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o91) {
            o91 o91 = (o91) list;
            i = 0;
            while (i2 < size) {
                i += r81.K(o91.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += r81.K(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int j(List<?> list) {
        return list.size() << 2;
    }

    public static int k(List<?> list) {
        return list.size() << 3;
    }

    public static int l(List<?> list) {
        return list.size();
    }

    public static void m(int i, List<c81> list, cd1 cd1) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.x(i, list);
        }
    }

    public static void n(int i, List<?> list, cd1 cd1, lb1 lb1) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.J(i, list, lb1);
        }
    }

    public static void o(int i, List<Float> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.y(i, list, z);
        }
    }

    public static int p(int i, Object obj, lb1 lb1) {
        if (obj instanceof aa1) {
            return r81.d(i, (aa1) obj);
        }
        return r81.t(i, (wa1) obj, lb1);
    }

    public static int q(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int H = r81.H(i) * size;
        if (list instanceof ca1) {
            ca1 ca1 = (ca1) list;
            while (i4 < size) {
                Object m0 = ca1.m0(i4);
                if (m0 instanceof c81) {
                    i3 = r81.u((c81) m0);
                } else {
                    i3 = r81.p0((String) m0);
                }
                H += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof c81) {
                    i2 = r81.u((c81) obj);
                } else {
                    i2 = r81.p0((String) obj);
                }
                H += i2;
                i4++;
            }
        }
        return H;
    }

    public static int r(int i, List<?> list, lb1 lb1) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H = r81.H(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof aa1) {
                i2 = r81.e((aa1) obj);
            } else {
                i2 = r81.v((wa1) obj, lb1);
            }
            H += i2;
        }
        return H;
    }

    public static void s(int i, List<Long> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.i(i, list, z);
        }
    }

    public static int t(int i, List<c81> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int H = size * r81.H(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            H += r81.u(list.get(i2));
        }
        return H;
    }

    public static int u(int i, List<wa1> list, lb1 lb1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += r81.b0(i, list.get(i3), lb1);
        }
        return i2;
    }

    public static void v(int i, List<Long> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.u(i, list, z);
        }
    }

    public static boolean w(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void x(int i, List<Long> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.t(i, list, z);
        }
    }

    public static void y(int i, List<Long> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.r(i, list, z);
        }
    }

    public static void z(int i, List<Long> list, cd1 cd1, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            cd1.j(i, list, z);
        }
    }
}
