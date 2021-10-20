package com.huawei.hms.rn.location.backend.providers;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.huawei.hms.location.ActivityIdentification;
import com.huawei.hms.location.ActivityIdentificationService;
import com.huawei.hms.rn.location.backend.helpers.Constants;
import com.huawei.hms.rn.location.backend.helpers.Exceptions;
import com.huawei.hms.rn.location.backend.helpers.HMSBroadcastReceiver;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import com.huawei.hms.rn.location.backend.logger.HMSLogger;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;
import com.huawei.hms.rn.location.backend.utils.ActivityUtils;
import com.huawei.hms.rn.location.backend.utils.PermissionUtils;
import com.huawei.hms.rn.location.backend.utils.PlatformUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ActivityIdentificationProvider extends HMSProvider {
    private static String TAG;
    private ActivityIdentificationService activityService = ActivityIdentification.getService(getContext());
    private HMSCallback permissionResultCallback;

    static {
        C0201.m83(ActivityIdentificationProvider.class, 649);
    }

    public ActivityIdentificationProvider(Context context) {
        super(context);
    }

    public void createActivityConversionUpdates(int i, JSONArray jSONArray, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(19149));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(19150), true);
        PendingIntent buildPendingIntent = buildPendingIntent(i, HMSBroadcastReceiver.getPackageAction(getContext(), C0201.m82(19151)));
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.activityService.createActivityConversionUpdates(ActivityUtils.FROM_JSON_ARRAY_TO_ACTIVITY_CONVERSION_REQUEST.map(jSONArray), buildPendingIntent).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, PlatformUtils.keyValPair(C0201.m82(19152), Integer.valueOf(i)))).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        Log.i(TAG, C0201.m82(19153));
    }

    public void createActivityIdentificationUpdates(int i, double d, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(19154));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(19155), true);
        PendingIntent buildPendingIntent = buildPendingIntent(i, HMSBroadcastReceiver.getPackageAction(getContext(), C0201.m82(19156)));
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.activityService.createActivityIdentificationUpdates((long) d, buildPendingIntent).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback, PlatformUtils.keyValPair(C0201.m82(19157), Integer.valueOf(i)))).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        Log.i(TAG, C0201.m82(19158));
    }

    public void deleteActivityConversionUpdates(int i, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(19159));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(19160), true);
        if (!this.requests.containsKey(Integer.valueOf(i))) {
            hMSCallback.error(Exceptions.toErrorJSON(806));
            return;
        }
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.activityService.deleteActivityConversionUpdates(this.requests.get(Integer.valueOf(i))).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        Log.i(TAG, C0201.m82(19161));
    }

    public void deleteActivityIdentificationUpdates(int i, HMSCallback hMSCallback) {
        Log.i(TAG, C0201.m82(19162));
        HMSMethod hMSMethod = new HMSMethod(C0201.m82(19163), true);
        if (!this.requests.containsKey(Integer.valueOf(i))) {
            hMSCallback.error(Exceptions.toErrorJSON(806));
            return;
        }
        HMSLogger.getInstance(getActivity()).startMethodExecutionTimer(hMSMethod.getName());
        this.activityService.deleteActivityIdentificationUpdates(this.requests.get(Integer.valueOf(i))).addOnSuccessListener(PlatformUtils.successListener(hMSMethod, getActivity(), hMSCallback)).addOnFailureListener(PlatformUtils.failureListener(hMSMethod, getActivity(), hMSCallback));
        Log.i(TAG, C0201.m82(19164));
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSProvider
    public JSONObject getConstants() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(19165), 100);
        jSONObject.put(C0201.m82(19166), 101);
        jSONObject.put(C0201.m82(19167), 102);
        jSONObject.put(C0201.m82(19168), 108);
        jSONObject.put(C0201.m82(19169), 103);
        jSONObject.put(C0201.m82(19170), 105);
        jSONObject.put(C0201.m82(19171), 104);
        jSONObject.put(C0201.m82(19172), 107);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C0201.m82(19173), Constants.Event.ACTIVITY_CONVERSION_RESULT.getVal());
        jSONObject2.put(C0201.m82(19174), Constants.Event.ACTIVITY_IDENTIFICATION_RESULT.getVal());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(C0201.m82(19175), 0);
        jSONObject3.put(C0201.m82(19176), 1);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(C0201.m82(19177), jSONObject);
        jSONObject4.put(C0201.m82(19178), jSONObject2);
        jSONObject4.put(C0201.m82(19179), jSONObject3);
        return jSONObject4;
    }

    public void hasPermission(HMSCallback hMSCallback) {
        hMSCallback.success(PlatformUtils.keyValPair(C0201.m82(19180), Boolean.valueOf(PermissionUtils.hasActivityRecognitionPermission(this))));
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        JSONObject map = PermissionUtils.HANDLE_PERMISSION_REQUEST_RESULT.map(Integer.valueOf(i), strArr, iArr);
        HMSCallback hMSCallback = this.permissionResultCallback;
        if (hMSCallback != null) {
            hMSCallback.success(map);
        } else {
            Log.w(TAG, C0201.m82(19181));
        }
    }

    @Override // com.huawei.hms.rn.location.backend.interfaces.HMSProvider
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionResult(i, strArr, iArr);
        return false;
    }

    public void requestPermission(HMSCallback hMSCallback) {
        PermissionUtils.requestActivityRecognitionPermission(this);
        this.permissionResultCallback = hMSCallback;
    }
}
