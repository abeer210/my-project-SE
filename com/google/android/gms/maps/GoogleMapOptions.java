package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import vigqyno.C0201;

public final class GoogleMapOptions extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new k();
    private Boolean a;
    private Boolean b;
    private int c = -1;
    private CameraPosition d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n = null;
    private Float o = null;
    private LatLngBounds p = null;
    private Boolean q;

    public GoogleMapOptions(byte b2, byte b3, int i2, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f2, Float f3, LatLngBounds latLngBounds, byte b13) {
        this.a = yp1.b(b2);
        this.b = yp1.b(b3);
        this.c = i2;
        this.d = cameraPosition;
        this.e = yp1.b(b4);
        this.f = yp1.b(b5);
        this.g = yp1.b(b6);
        this.h = yp1.b(b7);
        this.i = yp1.b(b8);
        this.j = yp1.b(b9);
        this.k = yp1.b(b10);
        this.l = yp1.b(b11);
        this.m = yp1.b(b12);
        this.n = f2;
        this.o = f3;
        this.p = latLngBounds;
        this.q = yp1.b(b13);
    }

    public final CameraPosition o() {
        return this.d;
    }

    public final LatLngBounds p() {
        return this.p;
    }

    public final int r() {
        return this.c;
    }

    public final Float s() {
        return this.o;
    }

    public final String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(18884), Integer.valueOf(this.c));
        c2.a(C0201.m82(18885), this.k);
        c2.a(C0201.m82(18886), this.d);
        c2.a(C0201.m82(18887), this.f);
        c2.a(C0201.m82(18888), this.e);
        c2.a(C0201.m82(18889), this.g);
        c2.a(C0201.m82(18890), this.h);
        c2.a(C0201.m82(18891), this.i);
        c2.a(C0201.m82(18892), this.j);
        c2.a(C0201.m82(18893), this.q);
        c2.a(C0201.m82(18894), this.l);
        c2.a(C0201.m82(18895), this.m);
        c2.a(C0201.m82(18896), this.n);
        c2.a(C0201.m82(18897), this.o);
        c2.a(C0201.m82(18898), this.p);
        c2.a(C0201.m82(18899), this.a);
        c2.a(C0201.m82(18900), this.b);
        return c2.toString();
    }

    public final Float u() {
        return this.n;
    }

    public final GoogleMapOptions w(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.f(parcel, 2, yp1.a(this.a));
        kp0.f(parcel, 3, yp1.a(this.b));
        kp0.n(parcel, 4, r());
        kp0.s(parcel, 5, o(), i2, false);
        kp0.f(parcel, 6, yp1.a(this.e));
        kp0.f(parcel, 7, yp1.a(this.f));
        kp0.f(parcel, 8, yp1.a(this.g));
        kp0.f(parcel, 9, yp1.a(this.h));
        kp0.f(parcel, 10, yp1.a(this.i));
        kp0.f(parcel, 11, yp1.a(this.j));
        kp0.f(parcel, 12, yp1.a(this.k));
        kp0.f(parcel, 14, yp1.a(this.l));
        kp0.f(parcel, 15, yp1.a(this.m));
        kp0.l(parcel, 16, u(), false);
        kp0.l(parcel, 17, s(), false);
        kp0.s(parcel, 18, p(), i2, false);
        kp0.f(parcel, 19, yp1.a(this.q));
        kp0.b(parcel, a2);
    }

    public GoogleMapOptions() {
    }
}
