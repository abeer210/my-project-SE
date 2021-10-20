package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: lu1  reason: default package */
public final class lu1 implements Parcelable.Creator<wt1.l> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.l createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                str = jp0.f(parcel, t);
            } else if (l == 3) {
                str2 = jp0.f(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                i = jp0.v(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new wt1.l(str, str2, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.l[] newArray(int i) {
        return new wt1.l[i];
    }
}
