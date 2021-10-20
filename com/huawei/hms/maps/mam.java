package com.huawei.hms.maps;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import vigqyno.C0201;

public interface mam extends IInterface {

    public static abstract class maa extends Binder implements mam {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mam$maa$maa  reason: collision with other inner class name */
        public static class C0092maa implements mam {
            private IBinder a;

            public C0092maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mam
            public final IObjectWrapper a() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(32015), 2));
            }

            @Override // com.huawei.hms.maps.mam
            public final void a(Bundle bundle) {
                mby.a(this.a, C0201.m82(32016), 3, bundle);
            }

            @Override // com.huawei.hms.maps.mam
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(32017), 15, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mam
            public final void a(mbb mbb) {
                IBinder asBinder = mbb.asBinder();
                mby.a(this.a, C0201.m82(32018), 13, asBinder);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mam
            public final void b() {
                mby.h(this.a, C0201.m82(32019), 4);
            }

            @Override // com.huawei.hms.maps.mam
            public final void b(Bundle bundle) {
                mby.a(this.a, C0201.m82(32020), 10, bundle);
            }

            @Override // com.huawei.hms.maps.mam
            public final void c() {
                mby.h(this.a, C0201.m82(32021), 7);
            }

            @Override // com.huawei.hms.maps.mam
            public final void d() {
                mby.h(this.a, C0201.m82(32022), 8);
            }

            @Override // com.huawei.hms.maps.mam
            public final void e() {
                mby.h(this.a, C0201.m82(32023), 9);
            }

            @Override // com.huawei.hms.maps.mam
            public final void f() {
                mby.h(this.a, C0201.m82(32024), 11);
            }

            @Override // com.huawei.hms.maps.mam
            public final void g() {
                mby.h(this.a, C0201.m82(32025), 12);
            }
        }

        public static mam a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(13844));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mam)) ? new C0092maa(iBinder) : (mam) queryLocalInterface;
        }
    }

    IObjectWrapper a();

    void a(Bundle bundle);

    void a(IObjectWrapper iObjectWrapper);

    void a(mbb mbb);

    void b();

    void b(Bundle bundle);

    void c();

    void d();

    void e();

    void f();

    void g();
}
