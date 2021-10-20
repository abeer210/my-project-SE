package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: op1  reason: default package */
public final class op1 implements Parcelable.Creator<np1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ np1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
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
                j = jp0.x(parcel, t);
            } else if (l != 6) {
                jp0.B(parcel, t);
            } else {
                i4 = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new np1(i, i2, i3, j, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ np1[] newArray(int i) {
        return new np1[i];
    }
}
