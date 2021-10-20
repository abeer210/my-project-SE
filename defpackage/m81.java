package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: m81  reason: default package */
public abstract class m81 extends g41 implements n91 {
    public static n91 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(17229));
        if (queryLocalInterface instanceof n91) {
            return (n91) queryLocalInterface;
        }
        return new na1(iBinder);
    }
}
