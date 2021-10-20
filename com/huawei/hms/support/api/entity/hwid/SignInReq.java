package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class SignInReq implements IMessageEntity {
    private static final String KEY_DYNAMIC_PERMISSIONS = null;
    private static final String KEY_SCOPES = null;
    @Packed
    private String mLocalJsonObject;

    static {
        C0201.m83(SignInReq.class, 706);
    }

    public SignInReq() {
    }

    private JSONObject getJsonObj() {
        if (this.mLocalJsonObject == null) {
            return null;
        }
        try {
            return new JSONObject(this.mLocalJsonObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    public List<String> getPermissionInfos() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj == null) {
            return new ArrayList(0);
        }
        try {
            JSONArray jSONArray = jsonObj.getJSONArray(C0201.m82(5788));
            if (jSONArray == null || jSONArray.length() <= 0) {
                return new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList(0);
        }
    }

    public List<String> getScopes() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj == null) {
            return new ArrayList(0);
        }
        try {
            JSONArray jSONArray = jsonObj.getJSONArray(C0201.m82(5789));
            if (jSONArray == null || jSONArray.length() <= 0) {
                return new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList(0);
        }
    }

    public SignInReq(Set<String> set, Set<String> set2) {
        JSONArray jSONArray = new JSONArray();
        for (String str : set) {
            jSONArray.put(str);
        }
        JSONArray jSONArray2 = new JSONArray();
        for (String str2 : set2) {
            jSONArray2.put(str2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(5786), jSONArray);
            jSONObject.put(C0201.m82(5787), jSONArray2);
            this.mLocalJsonObject = jSONObject.toString();
        } catch (JSONException unused) {
            this.mLocalJsonObject = new JSONObject().toString();
        }
    }
}
