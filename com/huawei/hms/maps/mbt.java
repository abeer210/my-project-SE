package com.huawei.hms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.huawei.hms.maps.LocationSource;
import com.huawei.hms.maps.maj;
import vigqyno.C0201;

public final class mbt extends maj.maa {
    private LocationSource a;

    public static class maa implements LocationSource.OnLocationChangedListener {
        public max a;

        public maa(max max) {
            this.a = max;
        }

        @Override // com.huawei.hms.maps.LocationSource.OnLocationChangedListener
        public final void onLocationChanged(Location location) {
            try {
                this.a.a(location);
            } catch (RemoteException unused) {
                mco.d(C0201.m82(28584), C0201.m82(28585));
            }
        }
    }

    public mbt(LocationSource locationSource) {
        this.a = locationSource;
    }

    @Override // com.huawei.hms.maps.maj
    public final void a() {
        mco.a(C0201.m82(31361), C0201.m82(31362));
        this.a.deactivate();
    }

    @Override // com.huawei.hms.maps.maj
    public final void a(max max) {
        mco.a(C0201.m82(31363), C0201.m82(31364));
        this.a.activate(new maa(max));
    }
}
