package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.app.l;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.c;
import java.io.IOException;
import vigqyno.C0201;

public class RNFirebaseMessaging extends ReactContextBaseJavaModule {
    private static final String TAG = null;

    class a implements us1<Void> {
        public final /* synthetic */ Promise a;

        public a(RNFirebaseMessaging rNFirebaseMessaging, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(4880);
            if (p) {
                Log.d(r1, C0201.m82(4881));
                this.a.resolve(null);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(4882), k);
            this.a.reject(k);
        }
    }

    class b implements us1<Void> {
        public final /* synthetic */ Promise a;

        public b(RNFirebaseMessaging rNFirebaseMessaging, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(4832);
            if (p) {
                Log.d(r1, C0201.m82(4833));
                this.a.resolve(null);
                return;
            }
            Exception k = zs1.k();
            Log.e(r1, C0201.m82(4834), k);
            this.a.reject(k);
        }
    }

    private class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (RNFirebaseMessaging.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                Log.d(C0201.m82(4868), C0201.m82(4869));
                io.invertase.firebase.c.k(RNFirebaseMessaging.this.getReactApplicationContext(), C0201.m82(4871), b.a((com.google.firebase.messaging.c) intent.getParcelableExtra(C0201.m82(4870))));
            }
        }

        public /* synthetic */ c(RNFirebaseMessaging rNFirebaseMessaging, a aVar) {
            this();
        }
    }

    private class d extends BroadcastReceiver {

        class a implements Runnable {
            public a() {
            }

            public void run() {
                String str;
                String r0 = C0201.m82(17178);
                try {
                    str = FirebaseInstanceId.d().e(l12.k().n().e(), C0201.m82(17179));
                } catch (IOException e) {
                    Log.d(r0, C0201.m82(17180), e);
                    str = null;
                }
                if (str != null) {
                    Log.d(r0, C0201.m82(17181));
                    io.invertase.firebase.c.k(RNFirebaseMessaging.this.getReactApplicationContext(), C0201.m82(17182), str);
                }
            }
        }

        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (RNFirebaseMessaging.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                Log.d(C0201.m82(4612), C0201.m82(4613));
                new Thread(new a()).start();
            }
        }

        public /* synthetic */ d(RNFirebaseMessaging rNFirebaseMessaging, a aVar) {
            this();
        }
    }

    static {
        C0201.m83(RNFirebaseMessaging.class, 664);
    }

    public RNFirebaseMessaging(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        w4 b2 = w4.b(reactApplicationContext);
        b2.c(new c(this, null), new IntentFilter(C0201.m82(36569)));
        b2.c(new d(this, null), new IntentFilter(C0201.m82(36570)));
    }

    @ReactMethod
    public void deleteToken(Promise promise) {
        try {
            FirebaseInstanceId.d().b(l12.k().n().e(), C0201.m82(36571));
            promise.resolve(null);
        } catch (Throwable th) {
            th.printStackTrace();
            promise.reject(C0201.m82(36572), th.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(36573);
    }

    @ReactMethod
    public void getToken(Promise promise) {
        try {
            promise.resolve(FirebaseInstanceId.d().e(l12.k().n().e(), C0201.m82(36574)));
        } catch (Throwable th) {
            th.printStackTrace();
            promise.reject(C0201.m82(36575), th.getMessage());
        }
    }

    @ReactMethod
    public void hasPermission(Promise promise) {
        promise.resolve(Boolean.valueOf(l.b(getReactApplicationContext()).a()));
    }

    @ReactMethod
    public void requestPermission(Promise promise) {
        promise.resolve(null);
    }

    @ReactMethod
    public void sendMessage(ReadableMap readableMap, Promise promise) {
        String r0 = C0201.m82(36576);
        if (!readableMap.hasKey(r0)) {
            promise.reject(C0201.m82(36577), C0201.m82(36578));
            return;
        }
        c.a aVar = new c.a(readableMap.getString(r0));
        String r02 = C0201.m82(36579);
        if (readableMap.hasKey(r02)) {
            aVar.c(readableMap.getString(r02));
        }
        String r03 = C0201.m82(36580);
        if (readableMap.hasKey(r03)) {
            aVar.d(readableMap.getString(r03));
        }
        String r04 = C0201.m82(36581);
        if (readableMap.hasKey(r04)) {
            aVar.e(readableMap.getString(r04));
        }
        String r05 = C0201.m82(36582);
        if (readableMap.hasKey(r05)) {
            aVar.f(readableMap.getInt(r05));
        }
        String r06 = C0201.m82(36583);
        if (readableMap.hasKey(r06)) {
            ReadableMap map = readableMap.getMap(r06);
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                aVar.a(nextKey, map.getString(nextKey));
            }
        }
        com.google.firebase.messaging.a.a().b(aVar.b());
        promise.resolve(null);
    }

    @ReactMethod
    public void subscribeToTopic(String str, Promise promise) {
        com.google.firebase.messaging.a.a().c(str).b(new a(this, promise));
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, Promise promise) {
        com.google.firebase.messaging.a.a().d(str).b(new b(this, promise));
    }
}
