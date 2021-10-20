package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeStatusBarManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
    public NativeStatusBarManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @ReactMethod
    public abstract void getHeight(Callback callback);

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void setColor(double d, boolean z);

    @ReactMethod
    public abstract void setHidden(boolean z, String str);

    @ReactMethod
    public abstract void setNetworkActivityIndicatorVisible(boolean z);

    @ReactMethod
    public abstract void setStyle(String str, Boolean bool);

    @ReactMethod
    public abstract void setTranslucent(boolean z);
}
