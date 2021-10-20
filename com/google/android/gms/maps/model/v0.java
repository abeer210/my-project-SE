package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class v0 implements Parcelable.Creator<e0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l == 3) {
                latLng2 = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l == 4) {
                latLng3 = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l == 5) {
                latLng4 = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l != 6) {
                jp0.B(parcel, t);
            } else {
                latLngBounds = (LatLngBounds) jp0.e(parcel, t, LatLngBounds.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new e0(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i) {
        return new e0[i];
    }
}
