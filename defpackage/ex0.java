package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ex0  reason: default package */
public final class ex0<E> extends yt0<E> {
    private static final ex0<Object> c;
    private final List<E> b;

    static {
        ex0<Object> ex0 = new ex0<>();
        c = ex0;
        ex0.L0();
    }

    public ex0() {
        this(new ArrayList(10));
    }

    private ex0(List<E> list) {
        this.b = list;
    }

    public static <E> ex0<E> b() {
        return (ex0<E>) c;
    }

    @Override // defpackage.pv0
    public final /* synthetic */ pv0 B0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new ex0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i, E e) {
        a();
        this.b.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public final E remove(int i) {
        a();
        E remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E set(int i, E e) {
        a();
        E e2 = this.b.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    public final int size() {
        return this.b.size();
    }
}
