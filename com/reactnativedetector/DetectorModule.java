package com.reactnativedetector;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import vigqyno.C0201;

/* compiled from: DetectorModule.kt */
public final class DetectorModule extends ReactContextBaseJavaModule implements c {
    private final ReactApplicationContext reactContext;
    private final b screenshotDetectionDelegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetectorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        ow2.c(reactApplicationContext, C0201.m82(4037));
        this.reactContext = reactApplicationContext;
        this.screenshotDetectionDelegate = new b(reactApplicationContext, this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(4038);
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.reactnativedetector.c
    public void onScreenCaptured(String str) {
        ow2.c(str, C0201.m82(4039));
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(4040), null);
    }

    @Override // com.reactnativedetector.c
    public void onScreenCapturedWithDeniedPermission() {
    }

    @ReactMethod
    public final void startScreenshotDetection() {
        this.screenshotDetectionDelegate.l();
    }

    @ReactMethod
    public final void stopScreenshotDetection() {
        this.screenshotDetectionDelegate.m();
    }
}
