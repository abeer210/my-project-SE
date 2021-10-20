package com.huawei.hms.common.internal;

import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ResponseHeader implements ResponseErrorCode, IMessageEntity {
    private static final String TAG = null;
    @Packed
    private String api_name;
    @Packed
    private String app_id = C0201.m82(2733);
    @Packed
    private int error_code;
    @Packed
    private String error_reason;
    private Parcelable parcelable;
    @Packed
    private String pkg_name;
    @Packed
    private String resolution;
    @Packed
    private String session_id;
    @Packed
    private String srv_name;
    @Packed
    private int status_code;
    @Packed
    private String transaction_id;

    static {
        C0201.m83(ResponseHeader.class, 671);
    }

    public ResponseHeader() {
    }

    public boolean fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.status_code = JsonUtil.getIntValue(jSONObject, C0201.m82(2735));
            this.error_code = JsonUtil.getIntValue(jSONObject, C0201.m82(2736));
            this.error_reason = JsonUtil.getStringValue(jSONObject, C0201.m82(2737));
            this.srv_name = JsonUtil.getStringValue(jSONObject, C0201.m82(2738));
            this.api_name = JsonUtil.getStringValue(jSONObject, C0201.m82(2739));
            this.app_id = JsonUtil.getStringValue(jSONObject, C0201.m82(2740));
            this.pkg_name = JsonUtil.getStringValue(jSONObject, C0201.m82(2741));
            this.session_id = JsonUtil.getStringValue(jSONObject, C0201.m82(2742));
            this.transaction_id = JsonUtil.getStringValue(jSONObject, C0201.m82(2743));
            this.resolution = JsonUtil.getStringValue(jSONObject, C0201.m82(2744));
            return true;
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(2746), C0201.m82(2745) + e.getMessage());
            return false;
        }
    }

    public String getActualAppID() {
        boolean isEmpty = TextUtils.isEmpty(this.app_id);
        String r1 = C0201.m82(2747);
        if (isEmpty) {
            return r1;
        }
        String[] split = this.app_id.split(C0201.m82(2748));
        if (split.length == 0) {
            return r1;
        }
        if (split.length == 1) {
            return split[0];
        }
        return split[1];
    }

    public String getApiName() {
        return this.api_name;
    }

    public String getAppID() {
        return this.app_id;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public int getErrorCode() {
        return this.error_code;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getErrorReason() {
        return this.error_reason;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public String getPkgName() {
        return this.pkg_name;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getResolution() {
        return this.resolution;
    }

    public String getSessionId() {
        return this.session_id;
    }

    public String getSrvName() {
        return this.srv_name;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public int getStatusCode() {
        return this.status_code;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getTransactionId() {
        return this.transaction_id;
    }

    public boolean isSuccess() {
        return this.status_code == 0;
    }

    public void setApiName(String str) {
        this.api_name = str;
    }

    public void setAppID(String str) {
        this.app_id = str;
    }

    public void setErrorCode(int i) {
        this.error_code = i;
    }

    public void setErrorReason(String str) {
        this.error_reason = str;
    }

    public void setParcelable(Parcelable parcelable2) {
        this.parcelable = parcelable2;
    }

    public void setPkgName(String str) {
        this.pkg_name = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setSessionId(String str) {
        this.session_id = str;
    }

    public void setSrvName(String str) {
        this.srv_name = str;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setTransactionId(String str) {
        this.transaction_id = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(2749), this.status_code);
            jSONObject.put(C0201.m82(2750), this.error_code);
            jSONObject.put(C0201.m82(2751), this.error_reason);
            jSONObject.put(C0201.m82(2752), this.srv_name);
            jSONObject.put(C0201.m82(2753), this.api_name);
            jSONObject.put(C0201.m82(2754), this.app_id);
            jSONObject.put(C0201.m82(2755), this.pkg_name);
            if (!TextUtils.isEmpty(this.session_id)) {
                jSONObject.put(C0201.m82(2756), this.session_id);
            }
            jSONObject.put(C0201.m82(2757), this.transaction_id);
            jSONObject.put(C0201.m82(2758), this.resolution);
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(2760), C0201.m82(2759) + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return C0201.m82(2761) + this.status_code + C0201.m82(2762) + this.error_code + C0201.m82(2763) + this.api_name + C0201.m82(2764) + this.app_id + C0201.m82(2765) + this.pkg_name + C0201.m82(2766) + this.transaction_id + C0201.m82(2767) + this.resolution;
    }

    public ResponseHeader(int i, int i2, String str) {
        this.status_code = i;
        this.error_code = i2;
        this.error_reason = str;
    }
}
