package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public class AnalyticsSwitchHolder {
    private static final int ANALYTICS_DISABLED = 0;
    private static final int ANALYTICS_ENABLED = 0;
    private static final Object LOCK_OBJ = new Object();
    private static final String META_BI_REPORT_SETTING = null;
    private static final String META_BI_SETTING = null;
    private static final int NOT_CHECKED = 0;
    private static final String TAG = null;
    private static int analyticsState;

    static {
        C0201.m83(AnalyticsSwitchHolder.class, 460);
    }

    private static boolean getBiIsReportSetting(Context context) {
        String r1 = C0201.m82(25523);
        if (context == null) {
            HMSLog.e(r1, C0201.m82(25524));
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    return applicationInfo.metaData.getBoolean(C0201.m82(25525));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.e(r1, C0201.m82(25526));
            }
        }
        HMSLog.i(r1, C0201.m82(25527));
        return false;
    }

    public static boolean getBiSetting(Context context) {
        String r1 = C0201.m82(25528);
        if (context == null) {
            HMSLog.e(r1, C0201.m82(25529));
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    return applicationInfo.metaData.getBoolean(C0201.m82(25530));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.e(r1, C0201.m82(25531));
            }
        }
        HMSLog.i(r1, C0201.m82(25532));
        return false;
    }

    public static boolean isAnalyticsDisabled(Context context) {
        synchronized (LOCK_OBJ) {
            boolean z = true;
            if (analyticsState == 0) {
                if (context == null) {
                    return true;
                }
                if (getBiIsReportSetting(context)) {
                    HMSLog.i(C0201.m82(25533), C0201.m82(25534));
                    analyticsState = 1;
                } else if (getBiSetting(context)) {
                    HMSLog.i(C0201.m82(25535), C0201.m82(25536));
                    analyticsState = 2;
                } else if (C0201.m82(25537).equalsIgnoreCase(GrsApp.getInstance().getIssueCountryCode(context))) {
                    analyticsState = 1;
                } else {
                    HMSLog.i(C0201.m82(25538), C0201.m82(25539));
                    try {
                        int i = Settings.Secure.getInt(context.getContentResolver(), C0201.m82(25540));
                        String r1 = C0201.m82(25541);
                        HMSLog.i(r1, C0201.m82(25542) + i);
                        if (i == 1) {
                            analyticsState = 1;
                        } else {
                            analyticsState = 2;
                        }
                    } catch (Settings.SettingNotFoundException unused) {
                        HMSLog.i(C0201.m82(25543), C0201.m82(25544));
                        analyticsState = 2;
                    }
                }
            }
            if (analyticsState == 1) {
                z = false;
            }
            return z;
        }
    }
}
