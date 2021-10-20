package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class l0 implements Parcelable.Creator<k0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        Bundle bundle = null;
        xo0[] xo0Arr = null;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                bundle = jp0.a(parcel, t);
            } else if (l == 2) {
                xo0Arr = (xo0[]) jp0.i(parcel, t, xo0.CREATOR);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                i = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new k0(bundle, xo0Arr, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0[] newArray(int i) {
        return new k0[i];
    }
}
