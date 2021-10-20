package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mbn;
import com.huawei.hms.maps.mbs;
import com.huawei.hms.maps.mbz;
import com.huawei.hms.maps.mca;
import com.huawei.hms.maps.mcb;
import com.huawei.hms.maps.mcc;
import com.huawei.hms.maps.mce;
import com.huawei.hms.maps.mcf;
import com.huawei.hms.maps.mcg;
import com.huawei.hms.maps.mch;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.CameraUpdateParam;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.maps.model.TileOverlayOptions;
import vigqyno.C0201;

public interface mah extends IInterface {

    public static abstract class maa extends Binder implements mah {

        /* renamed from: com.huawei.hms.maps.mah$maa$maa  reason: collision with other inner class name */
        static class C0089maa implements mah {
            private IBinder a;

            public C0089maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mah
            public final mca a(CircleOptions circleOptions) {
                return mca.maa.a(mby.a(this.a, C0201.m82(37489), 25, circleOptions));
            }

            @Override // com.huawei.hms.maps.mah
            public final mcb a(GroundOverlayOptions groundOverlayOptions) {
                return mcb.maa.a(mby.a(this.a, C0201.m82(37490), 28, groundOverlayOptions));
            }

            @Override // com.huawei.hms.maps.mah
            public final mcc a() {
                return mcc.maa.a(mby.i(this.a, C0201.m82(37491), 2));
            }

            @Override // com.huawei.hms.maps.mah
            public final mce a(MarkerOptions markerOptions) {
                return mce.maa.a(mby.a(this.a, C0201.m82(37492), 24, markerOptions));
            }

            @Override // com.huawei.hms.maps.mah
            public final mcf a(PolygonOptions polygonOptions) {
                return mcf.maa.a(mby.a(this.a, C0201.m82(37493), 26, polygonOptions));
            }

            @Override // com.huawei.hms.maps.mah
            public final mcg a(PolylineOptions polylineOptions) {
                return mcg.maa.a(mby.a(this.a, C0201.m82(37494), 27, polylineOptions));
            }

            @Override // com.huawei.hms.maps.mah
            public final mch a(TileOverlayOptions tileOverlayOptions) {
                return mch.maa.a(mby.a(this.a, C0201.m82(37495), 1, tileOverlayOptions));
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(float f) {
                mby.a(this.a, C0201.m82(37496), 16, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(int i) {
                mby.a(this.a, C0201.m82(37497), 7, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(int i, int i2, int i3, int i4) {
                mby.a(this.a, C0201.m82(37498), 18, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mai mai) {
                mby.a(mai.asBinder(), this.a, C0201.m82(37499), 45);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(maj maj) {
                mby.a(maj != null ? maj.asBinder() : null, this.a, C0201.m82(37500), 58);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(man man) {
                mby.a(man != null ? man.asBinder() : null, this.a, C0201.m82(37501), 40);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mao mao) {
                mby.a(mao != null ? mao.asBinder() : null, this.a, C0201.m82(37502), 39);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(map map) {
                mby.a(map != null ? map.asBinder() : null, this.a, C0201.m82(37503), 38);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(maq maq) {
                mby.a(maq != null ? maq.asBinder() : null, this.a, C0201.m82(37504), 37);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mar mar) {
                mby.a(mar != null ? mar.asBinder() : null, this.a, C0201.m82(37505), 42);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mas mas) {
                mby.a(mas != null ? mas.asBinder() : null, this.a, C0201.m82(37506), 47);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mat mat) {
                mby.a(mat != null ? mat.asBinder() : null, this.a, C0201.m82(37507), 48);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mau mau) {
                mby.a(mau != null ? mau.asBinder() : null, this.a, C0201.m82(37508), 46);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mav mav) {
                mby.a(mav != null ? mav.asBinder() : null, this.a, C0201.m82(37509), 49);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(maw maw) {
                mby.a(maw != null ? maw.asBinder() : null, this.a, C0201.m82(37510), 50);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(may may) {
                mby.a(may != null ? may.asBinder() : null, this.a, C0201.m82(37511), 54);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(maz maz) {
                mby.a(maz.asBinder(), this.a, C0201.m82(37512), 30);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mba mba) {
                mby.a(mba != null ? mba.asBinder() : null, this.a, C0201.m82(37513), 53);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbc mbc) {
                mby.a(mbc != null ? mbc.asBinder() : null, this.a, C0201.m82(37514), 51);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbd mbd) {
                mby.a(mbd != null ? mbd.asBinder() : null, this.a, C0201.m82(37515), 52);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbe mbe) {
                mby.a(mbe != null ? mbe.asBinder() : null, this.a, C0201.m82(37516), 55);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbf mbf) {
                mby.a(mbf != null ? mbf.asBinder() : null, this.a, C0201.m82(37517), 57);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbg mbg) {
                mby.a(mbg != null ? mbg.asBinder() : null, this.a, C0201.m82(37518), 61);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbh mbh) {
                mby.a(mbh != null ? mbh.asBinder() : null, this.a, C0201.m82(37519), 43);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbi mbi) {
                mby.a(mbi != null ? mbi.asBinder() : null, this.a, C0201.m82(37520), 44);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbo mbo) {
                mby.a(mbo.asBinder(), this.a, C0201.m82(37521), 65);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(mbo mbo, IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(37522), 64, mbo.asBinder(), iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(CameraUpdateParam cameraUpdateParam) {
                mby.a(this.a, C0201.m82(37523), 33, cameraUpdateParam);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(CameraUpdateParam cameraUpdateParam, int i, mae mae) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(37524));
                    if (cameraUpdateParam != null) {
                        obtain.writeInt(1);
                        cameraUpdateParam.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(mae != null ? mae.asBinder() : null);
                    this.a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(CameraUpdateParam cameraUpdateParam, mae mae) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(37525));
                    if (cameraUpdateParam != null) {
                        obtain.writeInt(1);
                        cameraUpdateParam.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(mae != null ? mae.asBinder() : null);
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(LatLngBounds latLngBounds) {
                mby.a(this.a, C0201.m82(37526), 23, latLngBounds);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(String str) {
                mby.a(str, this.a, C0201.m82(37527), 14);
            }

            @Override // com.huawei.hms.maps.mah
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(37528), 6);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean a(MapStyleOptions mapStyleOptions) {
                return mby.a(this.a, C0201.m82(37529), 59, 0, new Parcelable[]{mapStyleOptions}).intValue() != 0;
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mah
            public final float b() {
                return mby.c(this.a, C0201.m82(37530), 3);
            }

            @Override // com.huawei.hms.maps.mah
            public final void b(float f) {
                mby.a(this.a, C0201.m82(37531), 17, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mah
            public final void b(CameraUpdateParam cameraUpdateParam) {
                mby.a(this.a, C0201.m82(37532), 34, cameraUpdateParam);
            }

            @Override // com.huawei.hms.maps.mah
            public final void b(String str) {
                mby.a(str, this.a, C0201.m82(37533), 67);
            }

            @Override // com.huawei.hms.maps.mah
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(37534), 8);
            }

            @Override // com.huawei.hms.maps.mah
            public final float c() {
                return mby.c(this.a, C0201.m82(37535), 4);
            }

            @Override // com.huawei.hms.maps.mah
            public final void c(String str) {
                mby.a(str, this.a, C0201.m82(37536), 69);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean c(boolean z) {
                return mby.a(this.a, C0201.m82(37537), z);
            }

            @Override // com.huawei.hms.maps.mah
            public final void d(boolean z) {
                mby.a(z, this.a, C0201.m82(37538), 19);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean d() {
                return mby.a(this.a, C0201.m82(37539), 5);
            }

            @Override // com.huawei.hms.maps.mah
            public final void e(boolean z) {
                mby.a(z, this.a, C0201.m82(37540), 20);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean e() {
                return mby.a(this.a, C0201.m82(37541), 9);
            }

            @Override // com.huawei.hms.maps.mah
            public final int f() {
                return mby.b(this.a, C0201.m82(37542), 10);
            }

            @Override // com.huawei.hms.maps.mah
            public final void f(boolean z) {
                mby.a(z, this.a, C0201.m82(37543), 60);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean g() {
                return mby.a(this.a, C0201.m82(37544), 11);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean h() {
                return mby.a(this.a, C0201.m82(37545), 12);
            }

            @Override // com.huawei.hms.maps.mah
            public final void i() {
                mby.h(this.a, C0201.m82(37546), 13);
            }

            @Override // com.huawei.hms.maps.mah
            public final boolean j() {
                return mby.a(this.a, C0201.m82(37547), 21);
            }

            @Override // com.huawei.hms.maps.mah
            public final mbs k() {
                return mbs.maa.a(mby.i(this.a, C0201.m82(37548), 22));
            }

            @Override // com.huawei.hms.maps.mah
            public final mbn l() {
                return mbn.maa.a(mby.i(this.a, C0201.m82(37549), 29));
            }

            @Override // com.huawei.hms.maps.mah
            public final void m() {
                mby.h(this.a, C0201.m82(37550), 32);
            }

            @Override // com.huawei.hms.maps.mah
            public final CameraPosition n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(37551));
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mah
            public final void o() {
                mby.h(this.a, C0201.m82(37552), 66);
            }

            @Override // com.huawei.hms.maps.mah
            public final mbz p() {
                return mbz.maa.a(mby.i(this.a, C0201.m82(37553), 68));
            }
        }
    }

    mca a(CircleOptions circleOptions);

    mcb a(GroundOverlayOptions groundOverlayOptions);

    mcc a();

    mce a(MarkerOptions markerOptions);

    mcf a(PolygonOptions polygonOptions);

    mcg a(PolylineOptions polylineOptions);

    mch a(TileOverlayOptions tileOverlayOptions);

    void a(float f);

    void a(int i);

    void a(int i, int i2, int i3, int i4);

    void a(mai mai);

    void a(maj maj);

    void a(man man);

    void a(mao mao);

    void a(map map);

    void a(maq maq);

    void a(mar mar);

    void a(mas mas);

    void a(mat mat);

    void a(mau mau);

    void a(mav mav);

    void a(maw maw);

    void a(may may);

    void a(maz maz);

    void a(mba mba);

    void a(mbc mbc);

    void a(mbd mbd);

    void a(mbe mbe);

    void a(mbf mbf);

    void a(mbg mbg);

    void a(mbh mbh);

    void a(mbi mbi);

    void a(mbo mbo);

    void a(mbo mbo, IObjectWrapper iObjectWrapper);

    void a(CameraUpdateParam cameraUpdateParam);

    void a(CameraUpdateParam cameraUpdateParam, int i, mae mae);

    void a(CameraUpdateParam cameraUpdateParam, mae mae);

    void a(LatLngBounds latLngBounds);

    void a(String str);

    void a(boolean z);

    boolean a(MapStyleOptions mapStyleOptions);

    float b();

    void b(float f);

    void b(CameraUpdateParam cameraUpdateParam);

    void b(String str);

    void b(boolean z);

    float c();

    void c(String str);

    boolean c(boolean z);

    void d(boolean z);

    boolean d();

    void e(boolean z);

    boolean e();

    int f();

    void f(boolean z);

    boolean g();

    boolean h();

    void i();

    boolean j();

    mbs k();

    mbn l();

    void m();

    CameraPosition n();

    void o();

    mbz p();
}
