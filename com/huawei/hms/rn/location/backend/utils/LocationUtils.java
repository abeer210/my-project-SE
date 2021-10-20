package com.huawei.hms.rn.location.backend.utils;

import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.location.LocationSettingsStates;
import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.rn.location.backend.helpers.Exceptions;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import com.huawei.hms.rn.location.backend.interfaces.Mapper;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class LocationUtils {
    public static final Mapper<HWLocation, JSONObject> FROM_HW_LOCATION_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(o.a, new JSONObject());
    public static final Mapper<JSONObject, LocationRequest> FROM_JSON_OBJECT_TO_LOCATION_REQUEST = PlatformUtils.mapperWrapper(k.a);
    public static final Mapper<JSONObject, LocationSettingsRequest> FROM_JSON_OBJECT_TO_LOCATION_SETTINGS_REQUEST = PlatformUtils.mapperWrapper(p.a);
    public static final Mapper<LocationAvailability, JSONObject> FROM_LOCATION_AVAILABILITY_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(s.a);
    public static final Mapper<LocationResult, JSONObject> FROM_LOCATION_RESULT_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(n.a, new JSONObject());
    public static final Mapper<LocationSettingsResponse, JSONObject> FROM_LOCATION_SETTINGS_STATES_RESPONSE_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(q.a);
    public static final Mapper<LocationSettingsStates, JSONObject> FROM_LOCATION_SETTINGS_STATES_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(r.a, new JSONObject());
    public static final Mapper<Location, JSONObject> FROM_LOCATION_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(m.a, new JSONObject());
    public static final Mapper<NavigationResult, JSONObject> FROM_NAVIGATION_RESULT_TO_JSON_OBJECT = PlatformUtils.mapperWrapper(l.a, new JSONObject());
    private static final String TAG = null;

    static {
        C0201.m83(LocationUtils.class, 634);
    }

    public static /* synthetic */ JSONObject c(LocationResult locationResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22491), FROM_HW_LOCATION_TO_JSON_OBJECT.map(locationResult.getLastHWLocation()));
        jSONObject.put(C0201.m82(22492), FROM_LOCATION_TO_JSON_OBJECT.map(locationResult.getLastLocation()));
        jSONObject.put(C0201.m82(22493), PlatformUtils.mapList(locationResult.getLocations(), FROM_LOCATION_TO_JSON_OBJECT));
        jSONObject.put(C0201.m82(22494), PlatformUtils.mapList(locationResult.getHWLocationList(), FROM_HW_LOCATION_TO_JSON_OBJECT));
        return jSONObject;
    }

    public static boolean checkForObstacles(HMSProvider hMSProvider, FusedLocationProviderClient fusedLocationProviderClient, HMSCallback hMSCallback) {
        if (!PermissionUtils.hasLocationPermission(hMSProvider)) {
            Log.i(TAG, C0201.m82(22495));
            if (hMSCallback != null) {
                hMSCallback.error(Exceptions.toErrorJSON(802));
            }
            return true;
        } else if (fusedLocationProviderClient != null) {
            return false;
        } else {
            Log.i(TAG, C0201.m82(22496));
            if (hMSCallback != null) {
                hMSCallback.error(Exceptions.toErrorJSON(803));
            }
            return true;
        }
    }

    public static /* synthetic */ JSONObject d(Location location) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22497), location.getLatitude());
        jSONObject.put(C0201.m82(22498), location.getLongitude());
        jSONObject.put(C0201.m82(22499), location.getAltitude());
        jSONObject.put(C0201.m82(22500), (double) location.getSpeed());
        jSONObject.put(C0201.m82(22501), (double) location.getBearing());
        jSONObject.put(C0201.m82(22502), (double) location.getAccuracy());
        int i = Build.VERSION.SDK_INT;
        String r2 = C0201.m82(22503);
        String r3 = C0201.m82(22504);
        String r4 = C0201.m82(22505);
        if (i >= 26) {
            jSONObject.put(r4, (double) location.getVerticalAccuracyMeters());
            jSONObject.put(r3, (double) location.getBearingAccuracyDegrees());
            jSONObject.put(r2, (double) location.getSpeedAccuracyMetersPerSecond());
        } else {
            jSONObject.put(r4, 0.0d);
            jSONObject.put(r3, 0.0d);
            jSONObject.put(r2, 0.0d);
        }
        jSONObject.put(C0201.m82(22506), location.getTime());
        jSONObject.put(C0201.m82(22507), location.isFromMockProvider());
        return jSONObject;
    }

    public static /* synthetic */ JSONObject e(HWLocation hWLocation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22508), hWLocation.getLatitude());
        jSONObject.put(C0201.m82(22509), hWLocation.getLongitude());
        jSONObject.put(C0201.m82(22510), hWLocation.getAltitude());
        jSONObject.put(C0201.m82(22511), (double) hWLocation.getSpeed());
        jSONObject.put(C0201.m82(22512), (double) hWLocation.getBearing());
        jSONObject.put(C0201.m82(22513), (double) hWLocation.getAccuracy());
        jSONObject.put(C0201.m82(22514), hWLocation.getProvider());
        jSONObject.put(C0201.m82(22515), hWLocation.getTime());
        jSONObject.put(C0201.m82(22516), hWLocation.getElapsedRealtimeNanos());
        jSONObject.put(C0201.m82(22517), hWLocation.getCountryCode());
        jSONObject.put(C0201.m82(22518), hWLocation.getCountryName());
        jSONObject.put(C0201.m82(22519), hWLocation.getState());
        jSONObject.put(C0201.m82(22520), hWLocation.getCity());
        jSONObject.put(C0201.m82(22521), hWLocation.getCounty());
        jSONObject.put(C0201.m82(22522), hWLocation.getStreet());
        jSONObject.put(C0201.m82(22523), hWLocation.getFeatureName());
        jSONObject.put(C0201.m82(22524), hWLocation.getPostalCode());
        jSONObject.put(C0201.m82(22525), hWLocation.getPhone());
        jSONObject.put(C0201.m82(22526), hWLocation.getUrl());
        jSONObject.put(C0201.m82(22527), PlatformUtils.fromMapToJSONObject(hWLocation.getExtraInfo()));
        int i = Build.VERSION.SDK_INT;
        String r2 = C0201.m82(22528);
        String r3 = C0201.m82(22529);
        String r4 = C0201.m82(22530);
        if (i >= 26) {
            jSONObject.put(r4, (double) hWLocation.getVerticalAccuracyMeters());
            jSONObject.put(r3, (double) hWLocation.getBearingAccuracyDegrees());
            jSONObject.put(r2, (double) hWLocation.getSpeedAccuracyMetersPerSecond());
        } else {
            jSONObject.put(r4, 0.0d);
            jSONObject.put(r3, 0.0d);
            jSONObject.put(r2, 0.0d);
        }
        return jSONObject;
    }

    public static /* synthetic */ JSONObject f(LocationSettingsStates locationSettingsStates) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22531), locationSettingsStates.isBlePresent());
        jSONObject.put(C0201.m82(22532), locationSettingsStates.isBleUsable());
        jSONObject.put(C0201.m82(22533), locationSettingsStates.isGpsPresent());
        jSONObject.put(C0201.m82(22534), locationSettingsStates.isGpsUsable());
        jSONObject.put(C0201.m82(22535), locationSettingsStates.isLocationPresent());
        jSONObject.put(C0201.m82(22536), locationSettingsStates.isLocationUsable());
        jSONObject.put(C0201.m82(22537), locationSettingsStates.isNetworkLocationPresent());
        jSONObject.put(C0201.m82(22538), locationSettingsStates.isNetworkLocationUsable());
        return jSONObject;
    }

    public static /* synthetic */ JSONObject g(LocationAvailability locationAvailability) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22539), locationAvailability.isLocationAvailable());
        return jSONObject;
    }

    public static /* synthetic */ JSONObject h(LocationSettingsResponse locationSettingsResponse) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22540), FROM_LOCATION_SETTINGS_STATES_TO_JSON_OBJECT.map(locationSettingsResponse.getLocationSettingsStates()));
        return jSONObject;
    }

    public static /* synthetic */ JSONObject i(NavigationResult navigationResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(22541), navigationResult.getState());
        jSONObject.put(C0201.m82(22542), navigationResult.getPossibility());
        return jSONObject;
    }
}
