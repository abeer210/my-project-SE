package com.facebook.react.views.checkbox;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactCheckBoxEvent */
public class b extends c<b> {
    private final boolean f;

    public b(int i, boolean z) {
        super(i);
        this.f = z;
    }

    private WritableMap n() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(37930), i());
        createMap.putBoolean(C0201.m82(37931), m());
        return createMap;
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
        return C0201.m82(37932);
    }

    public boolean m() {
        return this.f;
    }
}
