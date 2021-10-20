package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ForegroundInnerHeader {
    private final String TAG = C0201.m82(21808);
    private String action;
    private int apkVersion;
    private String responseCallbackKey;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.apkVersion = JsonUtil.getIntValue(jSONObject, C0201.m82(21809));
            this.action = JsonUtil.getStringValue(jSONObject, C0201.m82(21810));
            this.responseCallbackKey = JsonUtil.getStringValue(jSONObject, C0201.m82(21811));
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(21813), C0201.m82(21812) + e.getMessage());
        }
    }

    public String getAction() {
        return this.action;
    }

    public int getApkVersion() {
        return this.apkVersion;
    }

    public String getResponseCallbackKey() {
        return this.responseCallbackKey;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setApkVersion(int i) {
        this.apkVersion = i;
    }

    public void setResponseCallbackKey(String str) {
        this.responseCallbackKey = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(21814), this.apkVersion);
            jSONObject.put(C0201.m82(21815), this.action);
            jSONObject.put(C0201.m82(21816), this.responseCallbackKey);
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(21818), C0201.m82(21817) + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return C0201.m82(21819) + this.apkVersion + C0201.m82(21820) + this.action + C0201.m82(21821) + this.responseCallbackKey;
    }
}
