package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class x2 implements o1 {
    private final /* synthetic */ v2 a;

    private x2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void a(vo0 vo0) {
        this.a.m.lock();
        try {
            this.a.j = vo0;
            this.a.A();
        } finally {
            this.a.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void b(Bundle bundle) {
        this.a.m.lock();
        try {
            this.a.n(bundle);
            this.a.j = vo0.e;
            this.a.A();
        } finally {
            this.a.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void c(int i, boolean z) {
        this.a.m.lock();
        try {
            if (!(this.a.l) && this.a.k != null) {
                if (this.a.k.u()) {
                    this.a.l = true;
                    this.a.e.onConnectionSuspended(i);
                    this.a.m.unlock();
                    return;
                }
            }
            this.a.l = false;
            this.a.m(i, z);
        } finally {
            this.a.m.unlock();
        }
    }

    public /* synthetic */ x2(v2 v2Var, y2 y2Var) {
        this(v2Var);
    }
}
