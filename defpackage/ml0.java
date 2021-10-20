package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: ml0  reason: default package */
/* compiled from: DrawerStateChangedEvent */
public class ml0 extends c<ml0> {
    private final int f;

    public ml0(int i, int i2) {
        super(i);
        this.f = i2;
    }

    private WritableMap n() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(C0201.m82(24274), (double) m());
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
        return C0201.m82(24275);
    }

    public int m() {
        return this.f;
    }
}
