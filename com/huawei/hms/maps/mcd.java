package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mcd extends IInterface {

    public static abstract class maa extends Binder implements mcd {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mcd$maa$maa  reason: collision with other inner class name */
        public static class C0102maa implements mcd {
            private IBinder a;

            public C0102maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mcd
            public final void a() {
                mby.h(this.a, C0201.m82(35269), 1);
            }

            @Override // com.huawei.hms.maps.mcd
            public final boolean a(mcd mcd) {
                return mby.a(mcd, this.a, C0201.m82(35270), 4);
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.mcd
            public final String b() {
                return mby.d(this.a, C0201.m82(35271), 2);
            }

            @Override // com.huawei.hms.maps.mcd
            public final String c() {
                return mby.d(this.a, C0201.m82(35272), 3);
            }

            @Override // com.huawei.hms.maps.mcd
            public final int d() {
                return mby.b(this.a, C0201.m82(35273), 5);
            }
        }

        public static mcd a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(13436));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mcd)) ? new C0102maa(iBinder) : (mcd) queryLocalInterface;
        }
    }

    void a();

    boolean a(mcd mcd);

    String b();

    String c();

    int d();
}
