package com.huawei.hms.rn.location.backend.helpers;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class Exceptions {
    public static final Map<Integer, String> ERROR_MSGS;
    public static final int ERR_DUPLICATE_ID = 0;
    public static final int ERR_EMPTY_CALLBACK = 0;
    public static final int ERR_GENERIC = 0;
    public static final int ERR_JSON = 0;
    public static final int ERR_NO_EXISTENT_REQUEST_ID = 0;
    public static final int ERR_NO_FUSED_LOCATION_PROVIDER = 0;
    public static final int ERR_NO_HW_LOCATION = 0;
    public static final int ERR_NO_PERMISSION = 0;
    public static final int ERR_NULL_VALUE = 0;
    public static final int ERR_PENDING_RESOLUTION = 0;
    public static final int ERR_RESOLUTION_FAILED = 0;

    static {
        C0201.m83(Exceptions.class, 389);
        HashMap hashMap = new HashMap();
        ERROR_MSGS = hashMap;
        hashMap.put(802, C0201.m82(14522));
        ERROR_MSGS.put(804, C0201.m82(14523));
        ERROR_MSGS.put(806, C0201.m82(14524));
        ERROR_MSGS.put(807, C0201.m82(14525));
        ERROR_MSGS.put(805, C0201.m82(14526));
        ERROR_MSGS.put(808, C0201.m82(14527));
        ERROR_MSGS.put(809, C0201.m82(14528));
        ERROR_MSGS.put(810, C0201.m82(14529));
        ERROR_MSGS.put(801, C0201.m82(14530));
    }

    public static JSONObject toErrorJSON(int i) {
        try {
            return new JSONObject().put(C0201.m82(14531), i).put(C0201.m82(14532), ERROR_MSGS.get(Integer.valueOf(i)));
        } catch (JSONException e) {
            Log.e(C0201.m82(14533), e.getMessage());
            return new JSONObject();
        }
    }

    public static JSONObject toErrorJSON(int i, Throwable th) {
        try {
            return new JSONObject().put(C0201.m82(14534), i).put(C0201.m82(14535), th.getMessage());
        } catch (JSONException e) {
            Log.e(C0201.m82(14536), e.getMessage());
            return new JSONObject();
        }
    }
}
