package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0188;

public final class q implements Parcelable.Creator<LocationAvailability> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 0;
        z[] zVarArr = null;
        int i = C0188.f18;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i2 = jp0.v(parcel, t);
            } else if (l == 2) {
                i3 = jp0.v(parcel, t);
            } else if (l == 3) {
                j = jp0.x(parcel, t);
            } else if (l == 4) {
                i = jp0.v(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                zVarArr = (z[]) jp0.i(parcel, t, z.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new LocationAvailability(i, i2, i3, j, zVarArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
