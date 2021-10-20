package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v;

/* renamed from: ks1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class ks1 implements Parcelable.Creator<ls1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ls1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        v vVar = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l != 2) {
                jp0.B(parcel, t);
            } else {
                vVar = (v) jp0.e(parcel, t, v.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new ls1(i, vVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ls1[] newArray(int i) {
        return new ls1[i];
    }
}
