package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class o0 implements Parcelable.Creator<r> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l == 3) {
                str = jp0.f(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                str2 = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new r(latLng, str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i) {
        return new r[i];
    }
}
