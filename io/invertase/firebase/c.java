package io.invertase.firebase;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: Utils */
public class c {
    public static void a(Object obj, WritableArray writableArray) {
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        char c = 65535;
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals(C0201.m82(1417))) {
                    c = 4;
                    break;
                }
                break;
            case -527879800:
                if (name.equals(C0201.m82(1416))) {
                    c = 2;
                    break;
                }
                break;
            case 146015330:
                if (name.equals(C0201.m82(1415))) {
                    c = 7;
                    break;
                }
                break;
            case 344809556:
                if (name.equals(C0201.m82(1414))) {
                    c = 0;
                    break;
                }
                break;
            case 398795216:
                if (name.equals(C0201.m82(1413))) {
                    c = 1;
                    break;
                }
                break;
            case 761287205:
                if (name.equals(C0201.m82(1412))) {
                    c = 3;
                    break;
                }
                break;
            case 1195259493:
                if (name.equals(C0201.m82(1411))) {
                    c = 5;
                    break;
                }
                break;
            case 1614941136:
                if (name.equals(C0201.m82(1410))) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                writableArray.pushBoolean(((Boolean) obj).booleanValue());
                return;
            case 1:
                writableArray.pushDouble((double) ((Long) obj).longValue());
                return;
            case 2:
                writableArray.pushDouble((double) ((Float) obj).floatValue());
                return;
            case 3:
                writableArray.pushDouble(((Double) obj).doubleValue());
                return;
            case 4:
                writableArray.pushInt(((Integer) obj).intValue());
                return;
            case 5:
                writableArray.pushString((String) obj);
                return;
            case 6:
                try {
                    writableArray.pushMap(e((JSONObject) obj));
                    return;
                } catch (JSONException unused) {
                    writableArray.pushNull();
                    return;
                }
            case 7:
                try {
                    writableArray.pushArray(d((JSONArray) obj));
                    return;
                } catch (JSONException unused2) {
                    writableArray.pushNull();
                    return;
                }
            default:
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushArray(f((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushMap(h((Map) obj));
                    return;
                } else {
                    Log.d(C0201.m82(1419), C0201.m82(1418) + name);
                    writableArray.pushNull();
                    return;
                }
        }
    }

    public static int b(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, C0201.m82(1420), context.getPackageName());
        if (identifier == 0) {
            Log.e(C0201.m82(1423), C0201.m82(1421) + str + C0201.m82(1422));
        }
        return identifier;
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0201.m82(1424));
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                try {
                    if (((ReactContext) context).getLifecycleState() == LifecycleState.RESUMED) {
                        return true;
                    }
                    return false;
                } catch (ClassCastException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public static WritableArray d(JSONArray jSONArray) throws JSONException {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(e(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(d(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static WritableMap e(JSONObject jSONObject) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        WritableMap createMap = Arguments.createMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                createMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, e(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, d(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    private static WritableArray f(List<Object> list) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : list) {
            a(obj, createArray);
        }
        return createArray;
    }

    public static void g(String str, Object obj, WritableMap writableMap) {
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        char c = 65535;
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals(C0201.m82(1432))) {
                    c = 4;
                    break;
                }
                break;
            case -527879800:
                if (name.equals(C0201.m82(1431))) {
                    c = 2;
                    break;
                }
                break;
            case 146015330:
                if (name.equals(C0201.m82(1430))) {
                    c = 7;
                    break;
                }
                break;
            case 344809556:
                if (name.equals(C0201.m82(1429))) {
                    c = 0;
                    break;
                }
                break;
            case 398795216:
                if (name.equals(C0201.m82(1428))) {
                    c = 1;
                    break;
                }
                break;
            case 761287205:
                if (name.equals(C0201.m82(1427))) {
                    c = 3;
                    break;
                }
                break;
            case 1195259493:
                if (name.equals(C0201.m82(1426))) {
                    c = 5;
                    break;
                }
                break;
            case 1614941136:
                if (name.equals(C0201.m82(1425))) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 1:
                writableMap.putDouble(str, (double) ((Long) obj).longValue());
                return;
            case 2:
                writableMap.putDouble(str, (double) ((Float) obj).floatValue());
                return;
            case 3:
                writableMap.putDouble(str, ((Double) obj).doubleValue());
                return;
            case 4:
                writableMap.putInt(str, ((Integer) obj).intValue());
                return;
            case 5:
                writableMap.putString(str, (String) obj);
                return;
            case 6:
                try {
                    writableMap.putMap(str, e((JSONObject) obj));
                    return;
                } catch (JSONException unused) {
                    writableMap.putNull(str);
                    return;
                }
            case 7:
                try {
                    writableMap.putArray(str, d((JSONArray) obj));
                    return;
                } catch (JSONException unused2) {
                    writableMap.putNull(str);
                    return;
                }
            default:
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putArray(str, f((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putMap(str, h((Map) obj));
                    return;
                } else {
                    Log.d(C0201.m82(1434), C0201.m82(1433) + name);
                    writableMap.putNull(str);
                    return;
                }
        }
    }

    public static WritableMap h(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            g(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public static List<Object> i(ReadableArray readableArray) {
        return readableArray.toArrayList();
    }

    public static Map<String, Object> j(ReadableMap readableMap) {
        return readableMap.toHashMap();
    }

    public static void k(ReactContext reactContext, String str, Object obj) {
        if (reactContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        } else {
            Log.d(C0201.m82(1435), C0201.m82(1436));
        }
    }

    public static String l(long j) {
        Date date = new Date((j + ((long) Calendar.getInstance().getTimeZone().getOffset(j))) * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(1437), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C0201.m82(1438)));
        return simpleDateFormat.format(date);
    }
}
