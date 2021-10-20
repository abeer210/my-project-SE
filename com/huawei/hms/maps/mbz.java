package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public interface mbz extends IInterface {

    public static abstract class maa extends Binder implements mbz {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbz$maa$maa  reason: collision with other inner class name */
        public static class C0098maa implements mbz {
            private IBinder a;

            public C0098maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbz
            public final IObjectWrapper a() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(23771), 1));
            }

            @Override // com.huawei.hms.maps.mbz
            public final IObjectWrapper a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(23772));
                    obtain.writeFloat(f);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public static mbz a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(27038));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbz)) ? new C0098maa(iBinder) : (mbz) queryLocalInterface;
        }
    }

    IObjectWrapper a();

    IObjectWrapper a(float f);
}
