package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0188;

public final class r implements Parcelable.Creator<LocationRequest> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = C0188.f24;
        float f = 0.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    j = jp0.x(parcel, t);
                    break;
                case 3:
                    j2 = jp0.x(parcel, t);
                    break;
                case 4:
                    z = jp0.m(parcel, t);
                    break;
                case 5:
                    j3 = jp0.x(parcel, t);
                    break;
                case 6:
                    i2 = jp0.v(parcel, t);
                    break;
                case 7:
                    f = jp0.r(parcel, t);
                    break;
                case 8:
                    j4 = jp0.x(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
