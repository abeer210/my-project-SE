package com.google.android.gms.maps;

import android.location.Location;

public interface d {

    public interface a {
        void onLocationChanged(Location location);
    }

    void a(a aVar);

    void deactivate();
}
