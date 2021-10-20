package defpackage;

import java.util.Iterator;

/* renamed from: gy0  reason: default package */
public final class gy0 implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ ey0 b;

    public gy0(ey0 ey0) {
        this.b = ey0;
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
