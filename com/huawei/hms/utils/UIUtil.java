package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;
import vigqyno.C0201;

public class UIUtil {
    public static Activity getActiveActivity(Activity activity, Context context) {
        boolean isBackground = isBackground(context);
        String r1 = C0201.m82(15926);
        if (isBackground) {
            HMSLog.i(r1, C0201.m82(15927) + isBackground(context));
            return null;
        } else if (activity != null && !activity.isFinishing()) {
            return activity;
        } else {
            HMSLog.i(r1, C0201.m82(15928) + activity + C0201.m82(15929) + activity.isFinishing());
            return ActivityMgr.INST.getCurrentActivity();
        }
    }

    public static String getProcessName(Context context, int i) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String r0 = C0201.m82(15930);
        if (!(context == null || (activityManager = (ActivityManager) context.getSystemService(C0201.m82(15931))) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return r0;
    }

    public static boolean isActivityFullscreen(Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024;
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean z;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0201.m82(15932));
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(C0201.m82(15933));
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = getProcessName(context, Process.myPid());
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, processName)) {
                String r1 = C0201.m82(15935);
                HMSLog.i(r1, C0201.m82(15934) + runningAppProcessInfo.importance);
                boolean z2 = runningAppProcessInfo.importance == 100;
                if (Build.VERSION.SDK_INT > 22) {
                    z = keyguardManager.isDeviceLocked();
                } else {
                    z = keyguardManager.inKeyguardRestrictedInputMode();
                }
                HMSLog.i(r1, C0201.m82(15936) + z2 + C0201.m82(15937) + z);
                if (!z2 || z) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
