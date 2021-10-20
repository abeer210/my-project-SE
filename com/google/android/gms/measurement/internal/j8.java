package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;

public final class j8 {
    private final e a;
    private long b;

    public j8(e eVar) {
        u.k(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.b = 0;
    }

    public final void b() {
        this.b = this.a.b();
    }

    public final boolean c(long j) {
        if (this.b != 0 && this.a.b() - this.b < 3600000) {
            return false;
        }
        return true;
    }
}
