package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class p0 implements Parcelable.Creator<t> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    arrayList2 = jp0.j(parcel, t, LatLng.CREATOR);
                    break;
                case 3:
                    jp0.w(parcel, t, arrayList, p0.class.getClassLoader());
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
                    z3 = jp0.m(parcel, t);
                    break;
                case 11:
                    i3 = jp0.v(parcel, t);
                    break;
                case 12:
                    arrayList3 = jp0.j(parcel, t, q.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new t(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i) {
        return new t[i];
    }
}
