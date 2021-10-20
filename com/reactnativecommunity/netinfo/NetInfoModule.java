package com.reactnativecommunity.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.reactnativecommunity.netinfo.a;
import vigqyno.C0201;

@pj0(name = "RNCNetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule implements a.b {
    public static final String NAME = null;
    private final a mAmazonConnectivityChecker;
    private final c mConnectivityReceiver;

    static {
        C0201.m83(NetInfoModule.class, 675);
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new f(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new b(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new a(reactApplicationContext, this);
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.d(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(35471);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mConnectivityReceiver.f();
        this.mAmazonConnectivityChecker.g();
    }

    @Override // com.reactnativecommunity.netinfo.a.b
    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        this.mConnectivityReceiver.h(z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mAmazonConnectivityChecker.k();
        this.mConnectivityReceiver.i();
    }
}
