package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class l0 implements Parcelable.Creator<n> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            if (jp0.l(t) != 2) {
                jp0.B(parcel, t);
            } else {
                str = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new n(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n[] newArray(int i) {
        return new n[i];
    }
}
