package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: br1  reason: default package */
public abstract class br1 extends i31 implements ar1 {
    public br1() {
        super(C0201.m82(36761));
    }

    @Override // defpackage.i31
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onSnapshotReady((Bitmap) j31.b(parcel, Bitmap.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            Q1(yq0.a.U3(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
