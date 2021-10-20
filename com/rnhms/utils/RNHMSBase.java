package com.rnhms.utils;

import android.widget.Toast;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.huawei.hms.api.HuaweiApiAvailability;
import vigqyno.C0201;

public class RNHMSBase extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactContext;

    public RNHMSBase(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(15501);
    }

    @ReactMethod
    public void getPackageName() {
        Toast.makeText(getReactApplicationContext(), C0201.m82(15502), 1).show();
    }

    @ReactMethod
    public void isGmsAvailable(Callback callback) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        callback.invoke(Boolean.valueOf(reactApplicationContext != null && yo0.q().i(reactApplicationContext) == 0));
    }

    @ReactMethod
    public void isHmsAvailable(Callback callback) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        callback.invoke(Boolean.valueOf(reactApplicationContext != null && HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(reactApplicationContext) == 0));
    }
}
