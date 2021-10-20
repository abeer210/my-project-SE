package com.huawei.hms.rn.location.backend.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.rn.location.backend.helpers.Exceptions;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.interfaces.JSONMapper;
import com.huawei.hms.rn.location.backend.interfaces.JSONTriMapper;
import com.huawei.hms.rn.location.backend.interfaces.Mapper;
import com.huawei.hms.rn.location.backend.interfaces.TriMapper;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0188;
import vigqyno.C0201;

public class PlatformUtils {
    private static final int RESOLUTION_REQUEST = 0;
    private static final String TAG = null;

    static {
        C0201.m83(PlatformUtils.class, 511);
    }

    public static /* synthetic */ void a(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback, Exception exc) {
        String str = TAG;
        Log.d(str, C0201.m82(13568) + exc.getMessage());
        JSONObject errorJSON = Exceptions.toErrorJSON(C0188.f20, exc);
        if (!(exc instanceof ApiException)) {
            Log.d(TAG, C0201.m82(13569));
            hMSMethod.sendLoggerEvent(activity, C0201.m82(13570));
            hMSCallback.error(errorJSON);
            return;
        }
        int statusCode = ((ApiException) exc).getStatusCode();
        if (statusCode != 6) {
            hMSMethod.sendLoggerEvent(activity, String.valueOf(statusCode));
            hMSCallback.error(errorJSON);
        } else if (!(exc instanceof ResolvableApiException)) {
            Log.d(TAG, C0201.m82(13571));
            hMSMethod.sendLoggerEvent(activity, String.valueOf(statusCode));
            hMSCallback.error(errorJSON);
        } else {
            try {
                ((ResolvableApiException) exc).startResolutionForResult(activity, 0);
                hMSMethod.sendLoggerEvent(activity, String.valueOf(statusCode));
                hMSCallback.error(Exceptions.toErrorJSON(809));
            } catch (IntentSender.SendIntentException e) {
                String str2 = TAG;
                Log.e(str2, C0201.m82(13572) + e.getMessage());
                hMSMethod.sendLoggerEvent(activity, String.valueOf(statusCode));
                hMSCallback.error(Exceptions.toErrorJSON(808));
            }
        }
    }

    public static /* synthetic */ Object b(JSONMapper jSONMapper, Object obj, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        try {
            return jSONMapper.map(obj2);
        } catch (NullPointerException | JSONException e) {
            String str = TAG;
            Log.e(str, C0201.m82(13573) + e.getMessage());
            return obj;
        }
    }

    public static /* synthetic */ void c(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback, Object obj) {
        Log.d(TAG, C0201.m82(13574));
        hMSMethod.sendLoggerEvent(activity);
        hMSCallback.success();
    }

    public static /* synthetic */ void d(HMSCallback hMSCallback, HMSMethod hMSMethod, Activity activity, Mapper mapper, Object obj) {
        Log.d(TAG, C0201.m82(13575));
        if (obj == null) {
            Log.e(TAG, C0201.m82(13576));
            hMSCallback.error(Exceptions.toErrorJSON(810));
            hMSMethod.sendLoggerEvent(activity, C0201.m82(13577));
            return;
        }
        hMSMethod.sendLoggerEvent(activity);
        hMSCallback.success((JSONObject) mapper.map(obj));
    }

    public static /* synthetic */ void e(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback, JSONObject jSONObject, Object obj) {
        Log.d(TAG, C0201.m82(13578));
        hMSMethod.sendLoggerEvent(activity);
        hMSCallback.success(jSONObject);
    }

    public static /* synthetic */ Object f(JSONTriMapper jSONTriMapper, Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj2 == null || obj3 == null || obj4 == null) {
            return null;
        }
        try {
            return jSONTriMapper.run(obj2, obj3, obj4);
        } catch (NullPointerException | JSONException e) {
            String str = TAG;
            Log.e(str, C0201.m82(13579) + e.getMessage());
            return obj;
        }
    }

    public static OnFailureListener failureListener(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback) {
        return new x(hMSMethod, activity, hMSCallback);
    }

    public static JSONObject fromMapToJSONObject(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (JSONException e) {
            String str = TAG;
            Log.d(str, C0201.m82(13580) + e.getMessage());
        }
        return jSONObject;
    }

    public static <T> JSONObject keyValPair(String str, T t) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, t);
        } catch (JSONException e) {
            String str2 = TAG;
            Log.d(str2, C0201.m82(13581) + e.getMessage());
        }
        return jSONObject;
    }

    public static <R> List<R> mapJSONArray(JSONArray jSONArray, Mapper<JSONObject, R> mapper) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(mapper.map(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                String str = TAG;
                Log.d(str, C0201.m82(13582) + e.getMessage());
            }
        }
        return arrayList;
    }

    public static <T> JSONArray mapList(List<T> list, Mapper<T, JSONObject> mapper) {
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            jSONArray.put(mapper.map(t));
        }
        return jSONArray;
    }

    public static <T, R> Mapper<T, R> mapperWrapper(JSONMapper<T, R> jSONMapper) {
        return mapperWrapper(jSONMapper, null);
    }

    public static <T> OnSuccessListener<T> successListener(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback) {
        return new z(hMSMethod, activity, hMSCallback);
    }

    public static <T, U, V, R> TriMapper<T, U, V, R> triMapperWrapper(JSONTriMapper<T, U, V, R> jSONTriMapper) {
        return triMapperWrapper(jSONTriMapper, null);
    }

    public static <T, R> Mapper<T, R> mapperWrapper(JSONMapper<T, R> jSONMapper, R r) {
        return new u(jSONMapper, r);
    }

    public static <T> OnSuccessListener<T> successListener(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback, Mapper<T, JSONObject> mapper) {
        return new w(hMSCallback, hMSMethod, activity, mapper);
    }

    public static <T, U, V, R> TriMapper<T, U, V, R> triMapperWrapper(JSONTriMapper<T, U, V, R> jSONTriMapper, R r) {
        return new v(jSONTriMapper, r);
    }

    public static <T> OnSuccessListener<T> successListener(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback, JSONObject jSONObject) {
        return new y(hMSMethod, activity, hMSCallback, jSONObject);
    }
}
