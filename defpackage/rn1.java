package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rn1  reason: default package */
public final class rn1 implements Iterator<Object> {
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
