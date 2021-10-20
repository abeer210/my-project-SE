package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class k implements Parcelable.Creator<GoogleMapOptions> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    b = jp0.o(parcel, t);
                    break;
                case 3:
                    b2 = jp0.o(parcel, t);
                    break;
                case 4:
                    i = jp0.v(parcel, t);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) jp0.e(parcel, t, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = jp0.o(parcel, t);
                    break;
                case 7:
                    b4 = jp0.o(parcel, t);
                    break;
                case 8:
                    b5 = jp0.o(parcel, t);
                    break;
                case 9:
                    b6 = jp0.o(parcel, t);
                    break;
                case 10:
                    b7 = jp0.o(parcel, t);
                    break;
                case 11:
                    b8 = jp0.o(parcel, t);
                    break;
                case 12:
                    b9 = jp0.o(parcel, t);
                    break;
                case 13:
                default:
                    jp0.B(parcel, t);
                    break;
                case 14:
                    b10 = jp0.o(parcel, t);
                    break;
                case 15:
                    b11 = jp0.o(parcel, t);
                    break;
                case 16:
                    f = jp0.s(parcel, t);
                    break;
                case 17:
                    f2 = jp0.s(parcel, t);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) jp0.e(parcel, t, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = jp0.o(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
