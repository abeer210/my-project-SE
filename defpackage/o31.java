package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: o31  reason: default package */
public abstract class o31 extends i31 implements n31 {
    public static n31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(30806));
        if (queryLocalInterface instanceof n31) {
            return (n31) queryLocalInterface;
        }
        return new p31(iBinder);
    }
}
