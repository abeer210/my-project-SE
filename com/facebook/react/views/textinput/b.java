package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactContentSizeChangedEvent */
public class b extends c<e> {
    private float f;
    private float g;

    public b(int i, float f2, float f3) {
        super(i);
        this.f = f2;
        this.g = f3;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(C0201.m82(9441), (double) this.f);
        createMap2.putDouble(C0201.m82(9442), (double) this.g);
        createMap.putMap(C0201.m82(9443), createMap2);
        createMap.putInt(C0201.m82(9444), i());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(9445);
    }
}
