package io.invertase.firebase.fabric.crashlytics;

import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.util.ArrayList;
import vigqyno.C0201;

public class RNFirebaseCrashlytics extends ReactContextBaseJavaModule {
    private static final String TAG = null;

    static {
        C0201.m83(RNFirebaseCrashlytics.class, 686);
    }

    public RNFirebaseCrashlytics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(12762), C0201.m82(12763));
    }

    @ReactMethod
    public void crash() {
        Crashlytics.getInstance().crash();
    }

    @ReactMethod
    public void enableCrashlyticsCollection() {
        Fabric.with(getReactApplicationContext(), new Kit[]{new Crashlytics()});
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(12764);
    }

    @ReactMethod
    public void log(String str) {
        Crashlytics.log(str);
    }

    @ReactMethod
    public void recordCustomError(String str, String str2, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(0);
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String r3 = C0201.m82(12765);
            ReadableMap map2 = map.hasKey(r3) ? map.getMap(r3) : null;
            String r4 = C0201.m82(12766);
            String string = map.hasKey(r4) ? map.getString(r4) : C0201.m82(12767);
            String r5 = C0201.m82(12768);
            String string2 = map.hasKey(r5) ? map.getString(r5) : C0201.m82(12769);
            String r7 = C0201.m82(12770);
            String string3 = map.getString(r7);
            String r9 = C0201.m82(12771);
            int i2 = -1;
            arrayList.add(new StackTraceElement(string2, string, string3, map.hasKey(r9) ? map.getInt(r9) : -1));
            if (map2 != null) {
                String obj = map2.toString();
                String string4 = map.getString(r7);
                if (map.hasKey(r9)) {
                    i2 = map.getInt(r9);
                }
                arrayList.add(new StackTraceElement(C0201.m82(12772), obj, string4, i2));
            }
        }
        Exception exc = new Exception(str + C0201.m82(12773) + str2);
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
        Crashlytics.logException(exc);
    }

    @ReactMethod
    public void recordError(int i, String str) {
        Crashlytics.logException(new Exception(i + C0201.m82(12774) + str));
    }

    @ReactMethod
    public void setBoolValue(String str, boolean z) {
        Crashlytics.setBool(str, z);
    }

    @ReactMethod
    public void setFloatValue(String str, float f) {
        Crashlytics.setFloat(str, f);
    }

    @ReactMethod
    public void setIntValue(String str, int i) {
        Crashlytics.setInt(str, i);
    }

    @ReactMethod
    public void setStringValue(String str, String str2) {
        Crashlytics.setString(str, str2);
    }

    @ReactMethod
    public void setUserEmail(String str) {
        Crashlytics.setUserEmail(str);
    }

    @ReactMethod
    public void setUserIdentifier(String str) {
        Crashlytics.setUserIdentifier(str);
    }

    @ReactMethod
    public void setUserName(String str) {
        Crashlytics.setUserName(str);
    }
}
