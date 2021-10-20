package com.huawei.hms.rn.location.backend.interfaces;

import org.json.JSONObject;

public interface EventSender {
    void send(String str, JSONObject jSONObject);
}
