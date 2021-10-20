package com.reactlibrary;

import android.app.Activity;
import android.content.ComponentName;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import vigqyno.C0201;

public class RNChangeIconModule extends ReactContextBaseJavaModule {
    private String componentClass = null;
    private final String packageName;

    public RNChangeIconModule(ReactApplicationContext reactApplicationContext, String str) {
        super(reactApplicationContext);
        this.packageName = str;
    }

    @ReactMethod
    public void changeIcon(String str, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || str == null || str.isEmpty()) {
            promise.reject(C0201.m82(31428));
            return;
        }
        if (this.componentClass == null) {
            this.componentClass = currentActivity.getComponentName().getClassName();
        }
        String str2 = this.packageName + C0201.m82(31426) + str;
        if (this.componentClass.equals(str2)) {
            promise.reject(C0201.m82(31427));
            return;
        }
        promise.resolve(Boolean.TRUE);
        currentActivity.getPackageManager().setComponentEnabledSetting(new ComponentName(this.packageName, str2), 1, 1);
        currentActivity.getPackageManager().setComponentEnabledSetting(new ComponentName(this.packageName, this.componentClass), 2, 1);
        this.componentClass = str2;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(31429);
    }
}
