package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l21  reason: default package */
public final class l21 implements Parcelable.Creator<k21> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k21 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        i21 i21 = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    i21 = (i21) jp0.e(parcel, t, i21.CREATOR);
                    break;
                case 3:
                    iBinder = jp0.u(parcel, t);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) jp0.e(parcel, t, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = jp0.u(parcel, t);
                    break;
                case 6:
                    iBinder3 = jp0.u(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new k21(i, i21, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k21[] newArray(int i) {
        return new k21[i];
    }
}
