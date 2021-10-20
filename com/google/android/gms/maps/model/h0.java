package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class h0 implements Parcelable.Creator<f> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
                    break;
                case 3:
                    d = jp0.p(parcel, t);
                    break;
                case 4:
                    f = jp0.r(parcel, t);
                    break;
                case 5:
                    i = jp0.v(parcel, t);
                    break;
                case 6:
                    i2 = jp0.v(parcel, t);
                    break;
                case 7:
                    f2 = jp0.r(parcel, t);
                    break;
                case 8:
                    z = jp0.m(parcel, t);
                    break;
                case 9:
                    z2 = jp0.m(parcel, t);
                    break;
                case 10:
                    arrayList = jp0.j(parcel, t, q.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new f(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i) {
        return new f[i];
    }
}
