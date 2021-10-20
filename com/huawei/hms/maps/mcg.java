package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.Cap;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import java.util.List;
import vigqyno.C0201;

public interface mcg extends mbx {

    public static abstract class maa extends Binder implements mcg {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcg$maa$maa  reason: collision with other inner class name */
        public static class C0105maa implements mcg {
            private IBinder a;

            public C0105maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mbx
            public final String a() {
                return mby.d(this.a, C0201.m82(3197), 4);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(float f) {
                mby.a(this.a, C0201.m82(3198), 28, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcg
            public final void a(int i) {
                mby.a(this.a, C0201.m82(3199), 18, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(IObjectWrapper iObjectWrapper) {
                mby.a(this.a, C0201.m82(3200), 25, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.mcg
            public final void a(Cap cap) {
                mby.a(this.a, C0201.m82(3201), 19, cap);
            }

            @Override // com.huawei.hms.maps.mcg
            public final void a(List<PatternItem> list) {
                mby.b(list, this.a, C0201.m82(3202), 22);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void a(boolean z) {
                mby.a(z, this.a, C0201.m82(3203), 17);
            }

            @Override // com.huawei.hms.maps.mcg
            public final boolean a(mcg mcg) {
                return mby.a(mcg, this.a, C0201.m82(3204), 1);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mbx
            public final IObjectWrapper b() {
                return IObjectWrapper.Stub.asInterface(mby.i(this.a, C0201.m82(3205), 9));
            }

            @Override // com.huawei.hms.maps.mcg
            public final void b(float f) {
                mby.a(this.a, C0201.m82(3206), 27, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.mcg
            public final void b(int i) {
                mby.a(this.a, C0201.m82(3207), 21, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.mcg
            public final void b(Cap cap) {
                mby.a(this.a, C0201.m82(3208), 24, cap);
            }

            @Override // com.huawei.hms.maps.mcg
            public final void b(List<LatLng> list) {
                mby.a(list, this.a, C0201.m82(3209), 23);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void b(boolean z) {
                mby.a(z, this.a, C0201.m82(3210), 26);
            }

            @Override // com.huawei.hms.maps.mbx
            public final float c() {
                return mby.c(this.a, C0201.m82(3211), 11);
            }

            @Override // com.huawei.hms.maps.mcg
            public final void c(boolean z) {
                mby.a(z, this.a, C0201.m82(3212), 20);
            }

            @Override // com.huawei.hms.maps.mbx
            public final int d() {
                return mby.b(this.a, C0201.m82(3213), 12);
            }

            @Override // com.huawei.hms.maps.mbx
            public final boolean e() {
                return mby.a(this.a, C0201.m82(3214), 13);
            }

            @Override // com.huawei.hms.maps.mbx
            public final boolean f() {
                return mby.a(this.a, C0201.m82(3215), 15);
            }

            @Override // com.huawei.hms.maps.mbx
            public final void g() {
                mby.h(this.a, C0201.m82(3216), 16);
            }

            @Override // com.huawei.hms.maps.mcg
            public final int h() {
                return mby.b(this.a, C0201.m82(3217), 2);
            }

            @Override // com.huawei.hms.maps.mcg
            public final Cap i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(3218));
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Cap.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcg
            public final int j() {
                return mby.b(this.a, C0201.m82(3219), 5);
            }

            @Override // com.huawei.hms.maps.mcg
            public final List<PatternItem> k() {
                return mby.g(this.a, C0201.m82(3220), 6);
            }

            @Override // com.huawei.hms.maps.mcg
            public final List<LatLng> l() {
                return mby.f(this.a, C0201.m82(3221), 7);
            }

            @Override // com.huawei.hms.maps.mcg
            public final Cap m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(3222));
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Cap.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcg
            public final float n() {
                return mby.c(this.a, C0201.m82(3223), 10);
            }

            @Override // com.huawei.hms.maps.mcg
            public final boolean o() {
                return mby.a(this.a, C0201.m82(3224), 14);
            }
        }

        public static mcg a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(4615));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcg)) ? new C0105maa(iBinder) : (mcg) queryLocalInterface;
        }
    }

    void a(int i);

    void a(Cap cap);

    void a(List<PatternItem> list);

    boolean a(mcg mcg);

    void b(float f);

    void b(int i);

    void b(Cap cap);

    void b(List<LatLng> list);

    void c(boolean z);

    int h();

    Cap i();

    int j();

    List<PatternItem> k();

    List<LatLng> l();

    Cap m();

    float n();

    boolean o();
}
