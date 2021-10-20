package com.dynatrace.android.agent;

import android.location.Location;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import defpackage.r20;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import vigqyno.C0201;

public class DynatraceRNBridge extends ReactContextBaseJavaModule {
    private static final String DATA_COLLECTION_OFF = null;
    private static final String DATA_COLLECTION_PERFORMANCE = null;
    private static final String DATA_COLLECTION_USERBEHAVIOR = null;
    private static final String PLATFORM_ANDROID = null;
    private static final String PLATFORM_IOS = null;
    private static PrivateDTBridge _internal;
    private Hashtable<Integer, n> actions = new Hashtable<>();

    static {
        C0201.m83(DynatraceRNBridge.class, 304);
    }

    public DynatraceRNBridge(ReactApplicationContext reactApplicationContext, PrivateDTBridge privateDTBridge) {
        super(reactApplicationContext);
        _internal = privateDTBridge;
    }

    private n getAction(int i) {
        return this.actions.get(Integer.valueOf(i));
    }

    private void newAction(String str, int i) throws Exception {
        if (str != null) {
            this.actions.put(Integer.valueOf(i), _internal.enterAction(str));
            return;
        }
        throw new Exception(C0201.m82(105));
    }

    private Boolean shouldWorkOnAndroid(String str) {
        return Boolean.valueOf(str == null || str.equals(C0201.m82(106)) || str.equals(C0201.m82(107)));
    }

    @ReactMethod
    public void applyUserPrivacyOptions(ReadableMap readableMap, String str) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            r20.b e = r20.e();
            e.e(readableMap.getBoolean(C0201.m82(108)));
            e.f(f20.valueOf(readableMap.getString(C0201.m82(109))));
            q.a(e.d());
        }
    }

    @ReactMethod
    public void endVisit(String str) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            q.c();
        }
    }

    @ReactMethod
    public void enterAction(String str, int i, String str2) {
        if (shouldWorkOnAndroid(str2).booleanValue()) {
            try {
                newAction(str, i);
            } catch (Exception unused) {
            }
        }
    }

    @ReactMethod
    public void flushEvents(String str) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            q.d();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(110), C0201.m82(111));
        hashMap.put(C0201.m82(112), C0201.m82(113));
        hashMap.put(C0201.m82(114), C0201.m82(115));
        hashMap.put(C0201.m82(116), C0201.m82(117));
        hashMap.put(C0201.m82(118), C0201.m82(119));
        return hashMap;
    }

    @ReactMethod
    public void getDataCollectionLevel(String str, Promise promise) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            promise.resolve(q.f().name());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(120);
    }

    @ReactMethod
    public void getRequestTag(Promise promise) {
        promise.resolve(q.g());
    }

    @ReactMethod
    public void getUserPrivacyOptions(String str, Promise promise) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            r20 i = q.i();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(121), String.valueOf(i.f()));
            createMap.putBoolean(C0201.m82(122), i.h());
            promise.resolve(createMap);
        }
    }

    @ReactMethod
    public void identifyUser(String str, String str2) {
        if (shouldWorkOnAndroid(str2).booleanValue()) {
            q.j(str);
        }
    }

    @ReactMethod
    public void isCrashReportingOptedIn(String str, Promise promise) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            promise.resolve(Boolean.valueOf(q.m()));
        }
    }

    @ReactMethod
    public void leaveAction(int i, String str) {
        n action;
        if (shouldWorkOnAndroid(str).booleanValue() && (action = getAction(i)) != null) {
            if (action instanceof p) {
                ((p) action).l0();
            } else {
                action.c();
            }
            this.actions.remove(Integer.valueOf(i));
        }
    }

    @ReactMethod
    public void reportCrash(String str, String str2, String str3, String str4) {
        if (shouldWorkOnAndroid(str4).booleanValue()) {
            q.o(y20.JAVA_SCRIPT, str, str2, str3);
            q.b();
        }
    }

    @ReactMethod
    public void reportDoubleValueInAction(int i, String str, double d, String str2) {
        n action;
        if (shouldWorkOnAndroid(str2).booleanValue() && (action = getAction(i)) != null) {
            action.d(str, d);
        }
    }

    @ReactMethod
    public void reportError(String str, String str2, String str3, String str4, String str5) {
        if (shouldWorkOnAndroid(str5).booleanValue()) {
            q.q(y20.JAVA_SCRIPT, str, str2, str3, str4);
        }
    }

    @ReactMethod
    public void reportErrorInAction(int i, String str, int i2, String str2) {
        n action;
        if (shouldWorkOnAndroid(str2).booleanValue() && (action = getAction(i)) != null) {
            action.g(str, i2);
        }
    }

    @ReactMethod
    public void reportErrorWithoutStacktrace(String str, int i, String str2) {
        if (shouldWorkOnAndroid(str2).booleanValue()) {
            q.r(str, i);
        }
    }

    @ReactMethod
    public void reportEventInAction(int i, String str, String str2) {
        n action;
        if (shouldWorkOnAndroid(str2).booleanValue() && (action = getAction(i)) != null) {
            action.a(str);
        }
    }

    @ReactMethod
    public void reportIntValueInAction(int i, String str, int i2, String str2) {
        n action;
        if (shouldWorkOnAndroid(str2).booleanValue() && (action = getAction(i)) != null) {
            action.e(str, i2);
        }
    }

    @ReactMethod
    public void reportStringValueInAction(int i, String str, String str2, String str3) {
        n action;
        if (shouldWorkOnAndroid(str3).booleanValue() && (action = getAction(i)) != null) {
            action.b(str, str2);
        }
    }

    @ReactMethod
    public void reportValue(int i, String str, String str2, String str3) {
        n action;
        if (shouldWorkOnAndroid(str3).booleanValue() && (action = getAction(i)) != null) {
            action.b(str, str2);
        }
    }

    @ReactMethod
    public void setBeaconHeaders(ReadableMap readableMap, String str) {
        if (!shouldWorkOnAndroid(str).booleanValue()) {
            return;
        }
        if (readableMap == null) {
            q.u(null);
            return;
        }
        HashMap hashMap = new HashMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        q.u(hashMap);
    }

    @ReactMethod
    public void setCrashReportingOptedIn(boolean z, String str) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            q.v(z);
        }
    }

    @ReactMethod
    public void setDataCollectionLevel(String str, String str2) {
        if (shouldWorkOnAndroid(str2).booleanValue()) {
            q.w(f20.valueOf(str));
        }
    }

    @ReactMethod
    public void setGPSLocation(double d, double d2, String str) {
        if (shouldWorkOnAndroid(str).booleanValue()) {
            Location location = new Location(C0201.m82(123));
            location.setLatitude(d);
            location.setLongitude(d2);
            q.x(location);
        }
    }

    @ReactMethod
    public void start(ReadableMap readableMap) throws Exception {
        if (readableMap != null) {
            String r0 = C0201.m82(124);
            if (readableMap.getString(r0) != null) {
                String r1 = C0201.m82(125);
                if (readableMap.getString(r1) != null) {
                    g20 g20 = new g20(readableMap.getString(r0), readableMap.getString(r1));
                    g20.h(readableMap.getBoolean(C0201.m82(126)));
                    g20.c(readableMap.getBoolean(C0201.m82(127)));
                    g20.d(readableMap.getInt(C0201.m82(128)) == 0);
                    g20.b(readableMap.getBoolean(C0201.m82(129)));
                    q.y(getReactApplicationContext(), g20.a());
                    return;
                }
            }
            throw new Exception(C0201.m82(130));
        }
        throw new Exception(C0201.m82(131));
    }
}
