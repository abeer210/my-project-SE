package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vu1  reason: default package */
public final class vu1 implements Parcelable.Creator<qu1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qu1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        ru1[] ru1Arr = null;
        su1[] su1Arr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    i2 = jp0.v(parcel, t);
                    break;
                case 3:
                    f = jp0.r(parcel, t);
                    break;
                case 4:
                    f2 = jp0.r(parcel, t);
                    break;
                case 5:
                    f3 = jp0.r(parcel, t);
                    break;
                case 6:
                    f4 = jp0.r(parcel, t);
                    break;
                case 7:
                    f5 = jp0.r(parcel, t);
                    break;
                case 8:
                    f6 = jp0.r(parcel, t);
                    break;
                case 9:
                    ru1Arr = (ru1[]) jp0.i(parcel, t, ru1.CREATOR);
                    break;
                case 10:
                    f8 = jp0.r(parcel, t);
                    break;
                case 11:
                    f9 = jp0.r(parcel, t);
                    break;
                case 12:
                    f10 = jp0.r(parcel, t);
                    break;
                case 13:
                    su1Arr = (su1[]) jp0.i(parcel, t, su1.CREATOR);
                    break;
                case 14:
                    f7 = jp0.r(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new qu1(i, i2, f, f2, f3, f4, f5, f6, f7, ru1Arr, f8, f9, f10, su1Arr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qu1[] newArray(int i) {
        return new qu1[i];
    }
}
