package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: gu1  reason: default package */
public final class gu1 implements Parcelable.Creator<wt1.g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.g createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                d = jp0.p(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                d2 = jp0.p(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new wt1.g(d, d2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.g[] newArray(int i) {
        return new wt1.g[i];
    }
}
