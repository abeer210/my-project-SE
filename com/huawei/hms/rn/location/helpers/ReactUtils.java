package com.huawei.hms.rn.location.helpers;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.rn.location.backend.interfaces.ActivityHolder;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ReactUtils {
    private static String TAG;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.rn.location.helpers.ReactUtils$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            iArr[ReadableType.Null.ordinal()] = 1;
            $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        C0201.m83(ReactUtils.class, 492);
    }

    public static Map<String, Object> getConstants(HMSProvider hMSProvider) {
        try {
            return toMap(hMSProvider.getConstants());
        } catch (JSONException e) {
            String str = TAG;
            Log.e(str, C0201.m82(32236) + e.getMessage());
            return new HashMap();
        }
    }

    public static <T extends HMSProvider> T initializeProvider(T t, ReactContext reactContext, ActivityHolder activityHolder) {
        t.setActivityHolder(activityHolder);
        t.setEventSender(new a(reactContext));
        t.setPermissionHandler(new c(reactContext, t));
        return t;
    }

    public static void sendEvent(ReactContext reactContext, String str, ReadableMap readableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, readableMap);
    }

    public static JSONArray toJA(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            try {
                int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()];
                if (i2 == 2) {
                    jSONArray.put(readableArray.getBoolean(i));
                } else if (i2 == 3) {
                    jSONArray.put(readableArray.getDouble(i));
                } else if (i2 == 4) {
                    jSONArray.put(readableArray.getString(i));
                } else if (i2 == 5) {
                    jSONArray.put(toJO(readableArray.getMap(i)));
                } else if (i2 == 6) {
                    jSONArray.put(toJA(readableArray.getArray(i)));
                }
            } catch (JSONException e) {
                String str = TAG;
                Log.e(str, C0201.m82(32237) + e.getMessage());
            }
        }
        return jSONArray;
    }

    public static JSONObject toJO(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            try {
                String nextKey = keySetIterator.nextKey();
                switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, JSONObject.NULL);
                        break;
                    case 2:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        break;
                    case 3:
                        jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                        break;
                    case 4:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        break;
                    case 5:
                        jSONObject.put(nextKey, toJO(readableMap.getMap(nextKey)));
                        break;
                    case 6:
                        jSONObject.put(nextKey, toJA(readableMap.getArray(nextKey)));
                        break;
                }
            } catch (JSONException e) {
                String str = TAG;
                Log.e(str, C0201.m82(32238) + e.getMessage());
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = null;
            try {
                obj = jSONObject.get(next);
            } catch (JSONException e) {
                String str = TAG;
                Log.e(str, C0201.m82(32239) + e.getMessage());
            }
            if (obj instanceof JSONObject) {
                hashMap.put(next, toMap((JSONObject) obj));
            } else {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    private static WritableArray toWA(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = null;
            try {
                obj = jSONArray.get(i);
            } catch (JSONException e) {
                String str = TAG;
                Log.e(str, C0201.m82(32240) + e.getMessage());
            }
            if (obj instanceof JSONObject) {
                createArray.pushMap(toWM((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(toWA((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj != null) {
                createArray.pushString(obj.toString());
            }
        }
        return createArray;
    }

    public static WritableMap toWM(JSONObject jSONObject) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = null;
            String next = keys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException e) {
                String str = TAG;
                Log.e(str, C0201.m82(32241) + e.getMessage());
            }
            if (obj instanceof JSONObject) {
                createMap.putMap(next, toWM((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, toWA((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                createMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                createMap.putString(next, (String) obj);
            } else if (obj != null) {
                createMap.putString(next, obj.toString());
            }
        }
        return createMap;
    }
}
