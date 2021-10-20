package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.d;
import com.google.android.gms.maps.model.x;

public final class t implements d.a {
    private final /* synthetic */ cq1 a;

    public t(s sVar, cq1 cq1) {
        this.a = cq1;
    }

    @Override // com.google.android.gms.maps.d.a
    public final void onLocationChanged(Location location) {
        try {
            this.a.p1(location);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
