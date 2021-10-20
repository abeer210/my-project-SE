package com.huawei.hms.rn.location.backend.utils;

import android.os.Build;
import android.util.Log;
import com.huawei.hms.rn.location.backend.interfaces.HMSProvider;
import com.huawei.hms.rn.location.backend.interfaces.TriMapper;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class PermissionUtils {
    public static final TriMapper<Integer, String[], int[], JSONObject> HANDLE_PERMISSION_REQUEST_RESULT = PlatformUtils.triMapperWrapper(t.a, new JSONObject());
    private static int REQUEST_ACTIVITY;
    private static int REQUEST_ACTIVITY_P;
    private static int REQUEST_LOCATION;
    private static int REQUEST_LOCATION_P;
    private static final String TAG = null;

    static {
        C0201.m83(PermissionUtils.class, 197);
    }

    public static /* synthetic */ JSONObject a(Integer num, String[] strArr, int[] iArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean equals = num.equals(Integer.valueOf(REQUEST_LOCATION));
        String r1 = C0201.m82(3248);
        boolean z = true;
        if (equals || num.equals(Integer.valueOf(REQUEST_LOCATION_P))) {
            jSONObject.put(r1, iArr[0] == 0);
            jSONObject.put(C0201.m82(3250), iArr[0] == 0);
            jSONObject.put(C0201.m82(3251), iArr[1] == 0);
            if (num.equals(Integer.valueOf(REQUEST_LOCATION))) {
                if (iArr[2] != 0) {
                    z = false;
                }
                jSONObject.put(C0201.m82(3252), z);
            }
        } else if (num.equals(Integer.valueOf(REQUEST_ACTIVITY)) || num.equals(Integer.valueOf(REQUEST_ACTIVITY_P))) {
            jSONObject.put(r1, iArr[0] == 0);
            if (iArr[0] != 0) {
                z = false;
            }
            jSONObject.put(C0201.m82(3249), z);
        }
        return jSONObject;
    }

    public static boolean hasActivityRecognitionPermission(HMSProvider hMSProvider) {
        return (Build.VERSION.SDK_INT <= 28 && hMSProvider.hasPermission(C0201.m82(3253))) || (Build.VERSION.SDK_INT >= 28 && hMSProvider.hasPermission(C0201.m82(3254)));
    }

    public static boolean hasLocationPermission(HMSProvider hMSProvider) {
        boolean z = false;
        boolean z2 = hMSProvider.hasPermission(C0201.m82(3255)) || hMSProvider.hasPermission(C0201.m82(3256));
        if (z2 && Build.VERSION.SDK_INT < 28) {
            return z2;
        }
        boolean hasPermission = hMSProvider.hasPermission(C0201.m82(3257));
        if (z2 || hasPermission) {
            z = true;
        }
        return z;
    }

    public static void requestActivityRecognitionPermission(HMSProvider hMSProvider) {
        Log.d(TAG, C0201.m82(3258));
        if (hasActivityRecognitionPermission(hMSProvider)) {
            Log.d(TAG, C0201.m82(3259));
        }
        if (Build.VERSION.SDK_INT <= 28) {
            hMSProvider.requestPermission(REQUEST_ACTIVITY_P, C0201.m82(3260));
        } else {
            hMSProvider.requestPermission(REQUEST_ACTIVITY, C0201.m82(3261));
        }
        Log.d(TAG, C0201.m82(3262));
    }

    public static void requestLocationPermission(HMSProvider hMSProvider) {
        Log.d(TAG, C0201.m82(3263));
        if (hasLocationPermission(hMSProvider)) {
            Log.d(TAG, C0201.m82(3264));
        }
        int i = Build.VERSION.SDK_INT;
        String r2 = C0201.m82(3265);
        String r3 = C0201.m82(3266);
        if (i <= 28) {
            hMSProvider.requestPermissions(REQUEST_LOCATION_P, new String[]{r3, r2});
        } else {
            hMSProvider.requestPermissions(REQUEST_LOCATION, new String[]{r3, r2, C0201.m82(3267)});
        }
        Log.d(TAG, C0201.m82(3268));
    }
}
