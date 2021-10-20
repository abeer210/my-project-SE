package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.z;
import vigqyno.C0201;

/* renamed from: h31  reason: default package */
public final class h31 extends z21 implements f31 {
    public h31(IBinder iBinder) {
        super(iBinder, C0201.m82(2062));
    }

    @Override // defpackage.f31
    public final z getTile(int i, int i2, int i3) throws RemoteException {
        Parcel U3 = U3();
        U3.writeInt(i);
        U3.writeInt(i2);
        U3.writeInt(i3);
        Parcel V3 = V3(1, U3);
        z zVar = (z) j31.b(V3, z.CREATOR);
        V3.recycle();
        return zVar;
    }
}
