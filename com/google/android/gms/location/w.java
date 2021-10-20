package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class w implements Parcelable.Creator<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        u uVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                arrayList = jp0.j(parcel, t, LocationRequest.CREATOR);
            } else if (l == 2) {
                z = jp0.m(parcel, t);
            } else if (l == 3) {
                z2 = jp0.m(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                uVar = (u) jp0.e(parcel, t, u.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new j(arrayList, z, z2, uVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
