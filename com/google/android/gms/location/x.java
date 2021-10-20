package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class x implements Parcelable.Creator<l> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        Status status = null;
        m mVar = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                status = (Status) jp0.e(parcel, t, Status.CREATOR);
            } else if (l != 2) {
                jp0.B(parcel, t);
            } else {
                mVar = (m) jp0.e(parcel, t, m.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new l(status, mVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i) {
        return new l[i];
    }
}
