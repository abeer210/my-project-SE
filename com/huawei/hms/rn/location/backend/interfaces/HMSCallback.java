package com.huawei.hms.rn.location.backend.interfaces;

import org.json.JSONObject;

public interface HMSCallback {
    void error(JSONObject jSONObject);

    void success();

    void success(JSONObject jSONObject);
}
