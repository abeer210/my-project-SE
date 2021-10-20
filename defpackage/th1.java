package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: th1  reason: default package */
public class th1 implements IInterface {
    private final IBinder a;

    public th1(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    public IBinder asBinder() {
        return this.a;
    }
}
