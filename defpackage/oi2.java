package defpackage;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import vigqyno.C0201;

/* renamed from: oi2  reason: default package */
/* compiled from: EventEmitter */
public class oi2 {
    private ReactContext a;

    public oi2(ReactContext reactContext) {
        this.a = reactContext;
    }

    private void b(String str, WritableMap writableMap) {
        ReactContext reactContext = this.a;
        if (reactContext == null) {
            Log.e(C0201.m82(36125), C0201.m82(36123) + str + C0201.m82(36124));
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    public void a() {
        b(C0201.m82(36126), Arguments.createMap());
    }

    public void c(int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(36127), i);
        b(C0201.m82(36128), createMap);
    }

    public void d(int i, int i2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(36129), i);
        createMap.putInt(C0201.m82(36130), i2);
        b(C0201.m82(36131), createMap);
    }

    public void e(String str, String str2, long j) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(36132), str);
        createMap.putString(C0201.m82(36133), str2);
        createMap.putDouble(C0201.m82(36134), (double) j);
        b(C0201.m82(36135), createMap);
    }

    public void f(String str, String str2, ni2 ni2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(36136), str);
        createMap.putString(C0201.m82(36137), str2);
        createMap.putString(C0201.m82(36138), ni2.b());
        b(C0201.m82(36139), createMap);
    }

    public void g(String str, String str2, ni2 ni2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(36140), str);
        createMap.putString(C0201.m82(36141), str2);
        createMap.putString(C0201.m82(36142), ni2.b());
        b(C0201.m82(36143), createMap);
    }

    public void h(String str, String str2, int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(36144), str);
        createMap.putString(C0201.m82(36145), str2);
        createMap.putInt(C0201.m82(36146), i);
        b(C0201.m82(36147), createMap);
    }

    public void i(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(36148), str);
        createMap.putString(C0201.m82(36149), str2);
        b(C0201.m82(36150), createMap);
    }

    public void j(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(36151), str);
        b(C0201.m82(36152), createMap);
    }
}
