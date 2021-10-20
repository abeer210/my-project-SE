package com.huawei.hms.api;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.HuaweiApiCallable;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public abstract class HuaweiApiAvailability {
    public static final String ACTIVITY_NAME = null;
    public static final String APPID_HMS = null;
    public static final String APPID_HMS_TV = null;
    public static final String HMS_API_NAME_GAME = null;
    public static final String HMS_API_NAME_IAP = null;
    public static final String HMS_API_NAME_ID = null;
    public static final String HMS_API_NAME_OD = null;
    public static final String HMS_API_NAME_PAY = null;
    public static final String HMS_API_NAME_PPS = null;
    public static final String HMS_API_NAME_PUSH = null;
    public static final String HMS_API_NAME_SNS = null;
    public static final int HMS_JSON_VERSION_MIN = 0;
    public static final int HMS_SDK_VERSION_CODE = 0;
    public static final String HMS_SDK_VERSION_NAME = null;
    public static final int HMS_VERSION_CODE_GAME = 0;
    public static final int HMS_VERSION_CODE_IAP = 0;
    public static final int HMS_VERSION_CODE_ID = 0;
    public static final int HMS_VERSION_CODE_MIN = 0;
    public static final int HMS_VERSION_CODE_OD = 0;
    public static final int HMS_VERSION_CODE_PAY = 0;
    public static final int HMS_VERSION_CODE_PPS = 0;
    public static final int HMS_VERSION_CODE_PUSH = 0;
    public static final int HMS_VERSION_CODE_SNS = 0;
    public static final int HMS_VERSION_MAX = 0;
    public static final int HMS_VERSION_MIN = 0;
    public static final int NOTICE_VERSION_CODE = 0;
    public static final String SERVICES_ACTION = null;
    @Deprecated
    public static final String SERVICES_PACKAGE = null;
    @Deprecated
    public static final String SERVICES_PACKAGE_TV = null;
    @Deprecated
    public static final String SERVICES_SIGNATURE = null;
    @Deprecated
    public static final String SERVICES_SIGNATURE_CAR = null;
    @Deprecated
    public static final String SERVICES_SIGNATURE_TV = null;
    public static int SERVICES_VERSION_CODE;
    private static final Map<String, Integer> a;

    static {
        C0201.m83(HuaweiApiAvailability.class, 233);
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(C0201.m82(26570), 30000000);
        a.put(C0201.m82(26571), 20503000);
        a.put(C0201.m82(26572), 20503000);
        a.put(C0201.m82(26573), 20503000);
        a.put(C0201.m82(26574), 20503000);
        a.put(C0201.m82(26575), 20601000);
        a.put(C0201.m82(26576), 20700300);
        a.put(C0201.m82(26577), 20700300);
    }

    public static Map<String, Integer> getApiMap() {
        return a;
    }

    public static HuaweiApiAvailability getInstance() {
        return b.a();
    }

    public static int getServicesVersionCode() {
        return SERVICES_VERSION_CODE;
    }

    public static void setServicesVersionCode(int i) {
        SERVICES_VERSION_CODE = i;
    }

    public abstract Task<Void> checkApiAccessible(HuaweiApi<?> huaweiApi, HuaweiApi<?>... huaweiApiArr);

    public abstract Task<Void> checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr);

    public abstract PendingIntent getErrPendingIntent(Context context, int i, int i2);

    public abstract PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult);

    public abstract Dialog getErrorDialog(Activity activity, int i, int i2);

    public abstract Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener);

    public abstract String getErrorString(int i);

    public abstract Task<Void> getHuaweiServicesReady(Activity activity);

    public abstract Intent getResolveErrorIntent(Activity activity, int i);

    public abstract PendingIntent getResolveErrorPendingIntent(Activity activity, int i);

    public abstract int isHuaweiMobileNoticeAvailable(Context context);

    public abstract int isHuaweiMobileServicesAvailable(Context context);

    public abstract int isHuaweiMobileServicesAvailable(Context context, int i);

    public abstract boolean isUserResolvableError(int i);

    public abstract boolean isUserResolvableError(int i, PendingIntent pendingIntent);

    public abstract void popupErrNotification(Context context, ConnectionResult connectionResult);

    public abstract void resolveError(Activity activity, int i, int i2);

    public abstract void resolveError(Activity activity, int i, int i2, PendingIntent pendingIntent);

    public abstract boolean showErrorDialogFragment(Activity activity, int i, int i2);

    public abstract boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener);

    public abstract boolean showErrorDialogFragment(Activity activity, int i, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener);

    public abstract void showErrorNotification(Context context, int i);
}
