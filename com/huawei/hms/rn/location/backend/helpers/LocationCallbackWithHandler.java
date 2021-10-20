package com.huawei.hms.rn.location.backend.helpers;

import android.util.Log;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.rn.location.backend.interfaces.ResultHandler;
import vigqyno.C0201;

public class LocationCallbackWithHandler extends LocationCallback {
    private static final String TAG = null;
    private ResultHandler mResultHandler;

    static {
        C0201.m83(LocationCallbackWithHandler.class, 709);
    }

    public LocationCallbackWithHandler(ResultHandler resultHandler) {
        this.mResultHandler = resultHandler;
    }

    @Override // com.huawei.hms.location.LocationCallback
    public void onLocationAvailability(LocationAvailability locationAvailability) {
        Log.i(TAG, C0201.m82(34106));
        if (locationAvailability != null) {
            boolean isLocationAvailable = locationAvailability.isLocationAvailable();
            String str = TAG;
            Log.i(str, C0201.m82(34107) + isLocationAvailable);
        }
    }

    @Override // com.huawei.hms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        Log.i(TAG, C0201.m82(34108));
        if (locationResult != null) {
            this.mResultHandler.handleResult(locationResult);
        }
    }
}
