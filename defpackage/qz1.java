package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: qz1  reason: default package */
public abstract class qz1 extends lz1 implements rz1 {
    public qz1() {
        super(C0201.m82(27973));
    }

    @Override // defpackage.lz1
    public final boolean i(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                C2(parcel.readInt(), (Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                a(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                b(readInt2);
                return true;
            case 5:
                a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle3 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                b((Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                a((Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle4 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                O0((Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Bundle bundle5 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                E2((Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                a((Bundle) mz1.a(parcel, Bundle.CREATOR), (Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                x1((Bundle) mz1.a(parcel, Bundle.CREATOR), (Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                b2((Bundle) mz1.a(parcel, Bundle.CREATOR), (Bundle) mz1.a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Bundle bundle6 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                b();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) mz1.a(parcel, Bundle.CREATOR);
                a();
                return true;
        }
    }
}
