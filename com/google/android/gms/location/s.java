package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class s implements Parcelable.Creator<LocationResult> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        List<Location> list = LocationResult.b;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            if (jp0.l(t) != 1) {
                jp0.B(parcel, t);
            } else {
                list = jp0.j(parcel, t, Location.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new LocationResult(list);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult[] newArray(int i) {
        return new LocationResult[i];
    }
}
