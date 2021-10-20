package com.facebook.react.bridge;

import android.app.Activity;
import vigqyno.C0201;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    private final ReactApplicationContext mReactApplicationContext;

    public ReactContextBaseJavaModule() {
        this.mReactApplicationContext = null;
    }

    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    public final ReactApplicationContext getReactApplicationContext() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        yh0.d(reactApplicationContext, C0201.m82(12653));
        return reactApplicationContext;
    }

    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveCatalystInstance() || this.mReactApplicationContext.isBridgeless()) {
            return this.mReactApplicationContext;
        }
        ReactSoftException.logSoftException(C0201.m82(12655), new RuntimeException(C0201.m82(12654) + getName()));
        return null;
    }

    public ReactContextBaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
