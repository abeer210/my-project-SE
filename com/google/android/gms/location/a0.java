package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class a0 implements Parcelable.Creator<z> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                i2 = jp0.v(parcel, t);
            } else if (l == 3) {
                j = jp0.x(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                j2 = jp0.x(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new z(i, i2, j, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z[] newArray(int i) {
        return new z[i];
    }
}
