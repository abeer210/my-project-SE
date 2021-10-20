package com.ocetnik.timer;

import android.os.Handler;
import android.os.PowerManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import vigqyno.C0201;

public class BackgroundTimerModule extends ReactContextBaseJavaModule {
    private Handler handler;
    private final LifecycleEventListener listener = new a();
    private PowerManager powerManager;
    private ReactContext reactContext;
    private Runnable runnable;
    private PowerManager.WakeLock wakeLock;

    class a implements LifecycleEventListener {
        public a() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            if (BackgroundTimerModule.this.wakeLock.isHeld()) {
                BackgroundTimerModule.this.wakeLock.release();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            BackgroundTimerModule backgroundTimerModule = BackgroundTimerModule.this;
            backgroundTimerModule.sendEvent(backgroundTimerModule.reactContext, C0201.m82(4339));
        }
    }

    class c implements Runnable {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        public void run() {
            if (BackgroundTimerModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) BackgroundTimerModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(4319), Integer.valueOf(this.a));
            }
        }
    }

    public BackgroundTimerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        PowerManager powerManager2 = (PowerManager) getReactApplicationContext().getSystemService(C0201.m82(7401));
        this.powerManager = powerManager2;
        this.wakeLock = powerManager2.newWakeLock(1, C0201.m82(7402));
        reactApplicationContext.addLifecycleEventListener(this.listener);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendEvent(ReactContext reactContext2, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(7403);
    }

    @ReactMethod
    public void setTimeout(int i, double d) {
        new Handler().postDelayed(new c(i), (long) d);
    }

    @ReactMethod
    public void start(int i) {
        if (!this.wakeLock.isHeld()) {
            this.wakeLock.acquire();
        }
        this.handler = new Handler();
        b bVar = new b();
        this.runnable = bVar;
        this.handler.post(bVar);
    }

    @ReactMethod
    public void stop() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.runnable);
        }
    }
}
