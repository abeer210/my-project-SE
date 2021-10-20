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

public class RequestHeader implements IMessageEntity {
    private static final String TAG = null;
    @Packed
    private int apiLevel;
    @Packed
    private String api_name;
    @Packed
    private String app_id = C0201.m82(20597);
    @Packed
    private int kitSdkVersion;
    private Parcelable parcelable;
    @Packed
    private String pkg_name;
    @Packed
    private int sdk_version = 50004301;
    @Packed
    private String session_id;
    @Packed
    private String srv_name;
    @Packed
    private String transaction_id;
    @Packed
    private String version = C0201.m82(20598);

    static {
        C0201.m83(RequestHeader.class, 726);
    }

    public boolean fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.version = JsonUtil.getStringValue(jSONObject, C0201.m82(20599));
            this.srv_name = JsonUtil.getStringValue(jSONObject, C0201.m82(20600));
            this.api_name = JsonUtil.getStringValue(jSONObject, C0201.m82(20601));
            this.app_id = JsonUtil.getStringValue(jSONObject, C0201.m82(20602));
            this.pkg_name = JsonUtil.getStringValue(jSONObject, C0201.m82(20603));
            this.sdk_version = JsonUtil.getIntValue(jSONObject, C0201.m82(20604));
            this.kitSdkVersion = JsonUtil.getIntValue(jSONObject, C0201.m82(20605));
            this.apiLevel = JsonUtil.getIntValue(jSONObject, C0201.m82(20606));
            this.session_id = JsonUtil.getStringValue(jSONObject, C0201.m82(20607));
            this.transaction_id = JsonUtil.getStringValue(jSONObject, C0201.m82(20608));
            return true;
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(20610), C0201.m82(20609) + e.getMessage());
            return false;
        }
    }

    public String getActualAppID() {
        boolean isEmpty = TextUtils.isEmpty(this.app_id);
        String r1 = C0201.m82(20611);
        if (isEmpty) {
            return r1;
        }
        String[] split = this.app_id.split(C0201.m82(20612));
        if (split.length == 0) {
            return r1;
        }
        if (split.length == 1) {
            return split[0];
        }
        return split[1];
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public String getApiName() {
        return this.api_name;
    }

    public String getAppID() {
        return this.app_id;
    }

    public int getKitSdkVersion() {
        return this.kitSdkVersion;
    }

    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public String getPkgName() {
        return this.pkg_name;
    }

    public int getSdkVersion() {
        return this.sdk_version;
    }

    public String getSessionId() {
        return this.session_id;
    }

    public String getSrvName() {
        return this.srv_name;
    }

    public String getTransactionId() {
        return this.transaction_id;
    }

    public String getVersion() {
        return this.version;
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setApiName(String str) {
        this.api_name = str;
    }

    public void setAppID(String str) {
        this.app_id = str;
    }

    public void setKitSdkVersion(int i) {
        this.kitSdkVersion = i;
    }

    public void setParcelable(Parcelable parcelable2) {
        this.parcelable = parcelable2;
    }

    public void setPkgName(String str) {
        this.pkg_name = str;
    }

    public void setSdkVersion(int i) {
        this.sdk_version = i;
    }

    public void setSessionId(String str) {
        this.session_id = str;
    }

    public void setSrvName(String str) {
        this.srv_name = str;
    }

    public void setTransactionId(String str) {
        this.transaction_id = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(20613), this.version);
            jSONObject.put(C0201.m82(20614), this.srv_name);
            jSONObject.put(C0201.m82(20615), this.api_name);
            jSONObject.put(C0201.m82(20616), this.app_id);
            jSONObject.put(C0201.m82(20617), this.pkg_name);
            jSONObject.put(C0201.m82(20618), this.sdk_version);
            jSONObject.put(C0201.m82(20619), this.kitSdkVersion);
            jSONObject.put(C0201.m82(20620), this.apiLevel);
            if (!TextUtils.isEmpty(this.session_id)) {
                jSONObject.put(C0201.m82(20621), this.session_id);
            }
            jSONObject.put(C0201.m82(20622), this.transaction_id);
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(20624), C0201.m82(20623) + e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return C0201.m82(20625) + this.api_name + C0201.m82(20626) + this.app_id + C0201.m82(20627) + this.pkg_name + C0201.m82(20628) + this.sdk_version + C0201.m82(20629) + this.transaction_id + C0201.m82(20630) + this.kitSdkVersion + C0201.m82(20631) + this.apiLevel;
    }
}
