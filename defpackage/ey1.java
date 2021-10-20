package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: ey1  reason: default package */
public abstract class ey1 extends lz1 implements fy1 {
    public ey1() {
        super(C0201.m82(32729));
    }

    @Override // defpackage.lz1
    public final boolean i(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        a((Bundle) mz1.a(parcel, Bundle.CREATOR));
        return true;
    }
}
