package com.dynatrace.android.agent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import vigqyno.C0201;

public class PrivateDTBridge extends ReactContextBaseJavaModule {
    public PrivateDTBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public n enterAction(String str) {
        return q.l(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(14467);
    }
}
