package com.hieuvp.fingerprint;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import defpackage.zt2;
import vigqyno.C0188;
import vigqyno.C0201;

@pj0(name = "ReactNativeFingerprintScanner")
public class ReactNativeFingerprintScannerModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final int MAX_AVAILABLE_TIMES = 0;
    public static final String TYPE_FINGERPRINT = null;
    private wt2 mFingerprintIdentify;
    private final ReactApplicationContext mReactContext;

    /* access modifiers changed from: package-private */
    public class a implements zt2.d {
        public a() {
        }

        @Override // defpackage.zt2.d
        public void a(Throwable th) {
            ReactNativeFingerprintScannerModule.this.mReactContext.removeLifecycleEventListener(ReactNativeFingerprintScannerModule.this);
        }
    }

    class b implements zt2.e {
        public final /* synthetic */ Promise a;

        public b(Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.zt2.e
        public void a() {
            this.a.resolve(Boolean.TRUE);
            ReactNativeFingerprintScannerModule.this.release();
        }

        @Override // defpackage.zt2.e
        public void b(boolean z) {
            String r0 = C0201.m82(21919);
            if (z) {
                this.a.reject(r0, C0201.m82(21920));
            } else {
                this.a.reject(r0, C0201.m82(21921));
            }
            ReactNativeFingerprintScannerModule.this.release();
        }

        @Override // defpackage.zt2.e
        public void c() {
            this.a.reject(C0201.m82(21922), C0201.m82(21923));
        }

        @Override // defpackage.zt2.e
        public void d(int i) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) ReactNativeFingerprintScannerModule.this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(21924), C0201.m82(21925));
        }
    }

    static {
        C0201.m83(ReactNativeFingerprintScannerModule.class, 526);
    }

    public ReactNativeFingerprintScannerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private String getErrorMessage() {
        if (!getFingerprintIdentify().d()) {
            return C0201.m82(2777);
        }
        if (!getFingerprintIdentify().e()) {
            return C0201.m82(2778);
        }
        if (!getFingerprintIdentify().c()) {
            return C0201.m82(2779);
        }
        return null;
    }

    private wt2 getFingerprintIdentify() {
        wt2 wt2 = this.mFingerprintIdentify;
        if (wt2 != null) {
            return wt2;
        }
        this.mReactContext.addLifecycleEventListener(this);
        wt2 wt22 = new wt2(this.mReactContext);
        this.mFingerprintIdentify = wt22;
        wt22.h(true);
        this.mFingerprintIdentify.g(new a());
        this.mFingerprintIdentify.b();
        return this.mFingerprintIdentify;
    }

    @ReactMethod
    public void authenticate(Promise promise) {
        String errorMessage = getErrorMessage();
        if (errorMessage != null) {
            promise.reject(errorMessage, C0201.m82(2780));
            release();
            return;
        }
        getFingerprintIdentify().f();
        getFingerprintIdentify().i(C0188.f24, new b(promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(2781);
    }

    @ReactMethod
    public void isSensorAvailable(Promise promise) {
        String errorMessage = getErrorMessage();
        String r1 = C0201.m82(2782);
        if (errorMessage != null) {
            promise.reject(errorMessage, r1);
        } else {
            promise.resolve(r1);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        release();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void release() {
        getFingerprintIdentify().a();
        this.mFingerprintIdentify = null;
        this.mReactContext.removeLifecycleEventListener(this);
    }
}
