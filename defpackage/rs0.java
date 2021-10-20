package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: rs0  reason: default package */
public class rs0 implements IInterface {
    private final IBinder a;

    public rs0(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    public IBinder asBinder() {
        return this.a;
    }
}
