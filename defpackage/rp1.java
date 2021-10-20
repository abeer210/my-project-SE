package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rp1  reason: default package */
public final class rp1 implements Parcelable.Creator<qp1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qp1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l == 3) {
                i2 = jp0.v(parcel, t);
            } else if (l == 4) {
                i3 = jp0.v(parcel, t);
            } else if (l == 5) {
                i4 = jp0.v(parcel, t);
            } else if (l != 6) {
                jp0.B(parcel, t);
            } else {
                f = jp0.r(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new qp1(i, i2, i3, i4, f);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qp1[] newArray(int i) {
        return new qp1[i];
    }
}
