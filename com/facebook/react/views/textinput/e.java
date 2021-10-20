package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactTextChangedEvent */
public class e extends c<e> {
    private String f;
    private int g;

    public e(int i, String str, int i2) {
        super(i);
        this.f = str;
        this.g = i2;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(9074), this.f);
        createMap.putInt(C0201.m82(9075), this.g);
        createMap.putInt(C0201.m82(9076), i());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(9077);
    }
}
