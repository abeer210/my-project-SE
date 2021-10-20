package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: oz1  reason: default package */
public abstract class oz1 extends lz1 implements pz1 {
    public static pz1 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(36264));
        return queryLocalInterface instanceof pz1 ? (pz1) queryLocalInterface : new nz1(iBinder);
    }
}
