package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: bz2  reason: default package */
/* compiled from: CameraMountErrorEvent */
public class bz2 extends c<bz2> {
    private static final f<bz2> g = new f<>(3);
    private String f;

    private bz2() {
    }

    private void m(int i, String str) {
        super.j(i);
        this.f = str;
    }

    public static bz2 n(int i, String str) {
        bz2 b = g.b();
        if (b == null) {
            b = new bz2();
        }
        b.m(i, str);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(11567), this.f);
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
        return CameraViewManager.a.EVENT_ON_MOUNT_ERROR.toString();
    }
}
