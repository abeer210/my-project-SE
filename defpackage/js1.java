package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import vigqyno.C0201;

/* renamed from: js1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class js1 extends xs0 implements hs1 {
    public js1(IBinder iBinder) {
        super(iBinder, C0201.m82(17186));
    }

    @Override // defpackage.hs1
    public final void Y0(n nVar, int i, boolean z) throws RemoteException {
        Parcel U3 = U3();
        ys0.c(U3, nVar);
        U3.writeInt(i);
        ys0.a(U3, z);
        V3(9, U3);
    }

    @Override // defpackage.hs1
    public final void a0(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        V3(7, U3);
    }

    @Override // defpackage.hs1
    public final void y3(ls1 ls1, fs1 fs1) throws RemoteException {
        Parcel U3 = U3();
        ys0.d(U3, ls1);
        ys0.c(U3, fs1);
        V3(12, U3);
    }
}
