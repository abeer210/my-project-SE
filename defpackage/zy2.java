package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: zy2  reason: default package */
/* compiled from: BarcodeDetectionErrorEvent */
public class zy2 extends c<zy2> {
    private static final f<zy2> g = new f<>(3);
    private xy2 f;

    private zy2() {
    }

    private void m(int i, xy2 xy2) {
        super.j(i);
        this.f = xy2;
    }

    public static zy2 n(int i, xy2 xy2) {
        zy2 b = g.b();
        if (b == null) {
            b = new zy2();
        }
        b.m(i, xy2);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        xy2 xy2 = this.f;
        createMap.putBoolean(C0201.m82(34910), xy2 != null && xy2.c());
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
        return CameraViewManager.a.EVENT_ON_BARCODE_DETECTION_ERROR.toString();
    }
}
