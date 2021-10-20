package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: yr0  reason: default package */
public final class yr0 extends tr0 implements wr0 {
    public yr0(IBinder iBinder) {
        super(iBinder, C0201.m82(26749));
    }

    @Override // defpackage.wr0
    public final boolean P0(boolean z) throws RemoteException {
        Parcel U3 = U3();
        vr0.a(U3, true);
        Parcel V3 = V3(2, U3);
        boolean b = vr0.b(V3);
        V3.recycle();
        return b;
    }

    @Override // defpackage.wr0
    public final String t() throws RemoteException {
        Parcel V3 = V3(1, U3());
        String readString = V3.readString();
        V3.recycle();
        return readString;
    }
}
