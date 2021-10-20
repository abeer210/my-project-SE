package com.huawei.hms.maps;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import vigqyno.C0201;

public interface max extends IInterface {

    public static abstract class maa extends Binder implements max {

        /* renamed from: com.huawei.hms.maps.max$maa$maa  reason: collision with other inner class name */
        static class C0093maa implements max {
            private IBinder a;

            public C0093maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.max
            public final void a(Location location) {
                mby.a(this.a, C0201.m82(12982), 1, location);
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }
    }

    void a(Location location);
}
