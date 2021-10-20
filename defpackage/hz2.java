package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

/* renamed from: hz2  reason: default package */
/* compiled from: RecordingEndEvent */
public class hz2 extends c<hz2> {
    private static final f<hz2> f = new f<>(3);

    private hz2() {
    }

    public static hz2 m(int i) {
        hz2 b = f.b();
        if (b == null) {
            b = new hz2();
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
        return CameraViewManager.a.EVENT_ON_RECORDING_END.toString();
    }
}
