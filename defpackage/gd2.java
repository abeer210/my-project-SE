package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: gd2  reason: default package */
/* compiled from: TopLoadingFinishEvent.kt */
public final class gd2 extends c<gd2> {
    private final WritableMap f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gd2(int i, WritableMap writableMap) {
        super(i);
        ow2.c(writableMap, C0201.m82(9008));
        this.f = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        ow2.c(rCTEventEmitter, C0201.m82(9009));
        rCTEventEmitter.receiveEvent(i(), f(), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(9010);
    }
}
