package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: ed2  reason: default package */
/* compiled from: TopHttpErrorEvent.kt */
public final class ed2 extends c<ed2> {
    private final WritableMap f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ed2(int i, WritableMap writableMap) {
        super(i);
        ow2.c(writableMap, C0201.m82(23768));
        this.f = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        ow2.c(rCTEventEmitter, C0201.m82(23769));
        rCTEventEmitter.receiveEvent(i(), f(), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(23770);
    }
}
