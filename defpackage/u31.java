package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: u31  reason: default package */
public abstract class u31 extends i31 implements t31 {
    public static t31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(27503));
        if (queryLocalInterface instanceof t31) {
            return (t31) queryLocalInterface;
        }
        return new v31(iBinder);
    }
}
