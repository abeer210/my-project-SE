package com.huawei.hms.rn.location.backend.utils;

import android.util.Log;
import com.huawei.hms.location.ActivityConversionData;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.location.ActivityConversionRequest;
import com.huawei.hms.location.ActivityConversionResponse;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.ActivityIdentificationResponse;
import com.huawei.hms.rn.location.backend.interfaces.Mapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ActivityUtils {
    private static final Mapper<ActivityConversionData, JSONObject> FROM_ACTIVITY_CONVERSION_DATA_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(f.a, new JSONObject());
    public static final Mapper<ActivityConversionResponse, JSONObject> FROM_ACTIVITY_CONVERSION_RESPONSE_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(c.a, new JSONObject());
    public static final Mapper<ActivityIdentificationData, JSONObject> FROM_ACTIVITY_IDENTIFICATION_DATA_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(b.a, new JSONObject());
    public static final Mapper<ActivityIdentificationResponse, JSONObject> FROM_ACTIVITY_IDENTIFICATION_RESPONSE_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(d.a, new JSONObject());
    public static final Mapper<JSONArray, ActivityConversionRequest> FROM_JSON_ARRAY_TO_ACTIVITY_CONVERSION_REQUEST = PlatformUtils.mapperWrapper(a.a);
    public static final Mapper<JSONObject, ActivityConversionInfo> FROM_JSON_OBJECT_TO_ACTIVITY_CONVERSION_INFO = PlatformUtils.mapperWrapper(e.a);
    private static final String TAG = null;

    static {
        C0201.m83(ActivityUtils.class, 412);
    }

    public static /* synthetic */ ActivityConversionInfo a(JSONObject jSONObject) throws JSONException {
        String str = TAG;
        Log.i(str, C0201.m82(9084) + jSONObject.toString());
        ActivityConversionInfo build = new ActivityConversionInfo.Builder().setConversionType(jSONObject.getInt(C0201.m82(9085))).setActivityType(jSONObject.getInt(C0201.m82(9086))).build();
        String str2 = TAG;
        Log.i(str2, C0201.m82(9087) + build.toString());
        return build;
    }

    public static /* synthetic */ JSONObject b(ActivityIdentificationData activityIdentificationData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(9088), activityIdentificationData.getPossibility());
        jSONObject.put(C0201.m82(9089), activityIdentificationData.getIdentificationActivity());
        return jSONObject;
    }

    public static /* synthetic */ JSONObject c(ActivityConversionData activityConversionData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(9090), activityConversionData.getActivityType());
        jSONObject.put(C0201.m82(9091), activityConversionData.getElapsedTimeFromReboot());
        jSONObject.put(C0201.m82(9092), activityConversionData.getConversionType());
        return jSONObject;
    }

    public static /* synthetic */ ActivityConversionRequest d(JSONArray jSONArray) throws JSONException {
        String str = TAG;
        Log.i(str, C0201.m82(9093) + jSONArray.toString());
        return new ActivityConversionRequest(PlatformUtils.mapJSONArray(jSONArray, FROM_JSON_OBJECT_TO_ACTIVITY_CONVERSION_INFO));
    }

    public static /* synthetic */ JSONObject e(ActivityIdentificationResponse activityIdentificationResponse) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(9094), (double) activityIdentificationResponse.getElapsedTimeFromReboot());
        jSONObject.put(C0201.m82(9095), FROM_ACTIVITY_IDENTIFICATION_DATA_TO_JSON_OBJECT.map(activityIdentificationResponse.getMostActivityIdentification()));
        jSONObject.put(C0201.m82(9096), PlatformUtils.mapList(activityIdentificationResponse.getActivityIdentificationDatas(), FROM_ACTIVITY_IDENTIFICATION_DATA_TO_JSON_OBJECT));
        jSONObject.put(C0201.m82(9097), (double) activityIdentificationResponse.getTime());
        return jSONObject;
    }

    public static /* synthetic */ JSONObject f(ActivityConversionResponse activityConversionResponse) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(9098), PlatformUtils.mapList(activityConversionResponse.getActivityConversionDatas(), FROM_ACTIVITY_CONVERSION_DATA_TO_JSON_OBJECT));
        return jSONObject;
    }
}
