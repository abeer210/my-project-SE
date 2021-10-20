package io.invertase.firebase.notifications;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.m;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.messaging.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import me.leolin.shortcutbadger.ShortcutBadger;
import vigqyno.C0201;

public class RNFirebaseNotifications extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String BADGE_FILE = null;
    private static final String BADGE_KEY = null;
    private static final String TAG = null;
    private d notificationManager;
    private SharedPreferences sharedPreferences = null;

    private class b extends BroadcastReceiver {
        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (RNFirebaseNotifications.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                Log.d(C0201.m82(5816), C0201.m82(5817));
                io.invertase.firebase.c.k(RNFirebaseNotifications.this.getReactApplicationContext(), C0201.m82(5819), RNFirebaseNotifications.this.parseRemoteMessage((com.google.firebase.messaging.c) intent.getParcelableExtra(C0201.m82(5818))));
            }
        }
    }

    private class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (RNFirebaseNotifications.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                Log.d(C0201.m82(5793), C0201.m82(5794));
                io.invertase.firebase.c.k(RNFirebaseNotifications.this.getReactApplicationContext(), C0201.m82(5796), RNFirebaseNotifications.this.parseNotificationBundle(intent.getBundleExtra(C0201.m82(5795))));
            }
        }
    }

    static {
        C0201.m83(RNFirebaseNotifications.class, 444);
    }

    public RNFirebaseNotifications(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.notificationManager = new d(reactApplicationContext);
        this.sharedPreferences = reactApplicationContext.getSharedPreferences(C0201.m82(19456), 0);
        w4 b2 = w4.b(reactApplicationContext);
        b2.c(new b(), new IntentFilter(C0201.m82(19457)));
        b2.c(new c(), new IntentFilter(C0201.m82(19458)));
    }

    private String getNotificationBody(c.b bVar) {
        String a2 = bVar.a();
        String c2 = bVar.c();
        if (c2 == null) {
            return a2;
        }
        String[] b2 = bVar.b();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return reactApplicationContext.getResources().getString(io.invertase.firebase.c.b(reactApplicationContext, c2), b2);
    }

    private String getNotificationTitle(c.b bVar) {
        String k = bVar.k();
        String m = bVar.m();
        if (m == null) {
            return k;
        }
        String[] l = bVar.l();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return reactApplicationContext.getResources().getString(io.invertase.firebase.c.b(reactApplicationContext, m), l);
    }

    private WritableMap parseIntentForLocalNotification(Intent intent) {
        if (intent.getExtras() == null || !intent.hasExtra(C0201.m82(19459))) {
            return null;
        }
        WritableNativeMap makeNativeMap = Arguments.makeNativeMap(intent.getExtras());
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(19460), intent.getAction());
        createMap.putMap(C0201.m82(19461), makeNativeMap);
        Bundle j = m.j(intent);
        if (j != null) {
            createMap.putMap(C0201.m82(19462), Arguments.makeNativeMap(j));
        }
        return createMap;
    }

    private WritableMap parseIntentForNotification(Intent intent) {
        WritableMap parseIntentForRemoteNotification = parseIntentForRemoteNotification(intent);
        return parseIntentForRemoteNotification == null ? parseIntentForLocalNotification(intent) : parseIntentForRemoteNotification;
    }

    private WritableMap parseIntentForRemoteNotification(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        String r0 = C0201.m82(19463);
        if (!intent.hasExtra(r0)) {
            return null;
        }
        Bundle extras = intent.getExtras();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        for (String str : extras.keySet()) {
            if (str.equals(r0)) {
                createMap.putString(C0201.m82(19464), extras.getString(str));
            } else if (!str.equals(C0201.m82(19465)) && !str.equals(C0201.m82(19466)) && !str.equals(C0201.m82(19467)) && !str.equals(C0201.m82(19468)) && !str.equals(C0201.m82(19469))) {
                createMap2.putString(str, extras.getString(str));
            }
        }
        createMap.putMap(C0201.m82(19470), createMap2);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putString(C0201.m82(19471), intent.getAction());
        createMap3.putMap(C0201.m82(19472), createMap);
        return createMap3;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap parseNotificationBundle(Bundle bundle) {
        return Arguments.makeNativeMap(bundle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap parseRemoteMessage(com.google.firebase.messaging.c cVar) {
        c.b w = cVar.w();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        String notificationBody = getNotificationBody(w);
        if (notificationBody != null) {
            createMap.putString(C0201.m82(19473), notificationBody);
        }
        if (cVar.p() != null) {
            for (Map.Entry<String, String> entry : cVar.p().entrySet()) {
                createMap2.putString(entry.getKey(), entry.getValue());
            }
        }
        createMap.putMap(C0201.m82(19474), createMap2);
        if (cVar.s() != null) {
            createMap.putString(C0201.m82(19475), cVar.s());
        }
        if (w.i() != null) {
            createMap.putString(C0201.m82(19476), w.i());
        }
        String notificationTitle = getNotificationTitle(w);
        if (notificationTitle != null) {
            createMap.putString(C0201.m82(19477), notificationTitle);
        }
        WritableMap createMap3 = Arguments.createMap();
        if (w.e() != null) {
            createMap3.putString(C0201.m82(19478), w.e());
        }
        if (w.f() != null) {
            createMap3.putString(C0201.m82(19479), w.f());
        }
        if (w.g() != null) {
            WritableMap createMap4 = Arguments.createMap();
            createMap4.putString(C0201.m82(19480), w.g());
            createMap3.putMap(C0201.m82(19481), createMap4);
        }
        if (w.h() != null) {
            String uri = w.h().toString();
            WritableMap createMap5 = Arguments.createMap();
            createMap5.putString(C0201.m82(19482), uri);
            String r4 = C0201.m82(19483);
            createMap5.putNull(r4);
            createMap3.putMap(C0201.m82(19484), createMap5);
            createMap3.putString(r4, uri);
        }
        if (w.j() != null) {
            createMap3.putString(C0201.m82(19485), w.j());
            createMap3.putString(C0201.m82(19486), w.j());
        }
        if (w.d() != null) {
            createMap3.putString(C0201.m82(19487), w.d());
        }
        createMap.putMap(C0201.m82(19488), createMap3);
        return createMap;
    }

    @ReactMethod
    public void cancelAllNotifications(Promise promise) {
        this.notificationManager.b(promise);
    }

    @ReactMethod
    public void cancelNotification(String str, Promise promise) {
        this.notificationManager.c(str, promise);
    }

    @ReactMethod
    public void createChannel(ReadableMap readableMap, Promise promise) {
        try {
            this.notificationManager.d(readableMap);
        } catch (Throwable unused) {
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void createChannelGroup(ReadableMap readableMap, Promise promise) {
        try {
            this.notificationManager.e(readableMap);
        } catch (Throwable unused) {
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void createChannelGroups(ReadableArray readableArray, Promise promise) {
        try {
            this.notificationManager.g(readableArray);
        } catch (Throwable unused) {
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void createChannels(ReadableArray readableArray, Promise promise) {
        try {
            this.notificationManager.j(readableArray);
        } catch (Throwable unused) {
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void deleteChannel(String str, Promise promise) {
        try {
            this.notificationManager.l(str);
        } catch (Throwable unused) {
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void deleteChannelGroup(String str, Promise promise) {
        try {
            this.notificationManager.m(str);
            promise.resolve(null);
        } catch (NullPointerException unused) {
            promise.reject(C0201.m82(19489), C0201.m82(19490));
        }
    }

    @ReactMethod
    public void displayNotification(ReadableMap readableMap, Promise promise) {
        this.notificationManager.o(readableMap, promise);
    }

    @ReactMethod
    public void getBadge(Promise promise) {
        int i = this.sharedPreferences.getInt(C0201.m82(19491), 0);
        Log.d(C0201.m82(19493), C0201.m82(19492) + i);
        promise.resolve(Integer.valueOf(i));
    }

    @ReactMethod
    public void getChannel(String str, Promise promise) {
        try {
            promise.resolve(this.notificationManager.q(str));
        } catch (Throwable unused) {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void getChannelGroup(String str, Promise promise) {
        try {
            promise.resolve(this.notificationManager.r(str));
        } catch (Throwable unused) {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void getChannelGroups(Promise promise) {
        try {
            promise.resolve(this.notificationManager.s());
        } catch (Throwable unused) {
            promise.resolve(Collections.emptyList());
        }
    }

    @ReactMethod
    public void getChannels(Promise promise) {
        try {
            promise.resolve(this.notificationManager.t());
        } catch (Throwable unused) {
            promise.resolve(Collections.emptyList());
        }
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        promise.resolve(getCurrentActivity() != null ? parseIntentForNotification(getCurrentActivity().getIntent()) : null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(19494);
    }

    @ReactMethod
    public void getScheduledNotifications(Promise promise) {
        ArrayList<Bundle> w = this.notificationManager.w();
        WritableArray createArray = Arguments.createArray();
        Iterator<Bundle> it = w.iterator();
        while (it.hasNext()) {
            createArray.pushMap(parseNotificationBundle(it.next()));
        }
        promise.resolve(createArray);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        WritableMap parseIntentForNotification = parseIntentForNotification(intent);
        if (parseIntentForNotification != null) {
            io.invertase.firebase.c.k(getReactApplicationContext(), C0201.m82(19495), parseIntentForNotification);
        }
    }

    @ReactMethod
    public void removeAllDeliveredNotifications(Promise promise) {
        this.notificationManager.A(promise);
    }

    @ReactMethod
    public void removeDeliveredNotification(String str, Promise promise) {
        this.notificationManager.B(str, promise);
    }

    @ReactMethod
    public void removeDeliveredNotificationsByTag(String str, Promise promise) {
        this.notificationManager.C(str, promise);
    }

    @ReactMethod
    public void scheduleNotification(ReadableMap readableMap, Promise promise) {
        this.notificationManager.F(readableMap, promise);
    }

    @ReactMethod
    public void setBadge(int i, Promise promise) {
        this.sharedPreferences.edit().putInt(C0201.m82(19496), i).apply();
        String r0 = C0201.m82(19497);
        if (i == 0) {
            Log.d(r0, C0201.m82(19498));
            ShortcutBadger.removeCount(getReactApplicationContext());
        } else {
            Log.d(r0, C0201.m82(19499) + i);
            ShortcutBadger.applyCount(getReactApplicationContext(), i);
        }
        promise.resolve(null);
    }
}
