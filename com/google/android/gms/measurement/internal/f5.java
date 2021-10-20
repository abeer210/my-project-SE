package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public abstract class f5 extends d2 {
    private boolean b;

    public f5(o4 o4Var) {
        super(o4Var);
        this.a.s(this);
    }

    public void A() {
    }

    public final void v() {
        if (this.b) {
            throw new IllegalStateException(C0201.m82(32534));
        } else if (!z()) {
            this.a.G();
            this.b = true;
        }
    }

    public final boolean w() {
        return this.b;
    }

    public final void x() {
        if (!w()) {
            throw new IllegalStateException(C0201.m82(32535));
        }
    }

    public final void y() {
        if (!this.b) {
            A();
            this.a.G();
            this.b = true;
            return;
        }
        throw new IllegalStateException(C0201.m82(32536));
    }

    public abstract boolean z();
}
