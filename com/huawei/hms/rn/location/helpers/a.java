package com.huawei.hms.rn.location.helpers;

import com.facebook.react.bridge.ReactContext;
import com.huawei.hms.rn.location.backend.interfaces.EventSender;
import org.json.JSONObject;

/* compiled from: lambda */
public final /* synthetic */ class a implements EventSender {
    public final /* synthetic */ ReactContext a;

    public /* synthetic */ a(ReactContext reactContext) {
        this.a = reactContext;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.EventSender
    public final void send(String str, JSONObject jSONObject) {
        ReactUtils.sendEvent(this.a, str, ReactUtils.toWM(jSONObject));
    }
}
