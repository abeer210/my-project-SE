package com.huawei.hms.rn.location.helpers;

import com.facebook.react.bridge.Promise;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import org.json.JSONObject;

public class RNCallback implements HMSCallback {
    private Promise promise;

    private RNCallback(Promise promise2) {
        this.promise = promise2;
    }

    public static RNCallback fromPromise(Promise promise2) {
        return new RNCallback(promise2);
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSCallback
    public void error(JSONObject jSONObject) {
        this.promise.reject(jSONObject.toString());
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSCallback
    public void success() {
        this.promise.resolve(Boolean.TRUE);
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSCallback
    public void success(JSONObject jSONObject) {
        this.promise.resolve(ReactUtils.toWM(jSONObject));
    }
}
