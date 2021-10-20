package com.huawei.hms.maps;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public interface mbo extends IInterface {

    public static abstract class maa extends Binder implements mbo {
        public maa() {
            attachInterface(this, C0201.m82(27241));
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(27242);
            if (i == 1) {
                parcel.enforceInterface(r1);
                onSnapshotReady(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 2) {
                parcel.enforceInterface(r1);
                onSnapshotReadyWrapper(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
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

    void onSnapshotReady(Bitmap bitmap);

    void onSnapshotReadyWrapper(IObjectWrapper iObjectWrapper);
}
