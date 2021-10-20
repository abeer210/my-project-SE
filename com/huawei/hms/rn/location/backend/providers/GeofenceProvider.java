package com.huawei.hms.rn.location.backend.providers;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.huawei.hms.location.GeofenceService;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.rn.location.backend.helpers.Constants;
import com.huawei.hms.rn.location.backend.helpers.Exceptions;
import com.huawei.hms.rn.location.backend.helpers.HMSBroadcastReceiver;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import com.huawei.hms.rn.location.backend.logger.HMSLogger;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;
import com.huawei.hms.rn.location.backend.utils.GeofenceUtils;
import com.huawei.hms.rn.location.backend.utils.PlatformUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class GeofenceProvider extends HMSProvider {
    private static final String TAG = null;
    private GeofenceService geofenceService = LocationServices.getGeofenceService(getContext());

    static {
        C0201.m83(GeofenceProvider.class, 432);
    }

    public GeofenceProvider(Context context) {
        super(context);
    }

    public void createGeofenceList(int i, JSONArray jSONArray, int i2, int i3, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(17618));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(17619), true);
        PendingIntent buildPendingIntent = buildPendingIntent(i, HMSBroadcastReceiver.getPackageAction(getContext(), C0201.m82(17620)));
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.geofenceService.createGeofenceList(GeofenceUtils.FROM_JSON_ARRAY_TO_GEOFENCE.map(jSONArray, Integer.valueOf(i2), Integer.valueOf(i3)), buildPendingIntent).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, PlatformUtils.keyValPair(C0201.m82(17621), Integer.valueOf(i)))).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        Log.i(TAG, C0201.m82(17622));
    }

    public void deleteGeofenceList(int i, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(17623));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(17624), true);
        if (!this.requests.containsKey(Integer.valueOf(i))) {
            hMSCallback.error(Exceptions.toErrorJSON(806));
            return;
        }
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.geofenceService.deleteGeofenceList(this.requests.get(Integer.valueOf(i))).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        Log.i(TAG, C0201.m82(17625));
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSProvider
    public JSONObject getConstants() throws JSONException {
        Log.d(TAG, C0201.m82(17626));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(17627), 1);
        jSONObject.put(C0201.m82(17628), 2);
        jSONObject.put(C0201.m82(17629), 4);
        jSONObject.put(C0201.m82(17630), 1);
        jSONObject.put(C0201.m82(17631), 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0201.m82(17632), 1);
        jSONObject2.put(C0201.m82(17633), 2);
        jSONObject2.put(C0201.m82(17634), 4);
        jSONObject2.put(C0201.m82(17635), -1L);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C0201.m82(17636), 10200);
        jSONObject3.put(C0201.m82(17637), 10201);
        jSONObject3.put(C0201.m82(17638), 10202);
        jSONObject3.put(C0201.m82(17639), 10204);
        jSONObject3.put(C0201.m82(17640), 10205);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(C0201.m82(17641), Constants.Event.GEOFENCE_RESULT.getVal());
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(C0201.m82(17642), jSONObject);
        jSONObject5.put(C0201.m82(17643), jSONObject2);
        jSONObject5.put(C0201.m82(17644), jSONObject3);
        jSONObject5.put(C0201.m82(17645), jSONObject4);
        return jSONObject5;
    }
}
