package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactTextInputSubmitEditingEvent */
public class n extends c<n> {
    private String f;

    public n(int i, String str) {
        super(i);
        this.f = str;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(9834), i());
        createMap.putString(C0201.m82(9835), this.f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(9836);
    }
}
