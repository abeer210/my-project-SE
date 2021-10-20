package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class n0 implements Parcelable.Creator<q> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                f = jp0.s(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new q(i, f);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i) {
        return new q[i];
    }
}
