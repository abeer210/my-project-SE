package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ro0  reason: default package */
public final class ro0 implements Parcelable.Creator<qo0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qo0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                z = jp0.m(parcel, t);
            } else if (l == 2) {
                j2 = jp0.x(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                j = jp0.x(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new qo0(z, j, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qo0[] newArray(int i) {
        return new qo0[i];
    }
}
