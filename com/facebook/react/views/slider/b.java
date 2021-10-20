package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactSliderEvent */
public class b extends c<b> {
    private final double f;
    private final boolean g;

    public b(int i, double d, boolean z) {
        super(i);
        this.f = d;
        this.g = z;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(36565), i());
        createMap.putDouble(C0201.m82(36566), m());
        createMap.putBoolean(C0201.m82(36567), n());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), o());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(36568);
    }

    public double m() {
        return this.f;
    }

    public boolean n() {
        return this.g;
    }
}
