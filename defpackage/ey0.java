package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ey0  reason: default package */
public final class ey0 extends AbstractList<String> implements zv0, RandomAccess {
    private final zv0 a;

    public ey0(zv0 zv0) {
        this.a = zv0;
    }

    @Override // defpackage.zv0
    public final List<?> K() {
        return this.a.K();
    }

    @Override // defpackage.zv0
    public final zv0 W0() {
        return this;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new gy0(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new fy0(this, i);
    }

    @Override // defpackage.zv0
    public final Object m(int i) {
        return this.a.m(i);
    }

    public final int size() {
        return this.a.size();
    }
}
