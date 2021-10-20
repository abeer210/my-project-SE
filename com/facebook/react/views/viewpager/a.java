package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: PageScrollEvent */
public class a extends c<a> {
    private final int f;
    private final float g;

    public a(int i, int i2, float f2) {
        super(i);
        this.f = i2;
        this.g = (Float.isInfinite(f2) || Float.isNaN(f2)) ? 0.0f : f2;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(17232), this.f);
        createMap.putDouble(C0201.m82(17233), (double) this.g);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(17234);
    }
}
