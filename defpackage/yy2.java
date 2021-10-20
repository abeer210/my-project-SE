package defpackage;

import android.util.Base64;
import androidx.core.util.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import java.util.Formatter;
import org.reactnative.camera.CameraViewManager;
import vigqyno.C0201;

/* renamed from: yy2  reason: default package */
/* compiled from: BarCodeReadEvent */
public class yy2 extends c<yy2> {
    private static final f<yy2> j = new f<>(3);
    private t62 f;
    private int g;
    private int h;
    private byte[] i;

    private yy2() {
    }

    private void m(int i2, t62 t62, int i3, int i4, byte[] bArr) {
        super.j(i2);
        this.f = t62;
        this.g = i3;
        this.h = i4;
        this.i = bArr;
    }

    public static yy2 n(int i2, t62 t62, int i3, int i4, byte[] bArr) {
        yy2 b = j.b();
        if (b == null) {
            b = new yy2();
        }
        b.m(i2, t62, i3, i4, bArr);
        return b;
    }

    private WritableMap o() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt(C0201.m82(2387), i());
        createMap.putString(C0201.m82(2388), this.f.f());
        byte[] c = this.f.c();
        if (c != null && c.length > 0) {
            Formatter formatter = new Formatter();
            int length = c.length;
            for (int i2 = 0; i2 < length; i2++) {
                formatter.format(C0201.m82(2389), Byte.valueOf(c[i2]));
            }
            createMap.putString(C0201.m82(2390), formatter.toString());
            formatter.close();
        }
        createMap.putString(C0201.m82(2391), this.f.b().toString());
        WritableArray createArray = Arguments.createArray();
        v62[] e = this.f.e();
        for (v62 v62 : e) {
            if (v62 != null) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString(C0201.m82(2392), String.valueOf(v62.c()));
                createMap3.putString(C0201.m82(2393), String.valueOf(v62.d()));
                createArray.pushMap(createMap3);
            }
        }
        createMap2.putArray(C0201.m82(2394), createArray);
        createMap2.putInt(C0201.m82(2395), this.h);
        createMap2.putInt(C0201.m82(2396), this.g);
        createMap.putMap(C0201.m82(2397), createMap2);
        byte[] bArr = this.i;
        if (bArr != null) {
            createMap.putString(C0201.m82(2398), Base64.encodeToString(bArr, 2));
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void c(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(i(), f(), o());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short e() {
        return (short) (this.f.f().hashCode() % 32767);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String f() {
        return CameraViewManager.a.EVENT_ON_BAR_CODE_READ.toString();
    }
}
