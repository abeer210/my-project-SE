package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class HuaweiIdSignInRequest {
    public HuaweiIdSignInOptions a;

    public static HuaweiIdSignInRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new HuaweiIdSignInRequest().objectFromJson(new JSONObject(str));
    }

    public HuaweiIdSignInOptions getHuaweiIdSignInOptions() {
        return this.a;
    }

    public HuaweiIdSignInRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(C0201.m82(2938));
        if (jSONObject2 != null) {
            this.a = HuaweiIdSignInOptions.fromJsonObject(jSONObject2);
        }
        return this;
    }

    public void setHuaweiIdSignInOptions(HuaweiIdSignInOptions huaweiIdSignInOptions) {
        this.a = huaweiIdSignInOptions;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HuaweiIdSignInOptions huaweiIdSignInOptions = this.a;
        if (huaweiIdSignInOptions != null) {
            jSONObject.put(C0201.m82(2939), huaweiIdSignInOptions.toJsonObject());
        }
        return jSONObject.toString();
    }
}
