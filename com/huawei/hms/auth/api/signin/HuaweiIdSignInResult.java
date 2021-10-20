package com.huawei.hms.auth.api.signin;

import android.text.TextUtils;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class HuaweiIdSignInResult extends Result {
    private SignInHuaweiId signInHuaweiId;

    public HuaweiIdSignInResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        JSONObject jSONObject = new JSONObject(str);
        jsonToSuper(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject(C0201.m82(28776));
        if (optJSONObject != null) {
            this.signInHuaweiId = SignInHuaweiId.fromJson(optJSONObject);
        }
        return this;
    }

    public SignInHuaweiId getSignInAccount() {
        return this.signInHuaweiId;
    }

    public SignInHuaweiId getSignInHuaweiId() {
        return this.signInHuaweiId;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void jsonToSuper(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(C0201.m82(28777));
        if (optJSONObject != null) {
            setStatus(new Status(optJSONObject.optInt(C0201.m82(28778)), optJSONObject.optString(C0201.m82(28779), null)));
        }
    }

    public void setSignInHuaweiId(SignInHuaweiId signInHuaweiId2) {
        this.signInHuaweiId = signInHuaweiId2;
    }

    public JSONObject superToJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (getStatus() != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0201.m82(28780), getStatus().getStatusCode());
            if (getStatus().getStatusMessage() != null) {
                jSONObject2.put(C0201.m82(28781), getStatus().getStatusMessage());
            }
            jSONObject.put(C0201.m82(28782), jSONObject2);
        }
        return jSONObject;
    }

    public String toJson() throws JSONException {
        return toJsonObject().toString();
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject superToJson = superToJson();
        SignInHuaweiId signInHuaweiId2 = this.signInHuaweiId;
        if (signInHuaweiId2 != null) {
            superToJson.put(C0201.m82(28783), signInHuaweiId2);
        }
        return superToJson;
    }
}
