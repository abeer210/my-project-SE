package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mch extends IInterface {

    public static abstract class maa extends Binder implements mch {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mch$maa$maa  reason: collision with other inner class name */
        public static class C0106maa implements mch {
            private IBinder a;

            public C0106maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mch
            public final void a() {
                mby.h(this.a, C0201.m82(8650), 1);
            }

            @Override // com.huawei.hms.maps.mch
            public final void a(float f) {
                mby.a(this.a, C0201.m82(8651), 9, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mch
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(8652), 8);
            }

            @Override // com.huawei.hms.maps.mch
            public final boolean a(mch mch) {
                return mby.a(mch, this.a, C0201.m82(8653), 12);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mch
            public final void b(float f) {
                mby.a(this.a, C0201.m82(8654), 11, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mch
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(8655), 10);
            }

            @Override // com.huawei.hms.maps.mch
            public final boolean b() {
                return mby.a(this.a, C0201.m82(8656), 2);
            }

            @Override // com.huawei.hms.maps.mch
            public final String c() {
                return mby.d(this.a, C0201.m82(8657), 3);
            }

            @Override // com.huawei.hms.maps.mch
            public final float d() {
                return mby.c(this.a, C0201.m82(8658), 4);
            }

            @Override // com.huawei.hms.maps.mch
            public final float e() {
                return mby.c(this.a, C0201.m82(8659), 5);
            }

            @Override // com.huawei.hms.maps.mch
            public final boolean f() {
                return mby.a(this.a, C0201.m82(8660), 6);
            }

            @Override // com.huawei.hms.maps.mch
            public final void g() {
                mby.h(this.a, C0201.m82(8661), 7);
            }

            @Override // com.huawei.hms.maps.mch
            public final int h() {
                return mby.b(this.a, C0201.m82(8662), 13);
            }
        }

        public static mch a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(30526));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mch)) ? new C0106maa(iBinder) : (mch) queryLocalInterface;
        }
    }

    void a();

    void a(float f);

    void a(boolean z);

    boolean a(mch mch);

    void b(float f);

    void b(boolean z);

    boolean b();

    String c();

    float d();

    float e();

    boolean f();

    void g();

    int h();
}
