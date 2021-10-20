package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rg2  reason: default package */
/* compiled from: JSONParser */
public class rg2 {

    /* access modifiers changed from: package-private */
    /* renamed from: rg2$a */
    /* compiled from: JSONParser */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            iArr[ReadableType.String.ordinal()] = 1;
            a[ReadableType.Number.ordinal()] = 2;
            a[ReadableType.Boolean.ordinal()] = 3;
            a[ReadableType.Array.ordinal()] = 4;
            a[ReadableType.Map.ordinal()] = 5;
        }
    }

    private static Object c(ReadableArray readableArray, int i) {
        try {
            Double valueOf = Double.valueOf(readableArray.getDouble(i));
            return valueOf.doubleValue() % 1.0d == 0.0d ? Integer.valueOf(readableArray.getInt(i)) : valueOf;
        } catch (Exception unused) {
            return Integer.valueOf(readableArray.getInt(i));
        }
    }

    private static Object d(ReadableMap readableMap, String str) {
        try {
            Double valueOf = Double.valueOf(readableMap.getDouble(str));
            return valueOf.doubleValue() % 1.0d == 0.0d ? Integer.valueOf(readableMap.getInt(str)) : valueOf;
        } catch (Exception unused) {
            return Integer.valueOf(readableMap.getInt(str));
        }
    }

    public JSONArray a(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            int i2 = a.a[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                jSONArray.put(readableArray.getString(i));
            } else if (i2 == 2) {
                jSONArray.put(c(readableArray, i));
            } else if (i2 == 3) {
                jSONArray.put(readableArray.getBoolean(i));
            } else if (i2 == 4) {
                jSONArray.put(a(readableArray.getArray(i)));
            } else if (i2 == 5) {
                jSONArray.put(b(readableArray.getMap(i)));
            }
        }
        return jSONArray;
    }

    public JSONObject b(ReadableMap readableMap) {
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            JSONObject jSONObject = new JSONObject();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                int i = a.a[readableMap.getType(nextKey).ordinal()];
                if (i == 1) {
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                } else if (i == 2) {
                    jSONObject.put(nextKey, d(readableMap, nextKey));
                } else if (i == 3) {
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                } else if (i == 4) {
                    jSONObject.put(nextKey, a(readableMap.getArray(nextKey)));
                } else if (i == 5) {
                    jSONObject.put(nextKey, b(readableMap.getMap(nextKey)));
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
