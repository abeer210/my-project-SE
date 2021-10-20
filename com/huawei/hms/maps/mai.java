package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mce;
import vigqyno.C0201;

public interface mai extends IInterface {

    public static abstract class maa extends Binder implements mai {
        public maa() {
            attachInterface(this, C0201.m82(35730));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder iBinder = null;
            String r2 = C0201.m82(35731);
            if (i == 1) {
                parcel.enforceInterface(r2);
                IObjectWrapper infoWindow = getInfoWindow(mce.maa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (infoWindow != null) {
                    iBinder = infoWindow.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(r2);
                IObjectWrapper infoContents = getInfoContents(mce.maa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (infoContents != null) {
                    iBinder = infoContents.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r2);
                return true;
            }
        }
    }

    IObjectWrapper getInfoContents(mce mce);

    IObjectWrapper getInfoWindow(mce mce);
}
