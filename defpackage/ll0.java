package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: ll0  reason: default package */
/* compiled from: DrawerSlideEvent */
public class ll0 extends c<ll0> {
    private final float f;

    public ll0(int i, float f2) {
        super(i);
        this.f = f2;
    }

    private WritableMap n() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(26806), (double) m());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), n());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(26807);
    }

    public float m() {
        return this.f;
    }
}
