package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kb1  reason: default package */
public final class kb1<E> extends w71<E> {
    private static final kb1<Object> c;
    private final List<E> b;

    static {
        kb1<Object> kb1 = new kb1<>(new ArrayList(0));
        c = kb1;
        kb1.c0();
    }

    private kb1(List<E> list) {
        this.b = list;
    }

    public static <E> kb1<E> b() {
        return (kb1<E>) c;
    }

    @Override // defpackage.s91
    public final /* synthetic */ s91 Z0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new kb1(arrayList);
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
