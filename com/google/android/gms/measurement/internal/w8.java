package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class w8 implements Parcelable.Creator<t8> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t8 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    str = jp0.f(parcel, t);
                    break;
                case 3:
                    j = jp0.x(parcel, t);
                    break;
                case 4:
                    l = jp0.y(parcel, t);
                    break;
                case 5:
                    f = jp0.s(parcel, t);
                    break;
                case 6:
                    str2 = jp0.f(parcel, t);
                    break;
                case 7:
                    str3 = jp0.f(parcel, t);
                    break;
                case 8:
                    d = jp0.q(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new t8(i, str, j, l, f, str2, str3, d);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t8[] newArray(int i) {
        return new t8[i];
    }
}
