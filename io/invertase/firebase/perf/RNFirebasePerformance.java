package io.invertase.firebase.perf;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebasePerformance extends ReactContextBaseJavaModule {
    private static final String TAG = null;
    private HashMap<String, HttpMetric> httpMetrics = new HashMap<>();
    private HashMap<String, Trace> traces = new HashMap<>();

    static {
        C0201.m83(RNFirebasePerformance.class, 582);
    }

    public RNFirebasePerformance(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(36893), C0201.m82(36894));
    }

    private HttpMetric getOrCreateHttpMetric(String str, String str2) {
        String str3 = str + str2;
        if (this.httpMetrics.containsKey(str3)) {
            return this.httpMetrics.get(str3);
        }
        HttpMetric newHttpMetric = FirebasePerformance.getInstance().newHttpMetric(str, mapStringToMethod(str2));
        this.httpMetrics.put(str3, newHttpMetric);
        return newHttpMetric;
    }

    private Trace getOrCreateTrace(String str) {
        if (this.traces.containsKey(str)) {
            return this.traces.get(str);
        }
        Trace newTrace = FirebasePerformance.getInstance().newTrace(str);
        this.traces.put(str, newTrace);
        return newTrace;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private String mapStringToMethod(String str) {
        char c;
        int hashCode = str.hashCode();
        String r1 = C0201.m82(36895);
        String r2 = C0201.m82(36896);
        String r3 = C0201.m82(36897);
        String r4 = C0201.m82(36898);
        String r5 = C0201.m82(36899);
        String r6 = C0201.m82(36900);
        String r7 = C0201.m82(36901);
        String r8 = C0201.m82(36902);
        String r9 = C0201.m82(36903);
        switch (hashCode) {
            case -531492226:
                if (str.equals(r9)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 70454:
                if (str.equals(r8)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79599:
                if (str.equals(r7)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2213344:
                if (str.equals(r6)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2461856:
                if (str.equals(r5)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 75900968:
                if (str.equals(r4)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 80083237:
                if (str.equals(r3)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1669334218:
                if (str.equals(r2)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2012838315:
                if (str.equals(r1)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return r2;
            case 1:
                return r1;
            case 2:
                return r8;
            case 3:
                return r6;
            case 4:
                return r9;
            case 5:
                return r4;
            case 6:
                return r5;
            case 7:
                return r7;
            case '\b':
                return r3;
            default:
                return C0201.m82(36904);
        }
    }

    @ReactMethod
    public void getHttpMetricAttribute(String str, String str2, String str3, Promise promise) {
        promise.resolve(getOrCreateHttpMetric(str, str2).getAttribute(str3));
    }

    @ReactMethod
    public void getHttpMetricAttributes(String str, String str2, Promise promise) {
        Map attributes = getOrCreateHttpMetric(str, str2).getAttributes();
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry entry : attributes.entrySet()) {
            createMap.putString((String) entry.getKey(), (String) entry.getValue());
        }
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(36905);
    }

    @ReactMethod
    public void getTraceAttribute(String str, String str2, Promise promise) {
        promise.resolve(getOrCreateTrace(str).getAttribute(str2));
    }

    @ReactMethod
    public void getTraceAttributes(String str, Promise promise) {
        Map attributes = getOrCreateTrace(str).getAttributes();
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry entry : attributes.entrySet()) {
            createMap.putString((String) entry.getKey(), (String) entry.getValue());
        }
        promise.resolve(createMap);
    }

    @ReactMethod
    public void getTraceLongMetric(String str, String str2, Promise promise) {
        promise.resolve(Integer.valueOf(Long.valueOf(getOrCreateTrace(str).getLongMetric(str2)).intValue()));
    }

    @ReactMethod
    public void incrementTraceMetric(String str, String str2, Integer num, Promise promise) {
        getOrCreateTrace(str).incrementMetric(str2, num.longValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void putHttpMetricAttribute(String str, String str2, String str3, String str4, Promise promise) {
        getOrCreateHttpMetric(str, str2).putAttribute(str3, str4);
        if (getOrCreateHttpMetric(str, str2).getAttributes().containsKey(str3)) {
            promise.resolve(Boolean.TRUE);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void putTraceAttribute(String str, String str2, String str3, Promise promise) {
        getOrCreateTrace(str).putAttribute(str2, str3);
        if (getOrCreateTrace(str).getAttributes().containsKey(str2)) {
            promise.resolve(Boolean.TRUE);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void putTraceMetric(String str, String str2, Integer num, Promise promise) {
        getOrCreateTrace(str).putMetric(str2, num.longValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void removeHttpMetricAttribute(String str, String str2, String str3, Promise promise) {
        getOrCreateHttpMetric(str, str2).removeAttribute(str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void removeTraceAttribute(String str, String str2, Promise promise) {
        getOrCreateTrace(str).removeAttribute(str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void setHttpMetricRequestPayloadSize(String str, String str2, Integer num, Promise promise) {
        getOrCreateHttpMetric(str, str2).setRequestPayloadSize(num.longValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void setHttpMetricResponseCode(String str, String str2, Integer num, Promise promise) {
        getOrCreateHttpMetric(str, str2).setHttpResponseCode(num.intValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void setHttpMetricResponseContentType(String str, String str2, String str3, Promise promise) {
        getOrCreateHttpMetric(str, str2).setResponseContentType(str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void setHttpMetricResponsePayloadSize(String str, String str2, Integer num, Promise promise) {
        getOrCreateHttpMetric(str, str2).setResponsePayloadSize(num.longValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void setPerformanceCollectionEnabled(Boolean bool, Promise promise) {
        FirebasePerformance.getInstance().setPerformanceCollectionEnabled(bool.booleanValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void startHttpMetric(String str, String str2, Promise promise) {
        getOrCreateHttpMetric(str, str2).start();
        promise.resolve(null);
    }

    @ReactMethod
    public void startTrace(String str, Promise promise) {
        getOrCreateTrace(str).start();
        promise.resolve(null);
    }

    @ReactMethod
    public void stopHttpMetric(String str, String str2, Promise promise) {
        getOrCreateHttpMetric(str, str2).stop();
        HashMap<String, HttpMetric> hashMap = this.httpMetrics;
        hashMap.remove(str + str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void stopTrace(String str, Promise promise) {
        getOrCreateTrace(str).stop();
        this.traces.remove(str);
        promise.resolve(null);
    }
}
