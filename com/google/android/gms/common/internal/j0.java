package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class j0 implements Parcelable.Creator<w> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        IBinder iBinder = null;
        vo0 vo0 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                iBinder = jp0.u(parcel, t);
            } else if (l == 3) {
                vo0 = (vo0) jp0.e(parcel, t, vo0.CREATOR);
            } else if (l == 4) {
                z = jp0.m(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                z2 = jp0.m(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new w(i, iBinder, vo0, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ w[] newArray(int i) {
        return new w[i];
    }
}
