package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

public final class v implements Parcelable.Creator<u> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String r1 = C0201.m82(34833);
        String str = r1;
        String str2 = str;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                str = jp0.f(parcel, t);
            } else if (l == 2) {
                str2 = jp0.f(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                r1 = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new u(r1, str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u[] newArray(int i) {
        return new u[i];
    }
}
