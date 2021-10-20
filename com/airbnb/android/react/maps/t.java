package com.airbnb.android.react.maps;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import vigqyno.C0201;

/* compiled from: RegionChangeEvent */
public class t extends c<t> {
    private final LatLngBounds f;
    private final boolean g;
    private final boolean h;

    public t(int i, LatLngBounds latLngBounds, boolean z, boolean z2) {
        super(i);
        this.f = latLngBounds;
        this.g = z;
        this.h = z2;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean(C0201.m82(31295), this.g);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        LatLng o = this.f.o();
        writableNativeMap2.putDouble(C0201.m82(31296), o.a);
        writableNativeMap2.putDouble(C0201.m82(31297), o.b);
        LatLngBounds latLngBounds = this.f;
        writableNativeMap2.putDouble(C0201.m82(31298), latLngBounds.b.a - latLngBounds.a.a);
        LatLngBounds latLngBounds2 = this.f;
        writableNativeMap2.putDouble(C0201.m82(31299), latLngBounds2.b.b - latLngBounds2.a.b);
        writableNativeMap.putMap(C0201.m82(31300), writableNativeMap2);
        writableNativeMap.putBoolean(C0201.m82(31301), this.h);
        rCTEventEmitter.receiveEvent(i(), f(), writableNativeMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(31302);
    }
}
