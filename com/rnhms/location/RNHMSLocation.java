package com.rnhms.location;

import android.app.Activity;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInClient;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.location.SettingsClient;
import java.util.List;
import vigqyno.C0201;

public class RNHMSLocation extends ReactContextBaseJavaModule {
    private static final long FASTEST_INTERVAL = 0;
    public static final String TAG = null;
    private static final long UPDATE_INTERVAL = 0;
    private Activity activity;
    private FusedLocationProviderClient fusedLocationClient;
    private LocationRequest locationRequestH;
    private ReactApplicationContext mContext;
    public LocationCallback mLocationCallbackH;
    private Promise mPromise;
    private HuaweiIdSignInClient mSignInClient;
    private Location newLocation = null;
    private SettingsClient settingsClientH;

    class a extends LocationCallback {
        public a() {
        }

        @Override // com.huawei.hms.location.LocationCallback
        public void onLocationAvailability(LocationAvailability locationAvailability) {
            if (locationAvailability != null) {
                boolean isLocationAvailable = locationAvailability.isLocationAvailable();
                Log.i(C0201.m82(17412), C0201.m82(17411) + isLocationAvailable);
            }
        }

        @Override // com.huawei.hms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            if (locationResult != null) {
                List<Location> locations = locationResult.getLocations();
                if (!locations.isEmpty()) {
                    RNHMSLocation.this.newLocation = locations.get(0);
                    Log.i(C0201.m82(17414), C0201.m82(17413) + RNHMSLocation.this.newLocation);
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble(C0201.m82(17415), RNHMSLocation.this.newLocation.getLatitude());
                    createMap.putDouble(C0201.m82(17416), RNHMSLocation.this.newLocation.getLongitude());
                    createMap.putDouble(C0201.m82(17417), RNHMSLocation.this.newLocation.getAltitude());
                    createMap.putDouble(C0201.m82(17418), (double) RNHMSLocation.this.newLocation.getSpeed());
                    createMap.putDouble(C0201.m82(17419), (double) RNHMSLocation.this.newLocation.getBearing());
                    createMap.putDouble(C0201.m82(17420), (double) RNHMSLocation.this.newLocation.getAccuracy());
                    RNHMSLocation.this.fusedLocationClient.removeLocationUpdates(RNHMSLocation.this.mLocationCallbackH);
                    RNHMSLocation rNHMSLocation = RNHMSLocation.this;
                    rNHMSLocation.mLocationCallbackH = null;
                    rNHMSLocation.mPromise.resolve(createMap);
                }
            }
        }
    }

    static {
        C0201.m83(RNHMSLocation.class, 469);
    }

    public RNHMSLocation(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
        this.fusedLocationClient = LocationServices.getFusedLocationProviderClient(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(20926);
    }

    @ReactMethod
    public void getUserPosition(Promise promise) {
        this.mPromise = promise;
        this.settingsClientH = LocationServices.getSettingsClient(this.mContext);
        LocationRequest locationRequest = new LocationRequest();
        this.locationRequestH = locationRequest;
        locationRequest.setPriority(100);
        this.locationRequestH.setInterval(5000);
        this.locationRequestH.setFastestInterval(5000);
        if (this.mLocationCallbackH == null) {
            this.mLocationCallbackH = new a();
        }
        this.fusedLocationClient.requestLocationUpdates(this.locationRequestH, this.mLocationCallbackH, Looper.getMainLooper());
    }
}
