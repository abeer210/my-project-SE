package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class SignOutResult extends Result {
    public SignOutResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void jsonToSuper(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(C0201.m82(4653));
        if (optJSONObject != null) {
            setStatus(new Status(optJSONObject.optInt(C0201.m82(4654)), optJSONObject.optString(C0201.m82(4655), null)));
        }
    }
}
