package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import vigqyno.C0201;

public final class h implements Iterator<String> {
    private Iterator<String> a = this.b.a.keySet().iterator();
    private final /* synthetic */ i b;

    public h(i iVar) {
        this.b = iVar;
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
        throw new UnsupportedOperationException(C0201.m82(33341));
    }
}
