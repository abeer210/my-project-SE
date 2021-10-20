package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class r0 implements Parcelable.Creator<z> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l == 3) {
                i2 = jp0.v(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                bArr = jp0.b(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new z(i, i2, bArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z[] newArray(int i) {
        return new z[i];
    }
}
