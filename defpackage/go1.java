package defpackage;

import java.util.Iterator;

/* renamed from: go1  reason: default package */
public final class go1 implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ eo1 b;

    public go1(eo1 eo1) {
        this.b = eo1;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
