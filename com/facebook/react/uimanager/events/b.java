package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

/* compiled from: ContentSizeChangeEvent */
public class b extends c<b> {
    private final int f;
    private final int g;

    public b(int i, int i2, int i3) {
        super(i);
        this.f = i2;
        this.g = i3;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(24571), (double) q.a((float) this.f));
        createMap.putDouble(C0201.m82(24572), (double) q.a((float) this.g));
        rCTEventEmitter.receiveEvent(i(), C0201.m82(24573), createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(24574);
    }
}
