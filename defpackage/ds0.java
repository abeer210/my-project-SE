package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: ds0  reason: default package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class ds0 extends bs0 implements es0 {
    public ds0(IBinder iBinder) {
        super(iBinder, C0201.m82(21254));
    }

    @Override // defpackage.es0
    public final void k1(String str, gs0 gs0) throws RemoteException {
        Parcel U3 = U3();
        U3.writeString(str);
        cs0.b(U3, gs0);
        V3(2, U3);
    }
}
