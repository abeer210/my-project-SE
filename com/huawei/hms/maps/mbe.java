package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import vigqyno.C0201;

public interface mbe extends IInterface {

    public static abstract class maa extends Binder implements mbe {
        public maa() {
            attachInterface(this, C0201.m82(35998));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(35999);
            if (i == 1) {
                parcel.enforceInterface(r1);
                boolean onMyLocationButtonClick = onMyLocationButtonClick();
                parcel2.writeNoException();
                parcel2.writeInt(onMyLocationButtonClick ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    boolean onMyLocationButtonClick();
}
