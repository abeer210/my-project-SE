package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public interface IObjectWrapper extends IInterface {

    public static abstract class Stub extends Binder implements IObjectWrapper {
        private static final String a = null;

        /* access modifiers changed from: package-private */
        public static class Proxy implements IObjectWrapper {
            private IBinder a;

            public Proxy(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String getInterfaceDescriptor() {
                return C0201.m82(23711);
            }
        }

        static {
            C0201.m83(Stub.class, 710);
        }

        public Stub() {
            attachInterface(this, C0201.m82(21643));
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(21644));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IObjectWrapper)) ? new Proxy(iBinder) : (IObjectWrapper) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(C0201.m82(21645));
            return true;
        }
    }
}
