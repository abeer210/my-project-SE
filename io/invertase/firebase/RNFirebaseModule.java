package io.invertase.firebase;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import defpackage.n12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebaseModule extends ReactContextBaseJavaModule {
    private static final String TAG = null;

    static {
        C0201.m83(RNFirebaseModule.class, 554);
    }

    public RNFirebaseModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private WritableMap getPlayServicesStatusMap() {
        yo0 q = yo0.q();
        int i = q.i(getReactApplicationContext());
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(30043), i);
        String r3 = C0201.m82(30044);
        if (i == 0) {
            createMap.putBoolean(r3, true);
        } else {
            createMap.putBoolean(r3, false);
            createMap.putString(C0201.m82(30045), q.g(i));
            createMap.putBoolean(C0201.m82(30046), q.m(i));
            createMap.putBoolean(C0201.m82(30047), new vo0(i).s());
        }
        return createMap;
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        l12 l = l12.l(str);
        if (l != null) {
            l.f();
        }
        promise.resolve(null);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (l12 l12 : l12.j(getReactApplicationContext())) {
            String m = l12.m();
            n12 n = l12.n();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C0201.m82(30048), m);
            hashMap2.put(C0201.m82(30049), n.b());
            hashMap2.put(C0201.m82(30050), n.c());
            String f = n.f();
            String r6 = C0201.m82(30051);
            hashMap2.put(r6, f);
            hashMap2.put(r6, n.f());
            hashMap2.put(C0201.m82(30052), n.d());
            hashMap2.put(C0201.m82(30053), n.e());
            hashMap2.put(C0201.m82(30054), n.g());
            arrayList.add(hashMap2);
        }
        hashMap.put(C0201.m82(30055), arrayList);
        hashMap.put(C0201.m82(30056), getPlayServicesStatusMap());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(30057);
    }

    @ReactMethod
    public void getPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void initializeApp(String str, ReadableMap readableMap, Callback callback) {
        n12.b bVar = new n12.b();
        bVar.b(readableMap.getString(C0201.m82(30058)));
        bVar.c(readableMap.getString(C0201.m82(30059)));
        bVar.f(readableMap.getString(C0201.m82(30060)));
        bVar.d(readableMap.getString(C0201.m82(30061)));
        bVar.g(readableMap.getString(C0201.m82(30062)));
        bVar.e(readableMap.getString(C0201.m82(30063)));
        l12.s(getReactApplicationContext(), bVar.a(), str);
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(30064), C0201.m82(30065));
        callback.invoke(null, createMap);
    }

    @ReactMethod
    public void makePlayServicesAvailable() {
        Activity currentActivity;
        yo0 q = yo0.q();
        if (q.i(getReactApplicationContext()) != 0 && (currentActivity = getCurrentActivity()) != null) {
            q.r(currentActivity);
        }
    }

    @ReactMethod
    public void promptForPlayServices() {
        yo0 q = yo0.q();
        int i = q.i(getReactApplicationContext());
        if (i != 0 && q.m(i)) {
            getCurrentActivity();
        }
    }

    @ReactMethod
    public void resolutionForPlayServices() {
        Activity currentActivity;
        int i = yo0.q().i(getReactApplicationContext());
        vo0 vo0 = new vo0(i);
        if (!vo0.u() && vo0.s() && (currentActivity = getCurrentActivity()) != null) {
            try {
                vo0.w(currentActivity, i);
            } catch (IntentSender.SendIntentException e) {
                Log.d(C0201.m82(30066), C0201.m82(30067), e);
            }
        }
    }
}
