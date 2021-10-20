package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class z implements Parcelable.Creator<d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l != 2) {
                jp0.B(parcel, t);
            } else {
                str = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new d(i, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
