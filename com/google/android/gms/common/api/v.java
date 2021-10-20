package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class v implements Parcelable.Creator<Status> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i2 = jp0.v(parcel, t);
            } else if (l == 2) {
                str = jp0.f(parcel, t);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) jp0.e(parcel, t, PendingIntent.CREATOR);
            } else if (l != 1000) {
                jp0.B(parcel, t);
            } else {
                i = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new Status(i, i2, str, pendingIntent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
