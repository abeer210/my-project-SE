package com.reactnativecommunity.geolocation;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.h;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import vigqyno.C0201;

@pj0(name = "RNCGeolocation")
@SuppressLint({"MissingPermission"})
public class GeolocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = null;
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 0.0f;
    private final LocationListener mLocationListener = new a();
    private String mWatchedProvider;

    /* access modifiers changed from: package-private */
    public class a implements LocationListener {
        public a() {
        }

        public void onLocationChanged(Location location) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) GeolocationModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(3980), GeolocationModule.locationToMap(location));
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            String r5 = C0201.m82(3981);
            if (i == 0) {
                GeolocationModule geolocationModule = GeolocationModule.this;
                int i2 = b.b;
                geolocationModule.emitError(i2, r5 + str + C0201.m82(3982));
            } else if (i == 1) {
                GeolocationModule geolocationModule2 = GeolocationModule.this;
                int i3 = b.c;
                geolocationModule2.emitError(i3, r5 + str + C0201.m82(3983));
            }
        }
    }

    class b implements Callback {
        public final /* synthetic */ ReadableMap a;
        public final /* synthetic */ Callback b;
        public final /* synthetic */ Callback c;

        public b(ReadableMap readableMap, Callback callback, Callback callback2) {
            this.a = readableMap;
            this.b = callback;
            this.c = callback2;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (((String) objArr[0]) == C0201.m82(3770)) {
                GeolocationModule.this.getCurrentLocationData(this.a, this.b, this.c);
                return;
            }
            this.c.invoke(b.a(b.a, C0201.m82(3771)));
        }
    }

    class c implements Callback {
        public final /* synthetic */ Callback a;

        public c(GeolocationModule geolocationModule, Callback callback) {
            this.a = callback;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            this.a.invoke(b.a(b.a, C0201.m82(3834)));
        }
    }

    class d implements Callback {
        public final /* synthetic */ Callback a;

        public d(GeolocationModule geolocationModule, Callback callback) {
            this.a = callback;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            this.a.invoke(b.a(b.a, C0201.m82(3555)));
        }
    }

    class e implements Callback {
        public final /* synthetic */ PermissionsModule a;
        public final /* synthetic */ Callback b;
        public final /* synthetic */ Callback c;
        public final /* synthetic */ ReadableMap d;
        public final /* synthetic */ Callback e;
        public final /* synthetic */ Callback f;

        public e(PermissionsModule permissionsModule, Callback callback, Callback callback2, ReadableMap readableMap, Callback callback3, Callback callback4) {
            this.a = permissionsModule;
            this.b = callback;
            this.c = callback2;
            this.d = readableMap;
            this.e = callback3;
            this.f = callback4;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (!((Boolean) objArr[0]).booleanValue()) {
                this.a.requestPermission(C0201.m82(3609), new PromiseImpl(this.b, this.c));
                return;
            }
            GeolocationModule.this.getCurrentLocationData(this.d, this.e, this.f);
        }
    }

    /* access modifiers changed from: private */
    public static class f {
        private final long a;
        private final double b;
        private final boolean c;
        private final float d;

        private f(long j, double d2, boolean z, float f) {
            this.a = j;
            this.b = d2;
            this.c = z;
            this.d = f;
        }

        /* access modifiers changed from: private */
        public static f f(ReadableMap readableMap) {
            String r0 = C0201.m82(3424);
            long j = readableMap.hasKey(r0) ? (long) readableMap.getDouble(r0) : Long.MAX_VALUE;
            String r02 = C0201.m82(3425);
            double d2 = readableMap.hasKey(r02) ? readableMap.getDouble(r02) : Double.POSITIVE_INFINITY;
            String r03 = C0201.m82(3426);
            boolean z = readableMap.hasKey(r03) && readableMap.getBoolean(r03);
            String r04 = C0201.m82(3427);
            return new f(j, d2, z, readableMap.hasKey(r04) ? (float) readableMap.getDouble(r04) : 100.0f);
        }
    }

    /* access modifiers changed from: private */
    public static class g {
        private final Callback a;
        private final Callback b;
        private final LocationManager c;
        private final String d;
        private final long e;
        private Location f;
        private final Handler g;
        private final Runnable h;
        private final LocationListener i;
        private boolean j;

        class a implements Runnable {
            public a() {
            }

            public void run() {
                synchronized (g.this) {
                    if (!g.this.j) {
                        g.this.b.invoke(b.a(b.c, C0201.m82(10729)));
                        g.this.c.removeUpdates(g.this.i);
                        f60.n(C0201.m82(10730), C0201.m82(10731));
                        g.this.j = true;
                    }
                }
            }
        }

        class b implements LocationListener {
            public b() {
            }

            public void onLocationChanged(Location location) {
                synchronized (g.this) {
                    if (!g.this.j && g.this.m(location, g.this.f)) {
                        g.this.a.invoke(GeolocationModule.locationToMap(location));
                        g.this.g.removeCallbacks(g.this.h);
                        g.this.j = true;
                        g.this.c.removeUpdates(g.this.i);
                    }
                    g.this.f = location;
                }
            }

            public void onProviderDisabled(String str) {
            }

            public void onProviderEnabled(String str) {
            }

            public void onStatusChanged(String str, int i, Bundle bundle) {
            }
        }

        public /* synthetic */ g(LocationManager locationManager, String str, long j2, Callback callback, Callback callback2, a aVar) {
            this(locationManager, str, j2, callback, callback2);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean m(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z = time > 120000;
            boolean z2 = time < -120000;
            boolean z3 = time > 0;
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = accuracy > 200;
            boolean n = n(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (!z3 || z4) {
                return z3 && !z6 && n;
            }
            return true;
        }

        private boolean n(String str, String str2) {
            if (str == null) {
                return str2 == null;
            }
            return str.equals(str2);
        }

        public void l(Location location) {
            this.f = location;
            this.c.requestLocationUpdates(this.d, 100, 1.0f, this.i);
            this.g.postDelayed(this.h, this.e);
        }

        private g(LocationManager locationManager, String str, long j2, Callback callback, Callback callback2) {
            this.g = new Handler();
            this.h = new a();
            this.i = new b();
            this.c = locationManager;
            this.d = str;
            this.e = j2;
            this.a = callback;
            this.b = callback2;
        }
    }

    static {
        C0201.m83(GeolocationModule.class, 609);
    }

    public GeolocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void emitError(int i, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(36400), b.a(i, str));
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String r0 = C0201.m82(36401);
        String r1 = C0201.m82(36402);
        String str = z ? r1 : r0;
        if (!locationManager.isProviderEnabled(str)) {
            if (!str.equals(r1)) {
                r0 = r1;
            }
            if (!locationManager.isProviderEnabled(r0)) {
                return null;
            }
            str = r0;
        }
        int a2 = androidx.core.content.b.a(getReactApplicationContext(), C0201.m82(36403));
        if (!str.equals(r1) || a2 == 0) {
            return str;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static WritableMap locationToMap(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(C0201.m82(36404), location.getLatitude());
        createMap2.putDouble(C0201.m82(36405), location.getLongitude());
        createMap2.putDouble(C0201.m82(36406), location.getAltitude());
        createMap2.putDouble(C0201.m82(36407), (double) location.getAccuracy());
        createMap2.putDouble(C0201.m82(36408), (double) location.getBearing());
        createMap2.putDouble(C0201.m82(36409), (double) location.getSpeed());
        createMap.putMap(C0201.m82(36410), createMap2);
        createMap.putDouble(C0201.m82(36411), (double) location.getTime());
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putBoolean(C0201.m82(36412), location.isFromMockProvider());
        }
        return createMap;
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException(C0201.m82(36413), securityException);
    }

    public void getCurrentLocationData(ReadableMap readableMap, Callback callback, Callback callback2) {
        f f2 = f.f(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(C0201.m82(36414));
            String validProvider = getValidProvider(locationManager, f2.c);
            if (validProvider == null) {
                callback2.invoke(b.a(b.b, C0201.m82(36415)));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || ((double) (h.a() - lastKnownLocation.getTime())) >= f2.b) {
                new g(locationManager, validProvider, f2.a, callback, callback2, null).l(lastKnownLocation);
                return;
            }
            callback.invoke(locationToMap(lastKnownLocation));
        } catch (SecurityException e2) {
            throwLocationPermissionMissing(e2);
        }
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        if (Build.VERSION.SDK_INT >= 23) {
            PermissionsModule permissionsModule = (PermissionsModule) getReactApplicationContext().getNativeModule(PermissionsModule.class);
            b bVar = new b(readableMap, callback, callback2);
            c cVar = new c(this, callback2);
            permissionsModule.checkPermission(C0201.m82(36416), new PromiseImpl(new e(permissionsModule, bVar, cVar, readableMap, callback, callback2), new d(this, callback2)));
            return;
        }
        getCurrentLocationData(readableMap, callback, callback2);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(36417);
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if (!C0201.m82(36418).equals(this.mWatchedProvider)) {
            f f2 = f.f(readableMap);
            try {
                LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(C0201.m82(36419));
                String validProvider = getValidProvider(locationManager, f2.c);
                if (validProvider == null) {
                    emitError(b.b, C0201.m82(36420));
                    return;
                }
                if (!validProvider.equals(this.mWatchedProvider)) {
                    locationManager.removeUpdates(this.mLocationListener);
                    locationManager.requestLocationUpdates(validProvider, 1000, f2.d, this.mLocationListener);
                }
                this.mWatchedProvider = validProvider;
            } catch (SecurityException e2) {
                throwLocationPermissionMissing(e2);
            }
        }
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService(C0201.m82(36421))).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }
}
