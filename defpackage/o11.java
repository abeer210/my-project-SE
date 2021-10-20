package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: o11  reason: default package */
public abstract class o11 extends e21 implements n11 {
    public o11() {
        super(C0201.m82(26873));
    }

    @Override // defpackage.e21
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        d0((h11) s21.a(parcel, h11.CREATOR));
        return true;
    }
}
