package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: em1  reason: default package */
public final class em1 extends cm1 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private em1() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j, int i) {
        am1 am1;
        List<L> list;
        List<L> g = g(obj, j);
        if (g.isEmpty()) {
            if (g instanceof bm1) {
                list = new am1(i);
            } else if (!(g instanceof en1) || !(g instanceof rl1)) {
                list = new ArrayList<>(i);
            } else {
                list = ((rl1) g).C0(i);
            }
            ho1.g(obj, j, list);
            return list;
        }
        if (c.isAssignableFrom(g.getClass())) {
            ArrayList arrayList = new ArrayList(g.size() + i);
            arrayList.addAll(g);
            ho1.g(obj, j, arrayList);
            am1 = arrayList;
        } else if (g instanceof eo1) {
            am1 am12 = new am1(g.size() + i);
            am12.addAll((eo1) g);
            ho1.g(obj, j, am12);
            am1 = am12;
        } else if (!(g instanceof en1) || !(g instanceof rl1)) {
            return g;
        } else {
            rl1 rl1 = (rl1) g;
            if (rl1.n()) {
                return g;
            }
            rl1 C0 = rl1.C0(g.size() + i);
            ho1.g(obj, j, C0);
            return C0;
        }
        return am1;
    }

    private static <E> List<E> g(Object obj, long j) {
        return (List) ho1.L(obj, j);
    }

    @Override // defpackage.cm1
    public final <L> List<L> a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // defpackage.cm1
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
        ho1.g(obj, j, g);
    }

    @Override // defpackage.cm1
    public final void c(Object obj, long j) {
        Object obj2;
        List list = (List) ho1.L(obj, j);
        if (list instanceof bm1) {
            obj2 = ((bm1) list).U();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof en1) || !(list instanceof rl1)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                rl1 rl1 = (rl1) list;
                if (rl1.n()) {
                    rl1.h();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        ho1.g(obj, j, obj2);
    }
}
