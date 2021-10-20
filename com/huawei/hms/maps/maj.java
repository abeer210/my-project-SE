package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.max;
import vigqyno.C0201;

public interface maj extends IInterface {

    public static abstract class maa extends Binder implements maj {
        public maa() {
            attachInterface(this, C0201.m82(14037));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            max max;
            String r1 = C0201.m82(14038);
            if (i == 1) {
                parcel.enforceInterface(r1);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    max = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(C0201.m82(14039));
                    max = (queryLocalInterface == null || !(queryLocalInterface instanceof max)) ? new max.maa.C0093maa(readStrongBinder) : (max) queryLocalInterface;
                }
                a(max);
            } else if (i == 2) {
                parcel.enforceInterface(r1);
                a();
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a();

    void a(max max);
}
