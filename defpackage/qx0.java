package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: qx0  reason: default package */
public final class qx0 implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
