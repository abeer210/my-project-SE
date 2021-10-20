package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: x31  reason: default package */
public abstract class x31 extends i31 implements w31 {
    public static w31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(4936));
        if (queryLocalInterface instanceof w31) {
            return (w31) queryLocalInterface;
        }
        return new y31(iBinder);
    }
}
