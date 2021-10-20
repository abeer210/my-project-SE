package com.huawei.hms.rn.location;

import com.huawei.hms.rn.location.backend.interfaces.EventSender;
import org.json.JSONObject;

/* compiled from: lambda */
public final /* synthetic */ class d implements EventSender {
    public final /* synthetic */ RNLocationKitModule a;

    public /* synthetic */ d(RNLocationKitModule rNLocationKitModule) {
        this.a = rNLocationKitModule;
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.EventSender
    public final void send(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }
}
