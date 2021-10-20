package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ei1  reason: default package */
public final class ei1 implements Parcelable.Creator<di1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ di1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        mi1[] mi1Arr = null;
        qp1 qp1 = null;
        qp1 qp12 = null;
        qp1 qp13 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    mi1Arr = (mi1[]) jp0.i(parcel, t, mi1.CREATOR);
                    break;
                case 3:
                    qp1 = (qp1) jp0.e(parcel, t, qp1.CREATOR);
                    break;
                case 4:
                    qp12 = (qp1) jp0.e(parcel, t, qp1.CREATOR);
                    break;
                case 5:
                    qp13 = (qp1) jp0.e(parcel, t, qp1.CREATOR);
                    break;
                case 6:
                    str = jp0.f(parcel, t);
                    break;
                case 7:
                    f = jp0.r(parcel, t);
                    break;
                case 8:
                    str2 = jp0.f(parcel, t);
                    break;
                case 9:
                    i = jp0.v(parcel, t);
                    break;
                case 10:
                    z = jp0.m(parcel, t);
                    break;
                case 11:
                    i2 = jp0.v(parcel, t);
                    break;
                case 12:
                    i3 = jp0.v(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new di1(mi1Arr, qp1, qp12, qp13, str, f, str2, i, z, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ di1[] newArray(int i) {
        return new di1[i];
    }
}
