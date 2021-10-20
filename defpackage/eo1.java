package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: eo1  reason: default package */
public final class eo1 extends AbstractList<String> implements bm1, RandomAccess {
    private final bm1 a;

    public eo1(bm1 bm1) {
        this.a = bm1;
    }

    @Override // defpackage.bm1
    public final List<?> I0() {
        return this.a.I0();
    }

    @Override // defpackage.bm1
    public final bm1 U() {
        return this;
    }

    @Override // defpackage.bm1
    public final void d1(bk1 bk1) {
        throw new UnsupportedOperationException();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new go1(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new fo1(this, i);
    }

    @Override // defpackage.bm1
    public final Object m(int i) {
        return this.a.m(i);
    }

    public final int size() {
        return this.a.size();
    }
}
