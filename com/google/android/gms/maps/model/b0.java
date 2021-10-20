package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class b0 extends ip0 {
    public static final Parcelable.Creator<b0> CREATOR = new u0();
    private f31 a;
    private c0 b;
    private boolean c = true;
    private float d;
    private boolean e = true;
    private float f = 0.0f;

    public b0() {
    }

    public final boolean o() {
        return this.e;
    }

    public final float p() {
        return this.f;
    }

    public final float r() {
        return this.d;
    }

    public final boolean s() {
        return this.c;
    }

    public final b0 u(c0 c0Var) {
        t0 t0Var;
        this.b = c0Var;
        if (c0Var == null) {
            t0Var = null;
        } else {
            t0Var = new t0(this, c0Var);
        }
        this.a = t0Var;
        return this;
    }

    public final b0 w(float f2) {
        u.b(f2 >= 0.0f && f2 <= 1.0f, C0201.m82(29302));
        this.f = f2;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.m(parcel, 2, this.a.asBinder(), false);
        kp0.c(parcel, 3, s());
        kp0.k(parcel, 4, r());
        kp0.c(parcel, 5, o());
        kp0.k(parcel, 6, p());
        kp0.b(parcel, a2);
    }

    public final b0 y(float f2) {
        this.d = f2;
        return this;
    }

    public b0(IBinder iBinder, boolean z, float f2, boolean z2, float f3) {
        s0 s0Var;
        f31 U3 = g31.U3(iBinder);
        this.a = U3;
        if (U3 == null) {
            s0Var = null;
        } else {
            s0Var = new s0(this);
        }
        this.b = s0Var;
        this.c = z;
        this.d = f2;
        this.e = z2;
        this.f = f3;
    }
}
