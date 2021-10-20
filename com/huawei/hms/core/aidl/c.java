package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* compiled from: IAIDLCallback */
public interface c extends IInterface {

    /* compiled from: IAIDLCallback */
    public static abstract class a extends Binder implements c {

        /* access modifiers changed from: private */
        /* renamed from: com.huawei.hms.core.aidl.c$a$a  reason: collision with other inner class name */
        /* compiled from: IAIDLCallback */
        public static class C0084a implements c {
            public static c a;
            private IBinder b;

            public C0084a(IBinder iBinder) {
                this.b = iBinder;
            }

            public IBinder asBinder() {
                return this.b;
            }

            @Override // com.huawei.hms.core.aidl.c
            public void call(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(11631));
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.b.transact(1, obtain, null, 1) || a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        a.getDefaultImpl().call(bVar);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, C0201.m82(21946));
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(21947));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                return new C0084a(iBinder);
            }
            return (c) queryLocalInterface;
        }

        public static c getDefaultImpl() {
            return C0084a.a;
        }

        public static boolean setDefaultImpl(c cVar) {
            if (C0084a.a != null || cVar == null) {
                return false;
            }
            C0084a.a = cVar;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String r1 = C0201.m82(21948);
            if (i == 1) {
                parcel.enforceInterface(r1);
                call(parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    void call(b bVar) throws RemoteException;
}
