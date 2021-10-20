package defpackage;

import java.util.List;

/* renamed from: ga1  reason: default package */
public final class ga1 extends fa1 {
    private ga1() {
        super();
    }

    private static <E> s91<E> f(Object obj, long j) {
        return (s91) kc1.D(obj, j);
    }

    @Override // defpackage.fa1
    public final <L> List<L> a(Object obj, long j) {
        s91 f = f(obj, j);
        if (f.n0()) {
            return f;
        }
        int size = f.size();
        s91 Z0 = f.Z0(size == 0 ? 10 : size << 1);
        kc1.g(obj, j, Z0);
        return Z0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // defpackage.fa1
    public final <E> void b(Object obj, Object obj2, long j) {
        s91<E> f = f(obj, j);
        s91<E> f2 = f(obj2, j);
        int size = f.size();
        int size2 = f2.size();
        s91<E> s91 = f;
        s91 = f;
        if (size > 0 && size2 > 0) {
            boolean n0 = f.n0();
            s91<E> s912 = f;
            if (!n0) {
                s912 = f.Z0(size2 + size);
            }
            s912.addAll(f2);
            s91 = s912;
        }
        if (size > 0) {
            f2 = s91;
        }
        kc1.g(obj, j, f2);
    }

    @Override // defpackage.fa1
    public final void c(Object obj, long j) {
        f(obj, j).c0();
    }
}
