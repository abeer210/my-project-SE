package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class j0 implements Parcelable.Creator<LatLngBounds> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                latLng2 = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new LatLngBounds(latLng, latLng2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
