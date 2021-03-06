package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.core.aidl.c;
import vigqyno.C0201;

/* compiled from: IAIDLInvoke */
public interface d extends IInterface {
    void a(b bVar) throws RemoteException;

    void a(b bVar, c cVar) throws RemoteException;

    /* compiled from: IAIDLInvoke */
    public static abstract class a extends Binder implements d {
        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(37884));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                return new C0085a(iBinder);
            }
            return (d) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            b bVar = null;
            String r2 = C0201.m82(37885);
            if (i == 1) {
                parcel.enforceInterface(r2);
                if (parcel.readInt() != 0) {
                    bVar = b.CREATOR.createFromParcel(parcel);
                }
                a(bVar);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(r2);
                if (parcel.readInt() != 0) {
                    bVar = b.CREATOR.createFromParcel(parcel);
                }
                a(bVar, c.a.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r2);
                return true;
            }
        }

        public static d a() {
            return C0085a.a;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.huawei.hms.core.aidl.d$a$a  reason: collision with other inner class name */
        /* compiled from: IAIDLInvoke */
        public static class C0085a implements d {
            public static d a;
            private IBinder b;

            public C0085a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // com.huawei.hms.core.aidl.d
            public void a(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(34634));
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.b.transact(1, obtain, obtain2, 0) || a.a() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    a.a().a(bVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.huawei.hms.core.aidl.d
            public void a(b bVar, c cVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(34635));
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (this.b.transact(2, obtain, null, 1) || a.a() == null) {
                        obtain.recycle();
                    } else {
                        a.a().a(bVar, cVar);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
