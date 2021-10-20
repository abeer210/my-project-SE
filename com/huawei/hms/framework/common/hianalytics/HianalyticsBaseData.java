package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0188;
import vigqyno.C0201;

public abstract class HianalyticsBaseData {
    private static final String SDK_NAME = null;
    private static final String SDK_TYPE = null;
    private static final String TAG = null;
    private LinkedHashMap<String, String> data;

    static {
        C0201.m83(HianalyticsBaseData.class, 580);
    }

    public HianalyticsBaseData() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        this.data = linkedHashMap;
        linkedHashMap.put(C0201.m82(987), C0201.m82(988));
        this.data.put(C0201.m82(989), C0201.m82(990));
    }

    public LinkedHashMap<String, String> get() {
        return this.data;
    }

    public HianalyticsBaseData put(String str, long j) {
        if (str == null) {
            Logger.v(C0201.m82(992), C0201.m82(991) + j);
        } else {
            LinkedHashMap<String, String> linkedHashMap = this.data;
            linkedHashMap.put(str, C0201.m82(993) + j);
        }
        return this;
    }

    public HianalyticsBaseData put(String str, String str2) {
        if (str == null || str2 == null) {
            Logger.v(C0201.m82(996), C0201.m82(994) + str + C0201.m82(995) + str2);
        } else {
            this.data.put(str, str2);
        }
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            Logger.v(C0201.m82(997), C0201.m82(998));
        } else {
            this.data.putAll(linkedHashMap);
        }
        return this;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : get().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            Logger.w(C0201.m82(999), C0201.m82(C0188.f18), e);
        }
        return jSONObject.toString();
    }
}
