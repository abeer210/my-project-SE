package com.eddieowens;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.eddieowens.receivers.BoundaryEventBroadcastReceiver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.google.android.gms.location.b;
import com.google.android.gms.location.f;
import com.google.android.gms.location.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

public class RNBoundaryModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String GEOFENCE_DATA_TO_EMIT = null;
    public static final String ON_ENTER = null;
    public static final String ON_EXIT = null;
    public static final String TAG = null;
    private PendingIntent mBoundaryPendingIntent;
    private com.google.android.gms.location.d mGeofencingClient = i.b(getReactApplicationContext());

    class a implements vs1 {
        public final /* synthetic */ Promise a;

        public a(RNBoundaryModule rNBoundaryModule, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.i(C0201.m82(28262), C0201.m82(28263));
            this.a.reject(exc);
        }
    }

    class b implements ws1<Void> {
        public final /* synthetic */ Promise a;

        public b(RNBoundaryModule rNBoundaryModule, Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(Void r2) {
            Log.i(C0201.m82(28536), C0201.m82(28537));
            this.a.resolve(null);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements vs1 {
        public final /* synthetic */ Promise a;

        public c(RNBoundaryModule rNBoundaryModule, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            this.a.reject(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements ws1<Void> {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ WritableArray b;

        public d(RNBoundaryModule rNBoundaryModule, Promise promise, WritableArray writableArray) {
            this.a = promise;
            this.b = writableArray;
        }

        /* renamed from: a */
        public void onSuccess(Void r2) {
            this.a.resolve(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements vs1 {
        public final /* synthetic */ Promise a;

        public e(RNBoundaryModule rNBoundaryModule, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.i(C0201.m82(28589), C0201.m82(28590));
            this.a.reject(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements ws1<Void> {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ String b;

        public f(RNBoundaryModule rNBoundaryModule, Promise promise, String str) {
            this.a = promise;
            this.b = str;
        }

        /* renamed from: a */
        public void onSuccess(Void r2) {
            Log.i(C0201.m82(28788), C0201.m82(28789));
            this.a.resolve(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements vs1 {
        public final /* synthetic */ Promise a;

        public g(RNBoundaryModule rNBoundaryModule, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.vs1
        public void onFailure(Exception exc) {
            Log.i(C0201.m82(28716), C0201.m82(28717));
            this.a.reject(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements ws1<Void> {
        public final /* synthetic */ Promise a;

        public h(RNBoundaryModule rNBoundaryModule, Promise promise) {
            this.a = promise;
        }

        /* renamed from: a */
        public void onSuccess(Void r2) {
            Log.i(C0201.m82(28939), C0201.m82(28940));
            this.a.resolve(null);
        }
    }

    static {
        C0201.m83(RNBoundaryModule.class, 368);
    }

    public RNBoundaryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    private void addGeofence(Promise promise, com.google.android.gms.location.f fVar, WritableArray writableArray) {
        int a2 = androidx.core.content.b.a(getReactApplicationContext(), C0201.m82(10434));
        if (a2 != 0) {
            a2 = requestPermissions();
        }
        if (a2 != 0) {
            promise.reject(C0201.m82(10435), C0201.m82(10436));
            return;
        }
        zs1<Void> t = this.mGeofencingClient.t(fVar, getBoundaryPendingIntent());
        t.f(new d(this, promise, writableArray));
        t.d(new c(this, promise));
    }

    private com.google.android.gms.location.b createGeofence(ReadableMap readableMap) {
        b.a aVar = new b.a();
        aVar.d(readableMap.getString(C0201.m82(10442)));
        aVar.b(readableMap.getDouble(C0201.m82(10443)), readableMap.getDouble(C0201.m82(10444)), (float) readableMap.getDouble(C0201.m82(10445)));
        aVar.e(3);
        aVar.c(-1);
        return aVar.a();
    }

    private com.google.android.gms.location.f createGeofenceRequest(List<com.google.android.gms.location.b> list) {
        f.a aVar = new f.a();
        aVar.d(1);
        aVar.b(list);
        return aVar.c();
    }

    private List<com.google.android.gms.location.b> createGeofences(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(createGeofence(readableArray.getMap(i)));
        }
        return arrayList;
    }

    private PendingIntent getBoundaryPendingIntent() {
        PendingIntent pendingIntent = this.mBoundaryPendingIntent;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(getReactApplicationContext(), 0, new Intent(getReactApplicationContext(), BoundaryEventBroadcastReceiver.class), 134217728);
        this.mBoundaryPendingIntent = broadcast;
        return broadcast;
    }

    private void removeGeofence(Promise promise, List<String> list) {
        Log.i(C0201.m82(10446), C0201.m82(10447));
        zs1<Void> v = this.mGeofencingClient.v(list);
        v.f(new h(this, promise));
        v.d(new g(this, promise));
    }

    private int requestPermissions() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        String r1 = C0201.m82(10448);
        androidx.core.app.a.o(currentActivity, new String[]{r1, C0201.m82(10449)}, 1);
        return androidx.core.content.b.a(getReactApplicationContext(), r1);
    }

    @ReactMethod
    public void add(ReadableMap readableMap, Promise promise) {
        com.google.android.gms.location.f createGeofenceRequest = createGeofenceRequest(createGeofence(readableMap));
        addGeofence(promise, createGeofenceRequest, createGeofenceRequest.o().get(0).a());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(10450);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void remove(String str, Promise promise) {
        removeGeofence(promise, Collections.singletonList(str));
    }

    @ReactMethod
    public void removeAll(Promise promise) {
        zs1<Void> u = this.mGeofencingClient.u(getBoundaryPendingIntent());
        u.f(new b(this, promise));
        u.d(new a(this, promise));
    }

    @ReactMethod
    public void remove(ReadableArray readableArray, Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(readableArray.getString(i));
        }
        removeGeofence(promise, arrayList);
    }

    @ReactMethod
    public void add(ReadableArray readableArray, Promise promise) {
        List<com.google.android.gms.location.b> createGeofences = createGeofences(readableArray);
        WritableArray createArray = Arguments.createArray();
        for (com.google.android.gms.location.b bVar : createGeofences) {
            createArray.pushString(bVar.a());
        }
        addGeofence(promise, createGeofenceRequest(createGeofences(readableArray)), createArray);
    }

    private com.google.android.gms.location.f createGeofenceRequest(com.google.android.gms.location.b bVar) {
        f.a aVar = new f.a();
        aVar.a(bVar);
        aVar.d(1);
        return aVar.c();
    }

    private void addGeofence(Promise promise, com.google.android.gms.location.f fVar, String str) {
        int a2 = androidx.core.content.b.a(getReactApplicationContext(), C0201.m82(10437));
        if (a2 != 0) {
            a2 = requestPermissions();
        }
        if (a2 != 0) {
            promise.reject(C0201.m82(10438), C0201.m82(10439));
            return;
        }
        Log.i(C0201.m82(10440), C0201.m82(10441));
        zs1<Void> t = this.mGeofencingClient.t(fVar, getBoundaryPendingIntent());
        t.f(new f(this, promise, str));
        t.d(new e(this, promise));
    }
}
