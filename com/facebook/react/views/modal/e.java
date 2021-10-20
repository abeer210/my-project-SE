package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: RequestCloseEvent */
public class e extends c<e> {
    public e(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), null);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(24218);
    }
}
