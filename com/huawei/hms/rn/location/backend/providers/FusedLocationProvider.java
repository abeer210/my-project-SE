package com.huawei.hms.rn.location.backend.providers;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationEnhanceService;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.location.NavigationRequest;
import com.huawei.hms.location.SettingsClient;
import com.huawei.hms.rn.location.backend.helpers.Constants;
import com.huawei.hms.rn.location.backend.helpers.Exceptions;
import com.huawei.hms.rn.location.backend.helpers.HMSBroadcastReceiver;
import com.huawei.hms.rn.location.backend.helpers.LocationCallbackWithHandler;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import com.huawei.hms.rn.location.backend.interfaces.ResultHandler;
import com.huawei.hms.rn.location.backend.interfaces.TriMapper;
import com.huawei.hms.rn.location.backend.logger.HMSLogger;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;
import com.huawei.hms.rn.location.backend.utils.LocationUtils;
import com.huawei.hms.rn.location.backend.utils.PermissionUtils;
import com.huawei.hms.rn.location.backend.utils.PlatformUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class FusedLocationProvider extends HMSProvider implements ResultHandler {
    public static final String TAG = null;
    private FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(getContext());
    private HashMap<Integer, LocationCallback> locationCallbackMap = new HashMap<>();
    private LocationEnhanceService locationEnhanceService = LocationServices.getLocationEnhanceService(getContext());
    public int mRequestCode = 0;
    private HMSCallback permissionResultCallback;
    private SettingsClient settingsClient = LocationServices.getSettingsClient(getContext());

    static {
        C0201.m83(FusedLocationProvider.class, 657);
    }

    public FusedLocationProvider(Context context) {
        super(context);
    }

    private void requestLocationUpdatesWithCallbackGeneric(HMSMethod hMSMethod, TriMapper<LocationRequest, LocationCallback, Looper, Task<Void>> triMapper, JSONObject jSONObject, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14922));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            LocationCallbackWithHandler locationCallbackWithHandler = new LocationCallbackWithHandler(this);
            this.locationCallbackMap.put(Integer.valueOf(this.mRequestCode), locationCallbackWithHandler);
            Activity activity = getActivity();
            int i = this.mRequestCode;
            this.mRequestCode = i + 1;
            triMapper.map(LocationUtils.FROM_JSON_OBJECT_TO_LOCATION_REQUEST.map(jSONObject), locationCallbackWithHandler, Looper.getMainLooper()).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, activity, hMSCallback, PlatformUtils.keyValPair(C0201.m82(14923), Integer.valueOf(i)))).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14924));
        }
    }

    public void checkLocationSettings(JSONObject jSONObject, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14925));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14926));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
            this.settingsClient.checkLocationSettings(LocationUtils.FROM_JSON_OBJECT_TO_LOCATION_SETTINGS_REQUEST.map(jSONObject)).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, LocationUtils.FROM_LOCATION_SETTINGS_STATES_RESPONSE_TO_JSON_OBJECT)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14927));
        }
    }

    public void flushLocations(HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14928));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14929));
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.fusedLocationProviderClient.flushLocations().addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSProvider
    public JSONObject getConstants() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(14930), 102);
        jSONObject.put(C0201.m82(14931), 100);
        jSONObject.put(C0201.m82(14932), 104);
        jSONObject.put(C0201.m82(14933), 105);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0201.m82(14934), Constants.Event.SCANNING_RESULT.getVal());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C0201.m82(14935), 1);
        jSONObject3.put(C0201.m82(14936), 2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(C0201.m82(14937), jSONObject);
        jSONObject4.put(C0201.m82(14938), jSONObject2);
        jSONObject4.put(C0201.m82(14939), jSONObject3);
        return jSONObject4;
    }

    public void getLastLocation(HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14940));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14941));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
            this.fusedLocationProviderClient.getLastLocation().addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, LocationUtils.FROM_LOCATION_TO_JSON_OBJECT)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14942));
        }
    }

    public void getLastLocationWithAddress(JSONObject jSONObject, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14943));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14944));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
            this.fusedLocationProviderClient.getLastLocationWithAddress(LocationUtils.FROM_JSON_OBJECT_TO_LOCATION_REQUEST.map(jSONObject)).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, LocationUtils.FROM_HW_LOCATION_TO_JSON_OBJECT)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14945));
        }
    }

    public void getLocationAvailability(HMSCallback hMSCallback) {
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14946));
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        Log.i(TAG, C0201.m82(14947));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            this.fusedLocationProviderClient.getLocationAvailability().addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, LocationUtils.FROM_LOCATION_AVAILABILITY_TO_JSON_OBJECT)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14948));
        }
    }

    public void getNavigationContextState(int i, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14949));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14950));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
            this.locationEnhanceService.getNavigationState(new NavigationRequest(i)).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, LocationUtils.FROM_NAVIGATION_RESULT_TO_JSON_OBJECT)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14951));
        }
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.ResultHandler
    public void handleResult(LocationResult locationResult) {
        getEventSender().send(Constants.Event.SCANNING_RESULT.getVal(), LocationUtils.FROM_LOCATION_RESULT_TO_JSON_OBJECT.map(locationResult));
    }

    public void hasPermission(HMSCallback hMSCallback) {
        hMSCallback.success(PlatformUtils.keyValPair(C0201.m82(14952), Boolean.valueOf(PermissionUtils.hasLocationPermission(this))));
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        JSONObject map = PermissionUtils.HANDLE_PERMISSION_REQUEST_RESULT.map(Integer.valueOf(i), strArr, iArr);
        HMSCallback hMSCallback = this.permissionResultCallback;
        if (hMSCallback != null) {
            hMSCallback.success(map);
        } else {
            Log.e(TAG, C0201.m82(14953));
        }
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSProvider
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionResult(i, strArr, iArr);
        return false;
    }

    public void removeLocationUpdates(int i, HMSCallback hMSCallback) {
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14954), true);
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        if (this.locationCallbackMap.get(Integer.valueOf(i)) != null) {
            this.fusedLocationProviderClient.removeLocationUpdates(this.locationCallbackMap.get(Integer.valueOf(i))).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        } else if (this.requests.containsKey(Integer.valueOf(i))) {
            this.fusedLocationProviderClient.removeLocationUpdates(this.requests.get(Integer.valueOf(i))).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        } else {
            Log.i(TAG, C0201.m82(14955));
            hMSCallback.error(Exceptions.toErrorJSON(804));
            hMSMethod.sendLoggerEvent(getActivity(), C0201.m82(14956));
        }
    }

    public void requestLocationUpdates(int i, JSONObject jSONObject, HMSCallback hMSCallback) {
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14957), true);
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            PendingIntent buildPendingIntent = buildPendingIntent(i, HMSBroadcastReceiver.getPackageAction(getContext(), C0201.m82(14958)));
            this.fusedLocationProviderClient.requestLocationUpdates(LocationUtils.FROM_JSON_OBJECT_TO_LOCATION_REQUEST.map(jSONObject), buildPendingIntent).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, PlatformUtils.keyValPair(C0201.m82(14959), Integer.valueOf(i)))).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        }
    }

    public void requestLocationUpdatesWithCallback(JSONObject jSONObject, HMSCallback hMSCallback) {
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14960), true);
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        FusedLocationProviderClient fusedLocationProviderClient2 = this.fusedLocationProviderClient;
        fusedLocationProviderClient2.getClass();
        requestLocationUpdatesWithCallbackGeneric(hMSMethod, new a(fusedLocationProviderClient2), jSONObject, hMSCallback);
    }

    public void requestLocationUpdatesWithCallbackEx(JSONObject jSONObject, HMSCallback hMSCallback) {
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14961), true);
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        FusedLocationProviderClient fusedLocationProviderClient2 = this.fusedLocationProviderClient;
        fusedLocationProviderClient2.getClass();
        requestLocationUpdatesWithCallbackGeneric(hMSMethod, new b(fusedLocationProviderClient2), jSONObject, hMSCallback);
    }

    public void requestPermission(HMSCallback hMSCallback) {
        PermissionUtils.requestLocationPermission(this);
        this.permissionResultCallback = hMSCallback;
    }

    public void setMockLocation(JSONObject jSONObject, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(14962));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14963));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            Location location = new Location(C0201.m82(14964));
            location.setLongitude(jSONObject.optDouble(C0201.m82(14965)));
            location.setLatitude(jSONObject.optDouble(C0201.m82(14966)));
            HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
            this.fusedLocationProviderClient.setMockLocation(location).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14967));
        }
    }

    public void setMockMode(boolean z, HMSCallback hMSCallback) {
        String str = TAG;
        Log.i(str, C0201.m82(14968) + z);
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(14969));
        if (!LocationUtils.checkForObstacles(this, this.fusedLocationProviderClient, hMSCallback)) {
            HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
            this.fusedLocationProviderClient.setMockMode(z).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
            Log.i(TAG, C0201.m82(14970));
        }
    }
}
