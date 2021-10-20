package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mah;
import vigqyno.C0201;

public interface mbb extends IInterface {

    public static abstract class maa extends Binder implements mbb {
        public maa() {
            attachInterface(this, C0201.m82(335));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            mah mah;
            String r1 = C0201.m82(336);
            if (i == 1) {
                parcel.enforceInterface(r1);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    mah = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(337));
                    mah = (queryLocalInterface == null || !(queryLocalInterface instanceof mah)) ? new mah.maa.C0089maa(readStrongBinder) : (mah) queryLocalInterface;
                }
                a(mah);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    void a(mah mah);
}
