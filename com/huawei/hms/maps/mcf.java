package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;
import vigqyno.C0201;

public interface mcf extends mbx {

    public static abstract class maa extends Binder implements mcf {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcf$maa$maa  reason: collision with other inner class name */
        public static class C0104maa implements mcf {
            private IBinder a;

            public C0104maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbx
            public final String a() {
                return mby.d(this.a, C0201.m82(74), 3);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(float f) {
                mby.a(this.a, C0201.m82(75), 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcf
            public final void a(int i) {
                mby.a(this.a, C0201.m82(76), 17, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(77), 25, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcf
            public final void a(List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(78));
                    obtain.writeList(list);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(79), 16);
            }

            @Override // com.huawei.hms.maps.mcf
            public final boolean a(mcf mcf) {
                return mby.a(mcf, this.a, C0201.m82(80), 28);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mbx
            public final IObjectWrapper b() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(81), 9));
            }

            @Override // com.huawei.hms.maps.mcf
            public final void b(float f) {
                mby.a(this.a, C0201.m82(82), 24, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcf
            public final void b(int i) {
                mby.a(this.a, C0201.m82(83), 21, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mcf
            public final void b(List<LatLng> list) {
                mby.a(list, this.a, C0201.m82(84), 20);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(85), 26);
            }

            @Override // com.huawei.hms.maps.mbx
            public final float c() {
                return mby.c(this.a, C0201.m82(86), 10);
            }

            @Override // com.huawei.hms.maps.mcf
            public final void c(int i) {
                mby.a(this.a, C0201.m82(87), 22, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mcf
            public final void c(List<PatternItem> list) {
                mby.b(list, this.a, C0201.m82(88), 23);
            }

            @Override // com.huawei.hms.maps.mcf
            public final void c(boolean z) {
                mby.a(z, this.a, C0201.m82(89), 18);
            }

            @Override // com.huawei.hms.maps.mbx
            public final int d() {
                return mby.b(this.a, C0201.m82(90), 11);
            }

            @Override // com.huawei.hms.maps.mbx
            public final boolean e() {
                return mby.a(this.a, C0201.m82(91), 12);
            }

            @Override // com.huawei.hms.maps.mbx
            public final boolean f() {
                return mby.a(this.a, C0201.m82(92), 14);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void g() {
                mby.h(this.a, C0201.m82(93), 15);
            }

            @Override // com.huawei.hms.maps.mcf
            public final int h() {
                return mby.b(this.a, C0201.m82(94), 1);
            }

            @Override // com.huawei.hms.maps.mcf
            public final List i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(95));
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcf
            public final List<LatLng> j() {
                return mby.f(this.a, C0201.m82(96), 4);
            }

            @Override // com.huawei.hms.maps.mcf
            public final int k() {
                return mby.b(this.a, C0201.m82(97), 5);
            }

            @Override // com.huawei.hms.maps.mcf
            public final int l() {
                return mby.b(this.a, C0201.m82(98), 6);
            }

            @Override // com.huawei.hms.maps.mcf
            public final List<PatternItem> m() {
                return mby.g(this.a, C0201.m82(99), 7);
            }

            @Override // com.huawei.hms.maps.mcf
            public final float n() {
                return mby.c(this.a, C0201.m82(100), 8);
            }

            @Override // com.huawei.hms.maps.mcf
            public final boolean o() {
                return mby.a(this.a, C0201.m82(101), 13);
            }
        }

        public static mcf a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(28784));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcf)) ? new C0104maa(iBinder) : (mcf) queryLocalInterface;
        }
    }

    void a(int i);

    void a(List list);

    boolean a(mcf mcf);

    void b(float f);

    void b(int i);

    void b(List<LatLng> list);

    void c(int i);

    void c(List<PatternItem> list);

    void c(boolean z);

    int h();

    List i();

    List<LatLng> j();

    int k();

    int l();

    List<PatternItem> m();

    float n();

    boolean o();
}
