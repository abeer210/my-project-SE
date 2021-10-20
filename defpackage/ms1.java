package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w;

/* renamed from: ms1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class ms1 implements Parcelable.Creator<ns1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ns1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        vo0 vo0 = null;
        w wVar = null;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                vo0 = (vo0) jp0.e(parcel, t, vo0.CREATOR);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                wVar = (w) jp0.e(parcel, t, w.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new ns1(i, vo0, wVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ns1[] newArray(int i) {
        return new ns1[i];
    }
}
