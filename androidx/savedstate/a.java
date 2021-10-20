package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import vigqyno.C0201;

/* compiled from: SavedStateRegistryController */
public final class a {
    private final b a;
    private final SavedStateRegistry b = new SavedStateRegistry();

    private a(b bVar) {
        this.a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        d lifecycle = this.a.getLifecycle();
        if (lifecycle.b() == d.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.a));
            this.b.b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException(C0201.m82(20853));
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}
