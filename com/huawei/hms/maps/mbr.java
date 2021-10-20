package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public interface mbr extends IInterface {

    public static abstract class maa extends Binder implements mbr {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbr$maa$maa  reason: collision with other inner class name */
        public static class C0096maa implements mbr {
            private IBinder a;

            public C0096maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbr
            public final IObjectWrapper a() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(36555), 3));
            }

            @Override // com.huawei.hms.maps.mbr
            public final void a(Bundle bundle) {
                mby.a(this.a, C0201.m82(36556), 4, bundle);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void a(mbm mbm) {
                IBinder asBinder = mbm.asBinder();
                mby.a(this.a, C0201.m82(36557), 2, asBinder);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mbr
            public final void b() {
                mby.h(this.a, C0201.m82(36558), 5);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void b(Bundle bundle) {
                mby.a(this.a, C0201.m82(36559), 9, bundle);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void c() {
                mby.h(this.a, C0201.m82(36560), 6);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void d() {
                mby.h(this.a, C0201.m82(36561), 7);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void e() {
                mby.h(this.a, C0201.m82(36562), 8);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void f() {
                mby.h(this.a, C0201.m82(36563), 10);
            }

            @Override // com.huawei.hms.maps.mbr
            public final void g() {
                mby.h(this.a, C0201.m82(36564), 11);
            }
        }

        public static mbr a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(10937));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbr)) ? new C0096maa(iBinder) : (mbr) queryLocalInterface;
        }
    }

    IObjectWrapper a();

    void a(Bundle bundle);

    void a(mbm mbm);

    void b();

    void b(Bundle bundle);

    void c();

    void d();

    void e();

    void f();

    void g();
}
