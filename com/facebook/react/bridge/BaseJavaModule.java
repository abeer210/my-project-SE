package com.facebook.react.bridge;

import java.util.Map;
import vigqyno.C0201;

public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = null;
    public static final String METHOD_TYPE_PROMISE = null;
    public static final String METHOD_TYPE_SYNC = null;

    static {
        C0201.m83(BaseJavaModule.class, 498);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map<String, Object> getConstants() {
        return null;
    }

    public boolean hasConstants() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
    }
}
