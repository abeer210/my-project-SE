package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

@pj0(name = "DeviceEventManager")
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final String NAME = null;
    private final Runnable mInvokeDefaultBackPressRunnable;

    @zh0
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    class a implements Runnable {
        public final /* synthetic */ b a;

        public a(DeviceEventManagerModule deviceEventManagerModule, b bVar) {
            this.a = bVar;
        }

        public void run() {
            UiThreadUtil.assertOnUiThread();
            this.a.c();
        }
    }

    static {
        C0201.m83(DeviceEventManagerModule.class, 695);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new a(this, bVar);
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit(C0201.m82(6358), null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap createMap = Arguments.createMap();
            String uri2 = uri.toString();
            String r2 = C0201.m82(6359);
            createMap.putString(r2, uri2);
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(RCTDeviceEventEmitter.class)).emit(r2, createMap);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(6360);
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
