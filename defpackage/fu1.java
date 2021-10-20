package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: fu1  reason: default package */
public final class fu1 implements Parcelable.Creator<wt1.f> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.f createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l == 3) {
                str = jp0.f(parcel, t);
            } else if (l == 4) {
                str2 = jp0.f(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                str3 = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new wt1.f(i, str, str2, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.f[] newArray(int i) {
        return new wt1.f[i];
    }
}
