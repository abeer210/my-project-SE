package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class RevokeAccessResult extends Result {
    @Packed
    private Integer errorCode;
    @Packed
    private String errorMsg;

    public RevokeAccessResult() {
    }

    private void jsonToSuper(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(C0201.m82(17738));
        if (optJSONObject != null) {
            setStatus(new Status(optJSONObject.optInt(C0201.m82(17739)), optJSONObject.optString(C0201.m82(17740), null)));
        }
    }

    public RevokeAccessResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }

    public RevokeAccessResult getBeanFromJsonStr(String str) {
        String r0 = C0201.m82(17741);
        if (TextUtils.isEmpty(str)) {
            return new RevokeAccessResult();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer num = null;
            if (jSONObject.has(r0)) {
                num = Integer.valueOf(jSONObject.getInt(r0));
            }
            return new RevokeAccessResult(num, jSONObject.getString(C0201.m82(17742)));
        } catch (JSONException unused) {
            return new RevokeAccessResult();
        }
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public RevokeAccessResult(Integer num, String str) {
        this.errorCode = num;
        this.errorMsg = str;
    }

    public RevokeAccessResult(Status status) {
        setStatus(status);
    }
}
