package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: jz2  reason: default package */
/* compiled from: TextRecognizedEvent */
public class jz2 extends c<jz2> {
    private static final f<jz2> g = new f<>(3);
    private WritableArray f;

    private jz2() {
    }

    private WritableMap m() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(37155), C0201.m82(37156));
        createMap.putArray(C0201.m82(37157), this.f);
        createMap.putInt(C0201.m82(37158), i());
        return createMap;
    }

    private void n(int i, WritableArray writableArray) {
        super.j(i);
        this.f = writableArray;
    }

    public static jz2 o(int i, WritableArray writableArray) {
        jz2 b = g.b();
        if (b == null) {
            b = new jz2();
        }
        b.n(i, writableArray);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), m());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return CameraViewManager.a.EVENT_ON_TEXT_RECOGNIZED.toString();
    }
}
