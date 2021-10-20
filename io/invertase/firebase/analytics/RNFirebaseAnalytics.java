package io.invertase.firebase.analytics;

import android.app.Activity;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import vigqyno.C0201;

public class RNFirebaseAnalytics extends ReactContextBaseJavaModule {
    private static final String TAG = null;

    class a implements Runnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(Activity activity, String str, String str2) {
            this.a = activity;
            this.b = str;
            this.c = str2;
        }

        public void run() {
            FirebaseAnalytics.getInstance(RNFirebaseAnalytics.this.getReactApplicationContext()).setCurrentScreen(this.a, this.b, this.c);
        }
    }

    static {
        C0201.m83(RNFirebaseAnalytics.class, 730);
    }

    public RNFirebaseAnalytics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(1091), C0201.m82(1092));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(1093);
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap) {
        FirebaseAnalytics.getInstance(getReactApplicationContext()).a(str, Arguments.toBundle(readableMap));
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool) {
        FirebaseAnalytics.getInstance(getReactApplicationContext()).b(bool.booleanValue());
    }

    @ReactMethod
    public void setCurrentScreen(String str, String str2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Log.d(C0201.m82(1096), C0201.m82(1094) + str + C0201.m82(1095) + str2);
            currentActivity.runOnUiThread(new a(currentActivity, str, str2));
        }
    }

    @ReactMethod
    public void setMinimumSessionDuration(double d) {
        FirebaseAnalytics.getInstance(getReactApplicationContext()).c((long) d);
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d) {
        FirebaseAnalytics.getInstance(getReactApplicationContext()).d((long) d);
    }

    @ReactMethod
    public void setUserId(String str) {
        FirebaseAnalytics.getInstance(getReactApplicationContext()).e(str);
    }

    @ReactMethod
    public void setUserProperty(String str, String str2) {
        FirebaseAnalytics.getInstance(getReactApplicationContext()).f(str, str2);
    }
}
