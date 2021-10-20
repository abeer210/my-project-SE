package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import vigqyno.C0201;

/* renamed from: xv2  reason: default package */
/* compiled from: Collections.kt */
public final class xv2 implements ListIterator {
    public static final xv2 a = new xv2();

    private xv2() {
    }

    public Void a() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException(C0201.m82(7972));
    }

    public Void b() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public /* bridge */ /* synthetic */ Object next() {
        a();
        throw null;
    }

    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ Object previous() {
        b();
        throw null;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException(C0201.m82(7973));
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException(C0201.m82(7974));
    }
}
