package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: xr0  reason: default package */
public abstract class xr0 extends ur0 implements wr0 {
    public static wr0 i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(36812));
        return queryLocalInterface instanceof wr0 ? (wr0) queryLocalInterface : new yr0(iBinder);
    }
}
