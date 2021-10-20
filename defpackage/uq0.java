package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: uq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class uq0 implements Parcelable.Creator<rq0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rq0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                str = jp0.f(parcel, t);
            } else if (l == 2) {
                iBinder = jp0.u(parcel, t);
            } else if (l == 3) {
                z = jp0.m(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                z2 = jp0.m(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new rq0(str, iBinder, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ rq0[] newArray(int i) {
        return new rq0[i];
    }
}
