package com.huawei.hms.a.a.a;

import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: SmsRetrieverInputBean */
public class d {
    private String a;

    public d() {
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(12426), this.a);
            return jSONObject.toString();
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(12427), C0201.m82(12428));
            return null;
        }
    }

    public d(String str) {
        this.a = str;
    }
}
