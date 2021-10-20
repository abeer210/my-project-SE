package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dv1  reason: default package */
public final class dv1 implements Parcelable.Creator<ru1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ru1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                f = jp0.r(parcel, t);
            } else if (l == 3) {
                f2 = jp0.r(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                i2 = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new ru1(i, f, f2, i2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ru1[] newArray(int i) {
        return new ru1[i];
    }
}
