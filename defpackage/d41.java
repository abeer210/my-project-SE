package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: d41  reason: default package */
public abstract class d41 extends i31 implements c41 {
    public static c41 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(36762));
        if (queryLocalInterface instanceof c41) {
            return (c41) queryLocalInterface;
        }
        return new e41(iBinder);
    }
}
