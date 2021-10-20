package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import vigqyno.C0201;

/* compiled from: ReactSlidingCompleteEvent */
public class c extends com.facebook.react.uimanager.events.c<c> {
    private final double f;

    public c(int i, double d) {
        super(i);
        this.f = d;
    }

    private WritableMap n() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(36327), i());
        createMap.putDouble(C0201.m82(36328), m());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), n());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(36329);
    }

    public double m() {
        return this.f;
    }
}
