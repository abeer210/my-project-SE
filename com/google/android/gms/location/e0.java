package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0188;

public final class e0 implements Parcelable.Creator<d0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = C0188.f24;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                z = jp0.m(parcel, t);
            } else if (l == 2) {
                j = jp0.x(parcel, t);
            } else if (l == 3) {
                f = jp0.r(parcel, t);
            } else if (l == 4) {
                j2 = jp0.x(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                i = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new d0(z, j, f, j2, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d0[] newArray(int i) {
        return new d0[i];
    }
}
