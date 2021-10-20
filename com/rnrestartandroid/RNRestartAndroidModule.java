package com.rnrestartandroid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import vigqyno.C0201;

public class RNRestartAndroidModule extends ReactContextBaseJavaModule {
    private ReactContext mContext;

    public RNRestartAndroidModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    private void _restart() {
        ((AlarmManager) this.mContext.getSystemService(C0201.m82(18061))).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(this.mContext, 123456, this.mContext.getPackageManager().getLaunchIntentForPackage(this.mContext.getPackageName()), 268435456));
        System.exit(0);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(18062);
    }

    @ReactMethod
    public void restart() {
        _restart();
    }
}
