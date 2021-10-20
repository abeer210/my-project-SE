package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class c9 implements Parcelable.Creator<d9> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d9 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    str = jp0.f(parcel, t);
                    break;
                case 3:
                    str2 = jp0.f(parcel, t);
                    break;
                case 4:
                    str3 = jp0.f(parcel, t);
                    break;
                case 5:
                    str4 = jp0.f(parcel, t);
                    break;
                case 6:
                    j = jp0.x(parcel, t);
                    break;
                case 7:
                    j2 = jp0.x(parcel, t);
                    break;
                case 8:
                    str5 = jp0.f(parcel, t);
                    break;
                case 9:
                    z = jp0.m(parcel, t);
                    break;
                case 10:
                    z2 = jp0.m(parcel, t);
                    break;
                case 11:
                    j6 = jp0.x(parcel, t);
                    break;
                case 12:
                    str6 = jp0.f(parcel, t);
                    break;
                case 13:
                    j3 = jp0.x(parcel, t);
                    break;
                case 14:
                    j4 = jp0.x(parcel, t);
                    break;
                case 15:
                    i = jp0.v(parcel, t);
                    break;
                case 16:
                    z3 = jp0.m(parcel, t);
                    break;
                case 17:
                    z4 = jp0.m(parcel, t);
                    break;
                case 18:
                    z5 = jp0.m(parcel, t);
                    break;
                case 19:
                    str7 = jp0.f(parcel, t);
                    break;
                case 20:
                default:
                    jp0.B(parcel, t);
                    break;
                case 21:
                    bool = jp0.n(parcel, t);
                    break;
                case 22:
                    j5 = jp0.x(parcel, t);
                    break;
                case 23:
                    arrayList = jp0.h(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new d9(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d9[] newArray(int i) {
        return new d9[i];
    }
}
