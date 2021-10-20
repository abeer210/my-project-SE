package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: cy1  reason: default package */
public abstract class cy1 extends lz1 implements dy1 {
    public static dy1 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(2263));
        return queryLocalInterface instanceof dy1 ? (dy1) queryLocalInterface : new wz1(iBinder);
    }
}
