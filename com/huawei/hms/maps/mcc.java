package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import vigqyno.C0201;

public interface mcc extends IInterface {

    public static abstract class maa extends Binder implements mcc {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcc$maa$maa  reason: collision with other inner class name */
        public static class C0101maa implements mcc {
            private IBinder a;

            public C0101maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcc
            public final int a() {
                return mby.b(this.a, C0201.m82(7374), 1);
            }

            @Override // com.huawei.hms.maps.mcc
            public final boolean a(mcc mcc) {
                return mby.a(mcc, this.a, C0201.m82(7375), 5);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mcc
            public final int b() {
                return mby.b(this.a, C0201.m82(7376), 2);
            }

            @Override // com.huawei.hms.maps.mcc
            public final List<IBinder> c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(7377));
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createBinderArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.mcc
            public final boolean d() {
                return mby.a(this.a, C0201.m82(7378), 4);
            }

            @Override // com.huawei.hms.maps.mcc
            public final int e() {
                return mby.b(this.a, C0201.m82(7379), 6);
            }
        }

        public static mcc a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(37919));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcc)) ? new C0101maa(iBinder) : (mcc) queryLocalInterface;
        }
    }

    int a();

    boolean a(mcc mcc);

    int b();

    List<IBinder> c();

    boolean d();

    int e();
}
