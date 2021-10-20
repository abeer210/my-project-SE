package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: vp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class vp0 extends ws0 implements wp0 {
    public vp0() {
        super(C0201.m82(8118));
    }

    @Override // defpackage.ws0
    public boolean U3(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        L0(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
