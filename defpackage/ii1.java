package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ii1  reason: default package */
public final class ii1 implements Parcelable.Creator<hi1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hi1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            jp0.l(t);
            jp0.B(parcel, t);
        }
        jp0.k(parcel, C);
        return new hi1();
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hi1[] newArray(int i) {
        return new hi1[i];
    }
}
