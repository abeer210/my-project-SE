package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class u0 extends h01 implements v0 {
    public static v0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(28069));
        if (queryLocalInterface instanceof v0) {
            return (v0) queryLocalInterface;
        }
        return new w0(iBinder);
    }
}
