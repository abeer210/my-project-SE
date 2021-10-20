package com.huawei.hms.rn.location;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.rn.location.backend.providers.FusedLocationProvider;
import com.huawei.hms.rn.location.helpers.RNCallback;
import com.huawei.hms.rn.location.helpers.ReactUtils;
import java.util.Map;
import vigqyno.C0201;

public class RNFusedLocationModule extends ReactContextBaseJavaModule {
    private FusedLocationProvider provider;

    public RNFusedLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.provider = (FusedLocationProvider) ReactUtils.initializeProvider(new FusedLocationProvider(reactApplicationContext), reactApplicationContext, new b(this));
    }

    @ReactMethod
    public void checkLocationSettings(ReadableMap readableMap, Promise promise) {
        this.provider.checkLocationSettings(ReactUtils.toJO(readableMap), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void flushLocations(Promise promise) {
        this.provider.flushLocations(RNCallback.fromPromise(promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return ReactUtils.getConstants(this.provider);
    }

    @ReactMethod
    public void getLastLocation(Promise promise) {
        this.provider.getLastLocation(RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void getLastLocationWithAddress(ReadableMap readableMap, Promise promise) {
        this.provider.getLastLocationWithAddress(ReactUtils.toJO(readableMap), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void getLocationAvailability(Promise promise) {
        this.provider.getLocationAvailability(RNCallback.fromPromise(promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(12238);
    }

    @ReactMethod
    public void getNavigationContextState(int i, Promise promise) {
        this.provider.getNavigationContextState(i, RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void hasPermission(Promise promise) {
        this.provider.hasPermission(RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void removeLocationUpdates(int i, Promise promise) {
        this.provider.removeLocationUpdates(i, RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void requestLocationUpdates(int i, ReadableMap readableMap, Promise promise) {
        this.provider.requestLocationUpdates(i, ReactUtils.toJO(readableMap), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void requestLocationUpdatesWithCallback(ReadableMap readableMap, Promise promise) {
        this.provider.requestLocationUpdatesWithCallback(ReactUtils.toJO(readableMap), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void requestLocationUpdatesWithCallbackEx(ReadableMap readableMap, Promise promise) {
        this.provider.requestLocationUpdatesWithCallbackEx(ReactUtils.toJO(readableMap), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void requestPermission(Promise promise) {
        this.provider.requestPermission(RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void setMockLocation(ReadableMap readableMap, Promise promise) {
        this.provider.setMockLocation(ReactUtils.toJO(readableMap), RNCallback.fromPromise(promise));
    }

    @ReactMethod
    public void setMockMode(boolean z, Promise promise) {
        this.provider.setMockMode(z, RNCallback.fromPromise(promise));
    }
}
