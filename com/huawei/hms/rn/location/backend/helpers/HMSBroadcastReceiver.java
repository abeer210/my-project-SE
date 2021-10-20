package com.huawei.hms.rn.location.backend.helpers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.huawei.hms.location.ActivityConversionResponse;
import com.huawei.hms.location.ActivityIdentificationResponse;
import com.huawei.hms.location.GeofenceData;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.rn.location.backend.helpers.Constants;
import com.huawei.hms.rn.location.backend.interfaces.EventSender;
import com.huawei.hms.rn.location.backend.utils.ActivityUtils;
import com.huawei.hms.rn.location.backend.utils.GeofenceUtils;
import com.huawei.hms.rn.location.backend.utils.LocationUtils;
import org.json.JSONObject;
import vigqyno.C0201;

public class HMSBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_HMS_CONVERSION = null;
    public static final String ACTION_HMS_GEOFENCE = null;
    public static final String ACTION_HMS_IDENTIFICATION = null;
    public static final String ACTION_HMS_LOCATION = null;
    public static final String TAG = HMSBroadcastReceiver.class.getSimpleName();
    private static HMSBroadcastReceiver instance;
    private EventSender eventSender;

    static {
        C0201.m83(HMSBroadcastReceiver.class, 449);
    }

    public static synchronized HMSBroadcastReceiver getInstance() {
        HMSBroadcastReceiver hMSBroadcastReceiver;
        synchronized (HMSBroadcastReceiver.class) {
            if (instance == null) {
                instance = new HMSBroadcastReceiver();
            }
            hMSBroadcastReceiver = instance;
        }
        return hMSBroadcastReceiver;
    }

    public static IntentFilter getIntentFilter(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(getPackageAction(context, C0201.m82(18039)));
        intentFilter.addAction(getPackageAction(context, C0201.m82(18040)));
        intentFilter.addAction(getPackageAction(context, C0201.m82(18041)));
        intentFilter.addAction(getPackageAction(context, C0201.m82(18042)));
        return intentFilter;
    }

    public static String getPackageAction(Context context, String str) {
        return context.getPackageName() + C0201.m82(18043) + str;
    }

    public static Pair<String, JSONObject> handleIntent(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        Log.d(TAG, action);
        if (getPackageAction(context, C0201.m82(18044)).equals(action) && LocationResult.hasResult(intent)) {
            return Pair.create(action, LocationUtils.FROM_LOCATION_RESULT_TO_JSON_OBJECT.map(LocationResult.extractResult(intent)));
        }
        if (getPackageAction(context, C0201.m82(18045)).equals(action) && ActivityIdentificationResponse.containDataFromIntent(intent)) {
            return Pair.create(action, ActivityUtils.FROM_ACTIVITY_IDENTIFICATION_RESPONSE_TO_JSON_OBJECT.map(ActivityIdentificationResponse.getDataFromIntent(intent)));
        }
        if (getPackageAction(context, C0201.m82(18046)).equals(action) && ActivityConversionResponse.containDataFromIntent(intent)) {
            return Pair.create(action, ActivityUtils.FROM_ACTIVITY_CONVERSION_RESPONSE_TO_JSON_OBJECT.map(ActivityConversionResponse.getDataFromIntent(intent)));
        }
        if (getPackageAction(context, C0201.m82(18047)).equals(action)) {
            return Pair.create(action, GeofenceUtils.FROM_GEOFENCE_DATA_TO_JSON_OBJECT.map(GeofenceData.getDataFromIntent(intent)));
        }
        String str = TAG;
        Log.d(str, C0201.m82(18048) + action);
        return null;
    }

    public static HMSBroadcastReceiver init(Activity activity, EventSender eventSender2) {
        activity.registerReceiver(getInstance(), getIntentFilter(activity.getApplicationContext()));
        getInstance().setEventSender(eventSender2);
        return getInstance();
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Log.d(TAG, C0201.m82(18049));
        if (intent == null) {
            Log.d(TAG, C0201.m82(18050));
        } else if (this.eventSender == null) {
            Log.d(TAG, C0201.m82(18051));
        } else {
            Pair<String, JSONObject> handleIntent = handleIntent(context, intent);
            if (handleIntent != null) {
                if (getPackageAction(context, C0201.m82(18052)).equals(handleIntent.get0())) {
                    str = Constants.Event.SCANNING_RESULT.getVal();
                } else if (getPackageAction(context, C0201.m82(18053)).equals(handleIntent.get0())) {
                    str = Constants.Event.ACTIVITY_IDENTIFICATION_RESULT.getVal();
                } else if (getPackageAction(context, C0201.m82(18054)).equals(handleIntent.get0())) {
                    str = Constants.Event.ACTIVITY_CONVERSION_RESULT.getVal();
                } else if (getPackageAction(context, C0201.m82(18055)).equals(handleIntent.get0())) {
                    str = Constants.Event.GEOFENCE_RESULT.getVal();
                } else {
                    return;
                }
                this.eventSender.send(str, handleIntent.get1());
            }
            Log.d(TAG, C0201.m82(18056));
        }
    }

    public void setEventSender(EventSender eventSender2) {
        this.eventSender = eventSender2;
    }
}
