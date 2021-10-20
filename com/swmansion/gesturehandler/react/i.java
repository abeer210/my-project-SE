package com.swmansion.gesturehandler.react;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerStateChangeEvent */
public class i extends c<i> {
    private static final f<i> g = new f<>(7);
    private WritableMap f;

    private i() {
    }

    private void m(wp2 wp2, int i, int i2, c cVar) {
        super.j(wp2.r().getId());
        WritableMap createMap = Arguments.createMap();
        this.f = createMap;
        if (cVar != null) {
            cVar.a(wp2, createMap);
        }
        this.f.putInt(C0201.m82(17111), wp2.q());
        this.f.putInt(C0201.m82(17112), i);
        this.f.putInt(C0201.m82(17113), i2);
    }

    public static i n(wp2 wp2, int i, int i2, c cVar) {
        i b = g.b();
        if (b == null) {
            b = new i();
        }
        b.m(wp2, i, i2, cVar);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), C0201.m82(17114), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(17115);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void l() {
        this.f = null;
        g.a(this);
    }
}
