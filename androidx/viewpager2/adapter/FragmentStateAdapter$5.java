package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;

public class FragmentStateAdapter$5 implements e {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ Runnable b;

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        if (aVar == d.a.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            gVar.getLifecycle().c(this);
        }
    }
}
