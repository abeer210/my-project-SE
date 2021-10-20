package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import vigqyno.C0201;

@pj0(name = "AccessibilityInfo")
public class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    public static final String NAME = null;
    private static final String REDUCE_MOTION_EVENT_NAME = null;
    private static final String TOUCH_EXPLORATION_EVENT_NAME = null;
    private final ContentObserver animationScaleObserver = new a(new Handler(Looper.getMainLooper()));
    private AccessibilityManager mAccessibilityManager;
    private final ContentResolver mContentResolver;
    private boolean mReduceMotionEnabled = false;
    private boolean mTouchExplorationEnabled = false;
    private b mTouchExplorationStateChangeListener;

    class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            onChange(z, null);
        }

        public void onChange(boolean z, Uri uri) {
            if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
            }
        }
    }

    @TargetApi(19)
    private class b implements AccessibilityManager.TouchExplorationStateChangeListener {
        private b() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z);
        }

        public /* synthetic */ b(AccessibilityInfoModule accessibilityInfoModule, a aVar) {
            this();
        }
    }

    static {
        C0201.m83(AccessibilityInfoModule.class, 632);
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAccessibilityManager = (AccessibilityManager) reactApplicationContext.getApplicationContext().getSystemService(C0201.m82(28281));
        this.mContentResolver = getReactApplicationContext().getContentResolver();
        this.mTouchExplorationEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
        this.mReduceMotionEnabled = getIsReduceMotionEnabledValue();
        if (Build.VERSION.SDK_INT >= 19) {
            this.mTouchExplorationStateChangeListener = new b(this, null);
        }
    }

    private boolean getIsReduceMotionEnabledValue() {
        String str;
        if (Build.VERSION.SDK_INT < 17) {
            str = null;
        } else {
            str = Settings.Global.getString(this.mContentResolver, C0201.m82(28282));
        }
        return str != null && str.equals(C0201.m82(28283));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void updateAndSendReduceMotionChangeEvent() {
        boolean isReduceMotionEnabledValue = getIsReduceMotionEnabledValue();
        if (this.mReduceMotionEnabled != isReduceMotionEnabledValue) {
            this.mReduceMotionEnabled = isReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(28284), Boolean.valueOf(this.mReduceMotionEnabled));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void updateAndSendTouchExplorationChangeEvent(boolean z) {
        if (this.mTouchExplorationEnabled != z) {
            this.mTouchExplorationEnabled = z;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(28285), Boolean.valueOf(this.mTouchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String str) {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            obtain.setClassName(AccessibilityInfoModule.class.getName());
            obtain.setPackageName(getReactApplicationContext().getPackageName());
            this.mAccessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(28286);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mReduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mTouchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.mContentResolver.unregisterContentObserver(this.animationScaleObserver);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.mContentResolver.registerContentObserver(Settings.Global.getUriFor(C0201.m82(28287)), false, this.animationScaleObserver);
        }
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double d) {
    }
}
