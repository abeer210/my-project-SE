package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import defpackage.yq0;
import vigqyno.C0201;

public final class k extends ip0 {
    public static final Parcelable.Creator<k> CREATOR = new i0();
    private a a;
    private LatLng b;
    private float c;
    private float d;
    private LatLngBounds e;
    private float f;
    private float g;
    private boolean h = true;
    private float i = 0.0f;
    private float j = 0.5f;
    private float k = 0.5f;
    private boolean l = false;

    public k(IBinder iBinder, LatLng latLng, float f2, float f3, LatLngBounds latLngBounds, float f4, float f5, boolean z, float f6, float f7, float f8, boolean z2) {
        this.a = new a(yq0.a.U3(iBinder));
        this.b = latLng;
        this.c = f2;
        this.d = f3;
        this.e = latLngBounds;
        this.f = f4;
        this.g = f5;
        this.h = z;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = z2;
    }

    public final float A() {
        return this.c;
    }

    public final float D() {
        return this.g;
    }

    public final k E(a aVar) {
        u.l(aVar, C0201.m82(22189));
        this.a = aVar;
        return this;
    }

    public final boolean F() {
        return this.l;
    }

    public final boolean G() {
        return this.h;
    }

    public final k H(LatLngBounds latLngBounds) {
        boolean z = this.b == null;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append(C0201.m82(22190));
        sb.append(valueOf);
        u.o(z, sb.toString());
        this.e = latLngBounds;
        return this;
    }

    public final k P(boolean z) {
        this.h = z;
        return this;
    }

    public final k Q(float f2) {
        this.g = f2;
        return this;
    }

    public final k o(float f2) {
        this.f = ((f2 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public final float p() {
        return this.j;
    }

    public final float r() {
        return this.k;
    }

    public final float s() {
        return this.f;
    }

    public final LatLngBounds u() {
        return this.e;
    }

    public final float w() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.m(parcel, 2, this.a.a().asBinder(), false);
        kp0.s(parcel, 3, y(), i2, false);
        kp0.k(parcel, 4, A());
        kp0.k(parcel, 5, w());
        kp0.s(parcel, 6, u(), i2, false);
        kp0.k(parcel, 7, s());
        kp0.k(parcel, 8, D());
        kp0.c(parcel, 9, G());
        kp0.k(parcel, 10, z());
        kp0.k(parcel, 11, p());
        kp0.k(parcel, 12, r());
        kp0.c(parcel, 13, F());
        kp0.b(parcel, a2);
    }

    public final LatLng y() {
        return this.b;
    }

    public final float z() {
        return this.i;
    }

    public k() {
    }
}
