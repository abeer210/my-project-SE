package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class e3 {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    private final Map<at1<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private final void d(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).q(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((at1) entry2.getKey()).d(new b(status));
            }
        }
    }

    public final void b(BasePendingResult<? extends m> basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.b(new x(this, basePendingResult));
    }

    public final <TResult> void c(at1<TResult> at1, boolean z) {
        this.b.put(at1, Boolean.valueOf(z));
        at1.a().b(new w(this, at1));
    }

    public final boolean e() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }

    public final void f() {
        d(false, g.n);
    }

    public final void g() {
        d(true, f2.d);
    }
}
