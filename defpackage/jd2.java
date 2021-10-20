package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: jd2  reason: default package */
/* compiled from: TopMessageEvent.kt */
public final class jd2 extends c<jd2> {
    private final WritableMap f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd2(int i, WritableMap writableMap) {
        super(i);
        ow2.c(writableMap, C0201.m82(21880));
        this.f = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        ow2.c(rCTEventEmitter, C0201.m82(21881));
        rCTEventEmitter.receiveEvent(i(), C0201.m82(21882), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(21883);
    }
}
