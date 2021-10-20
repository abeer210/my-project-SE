package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface mak extends IInterface {

    public static abstract class maa extends Binder implements mak {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mak$maa$maa  reason: collision with other inner class name */
        public static class C0090maa implements mak {
            private IBinder a;

            public C0090maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mak
            public final void a(mbw mbw) {
                mby.a(this.a, C0201.m82(8117), 1, mbw);
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public static mak a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(5132));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mak)) ? new C0090maa(iBinder) : (mak) queryLocalInterface;
        }
    }

    void a(mbw mbw);
}
