package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public abstract class n8 extends k8 {
    private boolean c;

    public n8(m8 m8Var) {
        super(m8Var);
        this.b.t(this);
    }

    public final void r() {
        if (!this.c) {
            u();
            this.b.f0();
            this.c = true;
            return;
        }
        throw new IllegalStateException(C0201.m82(13892));
    }

    public final boolean s() {
        return this.c;
    }

    public final void t() {
        if (!s()) {
            throw new IllegalStateException(C0201.m82(13893));
        }
    }

    public abstract boolean u();
}
