package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class t extends ip0 {
    public static final Parcelable.Creator<t> CREATOR = new p0();
    private final List<LatLng> a;
    private final List<List<LatLng>> b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private List<q> k;

    public t() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final List<q> A() {
        return this.k;
    }

    public final float D() {
        return this.c;
    }

    public final float E() {
        return this.f;
    }

    public final boolean F() {
        return this.i;
    }

    public final boolean G() {
        return this.h;
    }

    public final boolean H() {
        return this.g;
    }

    public final t P(int i2) {
        this.d = i2;
        return this;
    }

    public final t Q(float f2) {
        this.c = f2;
        return this;
    }

    public final t R(float f2) {
        this.f = f2;
        return this;
    }

    public final t o(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.a.add(latLng);
        }
        return this;
    }

    public final t p(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.b.add(arrayList);
        return this;
    }

    public final t r(int i2) {
        this.e = i2;
        return this;
    }

    public final t s(boolean z) {
        this.h = z;
        return this;
    }

    public final int u() {
        return this.e;
    }

    public final List<LatLng> w() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.y(parcel, 2, w(), false);
        kp0.p(parcel, 3, this.b, false);
        kp0.k(parcel, 4, D());
        kp0.n(parcel, 5, y());
        kp0.n(parcel, 6, u());
        kp0.k(parcel, 7, E());
        kp0.c(parcel, 8, H());
        kp0.c(parcel, 9, G());
        kp0.c(parcel, 10, F());
        kp0.n(parcel, 11, z());
        kp0.y(parcel, 12, A(), false);
        kp0.b(parcel, a2);
    }

    public final int y() {
        return this.d;
    }

    public final int z() {
        return this.j;
    }

    public t(List<LatLng> list, List list2, float f2, int i2, int i3, float f3, boolean z, boolean z2, boolean z3, int i4, List<q> list3) {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = list;
        this.b = list2;
        this.c = f2;
        this.d = i2;
        this.e = i3;
        this.f = f3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i4;
        this.k = list3;
    }
}
