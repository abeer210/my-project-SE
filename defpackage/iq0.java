package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class iq0 implements Parcelable.Creator<vo0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ vo0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                i2 = jp0.v(parcel, t);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) jp0.e(parcel, t, PendingIntent.CREATOR);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                str = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new vo0(i, i2, pendingIntent, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ vo0[] newArray(int i) {
        return new vo0[i];
    }
}
