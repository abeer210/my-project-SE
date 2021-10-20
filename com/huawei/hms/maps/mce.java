package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.animation.Animation;
import vigqyno.C0201;

public interface mce extends IInterface {

    public static abstract class maa extends Binder implements mce {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mce$maa$maa  reason: collision with other inner class name */
        public static class C0103maa implements mce {
            private IBinder a;

            public C0103maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mce
            public final void a() {
                mby.h(this.a, C0201.m82(20004), 1);
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(float f) {
                mby.a(this.a, C0201.m82(20005), 22, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(float f, float f2) {
                mby.a(this.a, C0201.m82(20006), 19, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(20007), 18, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(mad mad) {
                mby.a(mad != null ? mad.asBinder() : null, this.a, C0201.m82(20008), 35);
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(LatLng latLng) {
                mby.a(this.a, C0201.m82(20009), 3, latLng);
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(Animation animation) {
                mby.a(this.a, C0201.m82(20010), 33, animation);
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(String str) {
                mby.a(str, this.a, C0201.m82(20011), 5);
            }

            @Override // com.huawei.hms.maps.mce
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(20012), 9);
            }

            @Override // com.huawei.hms.maps.mce
            public final boolean a(mce mce) {
                return mby.a(mce, this.a, C0201.m82(20013), 16);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mce
            public final String b() {
                return mby.d(this.a, C0201.m82(20014), 2);
            }

            @Override // com.huawei.hms.maps.mce
            public final void b(float f) {
                mby.a(this.a, C0201.m82(20015), 25, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mce
            public final void b(float f, float f2) {
                mby.a(this.a, C0201.m82(20016), 24, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mce
            public final void b(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(20017), 29, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mce
            public final void b(String str) {
                mby.a(str, this.a, C0201.m82(20018), 7);
            }

            @Override // com.huawei.hms.maps.mce
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(20019), 14);
            }

            @Override // com.huawei.hms.maps.mce
            public final LatLng c() {
                return mby.e(this.a, C0201.m82(20020), 4);
            }

            @Override // com.huawei.hms.maps.mce
            public final void c(float f) {
                mby.a(this.a, C0201.m82(20021), 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mce
            public final void c(float f, float f2) {
                mby.a(this.a, C0201.m82(20022), 32, Float.valueOf(f), Float.valueOf(f2));
            }

            @Override // com.huawei.hms.maps.mce
            public final void c(boolean z) {
                mby.a(z, this.a, C0201.m82(20023), 20);
            }

            @Override // com.huawei.hms.maps.mce
            public final String d() {
                return mby.d(this.a, C0201.m82(20024), 6);
            }

            @Override // com.huawei.hms.maps.mce
            public final String e() {
                return mby.d(this.a, C0201.m82(20025), 8);
            }

            @Override // com.huawei.hms.maps.mce
            public final boolean f() {
                return mby.a(this.a, C0201.m82(20026), 10);
            }

            @Override // com.huawei.hms.maps.mce
            public final void g() {
                mby.h(this.a, C0201.m82(20027), 11);
            }

            @Override // com.huawei.hms.maps.mce
            public final void h() {
                mby.h(this.a, C0201.m82(20028), 12);
            }

            @Override // com.huawei.hms.maps.mce
            public final boolean i() {
                return mby.a(this.a, C0201.m82(20029), 13);
            }

            @Override // com.huawei.hms.maps.mce
            public final boolean j() {
                return mby.a(this.a, C0201.m82(20030), 15);
            }

            @Override // com.huawei.hms.maps.mce
            public final int k() {
                return mby.b(this.a, C0201.m82(20031), 17);
            }

            @Override // com.huawei.hms.maps.mce
            public final boolean l() {
                return mby.a(this.a, C0201.m82(20032), 21);
            }

            @Override // com.huawei.hms.maps.mce
            public final float m() {
                return mby.c(this.a, C0201.m82(20033), 23);
            }

            @Override // com.huawei.hms.maps.mce
            public final float n() {
                return mby.c(this.a, C0201.m82(20034), 26);
            }

            @Override // com.huawei.hms.maps.mce
            public final float o() {
                return mby.c(this.a, C0201.m82(20035), 28);
            }

            @Override // com.huawei.hms.maps.mce
            public final IObjectWrapper p() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(20036), 30));
            }

            @Override // com.huawei.hms.maps.mce
            public final boolean q() {
                return mby.a(this.a, C0201.m82(20037), 31);
            }

            @Override // com.huawei.hms.maps.mce
            public final void r() {
                mby.a(this.a, C0201.m82(20038), 34, new Parcelable[0]);
            }
        }

        public static mce a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(7660));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mce)) ? new C0103maa(iBinder) : (mce) queryLocalInterface;
        }
    }

    void a();

    void a(float f);

    void a(float f, float f2);

    void a(IObjectWrapper iObjectWrapper);

    void a(mad mad);

    void a(LatLng latLng);

    void a(Animation animation);

    void a(String str);

    void a(boolean z);

    boolean a(mce mce);

    String b();

    void b(float f);

    void b(float f, float f2);

    void b(IObjectWrapper iObjectWrapper);

    void b(String str);

    void b(boolean z);

    LatLng c();

    void c(float f);

    void c(float f, float f2);

    void c(boolean z);

    String d();

    String e();

    boolean f();

    void g();

    void h();

    boolean i();

    boolean j();

    int k();

    boolean l();

    float m();

    float n();

    float o();

    IObjectWrapper p();

    boolean q();

    void r();
}
