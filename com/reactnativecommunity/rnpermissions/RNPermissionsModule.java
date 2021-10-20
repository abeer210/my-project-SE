package com.reactnativecommunity.rnpermissions;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.core.app.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RNPermissions")
public class RNPermissionsModule extends ReactContextBaseJavaModule {
    private static final String ERROR_INVALID_ACTIVITY = null;
    public static final String MODULE_NAME = null;
    private static final String[][] PERMISSIONS = {new String[]{C0201.m82(10043), C0201.m82(10044)}, new String[]{C0201.m82(10045), C0201.m82(10046)}, new String[]{C0201.m82(10047), C0201.m82(10048)}, new String[]{C0201.m82(10049), C0201.m82(10050)}, new String[]{C0201.m82(10051), C0201.m82(10052)}, new String[]{C0201.m82(10053), C0201.m82(10054)}, new String[]{C0201.m82(10055), C0201.m82(10056)}, new String[]{C0201.m82(10057), C0201.m82(10058)}, new String[]{C0201.m82(10059), C0201.m82(10060)}, new String[]{C0201.m82(10061), C0201.m82(10062)}, new String[]{C0201.m82(10063), C0201.m82(10064)}, new String[]{C0201.m82(10065), C0201.m82(10066)}, new String[]{C0201.m82(10067), C0201.m82(10068)}, new String[]{C0201.m82(10069), C0201.m82(10070)}, new String[]{C0201.m82(10071), C0201.m82(10072)}, new String[]{C0201.m82(10073), C0201.m82(10074)}, new String[]{C0201.m82(10075), C0201.m82(10076)}, new String[]{C0201.m82(10077), C0201.m82(10078)}, new String[]{C0201.m82(10079), C0201.m82(10080)}, new String[]{C0201.m82(10081), C0201.m82(10082)}, new String[]{C0201.m82(10083), C0201.m82(10084)}, new String[]{C0201.m82(10085), C0201.m82(10086)}, new String[]{C0201.m82(10087), C0201.m82(10088)}, new String[]{C0201.m82(10089), C0201.m82(10090)}, new String[]{C0201.m82(10091), C0201.m82(10092)}, new String[]{C0201.m82(10093), C0201.m82(10094)}, new String[]{C0201.m82(10095), C0201.m82(10096)}, new String[]{C0201.m82(10097), C0201.m82(10098)}, new String[]{C0201.m82(10099), C0201.m82(10100)}};
    private static final String SETTING_NAME = null;
    private final SharedPreferences sharedPrefs;

    static {
        C0201.m83(RNPermissionsModule.class, 406);
    }

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sharedPrefs = reactApplicationContext.getSharedPreferences(C0201.m82(10101), 0);
    }

    private boolean fieldExists(String str) {
        try {
            Manifest.permission.class.getField(str);
            return true;
        } catch (NoSuchFieldException unused) {
            return false;
        }
    }

    @ReactMethod
    public void checkNotifications(Promise promise) {
        boolean a = l.b(getReactApplicationContext()).a();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        String r3 = C0201.m82(10102);
        if (a) {
            createMap.putString(r3, C0201.m82(10103));
        } else {
            createMap.putString(r3, C0201.m82(10104));
        }
        createMap.putMap(C0201.m82(10105), createMap2);
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        WritableArray createArray = Arguments.createArray();
        String[][] strArr = PERMISSIONS;
        for (String[] strArr2 : strArr) {
            if (fieldExists(strArr2[0])) {
                createArray.pushString(strArr2[1]);
            }
        }
        hashMap.put(C0201.m82(10106), createArray);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(10107);
    }

    @ReactMethod
    public void getNonRequestables(Promise promise) {
        WritableArray createArray = Arguments.createArray();
        for (Map.Entry<String, ?> entry : this.sharedPrefs.getAll().entrySet()) {
            createArray.pushString(entry.getKey());
        }
        promise.resolve(createArray);
    }

    @ReactMethod
    public void isNonRequestable(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(this.sharedPrefs.getBoolean(str, false)));
    }

    @ReactMethod
    public void openSettings(Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intent intent = new Intent();
            String packageName = reactApplicationContext.getPackageName();
            intent.setAction(C0201.m82(10108));
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts(C0201.m82(10109), packageName, null));
            reactApplicationContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(C0201.m82(10110), e);
        }
    }

    @ReactMethod
    public void setNonRequestable(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(this.sharedPrefs.edit().putBoolean(str, true).commit()));
    }

    @ReactMethod
    public void setNonRequestables(ReadableArray readableArray, Promise promise) {
        SharedPreferences.Editor edit = this.sharedPrefs.edit();
        for (int i = 0; i < readableArray.size(); i++) {
            edit.putBoolean(readableArray.getString(i), true);
        }
        promise.resolve(Boolean.valueOf(edit.commit()));
    }
}
