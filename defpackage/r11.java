package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: r11  reason: default package */
public abstract class r11 extends e21 implements q11 {
    public r11() {
        super(C0201.m82(9159));
    }

    @Override // defpackage.e21
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            c3(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            S3(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            w1(parcel.readInt(), (PendingIntent) s21.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
