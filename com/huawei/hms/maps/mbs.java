package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mbs extends IInterface {

    public static abstract class maa extends Binder implements mbs {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mbs$maa$maa  reason: collision with other inner class name */
        public static class C0097maa implements mbs {
            private IBinder a;

            public C0097maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbs
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(17450), 12);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean a() {
                return mby.a(this.a, C0201.m82(17451), 1);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mbs
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(17452), 13);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean b() {
                return mby.a(this.a, C0201.m82(17453), 2);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void c(boolean z) {
                mby.a(z, this.a, C0201.m82(17454), 14);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean c() {
                return mby.a(this.a, C0201.m82(17455), 3);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void d(boolean z) {
                mby.a(z, this.a, C0201.m82(17456), 15);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean d() {
                return mby.a(this.a, C0201.m82(17457), 4);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void e(boolean z) {
                mby.a(z, this.a, C0201.m82(17458), 16);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean e() {
                return mby.a(this.a, C0201.m82(17459), 5);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void f(boolean z) {
                mby.a(z, this.a, C0201.m82(17460), 17);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean f() {
                return mby.a(this.a, C0201.m82(17461), 6);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void g(boolean z) {
                mby.a(z, this.a, C0201.m82(17462), 18);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean g() {
                return mby.a(this.a, C0201.m82(17463), 7);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void h(boolean z) {
                mby.a(z, this.a, C0201.m82(17464), 19);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean h() {
                return mby.a(this.a, C0201.m82(17465), 8);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void i(boolean z) {
                mby.a(z, this.a, C0201.m82(17466), 20);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean i() {
                return mby.a(this.a, C0201.m82(17467), 9);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void j(boolean z) {
                mby.a(z, this.a, C0201.m82(17468), 21);
            }

            @Override // com.huawei.hms.maps.mbs
            public final boolean j() {
                return mby.a(this.a, C0201.m82(17469), 10);
            }

            @Override // com.huawei.hms.maps.mbs
            public final void k(boolean z) {
                mby.a(z, this.a, C0201.m82(17470), 11);
            }
        }

        public static mbs a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(6235));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mbs)) ? new C0097maa(iBinder) : (mbs) queryLocalInterface;
        }
    }

    void a(boolean z);

    boolean a();

    void b(boolean z);

    boolean b();

    void c(boolean z);

    boolean c();

    void d(boolean z);

    boolean d();

    void e(boolean z);

    boolean e();

    void f(boolean z);

    boolean f();

    void g(boolean z);

    boolean g();

    void h(boolean z);

    boolean h();

    void i(boolean z);

    boolean i();

    void j(boolean z);

    boolean j();

    void k(boolean z);
}
