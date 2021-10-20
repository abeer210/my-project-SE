package androidx.lifecycle;

import androidx.lifecycle.d;

public class CompositeGeneratedAdaptersObserver implements e {
    private final c[] a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        k kVar = new k();
        for (c cVar : this.a) {
            cVar.a(gVar, aVar, false, kVar);
        }
        for (c cVar2 : this.a) {
            cVar2.a(gVar, aVar, true, kVar);
        }
    }
}
