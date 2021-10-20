package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class k implements Parcelable.Creator<i> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            if (jp0.l(t) != 2) {
                jp0.B(parcel, t);
            } else {
                bundle = jp0.a(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new i(bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i) {
        return new i[i];
    }
}
