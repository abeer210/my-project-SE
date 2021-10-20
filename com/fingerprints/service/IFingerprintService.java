package com.fingerprints.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.fingerprints.service.IFingerprintClient;
import vigqyno.C0201;

public interface IFingerprintService extends IInterface {

    public static abstract class Stub extends Binder implements IFingerprintService {
        private static final String DESCRIPTOR = null;
        public static final int TRANSACTION_cancel = 0;
        public static final int TRANSACTION_getIds = 0;
        public static final int TRANSACTION_isFingerEnable = 0;
        public static final int TRANSACTION_isSurpport = 0;
        public static final int TRANSACTION_notifyScreenOff = 0;
        public static final int TRANSACTION_notifyScreenOn = 0;
        public static final int TRANSACTION_open = 0;
        public static final int TRANSACTION_release = 0;
        public static final int TRANSACTION_removeData = 0;
        public static final int TRANSACTION_shouldRestartByScreenOn = 0;
        public static final int TRANSACTION_startEnrol = 0;
        public static final int TRANSACTION_startGuidedEnrol = 0;
        public static final int TRANSACTION_startIdentify = 0;
        public static final int TRANSACTION_updateTA = 0;

        /* access modifiers changed from: private */
        public static class Proxy implements IFingerprintService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void cancel(IFingerprintClient iFingerprintClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15455));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public int[] getIds(IFingerprintClient iFingerprintClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15456));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return C0201.m82(15457);
            }

            @Override // com.fingerprints.service.IFingerprintService
            public boolean isFingerEnable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15458));
                    boolean z = false;
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public boolean isSurpport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15459));
                    boolean z = false;
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void notifyScreenOff() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15460));
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void notifyScreenOn() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15461));
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public boolean open(IFingerprintClient iFingerprintClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15462));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void release(IFingerprintClient iFingerprintClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15463));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public boolean removeData(IFingerprintClient iFingerprintClient, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15464));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    obtain.writeIntArray(iArr);
                    boolean z = false;
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void shouldRestartByScreenOn(IFingerprintClient iFingerprintClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15465));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void startEnrol(IFingerprintClient iFingerprintClient, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15466));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void startGuidedEnrol(IFingerprintClient iFingerprintClient, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15467));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public void startIdentify(IFingerprintClient iFingerprintClient, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15468));
                    obtain.writeStrongBinder(iFingerprintClient != null ? iFingerprintClient.asBinder() : null);
                    obtain.writeIntArray(iArr);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.fingerprints.service.IFingerprintService
            public boolean updateTA(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(15469));
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        static {
            C0201.m83(Stub.class, 359);
        }

        public Stub() {
            attachInterface(this, C0201.m82(27907));
        }

        public static IFingerprintService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(27908));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFingerprintService)) {
                return new Proxy(iBinder);
            }
            return (IFingerprintService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String r2 = C0201.m82(27909);
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(r2);
                        boolean open = open(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(open ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(r2);
                        startEnrol(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(r2);
                        startGuidedEnrol(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(r2);
                        startIdentify(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()), parcel.createIntArray());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(r2);
                        boolean removeData = removeData(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()), parcel.createIntArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeData ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(r2);
                        cancel(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(r2);
                        release(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(r2);
                        int[] ids = getIds(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeIntArray(ids);
                        return true;
                    case 9:
                        parcel.enforceInterface(r2);
                        boolean updateTA = updateTA(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(updateTA ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(r2);
                        boolean isFingerEnable = isFingerEnable();
                        parcel2.writeNoException();
                        parcel2.writeInt(isFingerEnable ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface(r2);
                        boolean isSurpport = isSurpport();
                        parcel2.writeNoException();
                        parcel2.writeInt(isSurpport ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface(r2);
                        notifyScreenOn();
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(r2);
                        notifyScreenOff();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(r2);
                        shouldRestartByScreenOn(IFingerprintClient.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(r2);
                return true;
            }
        }
    }

    void cancel(IFingerprintClient iFingerprintClient) throws RemoteException;

    int[] getIds(IFingerprintClient iFingerprintClient) throws RemoteException;

    boolean isFingerEnable() throws RemoteException;

    boolean isSurpport() throws RemoteException;

    void notifyScreenOff() throws RemoteException;

    void notifyScreenOn() throws RemoteException;

    boolean open(IFingerprintClient iFingerprintClient) throws RemoteException;

    void release(IFingerprintClient iFingerprintClient) throws RemoteException;

    boolean removeData(IFingerprintClient iFingerprintClient, int[] iArr) throws RemoteException;

    void shouldRestartByScreenOn(IFingerprintClient iFingerprintClient) throws RemoteException;

    void startEnrol(IFingerprintClient iFingerprintClient, int i) throws RemoteException;

    void startGuidedEnrol(IFingerprintClient iFingerprintClient, int i) throws RemoteException;

    void startIdentify(IFingerprintClient iFingerprintClient, int[] iArr) throws RemoteException;

    boolean updateTA(String str) throws RemoteException;
}
