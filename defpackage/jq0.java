package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class jq0 implements Parcelable.Creator<xo0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xo0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                str = jp0.f(parcel, t);
            } else if (l == 2) {
                i = jp0.v(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                j = jp0.x(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new xo0(str, i, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ xo0[] newArray(int i) {
        return new xo0[i];
    }
}
