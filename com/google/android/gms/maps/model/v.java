package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class v extends ip0 {
    public static final Parcelable.Creator<v> CREATOR = new q0();
    private final List<LatLng> a;
    private float b;
    private int c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private d h;
    private d i;
    private int j;
    private List<q> k;

    public v() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new c();
        this.i = new c();
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
    }

    public final List<LatLng> A() {
        return this.a;
    }

    public final d D() {
        return this.h;
    }

    public final float E() {
        return this.b;
    }

    public final float F() {
        return this.d;
    }

    public final boolean G() {
        return this.g;
    }

    public final boolean H() {
        return this.f;
    }

    public final boolean P() {
        return this.e;
    }

    public final v Q(List<q> list) {
        this.k = list;
        return this;
    }

    public final v R(d dVar) {
        u.l(dVar, C0201.m82(20773));
        this.h = dVar;
        return this;
    }

    public final v T(float f2) {
        this.b = f2;
        return this;
    }

    public final v V(float f2) {
        this.d = f2;
        return this;
    }

    public final v o(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.a.add(latLng);
        }
        return this;
    }

    public final v p(int i2) {
        this.c = i2;
        return this;
    }

    public final v r(d dVar) {
        u.l(dVar, C0201.m82(20774));
        this.i = dVar;
        return this;
    }

    public final v s(boolean z) {
        this.f = z;
        return this;
    }

    public final int u() {
        return this.c;
    }

    public final d w() {
        return this.i;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.y(parcel, 2, A(), false);
        kp0.k(parcel, 3, E());
        kp0.n(parcel, 4, u());
        kp0.k(parcel, 5, F());
        kp0.c(parcel, 6, P());
        kp0.c(parcel, 7, H());
        kp0.c(parcel, 8, G());
        kp0.s(parcel, 9, D(), i2, false);
        kp0.s(parcel, 10, w(), i2, false);
        kp0.n(parcel, 11, y());
        kp0.y(parcel, 12, z(), false);
        kp0.b(parcel, a2);
    }

    public final int y() {
        return this.j;
    }

    public final List<q> z() {
        return this.k;
    }

    public v(List list, float f2, int i2, float f3, boolean z, boolean z2, boolean z3, d dVar, d dVar2, int i3, List<q> list2) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new c();
        this.i = new c();
        this.j = 0;
        this.k = null;
        this.a = list;
        this.b = f2;
        this.c = i2;
        this.d = f3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (dVar != null) {
            this.h = dVar;
        }
        if (dVar2 != null) {
            this.i = dVar2;
        }
        this.j = i3;
        this.k = list2;
    }
}
