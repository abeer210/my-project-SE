package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import vigqyno.C0201;

public interface man extends IInterface {

    public static abstract class maa extends Binder implements man {
        public maa() {
            attachInterface(this, C0201.m82(38353));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(38354);
            if (i == 1) {
                parcel.enforceInterface(r1);
                onCameraIdle();
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

    void onCameraIdle();
}
