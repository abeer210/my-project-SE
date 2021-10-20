package defpackage;

import java.util.Iterator;

/* renamed from: lc1  reason: default package */
public final class lc1 implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ jc1 b;

    public lc1(jc1 jc1) {
        this.b = jc1;
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
