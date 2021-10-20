package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class q0 implements Parcelable.Creator<v> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        ArrayList arrayList = null;
        d dVar = null;
        d dVar2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    arrayList = jp0.j(parcel, t, LatLng.CREATOR);
                    break;
                case 3:
                    f = jp0.r(parcel, t);
                    break;
                case 4:
                    i = jp0.v(parcel, t);
                    break;
                case 5:
                    f2 = jp0.r(parcel, t);
                    break;
                case 6:
                    z = jp0.m(parcel, t);
                    break;
                case 7:
                    z2 = jp0.m(parcel, t);
                    break;
                case 8:
                    z3 = jp0.m(parcel, t);
                    break;
                case 9:
                    dVar = (d) jp0.e(parcel, t, d.CREATOR);
                    break;
                case 10:
                    dVar2 = (d) jp0.e(parcel, t, d.CREATOR);
                    break;
                case 11:
                    i2 = jp0.v(parcel, t);
                    break;
                case 12:
                    arrayList2 = jp0.j(parcel, t, q.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new v(arrayList, f, i, f2, z, z2, z3, dVar, dVar2, i2, arrayList2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v[] newArray(int i) {
        return new v[i];
    }
}
