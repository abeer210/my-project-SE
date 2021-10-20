package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: a41  reason: default package */
public abstract class a41 extends i31 implements z31 {
    public static z31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(20225));
        if (queryLocalInterface instanceof z31) {
            return (z31) queryLocalInterface;
        }
        return new b41(iBinder);
    }
}
