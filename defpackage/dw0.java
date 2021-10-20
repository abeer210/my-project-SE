package defpackage;

/* renamed from: dw0  reason: default package */
public final class dw0 extends aw0 {
    private dw0() {
        super();
    }

    private static <E> pv0<E> e(Object obj, long j) {
        return (pv0) hy0.M(obj, j);
    }

    @Override // defpackage.aw0
    public final void a(Object obj, long j) {
        e(obj, j).L0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // defpackage.aw0
    public final <E> void b(Object obj, Object obj2, long j) {
        pv0<E> e = e(obj, j);
        pv0<E> e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        pv0<E> pv0 = e;
        pv0 = e;
        if (size > 0 && size2 > 0) {
            boolean E0 = e.E0();
            pv0<E> pv02 = e;
            if (!E0) {
                pv02 = e.B0(size2 + size);
            }
            pv02.addAll(e2);
            pv0 = pv02;
        }
        if (size > 0) {
            e2 = pv0;
        }
        hy0.i(obj, j, e2);
    }
}
