package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import vigqyno.C0201;

@pj0(name = "Timing")
public final class TimingModule extends NativeTimingSpec implements LifecycleEventListener, mj0 {
    public static final String NAME = null;
    private final d mJavaTimerManager;

    public class a implements c {
        public a() {
        }

        @Override // com.facebook.react.modules.core.c
        public void callIdleCallbacks(double d) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void callTimers(WritableArray writableArray) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void emitTimeDriftWarning(String str) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
            }
        }
    }

    static {
        C0201.m83(TimingModule.class, 557);
    }

    public TimingModule(ReactApplicationContext reactApplicationContext, gj0 gj0) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new d(reactApplicationContext, new a(), g.i(), gj0);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d, double d2, double d3, boolean z) {
        this.mJavaTimerManager.q((int) d, (int) d2, d3, z);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d) {
        this.mJavaTimerManager.deleteTimer((int) d);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(24943);
    }

    public boolean hasActiveTimersInRange(long j) {
        return this.mJavaTimerManager.r(j);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        lj0.d(getReactApplicationContext()).b(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        lj0.d(getReactApplicationContext()).g(this);
        this.mJavaTimerManager.A();
    }

    @Override // defpackage.mj0
    public void onHeadlessJsTaskFinish(int i) {
        this.mJavaTimerManager.v(i);
    }

    @Override // defpackage.mj0
    public void onHeadlessJsTaskStart(int i) {
        this.mJavaTimerManager.w(i);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mJavaTimerManager.x();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mJavaTimerManager.y();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mJavaTimerManager.z();
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z) {
        this.mJavaTimerManager.setSendIdleEvents(z);
    }
}
