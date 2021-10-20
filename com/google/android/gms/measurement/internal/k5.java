package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public abstract class k5 extends l5 {
    private boolean b;

    public k5(o4 o4Var) {
        super(o4Var);
        this.a.t(this);
    }

    public final void n() {
        if (this.b) {
            throw new IllegalStateException(C0201.m82(27904));
        } else if (!r()) {
            this.a.G();
            this.b = true;
        }
    }

    public final boolean o() {
        return this.b;
    }

    public final void p() {
        if (!o()) {
            throw new IllegalStateException(C0201.m82(27905));
        }
    }

    public final void q() {
        if (!this.b) {
            s();
            this.a.G();
            this.b = true;
            return;
        }
        throw new IllegalStateException(C0201.m82(27906));
    }

    public abstract boolean r();

    public void s() {
    }
}
