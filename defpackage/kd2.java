package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: kd2  reason: default package */
/* compiled from: TopShouldStartLoadWithRequestEvent.kt */
public final class kd2 extends c<kd2> {
    private final WritableMap f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kd2(int i, WritableMap writableMap) {
        super(i);
        ow2.c(writableMap, C0201.m82(20100));
        this.f = writableMap;
        writableMap.putString(C0201.m82(20101), C0201.m82(20102));
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        ow2.c(rCTEventEmitter, C0201.m82(20103));
        rCTEventEmitter.receiveEvent(i(), C0201.m82(20104), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(20105);
    }
}
