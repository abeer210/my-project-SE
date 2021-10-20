package com.huawei.hms.api;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import vigqyno.C0201;

public abstract class HuaweiMobileServicesUtil {
    public static final String HMS_ERROR_DIALOG = null;

    static {
        C0201.m83(HuaweiMobileServicesUtil.class, 354);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return HuaweiApiAvailability.getInstance().getErrorDialog(activity, i, i2, null);
    }

    public static String getErrorString(int i) {
        return HuaweiApiAvailability.getInstance().getErrorString(i);
    }

    @Deprecated
    public static String getOpenSourceSoftwareLicenseInfo(Context context) {
        return C0201.m82(37);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext(HMSPackageManager.getInstance(context).getHMSPackageName(), 2);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication(HMSPackageManager.getInstance(context).getHMSPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int isHuaweiMobileServicesAvailable(Context context, int i) {
        Checker.checkNonNull(context, C0201.m82(38));
        if (Build.VERSION.SDK_INT < 16) {
            return 21;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String hMSPackageName = HMSPackageManager.getInstance(context).getHMSPackageName();
        String r3 = C0201.m82(40);
        HMSLog.i(r3, C0201.m82(39) + hMSPackageName);
        PackageManagerHelper.PackageStates packageStates = packageManagerHelper.getPackageStates(hMSPackageName);
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageStates)) {
            HMSLog.i(r3, C0201.m82(41));
            return 1;
        } else if (PackageManagerHelper.PackageStates.DISABLED.equals(packageStates)) {
            HMSLog.i(r3, C0201.m82(42));
            return 3;
        } else {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(HMSPackageManager.getInstance(context).getHMSPackageStates())) {
                String packageSignature = packageManagerHelper.getPackageSignature(hMSPackageName);
                if (!C0201.m82(43).equalsIgnoreCase(packageSignature)) {
                    String r1 = C0201.m82(44);
                    if (!r1.equalsIgnoreCase(packageSignature) && !r1.equalsIgnoreCase(packageSignature)) {
                        return 9;
                    }
                }
            }
            HMSLog.i(r3, C0201.m82(45) + HMSPackageManager.getInstance(context).getHmsVersionCode());
            if (!HMSPackageManager.getInstance(context).isApkUpdateNecessary(i)) {
                return 0;
            }
            HMSLog.i(r3, C0201.m82(46));
            return 2;
        }
    }

    public static boolean isUserRecoverableError(int i) {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(i);
    }

    public static boolean popupErrDlgFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return HuaweiApiAvailability.getInstance().showErrorDialogFragment(activity, i, i2, onCancelListener);
    }

    public static void setApplication(Application application) {
        ActivityMgr.INST.init(application);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return HuaweiApiAvailability.getInstance().showErrorDialogFragment(activity, i, i2, null);
    }

    public static void showErrorNotification(int i, Context context) {
        HuaweiApiAvailability.getInstance().showErrorNotification(context, i);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return HuaweiApiAvailability.getInstance().getErrorDialog(activity, i, i2, onCancelListener);
    }

    public static boolean popupErrDlgFragment(int i, Activity activity, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return HuaweiApiAvailability.getInstance().showErrorDialogFragment(activity, i, fragment, i2, onCancelListener);
    }

    public static int isHuaweiMobileServicesAvailable(Context context) {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context);
    }
}
