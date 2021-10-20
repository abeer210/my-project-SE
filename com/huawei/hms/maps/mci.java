package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.model.Tile;
import vigqyno.C0201;

public interface mci extends IInterface {

    public static abstract class maa extends Binder implements mci {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mci$maa$maa  reason: collision with other inner class name */
        public static class C0107maa implements mci {
            private IBinder a;

            public C0107maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mci
            public final Tile a(int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(5823));
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Tile.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public maa() {
            attachInterface(this, C0201.m82(15687));
        }

        public static mci a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(15688));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mci)) ? new C0107maa(iBinder) : (mci) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String r1 = C0201.m82(15689);
            if (i == 1) {
                parcel.enforceInterface(r1);
                Tile a = a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    Tile a(int i, int i2, int i3);
}
