package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xu1  reason: default package */
public final class xu1 implements Parcelable.Creator<wu1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wu1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    i = jp0.v(parcel, t);
                    break;
                case 3:
                    i2 = jp0.v(parcel, t);
                    break;
                case 4:
                    i3 = jp0.v(parcel, t);
                    break;
                case 5:
                    z = jp0.m(parcel, t);
                    break;
                case 6:
                    z2 = jp0.m(parcel, t);
                    break;
                case 7:
                    f = jp0.r(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wu1(i, i2, i3, z, z2, f);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wu1[] newArray(int i) {
        return new wu1[i];
    }
}
