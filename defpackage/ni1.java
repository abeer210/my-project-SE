package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ni1  reason: default package */
public final class ni1 implements Parcelable.Creator<mi1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mi1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        hi1[] hi1Arr = null;
        qp1 qp1 = null;
        qp1 qp12 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    hi1Arr = (hi1[]) jp0.i(parcel, t, hi1.CREATOR);
                    break;
                case 3:
                    qp1 = (qp1) jp0.e(parcel, t, qp1.CREATOR);
                    break;
                case 4:
                    qp12 = (qp1) jp0.e(parcel, t, qp1.CREATOR);
                    break;
                case 5:
                    str = jp0.f(parcel, t);
                    break;
                case 6:
                    f = jp0.r(parcel, t);
                    break;
                case 7:
                    str2 = jp0.f(parcel, t);
                    break;
                case 8:
                    z = jp0.m(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new mi1(hi1Arr, qp1, qp12, str, f, str2, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ mi1[] newArray(int i) {
        return new mi1[i];
    }
}
