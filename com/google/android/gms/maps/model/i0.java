package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class i0 implements Parcelable.Creator<k> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    iBinder = jp0.u(parcel, t);
                    break;
                case 3:
                    latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
                    break;
                case 4:
                    f = jp0.r(parcel, t);
                    break;
                case 5:
                    f2 = jp0.r(parcel, t);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) jp0.e(parcel, t, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = jp0.r(parcel, t);
                    break;
                case 8:
                    f4 = jp0.r(parcel, t);
                    break;
                case 9:
                    z = jp0.m(parcel, t);
                    break;
                case 10:
                    f5 = jp0.r(parcel, t);
                    break;
                case 11:
                    f6 = jp0.r(parcel, t);
                    break;
                case 12:
                    f7 = jp0.r(parcel, t);
                    break;
                case 13:
                    z2 = jp0.m(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new k(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i) {
        return new k[i];
    }
}
