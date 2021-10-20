package com.agontuk.RNFusedLocation;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.h;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.google.android.gms.location.j;
import com.google.android.gms.location.k;
import com.google.android.gms.location.p;
import vigqyno.C0201;

public class RNFusedLocationModule extends ReactContextBaseJavaModule {
    private static final int DEFAULT_ACCURACY = 0;
    private static final float DEFAULT_DISTANCE_FILTER = 0.0f;
    private static final long DEFAULT_FASTEST_INTERVAL = 0;
    private static final long DEFAULT_INTERVAL = 0;
    private static final int REQUEST_SETTINGS_CONTINUOUS_UPDATE = 0;
    private static final int REQUEST_SETTINGS_SINGLE_UPDATE = 0;
    public static final String TAG = null;
    private final ActivityEventListener mActivityEventListener = new a();
    private float mDistanceFilter = 100.0f;
    private Callback mErrorCallback;
    private long mFastestInterval = 5000;
    private boolean mForceRequestLocation = false;
    private com.google.android.gms.location.a mFusedProviderClient;
    private g mLocationCallback;
    private int mLocationPriority = 102;
    private LocationRequest mLocationRequest;
    private double mMaximumAge = Double.POSITIVE_INFINITY;
    private p mSettingsClient;
    private boolean mShowLocationDialog = true;
    private Callback mSuccessCallback;
    private long mTimeout = Long.MAX_VALUE;
    private long mUpdateInterval = 10000;

    class a extends BaseActivityEventListener {
        public a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            String r3 = C0201.m82(18860);
            String r6 = C0201.m82(18861);
            if (i == 11403) {
                if (i2 == -1) {
                    RNFusedLocationModule.this.getUserLocation();
                } else if (!RNFusedLocationModule.this.mForceRequestLocation) {
                    RNFusedLocationModule.this.invokeError(a.SETTINGS_NOT_SATISFIED.b(), r6, true);
                } else if (!b.d(RNFusedLocationModule.this.getContext())) {
                    RNFusedLocationModule.this.invokeError(a.POSITION_UNAVAILABLE.b(), r3, true);
                } else {
                    RNFusedLocationModule.this.getUserLocation();
                }
            } else if (i != 11404) {
            } else {
                if (i2 == -1) {
                    RNFusedLocationModule.this.getLocationUpdates();
                } else if (!RNFusedLocationModule.this.mForceRequestLocation) {
                    RNFusedLocationModule.this.invokeError(a.SETTINGS_NOT_SATISFIED.b(), r6, false);
                } else if (!b.d(RNFusedLocationModule.this.getContext())) {
                    RNFusedLocationModule.this.invokeError(a.POSITION_UNAVAILABLE.b(), r3, false);
                } else {
                    RNFusedLocationModule.this.getLocationUpdates();
                }
            }
        }
    }

    class b implements us1<k> {
        public b() {
        }

        @Override // defpackage.us1
        public void a(zs1<k> zs1) {
            RNFusedLocationModule.this.onLocationSettingsResponse(zs1, true);
        }
    }

    class c implements us1<k> {
        public c() {
        }

        @Override // defpackage.us1
        public void a(zs1<k> zs1) {
            RNFusedLocationModule.this.onLocationSettingsResponse(zs1, false);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements us1<Location> {
        public d() {
        }

        @Override // defpackage.us1
        public void a(zs1<Location> zs1) {
            Location location;
            try {
                location = zs1.m(com.google.android.gms.common.api.b.class);
            } catch (com.google.android.gms.common.api.b e) {
                Log.w(C0201.m82(18570), C0201.m82(18569) + e.getMessage());
                location = null;
            }
            if (location == null || ((double) (h.a() - location.getTime())) >= RNFusedLocationModule.this.mMaximumAge) {
                new d(RNFusedLocationModule.this.mFusedProviderClient, RNFusedLocationModule.this.mLocationRequest, RNFusedLocationModule.this.mTimeout, RNFusedLocationModule.this.mSuccessCallback, RNFusedLocationModule.this.mErrorCallback).g();
            } else {
                RNFusedLocationModule.this.invokeSuccess(b.e(location), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends g {
        public e() {
        }

        @Override // com.google.android.gms.location.g
        public void b(LocationResult locationResult) {
            RNFusedLocationModule.this.invokeSuccess(b.e(locationResult.o()), false);
        }
    }

    static {
        C0201.m83(RNFusedLocationModule.class, 448);
    }

    public RNFusedLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mFusedProviderClient = i.a(reactApplicationContext);
        this.mSettingsClient = i.c(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this.mActivityEventListener);
        Log.i(C0201.m82(10460), C0201.m82(10461));
    }

    private j buildLocationSettingsRequest() {
        LocationRequest locationRequest = new LocationRequest();
        this.mLocationRequest = locationRequest;
        locationRequest.u(this.mLocationPriority);
        locationRequest.s(this.mUpdateInterval);
        locationRequest.r(this.mFastestInterval);
        locationRequest.w(this.mDistanceFilter);
        j.a aVar = new j.a();
        aVar.a(this.mLocationRequest);
        return aVar.b();
    }

    private void clearCallbacks() {
        this.mSuccessCallback = null;
        this.mErrorCallback = null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private ReactApplicationContext getContext() {
        return getReactApplicationContext();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void getLocationUpdates() {
        if (this.mFusedProviderClient != null && this.mLocationRequest != null) {
            e eVar = new e();
            this.mLocationCallback = eVar;
            this.mFusedProviderClient.v(this.mLocationRequest, eVar, null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void getUserLocation() {
        com.google.android.gms.location.a aVar = this.mFusedProviderClient;
        if (aVar != null) {
            aVar.t().b(new d());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void invokeError(int i, String str, boolean z) {
        if (!z) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(10462), b.a(i, str));
            return;
        }
        try {
            if (this.mErrorCallback != null) {
                this.mErrorCallback.invoke(b.a(i, str));
            }
            clearCallbacks();
        } catch (RuntimeException e2) {
            Log.w(C0201.m82(10463), e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void invokeSuccess(WritableMap writableMap, boolean z) {
        if (!z) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(10464), writableMap);
            return;
        }
        try {
            if (this.mSuccessCallback != null) {
                this.mSuccessCallback.invoke(writableMap);
            }
            clearCallbacks();
        } catch (RuntimeException e2) {
            Log.w(C0201.m82(10465), e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onLocationSettingsResponse(zs1<k> zs1, boolean z) {
        String r0 = C0201.m82(10466);
        try {
            zs1.m(com.google.android.gms.common.api.b.class);
            if (z) {
                getUserLocation();
            } else {
                getLocationUpdates();
            }
        } catch (com.google.android.gms.common.api.b e2) {
            int a2 = e2.a();
            String r3 = C0201.m82(10467);
            if (a2 != 6) {
                invokeError(a.SETTINGS_NOT_SATISFIED.b(), r3, z);
            } else if (!this.mShowLocationDialog) {
                invokeError(a.SETTINGS_NOT_SATISFIED.b(), r3, z);
            } else {
                try {
                    com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) e2;
                    Activity currentActivity = getCurrentActivity();
                    if (currentActivity == null) {
                        invokeError(a.INTERNAL_ERROR.b(), C0201.m82(10468), z);
                    } else {
                        kVar.b(currentActivity, z ? 11403 : 11404);
                    }
                } catch (IntentSender.SendIntentException unused) {
                    invokeError(a.INTERNAL_ERROR.b(), r0, z);
                } catch (ClassCastException unused2) {
                    invokeError(a.INTERNAL_ERROR.b(), r0, z);
                }
            }
        }
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        ReactApplicationContext context = getContext();
        this.mSuccessCallback = callback;
        this.mErrorCallback = callback2;
        boolean z = true;
        if (!b.b(context)) {
            invokeError(a.PERMISSION_DENIED.b(), C0201.m82(10469), true);
        } else if (!b.c(context)) {
            invokeError(a.PLAY_SERVICE_NOT_AVAILABLE.b(), C0201.m82(10470), true);
        } else {
            String r6 = C0201.m82(10471);
            boolean z2 = false;
            this.mLocationPriority = readableMap.hasKey(r6) && readableMap.getBoolean(r6) ? 100 : 102;
            String r62 = C0201.m82(10472);
            this.mTimeout = readableMap.hasKey(r62) ? (long) readableMap.getDouble(r62) : Long.MAX_VALUE;
            String r63 = C0201.m82(10473);
            this.mMaximumAge = readableMap.hasKey(r63) ? readableMap.getDouble(r63) : Double.POSITIVE_INFINITY;
            String r64 = C0201.m82(10474);
            this.mDistanceFilter = readableMap.hasKey(r64) ? (float) readableMap.getDouble(r64) : 0.0f;
            String r65 = C0201.m82(10475);
            if (readableMap.hasKey(r65)) {
                z = readableMap.getBoolean(r65);
            }
            this.mShowLocationDialog = z;
            String r66 = C0201.m82(10476);
            if (readableMap.hasKey(r66)) {
                z2 = readableMap.getBoolean(r66);
            }
            this.mForceRequestLocation = z2;
            j buildLocationSettingsRequest = buildLocationSettingsRequest();
            p pVar = this.mSettingsClient;
            if (pVar != null) {
                pVar.t(buildLocationSettingsRequest).b(new b());
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(10477);
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        ReactApplicationContext context = getContext();
        boolean z = false;
        if (!b.b(context)) {
            invokeError(a.PERMISSION_DENIED.b(), C0201.m82(10478), false);
        } else if (!b.c(context)) {
            invokeError(a.PLAY_SERVICE_NOT_AVAILABLE.b(), C0201.m82(10479), false);
        } else {
            String r0 = C0201.m82(10480);
            boolean z2 = true;
            this.mLocationPriority = readableMap.hasKey(r0) && readableMap.getBoolean(r0) ? 100 : 102;
            String r02 = C0201.m82(10481);
            this.mDistanceFilter = readableMap.hasKey(r02) ? (float) readableMap.getDouble(r02) : 100.0f;
            String r03 = C0201.m82(10482);
            long j = 10000;
            this.mUpdateInterval = readableMap.hasKey(r03) ? (long) readableMap.getDouble(r03) : 10000;
            String r04 = C0201.m82(10483);
            if (readableMap.hasKey(r04)) {
                j = (long) readableMap.getDouble(r04);
            }
            this.mFastestInterval = j;
            String r05 = C0201.m82(10484);
            if (readableMap.hasKey(r05)) {
                z2 = readableMap.getBoolean(r05);
            }
            this.mShowLocationDialog = z2;
            String r06 = C0201.m82(10485);
            if (readableMap.hasKey(r06)) {
                z = readableMap.getBoolean(r06);
            }
            this.mForceRequestLocation = z;
            j buildLocationSettingsRequest = buildLocationSettingsRequest();
            p pVar = this.mSettingsClient;
            if (pVar != null) {
                pVar.t(buildLocationSettingsRequest).b(new c());
            }
        }
    }

    @ReactMethod
    public void stopObserving() {
        g gVar;
        com.google.android.gms.location.a aVar = this.mFusedProviderClient;
        if (aVar != null && (gVar = this.mLocationCallback) != null) {
            aVar.u(gVar);
            this.mLocationCallback = null;
        }
    }
}
