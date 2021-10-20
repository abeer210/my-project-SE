package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y21  reason: default package */
public final class y21 implements Parcelable.Creator<x21> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x21 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        v21 v21 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                v21 = (v21) jp0.e(parcel, t, v21.CREATOR);
            } else if (l == 3) {
                iBinder = jp0.u(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                iBinder2 = jp0.u(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new x21(i, v21, iBinder, iBinder2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x21[] newArray(int i) {
        return new x21[i];
    }
}
