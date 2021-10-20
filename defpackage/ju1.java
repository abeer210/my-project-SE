package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: ju1  reason: default package */
public final class ju1 implements Parcelable.Creator<wt1.j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.j createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                str = jp0.f(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                str2 = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new wt1.j(str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.j[] newArray(int i) {
        return new wt1.j[i];
    }
}
