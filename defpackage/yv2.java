package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import vigqyno.C0201;

/* renamed from: yv2  reason: default package */
/* compiled from: Collections.kt */
public final class yv2 implements List, Serializable, RandomAccess {
    public static final yv2 a = new yv2();

    private yv2() {
    }

    public boolean a(Void r2) {
        ow2.c(r2, C0201.m82(34513));
        return false;
    }

    @Override // java.util.List
    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException(C0201.m82(34514));
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException(C0201.m82(34515));
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException(C0201.m82(34516));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(C0201.m82(34517));
    }

    public Void b(int i) {
        throw new IndexOutOfBoundsException(C0201.m82(34518) + i + '.');
    }

    public int c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException(C0201.m82(34519));
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        ow2.c(collection, C0201.m82(34520));
        return collection.isEmpty();
    }

    public int d(Void r2) {
        ow2.c(r2, C0201.m82(34521));
        return -1;
    }

    public int e(Void r2) {
        ow2.c(r2, C0201.m82(34522));
        return -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        b(i);
        throw null;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return d((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return xv2.a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return e((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return xv2.a;
    }

    @Override // java.util.List
    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException(C0201.m82(34524));
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(C0201.m82(34525));
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(C0201.m82(34526));
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(C0201.m82(34527));
    }

    @Override // java.util.List
    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException(C0201.m82(34528));
    }

    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(C0201.m82(34529) + i + C0201.m82(34530) + i2);
    }

    public Object[] toArray() {
        return kw2.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kw2.b(this, tArr);
    }

    public String toString() {
        return C0201.m82(34531);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return xv2.a;
        }
        throw new IndexOutOfBoundsException(C0201.m82(34523) + i);
    }
}
