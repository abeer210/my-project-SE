package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: yt1  reason: default package */
public final class yt1 implements Parcelable.Creator<wt1.a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.a createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                strArr = jp0.g(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new wt1.a(i, strArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.a[] newArray(int i) {
        return new wt1.a[i];
    }
}
