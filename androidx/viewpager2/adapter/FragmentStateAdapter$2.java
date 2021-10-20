package androidx.viewpager2.adapter;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;

public class FragmentStateAdapter$2 implements e {
    public final /* synthetic */ b a;
    public final /* synthetic */ a b;

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        if (!this.b.u()) {
            gVar.getLifecycle().c(this);
            this.a.M();
            throw null;
        }
    }
}
