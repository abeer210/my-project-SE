package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import vigqyno.C0201;

public final class c0 implements Parcelable.Creator<b0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        ArrayList<String> arrayList = null;
        String r3 = C0201.m82(13657);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                arrayList = jp0.h(parcel, t);
            } else if (l == 2) {
                pendingIntent = (PendingIntent) jp0.e(parcel, t, PendingIntent.CREATOR);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                r3 = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new b0(arrayList, pendingIntent, r3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0[] newArray(int i) {
        return new b0[i];
    }
}
