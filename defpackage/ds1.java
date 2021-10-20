package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ds1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class ds1 implements Parcelable.Creator<es1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ es1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                i2 = jp0.v(parcel, t);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                intent = (Intent) jp0.e(parcel, t, Intent.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new es1(i, i2, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ es1[] newArray(int i) {
        return new es1[i];
    }
}
