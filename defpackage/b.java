package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* renamed from: b  reason: default package */
/* compiled from: IResultReceiver */
public interface b extends IInterface {

    /* renamed from: b$a */
    /* compiled from: IResultReceiver */
    public static abstract class a extends Binder implements b {

        /* access modifiers changed from: private */
        /* renamed from: b$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        public static class C0025a implements b {
            private IBinder a;

            public C0025a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.b
            public void Q3(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(20784));
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, C0201.m82(18475));
        }

        public static b i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(18476));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0025a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String r1 = C0201.m82(18477);
            if (i == 1) {
                parcel.enforceInterface(r1);
                Q3(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(r1);
                return true;
            }
        }
    }

    void Q3(int i, Bundle bundle) throws RemoteException;
}
