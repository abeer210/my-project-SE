package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public interface mal extends IInterface {

    public static abstract class maa extends Binder implements mal {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mal$maa$maa  reason: collision with other inner class name */
        public static class C0091maa implements mal {
            private IBinder a;

            public C0091maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mal
            public final IObjectWrapper a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(10737));
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
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return IObjectWrapper.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mal
            public final void a() {
                mby.a(this.a, C0201.m82(10738), 3, new Parcelable[0]);
            }

            @Override // com.huawei.hms.maps.mal
            public final void a(Bundle bundle) {
                mby.a(this.a, C0201.m82(10739), 12, bundle);
            }

            @Override // com.huawei.hms.maps.mal
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(10740), 7, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mal
            public final void a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(10741));
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (huaweiMapOptions != null) {
                        obtain.writeInt(1);
                        huaweiMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mal
            public final void a(mbb mbb) {
                IBinder asBinder = mbb.asBinder();
                mby.a(this.a, C0201.m82(10742), 11, asBinder);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mal
            public final void b() {
                mby.h(this.a, C0201.m82(10743), 5);
            }

            @Override // com.huawei.hms.maps.mal
            public final void c() {
                mby.h(this.a, C0201.m82(10744), 6);
            }

            @Override // com.huawei.hms.maps.mal
            public final void d() {
                mby.h(this.a, C0201.m82(10745), 8);
            }

            @Override // com.huawei.hms.maps.mal
            public final void e() {
                mby.h(this.a, C0201.m82(10746), 9);
            }

            @Override // com.huawei.hms.maps.mal
            public final void f() {
                mby.h(this.a, C0201.m82(10747), 10);
            }

            @Override // com.huawei.hms.maps.mal
            public final void g() {
                mby.h(this.a, C0201.m82(10748), 16);
            }

            @Override // com.huawei.hms.maps.mal
            public final void h() {
                mby.h(this.a, C0201.m82(10749), 17);
            }
        }

        public static mal a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(22437));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mal)) ? new C0091maa(iBinder) : (mal) queryLocalInterface;
        }
    }

    IObjectWrapper a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void a();

    void a(Bundle bundle);

    void a(IObjectWrapper iObjectWrapper);

    void a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions, Bundle bundle);

    void a(mbb mbb);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();
}
