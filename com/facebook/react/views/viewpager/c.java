package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import vigqyno.C0201;

/* compiled from: PageSelectedEvent */
public class c extends com.facebook.react.uimanager.events.c<c> {
    private final int f;

    public c(int i, int i2) {
        super(i);
        this.f = i2;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(17370), this.f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(17371);
    }
}
