package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeAnimationsDebugModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
    public NativeAnimationsDebugModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void startRecordingFps();

    @ReactMethod
    public abstract void stopRecordingFps(double d);
}