package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ft0  reason: default package */
public class ft0 implements IInterface {
    private final IBinder a;
    private final String b;

    public ft0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final Parcel U3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final void V3(int i, Parcel parcel) throws RemoteException {
        try {
            this.a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
