package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: a31  reason: default package */
public abstract class a31 extends i31 implements f41 {
    public static f41 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(12332));
        if (queryLocalInterface instanceof f41) {
            return (f41) queryLocalInterface;
        }
        return new b31(iBinder);
    }
}
