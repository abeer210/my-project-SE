package androidx.fragment.app;

import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;

/* compiled from: FragmentViewLifecycleOwner */
public class r implements g {
    private h a = null;

    public void a(d.a aVar) {
        this.a.i(aVar);
    }

    public void c() {
        if (this.a == null) {
            this.a = new h(this);
        }
    }

    public boolean d() {
        return this.a != null;
    }

    @Override // androidx.lifecycle.g
    public d getLifecycle() {
        c();
        return this.a;
    }
}
