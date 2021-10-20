package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import vigqyno.C0201;

/* renamed from: kl0  reason: default package */
/* compiled from: DrawerOpenedEvent */
public class kl0 extends c<kl0> {
    public kl0(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), Arguments.createMap());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return C0201.m82(36877);
    }
}
