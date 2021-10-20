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

public interface mca extends mbx {

    public static abstract class maa extends Binder implements mca {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mca$maa$maa  reason: collision with other inner class name */
        public static class C0099maa implements mca {
            private IBinder a;

            public C0099maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbx
            public final String a() {
                return mby.d(this.a, C0201.m82(30165), 3);
            }

            @Override // com.huawei.hms.maps.mca
            public final void a(double d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(30166));
                    obtain.writeDouble(d);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(float f) {
                mby.a(this.a, C0201.m82(30167), 23, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mca
            public final void a(int i) {
                mby.a(this.a, C0201.m82(30168), 16, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(30169), 21, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mca
            public final void a(LatLng latLng) {
                mby.a(this.a, C0201.m82(30170), 14, latLng);
            }

            @Override // com.huawei.hms.maps.mca
            public final void a(List<PatternItem> list) {
                mby.b(list, this.a, C0201.m82(30171), 19);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(30172), 15);
            }

            @Override // com.huawei.hms.maps.mca
            public final boolean a(mca mca) {
                return mby.a(mca, this.a, C0201.m82(30173), 24);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mbx
            public final IObjectWrapper b() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(30174), 8));
            }

            @Override // com.huawei.hms.maps.mca
            public final void b(float f) {
                mby.a(this.a, C0201.m82(30175), 20, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mca
            public final void b(int i) {
                mby.a(this.a, C0201.m82(30176), 18, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mbx
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(30177), 22);
            }

            @Override // com.huawei.hms.maps.mbx
            public final float c() {
                return mby.c(this.a, C0201.m82(30178), 9);
            }

            @Override // com.huawei.hms.maps.mbx
            public final int d() {
                return mby.b(this.a, C0201.m82(30179), 10);
            }

            @Override // com.huawei.hms.maps.mbx
            public final boolean e() {
                return mby.a(this.a, C0201.m82(30180), 11);
            }

            @Override // com.huawei.hms.maps.mbx
            public final boolean f() {
                return mby.a(this.a, C0201.m82(30181), 12);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void g() {
                mby.h(this.a, C0201.m82(30182), 13);
            }

            @Override // com.huawei.hms.maps.mca
            public final LatLng h() {
                return mby.e(this.a, C0201.m82(30183), 1);
            }

            @Override // com.huawei.hms.maps.mca
            public final int i() {
                return mby.b(this.a, C0201.m82(30184), 2);
            }

            @Override // com.huawei.hms.maps.mca
            public final double j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(30185));
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readDouble();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mca
            public final int k() {
                return mby.b(this.a, C0201.m82(30186), 5);
            }

            @Override // com.huawei.hms.maps.mca
            public final List<PatternItem> l() {
                return mby.g(this.a, C0201.m82(30187), 6);
            }

            @Override // com.huawei.hms.maps.mca
            public final float m() {
                return mby.c(this.a, C0201.m82(30188), 7);
            }
        }

        public static mca a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(30308));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mca)) ? new C0099maa(iBinder) : (mca) queryLocalInterface;
        }
    }

    void a(double d);

    void a(int i);

    void a(LatLng latLng);

    void a(List<PatternItem> list);

    boolean a(mca mca);

    void b(float f);

    void b(int i);

    LatLng h();

    int i();

    double j();

    int k();

    List<PatternItem> l();

    float m();
}
