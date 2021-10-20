package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: d31  reason: default package */
public abstract class d31 extends i31 implements c31 {
    public static c31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(30762));
        if (queryLocalInterface instanceof c31) {
            return (c31) queryLocalInterface;
        }
        return new e31(iBinder);
    }
}
