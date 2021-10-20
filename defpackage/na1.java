package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: na1  reason: default package */
public final class na1 extends a51 implements n91 {
    public na1(IBinder iBinder) {
        super(iBinder, C0201.m82(26670));
    }

    @Override // defpackage.n91
    public final Bundle S2(Bundle bundle) throws RemoteException {
        Parcel U3 = U3();
        m71.d(U3, bundle);
        Parcel V3 = V3(1, U3);
        Bundle bundle2 = (Bundle) m71.b(V3, Bundle.CREATOR);
        V3.recycle();
        return bundle2;
    }
}
