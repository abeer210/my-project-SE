package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: bv1  reason: default package */
public abstract class bv1 extends oi1 implements av1 {
    public static av1 i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(2346));
        if (queryLocalInterface instanceof av1) {
            return (av1) queryLocalInterface;
        }
        return new cv1(iBinder);
    }
}
