package com.huawei.hms.location;

import com.huawei.hms.common.api.CommonStatusCodes;
import vigqyno.C0201;

public final class GeofenceErrorCodes extends CommonStatusCodes {
    public static final int GEOFENCE_INSUFFICIENT_PERMISSION = 0;
    public static final int GEOFENCE_NUMBER_OVER_LIMIT = 0;
    public static final int GEOFENCE_PENDINGINTENT_OVER_LIMIT = 0;
    public static final int GEOFENCE_REQUEST_TOO_OFTEN = 0;
    public static final int GEOFENCE_UNAVAILABLE = 0;

    static {
        C0201.m83(GeofenceErrorCodes.class, 484);
    }

    private GeofenceErrorCodes() {
    }

    public static String getErrorMessage(int i) {
        switch (i) {
            case 10200:
                return C0201.m82(8739);
            case 10201:
                return C0201.m82(8738);
            case 10202:
                return C0201.m82(8737);
            case 10203:
            default:
                return CommonStatusCodes.getStatusCodeString(i);
            case 10204:
                return C0201.m82(8736);
            case 10205:
                return C0201.m82(8735);
        }
    }
}
