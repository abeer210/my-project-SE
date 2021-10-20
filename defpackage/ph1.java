package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ph1  reason: default package */
public final class ph1 implements Parcelable.Creator<qh1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qh1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    j = jp0.x(parcel, t);
                    break;
                case 2:
                    j2 = jp0.x(parcel, t);
                    break;
                case 3:
                    z = jp0.m(parcel, t);
                    break;
                case 4:
                    str = jp0.f(parcel, t);
                    break;
                case 5:
                    str2 = jp0.f(parcel, t);
                    break;
                case 6:
                    str3 = jp0.f(parcel, t);
                    break;
                case 7:
                    bundle = jp0.a(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new qh1(j, j2, z, str, str2, str3, bundle);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qh1[] newArray(int i) {
        return new qh1[i];
    }
}
