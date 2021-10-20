package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gi1  reason: default package */
public final class gi1 implements Parcelable.Creator<fi1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fi1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        Rect rect = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            if (jp0.l(t) != 2) {
                jp0.B(parcel, t);
            } else {
                rect = (Rect) jp0.e(parcel, t, Rect.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new fi1(rect);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fi1[] newArray(int i) {
        return new fi1[i];
    }
}
