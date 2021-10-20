package com.merryjs.PhotoViewer;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils */
public class h {

    /* access modifiers changed from: package-private */
    /* compiled from: Utils */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            iArr[ReadableType.Null.ordinal()] = 1;
            a[ReadableType.Boolean.ordinal()] = 2;
            a[ReadableType.Number.ordinal()] = 3;
            a[ReadableType.String.ordinal()] = 4;
            a[ReadableType.Map.ordinal()] = 5;
            try {
                a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static JSONArray a(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            int i2 = a.a[readableArray.getType(i).ordinal()];
            if (i2 == 2) {
                jSONArray.put(readableArray.getBoolean(i));
            } else if (i2 == 3) {
                jSONArray.put(readableArray.getDouble(i));
            } else if (i2 == 4) {
                jSONArray.put(readableArray.getString(i));
            } else if (i2 == 5) {
                jSONArray.put(d(readableArray.getMap(i)));
            } else if (i2 == 6) {
                jSONArray.put(a(readableArray.getArray(i)));
            }
        }
        return jSONArray;
    }

    public static WritableArray b(JSONArray jSONArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj == null) {
                    writableNativeArray.pushNull();
                } else if (obj instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeArray.pushString((String) obj);
                } else if (obj instanceof JSONObject) {
                    writableNativeArray.pushMap(c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeArray.pushArray(b((JSONArray) obj));
                }
            } catch (JSONException unused) {
            }
        }
        return writableNativeArray;
    }

    public static WritableMap c(JSONObject jSONObject) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        if (!keys.hasNext()) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj == null) {
                    writableNativeMap.putNull(next);
                } else if (obj instanceof Boolean) {
                    writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeMap.putString(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    writableNativeMap.putMap(next, c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeMap.putArray(next, b((JSONArray) obj));
                }
            } catch (JSONException unused) {
            }
        }
        return writableNativeMap;
    }

    public static JSONObject d(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (a.a[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, (Object) null);
                        continue;
                    case 2:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 3:
                        jSONObject.put(nextKey, readableMap.getInt(nextKey));
                        continue;
                    case 4:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case 5:
                        jSONObject.put(nextKey, d(readableMap.getMap(nextKey)));
                        continue;
                    case 6:
                        jSONObject.put(nextKey, a(readableMap.getArray(nextKey)));
                        continue;
                    default:
                        continue;
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static WritableMap e(ReadableMap readableMap) {
        return c(d(readableMap));
    }
}
