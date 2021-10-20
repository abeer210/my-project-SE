package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.l;
import vigqyno.C0201;

/* renamed from: v11  reason: default package */
public abstract class v11 extends e21 implements u11 {
    public v11() {
        super(C0201.m82(15232));
    }

    @Override // defpackage.e21
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        X0((l) s21.a(parcel, l.CREATOR));
        return true;
    }
}
