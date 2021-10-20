package com.airbnb.android.react.maps;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.maps.GoogleMapOptions;
import vigqyno.C0201;

public class AirMapLiteManager extends AirMapManager {
    private static final String REACT_CLASS = null;

    static {
        C0201.m83(AirMapLiteManager.class, 647);
    }

    public AirMapLiteManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.w(true);
        this.googleMapOptions = googleMapOptions;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager, com.airbnb.android.react.maps.AirMapManager
    public String getName() {
        return C0201.m82(10733);
    }
}
