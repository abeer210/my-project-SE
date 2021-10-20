package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* renamed from: r31  reason: default package */
public abstract class r31 extends i31 implements q31 {
    public static q31 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(13863));
        if (queryLocalInterface instanceof q31) {
            return (q31) queryLocalInterface;
        }
        return new s31(iBinder);
    }
}
