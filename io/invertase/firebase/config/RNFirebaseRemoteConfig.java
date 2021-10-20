package io.invertase.firebase.config;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import io.invertase.firebase.c;
import java.util.Iterator;
import java.util.Set;
import vigqyno.C0201;

public class RNFirebaseRemoteConfig extends ReactContextBaseJavaModule {
    private static final String BOOL_VALUE = null;
    private static final String DATA_VALUE = null;
    private static final String NUMBER_VALUE = null;
    private static final String SOURCE = null;
    private static final String STRING_VALUE = null;
    private static final String TAG = null;

    /* access modifiers changed from: package-private */
    public class a implements us1<Void> {
        public final /* synthetic */ Promise a;

        public a(RNFirebaseRemoteConfig rNFirebaseRemoteConfig, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            if (zs1.p()) {
                this.a.resolve(null);
            } else if (zs1.k() instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.a.reject(C0201.m82(5956), C0201.m82(5957), zs1.k());
            } else {
                this.a.reject(C0201.m82(5958), C0201.m82(5959), zs1.k());
            }
        }
    }

    static {
        C0201.m83(RNFirebaseRemoteConfig.class, 454);
    }

    public RNFirebaseRemoteConfig(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(27464), C0201.m82(27465));
    }

    private WritableMap convertRemoteConfigValue(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        String r0 = C0201.m82(27466);
        String r1 = C0201.m82(27467);
        String r2 = C0201.m82(27468);
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(27469), firebaseRemoteConfigValue.asString());
        try {
            createMap.putString(r2, new String(firebaseRemoteConfigValue.asByteArray()));
        } catch (Exception unused) {
            createMap.putNull(r2);
        }
        try {
            createMap.putBoolean(r1, Boolean.valueOf(firebaseRemoteConfigValue.asBoolean()).booleanValue());
        } catch (Exception unused2) {
            createMap.putNull(r1);
        }
        try {
            createMap.putDouble(r0, Double.valueOf(firebaseRemoteConfigValue.asDouble()).doubleValue());
        } catch (Exception unused3) {
            createMap.putNull(r0);
        }
        int source = firebaseRemoteConfigValue.getSource();
        String r12 = C0201.m82(27470);
        if (source == 1) {
            createMap.putString(r12, C0201.m82(27473));
        } else if (source != 2) {
            createMap.putString(r12, C0201.m82(27471));
        } else {
            createMap.putString(r12, C0201.m82(27472));
        }
        return createMap;
    }

    private void fetchInternal(Promise promise, Boolean bool, long j) {
        FirebaseRemoteConfig instance = FirebaseRemoteConfig.getInstance();
        if (!bool.booleanValue()) {
            j = 43200;
        }
        instance.fetch(j).b(new a(this, promise));
    }

    @ReactMethod
    public void activateFetched(Promise promise) {
        promise.resolve(Boolean.valueOf(FirebaseRemoteConfig.getInstance().activateFetched()));
    }

    @ReactMethod
    public void enableDeveloperMode() {
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        builder.setDeveloperModeEnabled(true);
        FirebaseRemoteConfig.getInstance().setConfigSettings(builder.build());
    }

    @ReactMethod
    public void fetch(Promise promise) {
        fetchInternal(promise, Boolean.FALSE, 0);
    }

    @ReactMethod
    public void fetchWithExpirationDuration(double d, Promise promise) {
        fetchInternal(promise, Boolean.TRUE, (long) d);
    }

    @ReactMethod
    public void getKeysByPrefix(String str, Promise promise) {
        Set<String> keysByPrefix = FirebaseRemoteConfig.getInstance().getKeysByPrefix(str);
        WritableArray createArray = Arguments.createArray();
        for (String str2 : keysByPrefix) {
            createArray.pushString(str2);
        }
        promise.resolve(createArray);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(27474);
    }

    @ReactMethod
    public void getValue(String str, Promise promise) {
        promise.resolve(convertRemoteConfigValue(FirebaseRemoteConfig.getInstance().getValue(str)));
    }

    @ReactMethod
    public void getValues(ReadableArray readableArray, Promise promise) {
        WritableArray createArray = Arguments.createArray();
        Iterator<Object> it = c.i(readableArray).iterator();
        while (it.hasNext()) {
            createArray.pushMap(convertRemoteConfigValue(FirebaseRemoteConfig.getInstance().getValue((String) it.next())));
        }
        promise.resolve(createArray);
    }

    @ReactMethod
    public void setDefaults(ReadableMap readableMap) {
        FirebaseRemoteConfig.getInstance().setDefaults(c.j(readableMap));
    }

    @ReactMethod
    public void setDefaultsFromResource(int i) {
        FirebaseRemoteConfig.getInstance().setDefaults(i);
    }
}
