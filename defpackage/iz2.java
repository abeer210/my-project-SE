package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;

/* renamed from: iz2  reason: default package */
/* compiled from: RecordingStartEvent */
public class iz2 extends c<iz2> {
    private static final f<iz2> g = new f<>(3);
    private WritableMap f;

    private iz2() {
    }

    private void m(int i, WritableMap writableMap) {
        super.j(i);
        this.f = writableMap;
    }

    public static iz2 n(int i, WritableMap writableMap) {
        iz2 b = g.b();
        if (b == null) {
            b = new iz2();
        }
        b.m(i, writableMap);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return CameraViewManager.a.EVENT_ON_RECORDING_START.toString();
    }
}
