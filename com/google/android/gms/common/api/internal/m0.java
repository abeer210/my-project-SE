package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.f;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class m0 implements f.b, f.c {
    private final /* synthetic */ f0 a;

    private m0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        if (this.a.r.l()) {
            this.a.b.lock();
            try {
                if (this.a.k != null) {
                    this.a.k.g(new k0(this.a));
                    this.a.b.unlock();
                }
            } finally {
                this.a.b.unlock();
            }
        } else {
            this.a.k.g(new k0(this.a));
        }
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void onConnectionFailed(vo0 vo0) {
        this.a.b.lock();
        try {
            if (this.a.z(vo0)) {
                this.a.o();
                this.a.m();
            } else {
                this.a.A(vo0);
            }
        } finally {
            this.a.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i) {
    }

    public /* synthetic */ m0(f0 f0Var, e0 e0Var) {
        this(f0Var);
    }
}
