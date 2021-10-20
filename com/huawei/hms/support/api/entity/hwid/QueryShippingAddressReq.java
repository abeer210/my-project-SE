package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class QueryShippingAddressReq implements IMessageEntity {
    private static final String KEY_ACCESSTOKEN = null;
    private static final String KEY_OPENID = null;
    private static final String KEY_USERID = null;
    private static final String TAG = null;
    @Packed
    private String mLocalJsonObject;

    static {
        C0201.m83(QueryShippingAddressReq.class, 231);
    }

    public QueryShippingAddressReq() {
    }

    private JSONObject getJsonObj() {
        if (this.mLocalJsonObject == null) {
            return null;
        }
        try {
            return new JSONObject(this.mLocalJsonObject);
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(20200), C0201.m82(20199) + e.getMessage());
            return null;
        }
    }

    public String getAccessToken() {
        JSONObject jsonObj = getJsonObj();
        String r1 = C0201.m82(20201);
        if (jsonObj == null) {
            return r1;
        }
        try {
            return jsonObj.getString(C0201.m82(20202));
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(20204), C0201.m82(20203) + e.getMessage());
            return r1;
        }
    }

    public String getOpenId() {
        JSONObject jsonObj = getJsonObj();
        String r1 = C0201.m82(20205);
        if (jsonObj == null) {
            return r1;
        }
        try {
            return jsonObj.getString(C0201.m82(20206));
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(20208), C0201.m82(20207) + e.getMessage());
            return r1;
        }
    }

    public String getUserID() {
        JSONObject jsonObj = getJsonObj();
        String r1 = C0201.m82(20209);
        if (jsonObj == null) {
            return r1;
        }
        try {
            return jsonObj.getString(C0201.m82(20210));
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(20212), C0201.m82(20211) + e.getMessage());
            return r1;
        }
    }

    public QueryShippingAddressReq(SignInHuaweiId signInHuaweiId) {
        String r0 = C0201.m82(20193);
        if (signInHuaweiId == null) {
            HMSLog.i(r0, C0201.m82(20194));
            this.mLocalJsonObject = new JSONObject().toString();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(20195), signInHuaweiId.getAccessToken());
            jSONObject.put(C0201.m82(20196), signInHuaweiId.getOpenId());
            jSONObject.put(C0201.m82(20197), signInHuaweiId.getUid());
            this.mLocalJsonObject = jSONObject.toString();
        } catch (JSONException e) {
            HMSLog.e(r0, C0201.m82(20198) + e.getMessage());
            this.mLocalJsonObject = new JSONObject().toString();
        }
    }
}
