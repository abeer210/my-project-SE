package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ha1  reason: default package */
public final class ha1 extends fa1 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private ha1() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j, int i) {
        da1 da1;
        List<L> list;
        List<L> g = g(obj, j);
        if (g.isEmpty()) {
            if (g instanceof ca1) {
                list = new da1(i);
            } else if (!(g instanceof ib1) || !(g instanceof s91)) {
                list = new ArrayList<>(i);
            } else {
                list = ((s91) g).Z0(i);
            }
            kc1.g(obj, j, list);
            return list;
        }
        if (c.isAssignableFrom(g.getClass())) {
            ArrayList arrayList = new ArrayList(g.size() + i);
            arrayList.addAll(g);
            kc1.g(obj, j, arrayList);
            da1 = arrayList;
        } else if (g instanceof jc1) {
            da1 da12 = new da1(g.size() + i);
            da12.addAll((jc1) g);
            kc1.g(obj, j, da12);
            da1 = da12;
        } else if (!(g instanceof ib1) || !(g instanceof s91)) {
            return g;
        } else {
            s91 s91 = (s91) g;
            if (s91.n0()) {
                return g;
            }
            s91 Z0 = s91.Z0(g.size() + i);
            kc1.g(obj, j, Z0);
            return Z0;
        }
        return da1;
    }

    private static <E> List<E> g(Object obj, long j) {
        return (List) kc1.D(obj, j);
    }

    @Override // defpackage.fa1
    public final <L> List<L> a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // defpackage.fa1
    public final <E> void b(Object obj, Object obj2, long j) {
        List g = g(obj2, j);
        List f = f(obj, j, g.size());
        int size = f.size();
        int size2 = g.size();
        if (size > 0 && size2 > 0) {
            f.addAll(g);
        }
        if (size > 0) {
            g = f;
        }
        kc1.g(obj, j, g);
    }

    @Override // defpackage.fa1
    public final void c(Object obj, long j) {
        Object obj2;
        List list = (List) kc1.D(obj, j);
        if (list instanceof ca1) {
            obj2 = ((ca1) list).Q0();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof ib1) || !(list instanceof s91)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                s91 s91 = (s91) list;
                if (s91.n0()) {
                    s91.c0();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        kc1.g(obj, j, obj2);
    }
}
