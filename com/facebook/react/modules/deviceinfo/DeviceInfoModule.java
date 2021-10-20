package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.c;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "DeviceInfo")
public class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    public static final String NAME = null;
    private float mFontScale;
    private ReadableMap mPreviousDisplayMetrics;
    private ReactApplicationContext mReactApplicationContext;

    static {
        C0201.m83(DeviceInfoModule.class, 450);
    }

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        c.h(reactApplicationContext);
        this.mFontScale = reactApplicationContext.getResources().getConfiguration().fontScale;
        this.mReactApplicationContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            if (reactApplicationContext.hasActiveCatalystInstance()) {
                WritableNativeMap b = c.b((double) this.mFontScale);
                ReadableMap readableMap = this.mPreviousDisplayMetrics;
                if (readableMap == null) {
                    this.mPreviousDisplayMetrics = b.copy();
                } else if (!b.equals(readableMap)) {
                    this.mPreviousDisplayMetrics = b.copy();
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(31430), b);
                }
            } else {
                ReactSoftException.logSoftException(C0201.m82(31432), new ReactNoCrashSoftException(C0201.m82(31431)));
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(31433);
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(31434), c.a((double) this.mFontScale));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            float f = reactApplicationContext.getResources().getConfiguration().fontScale;
            if (this.mFontScale != f) {
                this.mFontScale = f;
                emitUpdateDimensionsEvent();
            }
        }
    }

    public DeviceInfoModule(Context context) {
        super(null);
        this.mReactApplicationContext = null;
        c.h(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}
