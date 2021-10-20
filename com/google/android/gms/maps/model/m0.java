package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class m0 implements Parcelable.Creator<p> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    latLng = (LatLng) jp0.e(parcel, t, LatLng.CREATOR);
                    break;
                case 3:
                    str = jp0.f(parcel, t);
                    break;
                case 4:
                    str2 = jp0.f(parcel, t);
                    break;
                case 5:
                    iBinder = jp0.u(parcel, t);
                    break;
                case 6:
                    f = jp0.r(parcel, t);
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
                    z3 = jp0.m(parcel, t);
                    break;
                case 11:
                    f3 = jp0.r(parcel, t);
                    break;
                case 12:
                    f4 = jp0.r(parcel, t);
                    break;
                case 13:
                    f5 = jp0.r(parcel, t);
                    break;
                case 14:
                    f6 = jp0.r(parcel, t);
                    break;
                case 15:
                    f7 = jp0.r(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new p(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i) {
        return new p[i];
    }
}
