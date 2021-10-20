package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class o2 {
    private final r0<b<?>, vo0> a = new r0<>();
    private final r0<b<?>, String> b = new r0<>();
    private final at1<Map<b<?>, String>> c = new at1<>();
    private int d;
    private boolean e = false;

    public o2(Iterable<? extends g<?>> iterable) {
        Iterator<? extends g<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((g) it.next()).b(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final zs1<Map<b<?>, String>> a() {
        return this.c.a();
    }

    public final void b(b<?> bVar, vo0 vo0, String str) {
        this.a.put(bVar, vo0);
        this.b.put(bVar, str);
        this.d--;
        if (!vo0.u()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.c.b(new c(this.a));
            return;
        }
        this.c.c(this.b);
    }

    public final Set<b<?>> c() {
        return this.a.keySet();
    }
}
