package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class m implements Parcelable.Creator<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        i iVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                str = jp0.f(parcel, t);
            } else if (l == 3) {
                iVar = (i) jp0.e(parcel, t, i.CREATOR);
            } else if (l == 4) {
                str2 = jp0.f(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                j = jp0.x(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new j(str, iVar, str2, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i) {
        return new j[i];
    }
}
