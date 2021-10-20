package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yq0;
import vigqyno.C0201;

/* renamed from: m31  reason: default package */
public final class m31 extends z21 implements k31 {
    public m31(IBinder iBinder) {
        super(iBinder, C0201.m82(5004));
    }

    @Override // defpackage.k31
    public final yq0 C(int i) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        Parcel V3 = V3(1, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.k31
    public final yq0 o1(Bitmap bitmap) throws RemoteException {
        Parcel U3 = U3();
        j31.d(U3, bitmap);
        Parcel V3 = V3(6, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.k31
    public final yq0 s2(float f) throws RemoteException {
        Parcel U3 = U3();
        U3.writeFloat(f);
        Parcel V3 = V3(5, U3);
        yq0 U32 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U32;
    }

    @Override // defpackage.k31
    public final yq0 w() throws RemoteException {
        Parcel V3 = V3(4, U3());
        yq0 U3 = yq0.a.U3(V3.readStrongBinder());
        V3.recycle();
        return U3;
    }
}
