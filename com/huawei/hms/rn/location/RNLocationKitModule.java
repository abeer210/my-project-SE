package com.huawei.hms.rn.location;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.huawei.hms.rn.location.backend.helpers.HMSBroadcastReceiver;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;
import com.huawei.hms.rn.location.helpers.ReactUtils;
import org.json.JSONObject;
import vigqyno.C0201;

public class RNLocationKitModule extends ReactContextBaseJavaModule {
    private ReactContext reactContext;

    public RNLocationKitModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public /* synthetic */ void a(String str, JSONObject jSONObject) {
        ReactUtils.sendEvent(this.reactContext, str, ReactUtils.toWM(jSONObject));
    }

    @ReactMethod
    public void disableLogger(Promise promise) {
        HMSMethod.disableLogger(getCurrentActivity());
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void enableLogger(Promise promise) {
        HMSMethod.enableLogger(getCurrentActivity());
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(18870);
    }

    public String getStringKey(ReadableMap readableMap, String str, String str2) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.getType(str) != ReadableType.String) ? str2 : readableMap.getString(str);
    }

    @ReactMethod
    public void init(Promise promise) {
        HMSBroadcastReceiver.init(getCurrentActivity(), new d(this));
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void setNotification(ReadableMap readableMap, Promise promise) {
        ReactContext reactContext2 = this.reactContext;
        SharedPreferences.Editor edit = reactContext2.getSharedPreferences(reactContext2.getPackageName(), 0).edit();
        String r1 = C0201.m82(18871);
        edit.putString(r1, getStringKey(readableMap, r1, C0201.m82(18872)));
        String r12 = C0201.m82(18873);
        edit.putString(r12, getStringKey(readableMap, r12, C0201.m82(18874)));
        String r13 = C0201.m82(18875);
        edit.putString(r13, getStringKey(readableMap, r13, C0201.m82(18876)));
        String r14 = C0201.m82(18877);
        edit.putString(r14, getStringKey(readableMap, r14, C0201.m82(18878)));
        edit.apply();
        promise.resolve(Boolean.TRUE);
    }
}
