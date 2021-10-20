package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lk1  reason: default package */
public final class lk1 implements Parcelable.Creator<pj1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pj1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            if (jp0.l(t) != 2) {
                jp0.B(parcel, t);
            } else {
                i = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new pj1(i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pj1[] newArray(int i) {
        return new pj1[i];
    }
}
