package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: v31  reason: default package */
public final class v31 extends z21 implements t31 {
    public v31(IBinder iBinder) {
        super(iBinder, C0201.m82(25033));
    }

    @Override // defpackage.t31
    public final boolean N3() throws RemoteException {
        Parcel V3 = V3(4, U3());
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }

    @Override // defpackage.t31
    public final List<IBinder> c0() throws RemoteException {
        Parcel V3 = V3(3, U3());
        ArrayList<IBinder> createBinderArrayList = V3.createBinderArrayList();
        V3.recycle();
        return createBinderArrayList;
    }

    @Override // defpackage.t31
    public final int r2() throws RemoteException {
        Parcel V3 = V3(1, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.t31
    public final int s() throws RemoteException {
        Parcel V3 = V3(6, U3());
        int readInt = V3.readInt();
        V3.recycle();
        return readInt;
    }

    @Override // defpackage.t31
    public final boolean s3(t31 t31) throws RemoteException {
        Parcel U3 = U3();
        j31.c(U3, t31);
        Parcel V3 = V3(5, U3);
        boolean e = j31.e(V3);
        V3.recycle();
        return e;
    }
}
