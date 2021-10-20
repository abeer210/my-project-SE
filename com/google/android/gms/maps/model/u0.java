package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class u0 implements Parcelable.Creator<b0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                iBinder = jp0.u(parcel, t);
            } else if (l == 3) {
                z = jp0.m(parcel, t);
            } else if (l == 4) {
                f = jp0.r(parcel, t);
            } else if (l == 5) {
                z2 = jp0.m(parcel, t);
            } else if (l != 6) {
                jp0.B(parcel, t);
            } else {
                f2 = jp0.r(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new b0(iBinder, z, f, z2, f2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0[] newArray(int i) {
        return new b0[i];
    }
}
