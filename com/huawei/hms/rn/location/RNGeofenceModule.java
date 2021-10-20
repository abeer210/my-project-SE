package com.huawei.hms.rn.location;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.huawei.hms.rn.location.backend.providers.GeofenceProvider;
import com.huawei.hms.rn.location.helpers.RNCallback;
import com.huawei.hms.rn.location.helpers.ReactUtils;
import java.util.Map;
import vigqyno.C0201;

public class RNGeofenceModule extends ReactContextBaseJavaModule {
    private GeofenceProvider provider;

    public RNGeofenceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.provider = (GeofenceProvider) ReactUtils.initializeProvider(new GeofenceProvider(reactApplicationContext), reactApplicationContext, new c(this));
    }

    @ReactMethod
    public void createGeofenceList(int i, ReadableArray readableArray, int i2, int i3, Promise promise) {
        this.provider.createGeofenceList(i, ReactUtils.toJA(readableArray), i2, i3, RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void deleteGeofenceList(int i, Promise promise) {
        this.provider.deleteGeofenceList(i, RNCallback.fromPromise(promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return ReactUtils.getConstants(this.provider);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(2306);
    }
}
