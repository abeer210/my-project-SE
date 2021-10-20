package defpackage;

import android.util.Base64;
import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: az2  reason: default package */
/* compiled from: BarcodesDetectedEvent */
public class az2 extends c<az2> {
    private static final f<az2> h = new f<>(3);
    private WritableArray f;
    private byte[] g;

    private az2() {
    }

    private void m(int i, WritableArray writableArray, byte[] bArr) {
        super.j(i);
        this.f = writableArray;
        this.g = bArr;
    }

    public static az2 n(int i, WritableArray writableArray, byte[] bArr) {
        az2 b = h.b();
        if (b == null) {
            b = new az2();
        }
        b.m(i, writableArray, bArr);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(24576), C0201.m82(24577));
        createMap.putArray(C0201.m82(24578), this.f);
        createMap.putInt(C0201.m82(24579), i());
        byte[] bArr = this.g;
        if (bArr != null) {
            createMap.putString(C0201.m82(24580), Base64.encodeToString(bArr, 2));
        }
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
        return CameraViewManager.a.EVENT_ON_BARCODES_DETECTED.toString();
    }
}
