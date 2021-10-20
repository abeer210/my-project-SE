package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.model.LatLng;
import vigqyno.C0201;

public interface mag extends IInterface {

    public static abstract class maa extends Binder implements mag {

        /* access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.maps.mag$maa$maa  reason: collision with other inner class name */
        public static class C0088maa implements mag {
            private IBinder a;

            public C0088maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.mag
            public final double a(LatLng latLng, LatLng latLng2) {
                return mby.a(this.a, C0201.m82(2295), 1, 2, latLng, latLng2).doubleValue();
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }

        public static mag a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(34232));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof mag)) ? new C0088maa(iBinder) : (mag) queryLocalInterface;
        }
    }

    double a(LatLng latLng, LatLng latLng2);
}
