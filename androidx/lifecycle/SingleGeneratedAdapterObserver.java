package androidx.lifecycle;

import androidx.lifecycle.d;

public class SingleGeneratedAdapterObserver implements e {
    private final c a;

    public SingleGeneratedAdapterObserver(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        this.a.a(gVar, aVar, false, null);
        this.a.a(gVar, aVar, true, null);
    }
}
