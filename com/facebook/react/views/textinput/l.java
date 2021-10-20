package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactTextInputSelectionEvent */
public class l extends c<l> {
    private int f;
    private int g;

    public l(int i, int i2, int i3) {
        super(i);
        this.f = i2;
        this.g = i3;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(C0201.m82(9899), this.g);
        createMap2.putInt(C0201.m82(9900), this.f);
        createMap.putMap(C0201.m82(9901), createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(9902);
    }
}
