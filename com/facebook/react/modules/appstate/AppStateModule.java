package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "AppState")
public class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {
    public static final String APP_STATE_ACTIVE = null;
    public static final String APP_STATE_BACKGROUND = null;
    private static final String INITIAL_STATE = null;
    public static final String NAME = null;
    public static final String TAG = null;
    private String mAppState;

    static {
        C0201.m83(AppStateModule.class, 567);
    }

    public AppStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
        reactApplicationContext.addWindowFocusChangeListener(this);
        this.mAppState = reactApplicationContext.getLifecycleState() == LifecycleState.RESUMED ? C0201.m82(31736) : C0201.m82(31737);
    }

    private WritableMap createAppStateEventMap() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(31738), this.mAppState);
        return createMap;
    }

    private void sendAppStateChangeEvent() {
        sendEvent(C0201.m82(31739), createAppStateEventMap());
    }

    private void sendEvent(String str, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void getCurrentAppState(Callback callback, Callback callback2) {
        callback.invoke(createAppStateEventMap());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(31740);
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(31741), this.mAppState);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mAppState = C0201.m82(31742);
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mAppState = C0201.m82(31743);
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.WindowFocusChangeListener
    public void onWindowFocusChange(boolean z) {
        sendEvent(C0201.m82(31744), Boolean.valueOf(z));
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void removeListeners(double d) {
    }
}
