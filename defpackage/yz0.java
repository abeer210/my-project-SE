package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import vigqyno.C0201;

/* renamed from: yz0  reason: default package */
public abstract class yz0 extends du0 implements xz0 {
    public yz0() {
        super(C0201.m82(9771));
    }

    @Override // defpackage.du0
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                m((Status) dv0.a(parcel, Status.CREATOR));
                return true;
            case 2:
                T2((Status) dv0.a(parcel, Status.CREATOR));
                throw null;
            case 3:
                Q((Status) dv0.a(parcel, Status.CREATOR), parcel.readLong());
                throw null;
            case 4:
                z3((Status) dv0.a(parcel, Status.CREATOR));
                throw null;
            case 5:
                G3((Status) dv0.a(parcel, Status.CREATOR), parcel.readLong());
                throw null;
            case 6:
                a2((Status) dv0.a(parcel, Status.CREATOR), (so0[]) parcel.createTypedArray(so0.CREATOR));
                throw null;
            case 7:
                e0((DataHolder) dv0.a(parcel, DataHolder.CREATOR));
                throw null;
            case 8:
                e2((Status) dv0.a(parcel, Status.CREATOR), (qo0) dv0.a(parcel, qo0.CREATOR));
                throw null;
            case 9:
                C3((Status) dv0.a(parcel, Status.CREATOR), (qo0) dv0.a(parcel, qo0.CREATOR));
                throw null;
            default:
                return false;
        }
    }
}
