package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: jc1  reason: default package */
public final class jc1 extends AbstractList<String> implements ca1, RandomAccess {
    private final ca1 a;

    public jc1(ca1 ca1) {
        this.a = ca1;
    }

    @Override // defpackage.ca1
    public final ca1 Q0() {
        return this;
    }

    @Override // defpackage.ca1
    public final List<?> Y0() {
        return this.a.Y0();
    }

    @Override // defpackage.ca1
    public final void Z(c81 c81) {
        throw new UnsupportedOperationException();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new lc1(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new ic1(this, i);
    }

    @Override // defpackage.ca1
    public final Object m0(int i) {
        return this.a.m0(i);
    }

    public final int size() {
        return this.a.size();
    }
}
