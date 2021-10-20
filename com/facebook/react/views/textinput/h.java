package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: ReactTextInputEvent */
public class h extends c<h> {
    private String f;
    private String g;
    private int h;
    private int i;

    public h(int i2, String str, String str2, int i3, int i4) {
        super(i2);
        this.f = str;
        this.g = str2;
        this.h = i3;
        this.i = i4;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(C0201.m82(9738), (double) this.h);
        createMap2.putDouble(C0201.m82(9739), (double) this.i);
        createMap.putString(C0201.m82(9740), this.f);
        createMap.putString(C0201.m82(9741), this.g);
        createMap.putMap(C0201.m82(9742), createMap2);
        createMap.putInt(C0201.m82(9743), i());
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
        return C0201.m82(9744);
    }
}
