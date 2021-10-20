package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import vigqyno.C0201;

public interface mcb extends IInterface {

    public static abstract class maa extends Binder implements mcb {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcb$maa$maa  reason: collision with other inner class name */
        public static class C0100maa implements mcb {
            private IBinder a;

            public C0100maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcb
            public final float a() {
                return mby.c(this.a, C0201.m82(9699), 1);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void a(float f) {
                mby.a(this.a, C0201.m82(9700), 14, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcb
            public final void a(float f, float f2) {
                mby.a(this.a, C0201.m82(9701), 17, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mcb
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(9702), 21, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void a(LatLng latLng) {
                mby.a(this.a, C0201.m82(9703), 18, latLng);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void a(LatLngBounds latLngBounds) {
                mby.a(this.a, C0201.m82(9704), 20, latLngBounds);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(9705), 15);
            }

            @Override // com.huawei.hms.maps.mcb
            public final boolean a(mcb mcb) {
                return mby.a(mcb, this.a, C0201.m82(9706), 25);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mcb
            public final LatLngBounds b() {
                return mby.a(this.a, C0201.m82(9707));
            }

            @Override // com.huawei.hms.maps.mcb
            public final void b(float f) {
                mby.a(this.a, C0201.m82(9708), 22, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcb
            public final void b(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(9709), 19, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(9710), 23);
            }

            @Override // com.huawei.hms.maps.mcb
            public final float c() {
                return mby.c(this.a, C0201.m82(9711), 3);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void c(float f) {
                mby.a(this.a, C0201.m82(9712), 24, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcb
            public final String d() {
                return mby.d(this.a, C0201.m82(9713), 4);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void d(float f) {
                mby.a(this.a, C0201.m82(9714), 16, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcb
            public final LatLng e() {
                return mby.e(this.a, C0201.m82(9715), 5);
            }

            @Override // com.huawei.hms.maps.mcb
            public final IObjectWrapper f() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(9716), 6));
            }

            @Override // com.huawei.hms.maps.mcb
            public final float g() {
                return mby.c(this.a, C0201.m82(9717), 7);
            }

            @Override // com.huawei.hms.maps.mcb
            public final float h() {
                return mby.c(this.a, C0201.m82(9718), 8);
            }

            @Override // com.huawei.hms.maps.mcb
            public final float i() {
                return mby.c(this.a, C0201.m82(9719), 9);
            }

            @Override // com.huawei.hms.maps.mcb
            public final int j() {
                return mby.b(this.a, C0201.m82(9720), 10);
            }

            @Override // com.huawei.hms.maps.mcb
            public final boolean k() {
                return mby.a(this.a, C0201.m82(9721), 11);
            }

            @Override // com.huawei.hms.maps.mcb
            public final boolean l() {
                return mby.a(this.a, C0201.m82(9722), 12);
            }

            @Override // com.huawei.hms.maps.mcb
            public final void m() {
                mby.h(this.a, C0201.m82(9723), 13);
            }
        }

        public static mcb a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(16996));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcb)) ? new C0100maa(iBinder) : (mcb) queryLocalInterface;
        }
    }

    float a();

    void a(float f);

    void a(float f, float f2);

    void a(IObjectWrapper iObjectWrapper);

    void a(LatLng latLng);

    void a(LatLngBounds latLngBounds);

    void a(boolean z);

    boolean a(mcb mcb);

    LatLngBounds b();

    void b(float f);

    void b(IObjectWrapper iObjectWrapper);

    void b(boolean z);

    float c();

    void c(float f);

    String d();

    void d(float f);

    LatLng e();

    IObjectWrapper f();

    float g();

    float h();

    float i();

    int j();

    boolean k();

    boolean l();

    void m();
}
