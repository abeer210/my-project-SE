package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class j9 implements Parcelable.Creator<g9> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g9 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        t8 t8Var = null;
        String str3 = null;
        j jVar = null;
        j jVar2 = null;
        j jVar3 = null;
        boolean z = false;
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
                    t8Var = (t8) jp0.e(parcel, t, t8.CREATOR);
                    break;
                case 5:
                    j = jp0.x(parcel, t);
                    break;
                case 6:
                    z = jp0.m(parcel, t);
                    break;
                case 7:
                    str3 = jp0.f(parcel, t);
                    break;
                case 8:
                    jVar = (j) jp0.e(parcel, t, j.CREATOR);
                    break;
                case 9:
                    j2 = jp0.x(parcel, t);
                    break;
                case 10:
                    jVar2 = (j) jp0.e(parcel, t, j.CREATOR);
                    break;
                case 11:
                    j3 = jp0.x(parcel, t);
                    break;
                case 12:
                    jVar3 = (j) jp0.e(parcel, t, j.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new g9(str, str2, t8Var, j, z, str3, jVar, j2, jVar2, j3, jVar3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g9[] newArray(int i) {
        return new g9[i];
    }
}
