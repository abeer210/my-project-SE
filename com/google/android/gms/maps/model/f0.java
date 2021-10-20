package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class f0 implements Parcelable.Creator<CameraPosition> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
            } else if (l == 3) {
                f = jp0.r(parcel, t);
            } else if (l == 4) {
                f2 = jp0.r(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                f3 = jp0.r(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new CameraPosition(latLng, f, f2, f3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
