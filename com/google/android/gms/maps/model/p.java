package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.yq0;
import vigqyno.C0201;

public final class p extends ip0 {
    public static final Parcelable.Creator<p> CREATOR = new m0();
    private LatLng a;
    private String b;
    private String c;
    private a d;
    private float e = 0.5f;
    private float f = 1.0f;
    private boolean g;
    private boolean h = true;
    private boolean i = false;
    private float j = 0.0f;
    private float k = 0.5f;
    private float l = 0.0f;
    private float m = 1.0f;
    private float n;

    public p() {
    }

    public final float A() {
        return this.k;
    }

    public final float D() {
        return this.l;
    }

    public final LatLng E() {
        return this.a;
    }

    public final float F() {
        return this.j;
    }

    public final String G() {
        return this.c;
    }

    public final String H() {
        return this.b;
    }

    public final float P() {
        return this.n;
    }

    public final p Q(a aVar) {
        this.d = aVar;
        return this;
    }

    public final p R(float f2, float f3) {
        this.k = f2;
        this.l = f3;
        return this;
    }

    public final boolean T() {
        return this.g;
    }

    public final boolean V() {
        return this.i;
    }

    public final boolean d0() {
        return this.h;
    }

    public final p e0(LatLng latLng) {
        if (latLng != null) {
            this.a = latLng;
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(22191));
    }

    public final p f0(float f2) {
        this.j = f2;
        return this;
    }

    public final p g0(String str) {
        this.c = str;
        return this;
    }

    public final p i0(String str) {
        this.b = str;
        return this;
    }

    public final p j0(float f2) {
        this.n = f2;
        return this;
    }

    public final p o(float f2) {
        this.m = f2;
        return this;
    }

    public final p p(float f2, float f3) {
        this.e = f2;
        this.f = f3;
        return this;
    }

    public final p r(boolean z) {
        this.g = z;
        return this;
    }

    public final p s(boolean z) {
        this.i = z;
        return this;
    }

    public final float u() {
        return this.m;
    }

    public final float w() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, E(), i2, false);
        kp0.u(parcel, 3, H(), false);
        kp0.u(parcel, 4, G(), false);
        a aVar = this.d;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.a().asBinder();
        }
        kp0.m(parcel, 5, iBinder, false);
        kp0.k(parcel, 6, w());
        kp0.k(parcel, 7, y());
        kp0.c(parcel, 8, T());
        kp0.c(parcel, 9, d0());
        kp0.c(parcel, 10, V());
        kp0.k(parcel, 11, F());
        kp0.k(parcel, 12, A());
        kp0.k(parcel, 13, D());
        kp0.k(parcel, 14, u());
        kp0.k(parcel, 15, P());
        kp0.b(parcel, a2);
    }

    public final float y() {
        return this.f;
    }

    public final a z() {
        return this.d;
    }

    public p(LatLng latLng, String str, String str2, IBinder iBinder, float f2, float f3, boolean z, boolean z2, boolean z3, float f4, float f5, float f6, float f7, float f8) {
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.d = null;
        } else {
            this.d = new a(yq0.a.U3(iBinder));
        }
        this.e = f2;
        this.f = f3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.n = f8;
    }
}
