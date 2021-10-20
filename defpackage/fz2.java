package defpackage;

import androidx.core.util.f;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: fz2  reason: default package */
/* compiled from: PictureSavedEvent */
public class fz2 extends c<fz2> {
    private static final f<fz2> g = new f<>(5);
    private WritableMap f;

    private fz2() {
    }

    private void m(int i, WritableMap writableMap) {
        super.j(i);
        this.f = writableMap;
    }

    public static fz2 n(int i, WritableMap writableMap) {
        fz2 b = g.b();
        if (b == null) {
            b = new fz2();
        }
        b.m(i, writableMap);
        return b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), this.f);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return (short) (this.f.getMap(C0201.m82(27968)).getString(C0201.m82(27969)).hashCode() % 32767);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return CameraViewManager.a.EVENT_ON_PICTURE_SAVED.toString();
    }
}
