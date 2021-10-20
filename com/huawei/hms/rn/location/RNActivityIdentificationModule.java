package com.huawei.hms.rn.location;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.huawei.hms.rn.location.backend.providers.ActivityIdentificationProvider;
import com.huawei.hms.rn.location.helpers.RNCallback;
import com.huawei.hms.rn.location.helpers.ReactUtils;
import java.util.Map;
import vigqyno.C0201;

public class RNActivityIdentificationModule extends ReactContextBaseJavaModule {
    private ActivityIdentificationProvider provider;

    public RNActivityIdentificationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.provider = (ActivityIdentificationProvider) ReactUtils.initializeProvider(new ActivityIdentificationProvider(reactApplicationContext), reactApplicationContext, new a(this));
    }

    @ReactMethod
    public void createActivityConversionUpdates(int i, ReadableArray readableArray, Promise promise) {
        this.provider.createActivityConversionUpdates(i, ReactUtils.toJA(readableArray), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void createActivityIdentificationUpdates(int i, double d, Promise promise) {
        this.provider.createActivityIdentificationUpdates(i, d, RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void deleteActivityConversionUpdates(int i, Promise promise) {
        this.provider.deleteActivityConversionUpdates(i, RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void deleteActivityIdentificationUpdates(int i, Promise promise) {
        this.provider.deleteActivityIdentificationUpdates(i, RNCallback.fromPromise(promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return ReactUtils.getConstants(this.provider);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(5963);
    }

    @ReactMethod
    public void hasPermission(Promise promise) {
        this.provider.hasPermission(RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void requestPermission(Promise promise) {
        this.provider.requestPermission(RNCallback.fromPromise(promise));
    }
}
