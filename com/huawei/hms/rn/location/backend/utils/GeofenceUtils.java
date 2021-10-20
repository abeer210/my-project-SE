package com.huawei.hms.rn.location.backend.utils;

import android.util.Log;
import com.huawei.hms.location.Geofence;
import com.huawei.hms.location.GeofenceData;
import com.huawei.hms.location.GeofenceErrorCodes;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.rn.location.backend.interfaces.Mapper;
import com.huawei.hms.rn.location.backend.interfaces.TriMapper;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class GeofenceUtils {
    public static final Mapper<GeofenceData, JSONObject> FROM_GEOFENCE_DATA_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(j.a, new JSONObject());
    public static final Mapper<Geofence, JSONObject> FROM_GEOFENCE_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(g.a, new JSONObject());
    public static final TriMapper<JSONArray, Integer, Integer, GeofenceRequest> FROM_JSON_ARRAY_TO_GEOFENCE = PlatformUtils.triMapperWrapper(h.a);
    public static final Mapper<JSONObject, Geofence> FROM_JSON_OBJECT_TO_GEOFENCE = PlatformUtils.mapperWrapper(i.a);
    private static final String TAG = null;

    static {
        C0201.m83(GeofenceUtils.class, 637);
    }

    public static /* synthetic */ Geofence a(JSONObject jSONObject) throws JSONException {
        String str = TAG;
        Log.i(str, C0201.m82(26810) + jSONObject.toString());
        Geofence.Builder builder = new Geofence.Builder();
        builder.setRoundArea(jSONObject.getDouble(C0201.m82(26811)), jSONObject.getDouble(C0201.m82(26812)), (float) jSONObject.getDouble(C0201.m82(26813))).setUniqueId(jSONObject.getString(C0201.m82(26814))).setConversions(jSONObject.getInt(C0201.m82(26815))).setValidContinueTime((long) jSONObject.getDouble(C0201.m82(26816))).setDwellDelayTime(jSONObject.getInt(C0201.m82(26817))).setNotificationInterval(jSONObject.getInt(C0201.m82(26818)));
        return builder.build();
    }

    public static /* synthetic */ JSONObject b(Geofence geofence) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(26819), geofence.getUniqueId());
        return jSONObject;
    }

    public static /* synthetic */ GeofenceRequest c(JSONArray jSONArray, Integer num, Integer num2) throws JSONException {
        Log.i(TAG, C0201.m82(26820));
        List<Geofence> mapJSONArray = PlatformUtils.mapJSONArray(jSONArray, FROM_JSON_OBJECT_TO_GEOFENCE);
        GeofenceRequest.Builder builder = new GeofenceRequest.Builder();
        builder.createGeofenceList(mapJSONArray).setInitConversions(num.intValue()).setCoordinateType(num2.intValue());
        Log.i(TAG, C0201.m82(26821));
        return builder.build();
    }

    public static /* synthetic */ JSONObject d(GeofenceData geofenceData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(26822), PlatformUtils.mapList(geofenceData.getConvertingGeofenceList(), FROM_GEOFENCE_TO_JSON_OBJECT));
        jSONObject.put(C0201.m82(26823), geofenceData.getConversion());
        jSONObject.put(C0201.m82(26824), LocationUtils.FROM_LOCATION_TO_JSON_OBJECT.map(geofenceData.getConvertingLocation()));
        jSONObject.put(C0201.m82(26825), geofenceData.getErrorCode());
        jSONObject.put(C0201.m82(26826), GeofenceErrorCodes.getErrorMessage(geofenceData.getErrorCode()));
        return jSONObject;
    }
}
