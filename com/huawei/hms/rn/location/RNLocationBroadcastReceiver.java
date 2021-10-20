package com.huawei.hms.rn.location;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.List;
import vigqyno.C0201;

public class RNLocationBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = RNLocationBroadcastReceiver.class.getName();

    private boolean isAppOnForeground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C0201.m82(9157))).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, C0201.m82(9158));
        if (!isAppOnForeground(context)) {
            intent.setClass(context, RNTaskService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
                return;
            }
            context.startService(intent);
            di0.acquireWakeLockNow(context);
        }
    }
}
