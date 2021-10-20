package defpackage;

import java.util.List;

/* renamed from: fm1  reason: default package */
public final class fm1 extends cm1 {
    private fm1() {
        super();
    }

    private static <E> rl1<E> f(Object obj, long j) {
        return (rl1) ho1.L(obj, j);
    }

    @Override // defpackage.cm1
    public final <L> List<L> a(Object obj, long j) {
        rl1 f = f(obj, j);
        if (f.n()) {
            return f;
        }
        int size = f.size();
        rl1 C0 = f.C0(size == 0 ? 10 : size << 1);
        ho1.g(obj, j, C0);
        return C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // defpackage.cm1
    public final <E> void b(Object obj, Object obj2, long j) {
        rl1<E> f = f(obj, j);
        rl1<E> f2 = f(obj2, j);
        int size = f.size();
        int size2 = f2.size();
        rl1<E> rl1 = f;
        rl1 = f;
        if (size > 0 && size2 > 0) {
            boolean n = f.n();
            rl1<E> rl12 = f;
            if (!n) {
                rl12 = f.C0(size2 + size);
            }
            rl12.addAll(f2);
            rl1 = rl12;
        }
        if (size > 0) {
            f2 = rl1;
        }
        ho1.g(obj, j, f2);
    }

    @Override // defpackage.cm1
    public final void c(Object obj, long j) {
        f(obj, j).h();
    }
}
