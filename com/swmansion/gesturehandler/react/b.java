package com.swmansion.gesturehandler.react;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerEvent */
public class b extends c<b> {
    private static final f<b> h = new f<>(7);
    private WritableMap f;
    private short g;

    private b() {
    }

    private void m(wp2 wp2, c cVar) {
        super.j(wp2.r().getId());
        WritableMap createMap = Arguments.createMap();
        this.f = createMap;
        if (cVar != null) {
            cVar.a(wp2, createMap);
        }
        this.f.putInt(C0201.m82(18492), wp2.q());
        this.f.putInt(C0201.m82(18493), wp2.p());
        this.g = wp2.j();
    }

    public static b n(wp2 wp2, c cVar) {
        b b = h.b();
        if (b == null) {
            b = new b();
        }
        b.m(wp2, cVar);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), C0201.m82(18494), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return this.g;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(18495);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void l() {
        this.f = null;
        h.a(this);
    }
}
