package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: gr1  reason: default package */
public abstract class gr1 extends i31 implements fr1 {
    public gr1() {
        super(C0201.m82(35789));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onFinish();
        } else if (i != 2) {
            return false;
        } else {
            onCancel();
        }
        parcel2.writeNoException();
        return true;
    }
}
