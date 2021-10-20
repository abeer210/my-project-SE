package com.avishayil.rnrestart;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import vigqyno.C0201;

public class ReactNativeRestart extends ReactContextBaseJavaModule {
    private static final String REACT_APPLICATION_CLASS_NAME = null;
    private static final String REACT_NATIVE_HOST_CLASS_NAME = null;
    private static a mReactInstanceHolder;
    private LifecycleEventListener mLifecycleEventListener = null;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(ReactNativeRestart reactNativeRestart, Activity activity) {
            this.a = activity;
        }

        public void run() {
            this.a.recreate();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        public final /* synthetic */ si0 a;

        public b(si0 si0) {
            this.a = si0;
        }

        public void run() {
            try {
                this.a.S();
            } catch (Exception unused) {
                ReactNativeRestart.this.loadBundleLegacy();
            }
        }
    }

    static {
        C0201.m83(ReactNativeRestart.class, 438);
    }

    public ReactNativeRestart(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void clearLifecycleEventListener() {
        if (this.mLifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mLifecycleEventListener);
            this.mLifecycleEventListener = null;
        }
    }

    public static si0 getReactInstanceManager() {
        a aVar = mReactInstanceHolder;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    private void loadBundle() {
        clearLifecycleEventListener();
        try {
            si0 resolveInstanceManager = resolveInstanceManager();
            if (resolveInstanceManager != null) {
                new Handler(Looper.getMainLooper()).post(new b(resolveInstanceManager));
            }
        } catch (Exception unused) {
            loadBundleLegacy();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void loadBundleLegacy() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new a(this, currentActivity));
        }
    }

    private si0 resolveInstanceManager() throws NoSuchFieldException, IllegalAccessException {
        si0 reactInstanceManager = getReactInstanceManager();
        if (reactInstanceManager != null) {
            return reactInstanceManager;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return ((qi0) currentActivity.getApplication()).a().j();
    }

    @ReactMethod
    public void Restart() {
        loadBundle();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(28588);
    }
}
