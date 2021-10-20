package io.expo.appearance;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class RNCAppearanceModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String REACT_CLASS = null;
    private BroadcastReceiver mBroadcastReceiver = null;

    class a extends BroadcastReceiver {
        public final /* synthetic */ ReactApplicationContext a;

        public a(ReactApplicationContext reactApplicationContext) {
            this.a = reactApplicationContext;
        }

        public void onReceive(Context context, Intent intent) {
            Configuration configuration = (Configuration) intent.getParcelableExtra(C0201.m82(1458));
            RNCAppearanceModule rNCAppearanceModule = RNCAppearanceModule.this;
            rNCAppearanceModule.sendEvent(this.a, C0201.m82(1459), rNCAppearanceModule.getPreferences());
        }
    }

    static {
        C0201.m83(RNCAppearanceModule.class, 394);
    }

    public RNCAppearanceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (Build.VERSION.SDK_INT > 28) {
            this.mBroadcastReceiver = new a(reactApplicationContext);
            reactApplicationContext.addLifecycleEventListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap getPreferences() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(21391), getColorScheme(getReactApplicationContext().getResources().getConfiguration()));
        return createMap;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        if (reactContext.hasActiveCatalystInstance()) {
            f60.n(C0201.m82(21393), str + C0201.m82(21392) + writableMap.toString());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    private void updateAndSendAppearancePreferences() {
        sendEvent(C0201.m82(21396), getPreferences());
    }

    public String getColorScheme(Configuration configuration) {
        if (Build.VERSION.SDK_INT > 28) {
            int i = configuration.uiMode & 48;
            if (i == 0 || i == 16) {
                return C0201.m82(21398);
            }
            if (i == 32) {
                return C0201.m82(21397);
            }
        }
        return C0201.m82(21399);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(21400), getPreferences());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(21401);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            try {
                currentActivity.unregisterReceiver(this.mBroadcastReceiver);
            } catch (IllegalArgumentException e) {
                f60.j(C0201.m82(21402), C0201.m82(21403), e);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            f60.i(C0201.m82(21404), C0201.m82(21405));
            return;
        }
        currentActivity.registerReceiver(this.mBroadcastReceiver, new IntentFilter(C0201.m82(21406)));
        updateAndSendAppearancePreferences();
    }

    private void sendEvent(String str, WritableMap writableMap) {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            f60.n(C0201.m82(21395), str + C0201.m82(21394) + writableMap.toString());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }
}
