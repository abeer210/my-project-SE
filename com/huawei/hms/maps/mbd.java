package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mce;
import vigqyno.C0201;

public interface mbd extends IInterface {

    public static abstract class maa extends Binder implements mbd {
        public maa() {
            attachInterface(this, C0201.m82(13905));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(13906);
            if (i == 1) {
                parcel.enforceInterface(r1);
                onMarkerDragStart(mce.maa.a(parcel.readStrongBinder()));
            } else if (i == 2) {
                parcel.enforceInterface(r1);
                onMarkerDrag(mce.maa.a(parcel.readStrongBinder()));
            } else if (i == 3) {
                parcel.enforceInterface(r1);
                onMarkerDragEnd(mce.maa.a(parcel.readStrongBinder()));
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

    void onMarkerDrag(mce mce);

    void onMarkerDragEnd(mce mce);

    void onMarkerDragStart(mce mce);
}
