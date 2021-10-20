package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public interface mbq extends IInterface {

    public static abstract class maa extends Binder implements mbq {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbq$maa$maa  reason: collision with other inner class name */
        public static class C0095maa implements mbq {
            private IBinder a;

            public C0095maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbq
            public final IObjectWrapper a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(198));
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (iObjectWrapper2 != null) {
                        iBinder = iObjectWrapper2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbq
            public final void a() {
                mby.h(this.a, C0201.m82(199), 6);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void a(Bundle bundle) {
                mby.a(this.a, C0201.m82(200), 4, bundle);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(201));
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (streetViewPanoramaOptions != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbq
            public final void a(mbm mbm) {
                IBinder asBinder = mbm.asBinder();
                mby.a(this.a, C0201.m82(202), 2, asBinder);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mbq
            public final void b() {
                mby.h(this.a, C0201.m82(203), 7);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void b(Bundle bundle) {
                mby.a(this.a, C0201.m82(204), 12, bundle);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void c() {
                mby.h(this.a, C0201.m82(205), 9);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void d() {
                mby.h(this.a, C0201.m82(206), 10);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void e() {
                mby.h(this.a, C0201.m82(207), 11);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void f() {
                mby.h(this.a, C0201.m82(208), 13);
            }

            @Override // com.huawei.hms.maps.mbq
            public final void g() {
                mby.h(this.a, C0201.m82(209), 14);
            }
        }

        public static mbq a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(34512));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbq)) ? new C0095maa(iBinder) : (mbq) queryLocalInterface;
        }
    }

    IObjectWrapper a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void a();

    void a(Bundle bundle);

    void a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    void a(mbm mbm);

    void b();

    void b(Bundle bundle);

    void c();

    void d();

    void e();

    void f();

    void g();
}
