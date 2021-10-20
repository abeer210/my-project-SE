package defpackage;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tu1  reason: default package */
public final class tu1 implements Parcelable.Creator<su1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ su1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                pointFArr = (PointF[]) jp0.i(parcel, t, PointF.CREATOR);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                i = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new su1(pointFArr, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ su1[] newArray(int i) {
        return new su1[i];
    }
}
