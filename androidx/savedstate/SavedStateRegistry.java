package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;
import vigqyno.C0201;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {
    private i0<String, b> a = new i0<>();
    private Bundle b;
    private boolean c;
    public boolean d;

    public interface a {
        void a(b bVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException(C0201.m82(21429));
    }

    public void b(d dVar, Bundle bundle) {
        if (!this.c) {
            if (bundle != null) {
                this.b = bundle.getBundle(C0201.m82(21430));
            }
            dVar.a(new e() {
                /* class androidx.savedstate.SavedStateRegistry.AnonymousClass1 */

                @Override // androidx.lifecycle.e
                public void c(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_START) {
                        SavedStateRegistry.this.d = true;
                    } else if (aVar == d.a.ON_STOP) {
                        SavedStateRegistry.this.d = false;
                    }
                }
            });
            this.c = true;
            return;
        }
        throw new IllegalStateException(C0201.m82(21431));
    }

    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        i0<K, V>.d c2 = this.a.c();
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle(C0201.m82(21432), bundle2);
    }
}
