package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: RefreshEvent */
public class b extends c<b> {
    public b(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), null);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(13996);
    }
}
