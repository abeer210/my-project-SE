package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: l31  reason: default package */
public abstract class l31 extends i31 implements k31 {
    public static k31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(12254));
        if (queryLocalInterface instanceof k31) {
            return (k31) queryLocalInterface;
        }
        return new m31(iBinder);
    }
}
