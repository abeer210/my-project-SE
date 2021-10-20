package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import org.reactnative.facedetector.b;
import vigqyno.C0201;

/* renamed from: dz2  reason: default package */
/* compiled from: FaceDetectionErrorEvent */
public class dz2 extends c<dz2> {
    private static final f<dz2> g = new f<>(3);
    private b f;

    private dz2() {
    }

    private void m(int i, b bVar) {
        super.j(i);
        this.f = bVar;
    }

    public static dz2 n(int i, b bVar) {
        dz2 b = g.b();
        if (b == null) {
            b = new dz2();
        }
        b.m(i, bVar);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        b bVar = this.f;
        createMap.putBoolean(C0201.m82(36316), bVar != null && bVar.c());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), o());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return CameraViewManager.a.EVENT_ON_FACE_DETECTION_ERROR.toString();
    }
}
