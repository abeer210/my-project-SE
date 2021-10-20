package com.huawei.hms.support.api.a.c;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.client.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: LocationJsonUtil */
public class c {
    public static HWLocation a(JSONObject jSONObject) throws JSONException, ApiException {
        JSONObject jSONObject2;
        Log.d(C0201.m82(17674), C0201.m82(17675));
        if (jSONObject == null) {
            return null;
        }
        String r1 = C0201.m82(17676);
        if (!jSONObject.has(r1) || (jSONObject2 = jSONObject.getJSONObject(r1)) == null) {
            return null;
        }
        String r0 = C0201.m82(17677);
        if (jSONObject2.has(r0)) {
            String string = jSONObject2.getString(r0);
            HWLocation hWLocation = new HWLocation();
            hWLocation.setProvider(string);
            hWLocation.setAltitude(jSONObject2.optDouble(C0201.m82(17678), 0.0d));
            hWLocation.setBearing((float) jSONObject2.optDouble(C0201.m82(17679), 0.0d));
            if (Build.VERSION.SDK_INT >= 26) {
                hWLocation.setBearingAccuracyDegrees((float) jSONObject2.optDouble(C0201.m82(17680), 0.0d));
            }
            hWLocation.setElapsedRealtimeNanos(jSONObject2.optLong(C0201.m82(17681), 0));
            hWLocation.setAccuracy((float) jSONObject2.optDouble(C0201.m82(17682), 0.0d));
            hWLocation.setLatitude(jSONObject2.optDouble(C0201.m82(17683), 0.0d));
            hWLocation.setLongitude(jSONObject2.optDouble(C0201.m82(17684), 0.0d));
            hWLocation.setSpeed((float) jSONObject2.optDouble(C0201.m82(17685), 0.0d));
            if (Build.VERSION.SDK_INT >= 26) {
                hWLocation.setSpeedAccuracyMetersPerSecond((float) jSONObject2.optDouble(C0201.m82(17686), 0.0d));
            }
            hWLocation.setTime(jSONObject2.optLong(C0201.m82(17687), 0));
            if (Build.VERSION.SDK_INT >= 26) {
                hWLocation.setVerticalAccuracyMeters((float) jSONObject2.optDouble(C0201.m82(17688), 0.0d));
            }
            a(jSONObject, hWLocation);
            return hWLocation;
        }
        throw new ApiException(new Status(10000, a.a(10000)));
    }

    public static List<HWLocation> b(JSONObject jSONObject) throws JSONException, ApiException {
        String r0 = C0201.m82(17724);
        Log.d(r0, C0201.m82(17725));
        JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(17726));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HWLocation a = a(jSONArray.getJSONObject(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (a.a(arrayList)) {
            return null;
        }
        Log.d(r0, C0201.m82(17727));
        return arrayList;
    }

    public static LocationResult c(JSONObject jSONObject) throws JSONException, ApiException {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(C0201.m82(17728))) == null) {
            return null;
        }
        List<HWLocation> b = b(jSONObject2);
        if (a.a(b)) {
            return null;
        }
        return LocationResult.create(b);
    }

    private static void a(JSONObject jSONObject, HWLocation hWLocation) throws JSONException {
        JSONObject jSONObject2;
        String r0 = C0201.m82(17709);
        if (jSONObject.has(r0) && (jSONObject2 = jSONObject.getJSONObject(r0)) != null) {
            String r02 = C0201.m82(17710);
            String r1 = C0201.m82(17711);
            hWLocation.setCountryCode(jSONObject2.optString(r02, r1));
            hWLocation.setCountryName(jSONObject2.optString(C0201.m82(17712), r1));
            hWLocation.setState(jSONObject2.optString(C0201.m82(17713), r1));
            hWLocation.setCity(jSONObject2.optString(C0201.m82(17714), r1));
            hWLocation.setCounty(jSONObject2.optString(C0201.m82(17715), r1));
            hWLocation.setStreet(jSONObject2.optString(C0201.m82(17716), r1));
            hWLocation.setFeatureName(jSONObject2.optString(C0201.m82(17717), r1));
            hWLocation.setPostalCode(jSONObject2.optString(C0201.m82(17718), r1));
            hWLocation.setPhone(jSONObject2.optString(C0201.m82(17719), r1));
            hWLocation.setUrl(jSONObject2.optString(C0201.m82(17720), r1));
            String r03 = C0201.m82(17721);
            if (jSONObject2.has(r03)) {
                Object opt = jSONObject2.opt(r03);
                JSONObject jSONObject3 = null;
                if (opt instanceof JSONObject) {
                    jSONObject3 = (JSONObject) opt;
                }
                if (jSONObject3 == null) {
                    b.b(C0201.m82(17722), r1, C0201.m82(17723));
                    return;
                }
                Iterator<String> keys = jSONObject3.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject3.get(next));
                }
                hWLocation.setExtraInfo(hashMap);
            }
        }
    }

    public static Location a(HWLocation hWLocation) {
        if (hWLocation == null) {
            return null;
        }
        Location location = new Location(hWLocation.getProvider());
        location.setTime(hWLocation.getTime());
        if (Build.VERSION.SDK_INT >= 17) {
            location.setElapsedRealtimeNanos(hWLocation.getElapsedRealtimeNanos());
        }
        location.setLatitude(hWLocation.getLatitude());
        location.setLongitude(hWLocation.getLongitude());
        location.setAltitude(hWLocation.getAltitude());
        location.setSpeed(hWLocation.getSpeed());
        location.setBearing(hWLocation.getBearing());
        location.setAccuracy(hWLocation.getAccuracy());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters(hWLocation.getVerticalAccuracyMeters());
            location.setSpeedAccuracyMetersPerSecond(hWLocation.getSpeedAccuracyMetersPerSecond());
            location.setBearingAccuracyDegrees(hWLocation.getBearingAccuracyDegrees());
        }
        if (hWLocation.getExtraInfo() != null) {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject(hWLocation.getExtraInfo());
            for (Map.Entry<String, Object> entry : hWLocation.getExtraInfo().entrySet()) {
                try {
                    String key = entry.getKey();
                    if (!entry.getKey().startsWith(C0201.m82(17670))) {
                        Object obj = jSONObject.get(key);
                        if (obj instanceof Boolean) {
                            bundle.putBoolean(key, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            bundle.putInt(key, ((Integer) obj).intValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(key, ((Float) obj).floatValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(key, ((Long) obj).longValue());
                        } else if (obj instanceof Short) {
                            bundle.putShort(key, ((Short) obj).shortValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(key, ((Double) obj).doubleValue());
                        } else {
                            bundle.putString(key, jSONObject.getString(key));
                        }
                    }
                } catch (JSONException unused) {
                    b.d(C0201.m82(17672), C0201.m82(17673), C0201.m82(17671) + entry.getKey());
                }
            }
            location.setExtras(bundle);
        }
        return location;
    }

    public static LocationAvailability a(String str) throws JSONException {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        String r3 = C0201.m82(17689);
        if (!jSONObject2.has(r3) || (jSONObject = jSONObject2.getJSONObject(r3)) == null) {
            return null;
        }
        LocationAvailability locationAvailability = new LocationAvailability();
        locationAvailability.setCellStatus(jSONObject.optInt(C0201.m82(17690)));
        locationAvailability.setWifiStatus(jSONObject.optInt(C0201.m82(17691)));
        locationAvailability.setElapsedRealtimeNs(jSONObject.optLong(C0201.m82(17692)));
        locationAvailability.setLocationStatus(jSONObject.optInt(C0201.m82(17693)));
        return locationAvailability;
    }

    public static JSONObject a(Location location) throws JSONException {
        String r0 = C0201.m82(17694);
        Log.d(r0, C0201.m82(17695));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(17696), location.getProvider());
        jSONObject.put(C0201.m82(17697), location.getAltitude());
        jSONObject.put(C0201.m82(17698), (double) location.getBearing());
        if (Build.VERSION.SDK_INT >= 17) {
            jSONObject.put(C0201.m82(17699), location.getElapsedRealtimeNanos());
        }
        jSONObject.put(C0201.m82(17700), (double) location.getAccuracy());
        jSONObject.put(C0201.m82(17701), location.getLatitude());
        jSONObject.put(C0201.m82(17702), location.getLongitude());
        jSONObject.put(C0201.m82(17703), (double) location.getSpeed());
        if (Build.VERSION.SDK_INT >= 26) {
            jSONObject.put(C0201.m82(17704), (double) location.getSpeedAccuracyMetersPerSecond());
            jSONObject.put(C0201.m82(17705), (double) location.getVerticalAccuracyMeters());
            jSONObject.put(C0201.m82(17706), (double) location.getBearingAccuracyDegrees());
        }
        jSONObject.put(C0201.m82(17707), location.getTime());
        Log.d(r0, C0201.m82(17708));
        return jSONObject;
    }
}
