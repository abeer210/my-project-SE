package com.fingerprints.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

public interface IFingerprintClient extends IInterface {

    public static abstract class Stub extends Binder implements IFingerprintClient {
        private static final String DESCRIPTOR = null;
        public static final int TRANSACTION_onBundleMessage = 0;
        public static final int TRANSACTION_onBundleMessage2 = 0;
        public static final int TRANSACTION_onMessage = 0;

        private static class Proxy implements IFingerprintClient {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return C0201.m82(27043);
            }

            @Override // com.fingerprints.service.IFingerprintClient
            public void onBundleMessage(int i, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(27044));
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintClient
            public void onBundleMessage2(int i, int i2, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(27045));
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeIntArray(iArr);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintClient
            public void onMessage(int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(27046));
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            C0201.m83(Stub.class, 584);
        }

        public Stub() {
            attachInterface(this, C0201.m82(7765));
        }

        public static IFingerprintClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(7766));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFingerprintClient)) {
                return new Proxy(iBinder);
            }
            return (IFingerprintClient) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String r0 = C0201.m82(7767);
            if (i == 1) {
                parcel.enforceInterface(r0);
                onMessage(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(r0);
                onBundleMessage(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(r0);
                onBundleMessage2(parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r0);
                return true;
            }
        }
    }

    void onBundleMessage(int i, int i2, int i3, Bundle bundle) throws RemoteException;

    void onBundleMessage2(int i, int i2, int[] iArr) throws RemoteException;

    void onMessage(int i, int i2, int i3) throws RemoteException;
}
