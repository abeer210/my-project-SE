package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class f extends ip0 {
    public static final Parcelable.Creator<f> CREATOR = new h0();
    private LatLng a = null;
    private double b = 0.0d;
    private float c = 10.0f;
    private int d = -16777216;
    private int e = 0;
    private float f = 0.0f;
    private boolean g = true;
    private boolean h = false;
    private List<q> i = null;

    public f() {
    }

    public final float A() {
        return this.f;
    }

    public final boolean D() {
        return this.h;
    }

    public final boolean E() {
        return this.g;
    }

    public final f F(double d2) {
        this.b = d2;
        return this;
    }

    public final f G(int i2) {
        this.d = i2;
        return this;
    }

    public final f H(float f2) {
        this.c = f2;
        return this;
    }

    public final f P(float f2) {
        this.f = f2;
        return this;
    }

    public final f o(LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public final f p(int i2) {
        this.e = i2;
        return this;
    }

    public final LatLng r() {
        return this.a;
    }

    public final int s() {
        return this.e;
    }

    public final double u() {
        return this.b;
    }

    public final int w() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, r(), i2, false);
        kp0.i(parcel, 3, u());
        kp0.k(parcel, 4, z());
        kp0.n(parcel, 5, w());
        kp0.n(parcel, 6, s());
        kp0.k(parcel, 7, A());
        kp0.c(parcel, 8, E());
        kp0.c(parcel, 9, D());
        kp0.y(parcel, 10, y(), false);
        kp0.b(parcel, a2);
    }

    public final List<q> y() {
        return this.i;
    }

    public final float z() {
        return this.c;
    }

    public f(LatLng latLng, double d2, float f2, int i2, int i3, float f3, boolean z, boolean z2, List<q> list) {
        this.a = latLng;
        this.b = d2;
        this.c = f2;
        this.d = i2;
        this.e = i3;
        this.f = f3;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}
