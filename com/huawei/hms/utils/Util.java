package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;
import vigqyno.C0201;

public class Util {
    private static final String AVAILABLE_LOADED = null;
    private static final Object LOCK_OBJECT = new Object();
    private static final String META_HMSVERSION_NAME = null;
    private static final String TAG = null;
    private static boolean availableInit;
    private static boolean isAvailableAvailable;

    static {
        C0201.m83(Util.class, 416);
    }

    public static int compareHmsVersion(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        if (StringUtil.checkVersion(str) && StringUtil.checkVersion(str2)) {
            String r0 = C0201.m82(21481);
            String[] split = str.split(r0);
            String[] split2 = str2.split(r0);
            if (2 < split.length && 2 < split2.length) {
                if (Integer.parseInt(split[0]) > Integer.parseInt(split2[0])) {
                    return 1;
                }
                if (Integer.parseInt(split[0]) < Integer.parseInt(split2[0])) {
                    return -1;
                }
                if (Integer.parseInt(split[1]) > Integer.parseInt(split2[1])) {
                    return 1;
                }
                if (Integer.parseInt(split[1]) < Integer.parseInt(split2[1])) {
                    return -1;
                }
                if (Integer.parseInt(split[2]) > Integer.parseInt(split2[2])) {
                    return 1;
                }
                if (Integer.parseInt(split[2]) < Integer.parseInt(split2[2])) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static Activity getActiveActivity(Activity activity, Context context) {
        return UIUtil.getActiveActivity(activity, context);
    }

    public static String getAppId(Context context) {
        return AGCUtils.getAppId(context);
    }

    public static String getAppName(Context context, String str) {
        String r0 = C0201.m82(21482);
        String r1 = C0201.m82(21483);
        if (context == null) {
            HMSLog.e(r0, C0201.m82(21484));
            return r1;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e(r0, C0201.m82(21485));
            return r1;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0));
            return applicationLabel == null ? r1 : applicationLabel.toString();
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            HMSLog.e(r0, C0201.m82(21486));
            return r1;
        }
    }

    public static String getCpId(Context context) {
        return AGCUtils.getCpId(context);
    }

    public static int getHmsVersion(Context context) {
        Object obj;
        String r0 = C0201.m82(21487);
        PackageManager packageManager = context.getPackageManager();
        String r3 = C0201.m82(21488);
        if (packageManager == null) {
            HMSLog.e(r3, C0201.m82(21489));
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (!(applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get(C0201.m82(21490))) == null)) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf)) {
                    return StringUtil.convertVersion2Integer(valueOf);
                }
            }
            HMSLog.i(r3, r0);
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(r3, r0);
            return 0;
        }
    }

    public static String getNetType(Context context) {
        return SystemUtils.getNetType(context);
    }

    public static String getProcessName(Context context, int i) {
        return UIUtil.getProcessName(context, i);
    }

    @Deprecated
    public static String getProductCountry() {
        int lastIndexOf;
        String r0 = C0201.m82(21491);
        String r1 = C0201.m82(21492);
        String systemProperties = getSystemProperties(r0, r1);
        if (!TextUtils.isEmpty(systemProperties)) {
            return systemProperties;
        }
        String systemProperties2 = getSystemProperties(C0201.m82(21493), r1);
        if (!TextUtils.isEmpty(systemProperties2) && (lastIndexOf = systemProperties2.lastIndexOf(C0201.m82(21494))) != -1) {
            return systemProperties2.substring(lastIndexOf + 1);
        }
        String localCountry = SystemUtils.getLocalCountry();
        return !TextUtils.isEmpty(localCountry) ? localCountry : r1;
    }

    public static String getSystemProperties(String str, String str2) {
        return SystemUtils.getSystemProperties(str, str2);
    }

    public static Activity getValidActivity(Activity activity, Activity activity2) {
        if (activity != null && !activity.isFinishing()) {
            return activity;
        }
        if (activity2 == null || activity2.isFinishing()) {
            return null;
        }
        return activity2;
    }

    public static boolean isAvailableLibExist(Context context) {
        Object obj;
        synchronized (LOCK_OBJECT) {
            if (!availableInit) {
                boolean z = false;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    HMSLog.e(C0201.m82(21495), C0201.m82(21496));
                    try {
                        Class.forName(C0201.m82(21497));
                        z = true;
                    } catch (ClassNotFoundException unused) {
                        HMSLog.e(C0201.m82(21498), C0201.m82(21499));
                    }
                } else {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                        if (!(applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get(C0201.m82(21500))) == null || !String.valueOf(obj).equalsIgnoreCase(C0201.m82(21501)))) {
                            HMSLog.i(C0201.m82(21502), C0201.m82(21503));
                            z = true;
                        }
                        HMSLog.e(C0201.m82(21504), C0201.m82(21505));
                    } catch (PackageManager.NameNotFoundException unused2) {
                        HMSLog.e(C0201.m82(21506), C0201.m82(21507));
                    }
                }
                isAvailableAvailable = z;
                availableInit = true;
            }
        }
        String r6 = C0201.m82(21508);
        HMSLog.i(r6, C0201.m82(21509) + isAvailableAvailable);
        return isAvailableAvailable;
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0201.m82(21510));
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(C0201.m82(21511));
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = getProcessName(context, Process.myPid());
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, processName)) {
                String r1 = C0201.m82(21513);
                HMSLog.i(r1, C0201.m82(21512) + runningAppProcessInfo.importance);
                boolean z = runningAppProcessInfo.importance == 100;
                boolean inKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                HMSLog.i(r1, C0201.m82(21514) + z + C0201.m82(21515) + inKeyguardRestrictedInputMode);
                if (!z || inKeyguardRestrictedInputMode) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isChinaROM() {
        return SystemUtils.isChinaROM();
    }

    public static boolean isEMUI() {
        return SystemUtils.isEMUI();
    }

    public static void unBindServiceCatchException(Context context, ServiceConnection serviceConnection) {
        String r0 = C0201.m82(21516);
        try {
            HMSLog.i(r0, C0201.m82(21517) + serviceConnection);
            context.unbindService(serviceConnection);
        } catch (Exception e) {
            HMSLog.e(r0, C0201.m82(21518) + e.getMessage());
        }
    }
}
