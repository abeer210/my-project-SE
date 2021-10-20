package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import vigqyno.C0201;

public abstract class a3 extends g41 implements b3 {
    public a3() {
        super(C0201.m82(1120));
    }

    @Override // defpackage.g41
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                p3((j) m71.b(parcel, j.CREATOR), (d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                g2((t8) m71.b(parcel, t8.CREATOR), (d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                R1((d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                K((j) m71.b(parcel, j.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                t2((d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<t8> P1 = P1((d9) m71.b(parcel, d9.CREATOR), m71.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(P1);
                return true;
            case 9:
                byte[] r3 = r3((j) m71.b(parcel, j.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(r3);
                return true;
            case 10:
                j1(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String G0 = G0((d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(G0);
                return true;
            case 12:
                q0((g9) m71.b(parcel, g9.CREATOR), (d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                I((g9) m71.b(parcel, g9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<t8> O1 = O1(parcel.readString(), parcel.readString(), m71.e(parcel), (d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(O1);
                return true;
            case 15:
                List<t8> k0 = k0(parcel.readString(), parcel.readString(), parcel.readString(), m71.e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(k0);
                return true;
            case 16:
                List<g9> q1 = q1(parcel.readString(), parcel.readString(), (d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(q1);
                return true;
            case 17:
                List<g9> u2 = u2(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(u2);
                return true;
            case 18:
                n1((d9) m71.b(parcel, d9.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
