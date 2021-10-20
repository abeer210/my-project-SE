package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cw0  reason: default package */
public final class cw0 extends aw0 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private cw0() {
        super();
    }

    private static <E> List<E> e(Object obj, long j) {
        return (List) hy0.M(obj, j);
    }

    @Override // defpackage.aw0
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) hy0.M(obj, j);
        if (list instanceof zv0) {
            obj2 = ((zv0) list).W0();
        } else if (!c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        hy0.i(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aw0
    public final <E> void b(Object obj, Object obj2, long j) {
        yv0 yv0;
        List e = e(obj2, j);
        int size = e.size();
        List e2 = e(obj, j);
        if (e2.isEmpty()) {
            e2 = e2 instanceof zv0 ? new yv0(size) : new ArrayList(size);
            hy0.i(obj, j, e2);
        } else {
            if (c.isAssignableFrom(e2.getClass())) {
                ArrayList arrayList = new ArrayList(e2.size() + size);
                arrayList.addAll(e2);
                yv0 = arrayList;
            } else if (e2 instanceof ey0) {
                yv0 yv02 = new yv0(e2.size() + size);
                yv02.addAll((ey0) e2);
                yv0 = yv02;
            }
            hy0.i(obj, j, yv0);
            e2 = yv0;
        }
        int size2 = e2.size();
        int size3 = e.size();
        if (size2 > 0 && size3 > 0) {
            e2.addAll(e);
        }
        if (size2 > 0) {
            e = e2;
        }
        hy0.i(obj, j, e);
    }
}
