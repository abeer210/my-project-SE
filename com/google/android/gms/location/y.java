package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class y implements Parcelable.Creator<m> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    z = jp0.m(parcel, t);
                    break;
                case 2:
                    z2 = jp0.m(parcel, t);
                    break;
                case 3:
                    z3 = jp0.m(parcel, t);
                    break;
                case 4:
                    z4 = jp0.m(parcel, t);
                    break;
                case 5:
                    z5 = jp0.m(parcel, t);
                    break;
                case 6:
                    z6 = jp0.m(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new m(z, z2, z3, z4, z5, z6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i) {
        return new m[i];
    }
}
