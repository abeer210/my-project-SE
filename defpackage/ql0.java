package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: ql0  reason: default package */
/* compiled from: PickerItemSelectEvent */
public class ql0 extends c<ql0> {
    private final int f;

    public ql0(int i, int i2) {
        super(i);
        this.f = i2;
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(34268), this.f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(34269);
    }
}
