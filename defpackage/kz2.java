package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: kz2  reason: default package */
/* compiled from: TouchEvent */
public class kz2 extends c<kz2> {
    private static final f<kz2> i = new f<>(3);
    private int f;
    private int g;
    private boolean h;

    private kz2() {
    }

    private void m(int i2, boolean z, int i3, int i4) {
        super.j(i2);
        this.f = i3;
        this.g = i4;
        this.h = z;
    }

    public static kz2 n(int i2, boolean z, int i3, int i4) {
        kz2 b = i.b();
        if (b == null) {
            b = new kz2();
        }
        b.m(i2, z, i3, i4);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(27003), i());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt(C0201.m82(27004), this.f);
        createMap2.putInt(C0201.m82(27005), this.g);
        createMap.putBoolean(C0201.m82(27006), this.h);
        createMap.putMap(C0201.m82(27007), createMap2);
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
        return CameraViewManager.a.EVENT_ON_TOUCH.toString();
    }
}
