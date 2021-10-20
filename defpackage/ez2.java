package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: ez2  reason: default package */
/* compiled from: FacesDetectedEvent */
public class ez2 extends c<ez2> {
    private static final f<ez2> g = new f<>(3);
    private WritableArray f;

    private ez2() {
    }

    private void m(int i, WritableArray writableArray) {
        super.j(i);
        this.f = writableArray;
    }

    public static ez2 n(int i, WritableArray writableArray) {
        ez2 b = g.b();
        if (b == null) {
            b = new ez2();
        }
        b.m(i, writableArray);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(30280), C0201.m82(30281));
        createMap.putArray(C0201.m82(30282), this.f);
        createMap.putInt(C0201.m82(30283), i());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), o());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        if (this.f.size() > 32767) {
            return Short.MAX_VALUE;
        }
        return (short) this.f.size();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return CameraViewManager.a.EVENT_ON_FACES_DETECTED.toString();
    }
}
