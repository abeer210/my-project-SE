package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mce;
import vigqyno.C0201;

public interface mbc extends IInterface {

    public static abstract class maa extends Binder implements mbc {
        public maa() {
            attachInterface(this, C0201.m82(26097));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(26098);
            if (i == 1) {
                parcel.enforceInterface(r1);
                boolean onMarkerClick = onMarkerClick(mce.maa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(onMarkerClick ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    boolean onMarkerClick(mce mce);
}
