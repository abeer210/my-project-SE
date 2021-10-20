package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import defpackage.yq0;
import vigqyno.C0201;

public class d extends ip0 {
    public static final Parcelable.Creator<d> CREATOR = new g0();
    private final int a;
    private final a b;
    private final Float c;

    private d(int i, a aVar, Float f) {
        u.b(i != 3 || (aVar != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), String.format(C0201.m82(21426), Integer.valueOf(i), aVar, f));
        this.a = i;
        this.b = aVar;
        this.c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && s.a(this.b, dVar.b) && s.a(this.c, dVar.c);
    }

    public int hashCode() {
        return s.b(Integer.valueOf(this.a), this.b, this.c);
    }

    public String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(23);
        sb.append(C0201.m82(21427));
        sb.append(i);
        sb.append(C0201.m82(21428));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        a aVar = this.b;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.a().asBinder();
        }
        kp0.m(parcel, 3, iBinder, false);
        kp0.l(parcel, 4, this.c, false);
        kp0.b(parcel, a2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public d(int i, IBinder iBinder, Float f) {
        this(i, r3, f);
        a aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            aVar = new a(yq0.a.U3(iBinder));
        }
    }

    public d(int i) {
        this(i, (a) null, (Float) null);
    }
}
