package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

/* renamed from: cz2  reason: default package */
/* compiled from: CameraReadyEvent */
public class cz2 extends c<cz2> {
    private static final f<cz2> f = new f<>(3);

    private cz2() {
    }

    public static cz2 m(int i) {
        cz2 b = f.b();
        if (b == null) {
            b = new cz2();
        }
        b.j(i);
        return b;
    }

    private WritableMap n() {
        return Arguments.createMap();
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
        return CameraViewManager.a.EVENT_CAMERA_READY.toString();
    }
}
