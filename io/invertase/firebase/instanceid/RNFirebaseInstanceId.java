package io.invertase.firebase.instanceid;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import vigqyno.C0201;

public class RNFirebaseInstanceId extends ReactContextBaseJavaModule {
    private static final String TAG = null;

    static {
        C0201.m83(RNFirebaseInstanceId.class, 344);
    }

    public RNFirebaseInstanceId(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(27953), C0201.m82(27954));
    }

    @ReactMethod
    public void delete(Promise promise) {
        String r0 = C0201.m82(27955);
        try {
            Log.d(r0, C0201.m82(27956));
            FirebaseInstanceId.d().a();
            promise.resolve(null);
        } catch (IOException e) {
            Log.e(r0, e.getMessage());
            promise.reject(C0201.m82(27957), e.getMessage());
        }
    }

    @ReactMethod
    public void deleteToken(String str, String str2, Promise promise) {
        try {
            FirebaseInstanceId.d().b(str, str2);
            String r5 = C0201.m82(27958);
            Log.d(r5, C0201.m82(27959) + str);
            promise.resolve(null);
        } catch (IOException e) {
            promise.reject(C0201.m82(27960), C0201.m82(27961), e);
        }
    }

    @ReactMethod
    public void get(Promise promise) {
        promise.resolve(FirebaseInstanceId.d().c());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(27962);
    }

    @ReactMethod
    public void getToken(String str, String str2, Promise promise) {
        try {
            String e = FirebaseInstanceId.d().e(str, str2);
            String r0 = C0201.m82(27963);
            Log.d(r0, C0201.m82(27964) + str + C0201.m82(27965) + e);
            promise.resolve(e);
        } catch (IOException e2) {
            promise.reject(C0201.m82(27966), C0201.m82(27967), e2);
        }
    }
}
