package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class k implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
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
        return new c(bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i) {
        return new c[i];
    }
}
