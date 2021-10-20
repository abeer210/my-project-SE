package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import vigqyno.C0201;

public final class j0 implements Parcelable.Creator<f> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String r3 = C0201.m82(38983);
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                arrayList = jp0.j(parcel, t, m21.CREATOR);
            } else if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                r3 = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new f(arrayList, i, r3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i) {
        return new f[i];
    }
}
