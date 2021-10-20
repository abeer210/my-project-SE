package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

public final class h0 implements c.AbstractC0058c {
    private final WeakReference<f0> a;
    private final a<?> b;
    private final boolean c;

    public h0(f0 f0Var, a<?> aVar, boolean z) {
        this.a = new WeakReference<>(f0Var);
        this.b = aVar;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.c.AbstractC0058c
    public final void a(vo0 vo0) {
        f0 f0Var = this.a.get();
        if (f0Var != null) {
            u.o(Looper.myLooper() == f0Var.a.n.m(), C0201.m82(7977));
            f0Var.b.lock();
            try {
                if (f0Var.w(0)) {
                    if (!vo0.u()) {
                        f0Var.s(vo0, this.b, this.c);
                    }
                    if (f0Var.l()) {
                        f0Var.m();
                    }
                    f0Var.b.unlock();
                }
            } finally {
                f0Var.b.unlock();
            }
        }
    }
}
