package com.huawei.hms.support.api.a.c;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: PermissionUtil */
public class d {
    public static boolean a(Context context) {
        return b(context, C0201.m82(17604)) || b(context, C0201.m82(17605));
    }

    public static boolean b(Context context) {
        if (!b(context, C0201.m82(17614))) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return true;
        }
        return b(context, C0201.m82(17615));
    }

    public static boolean a(String str, Context context) {
        String r0 = C0201.m82(17606);
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 23) {
                Object systemService = context.getSystemService(C0201.m82(17607));
                if (systemService instanceof AppOpsManager) {
                    if (((AppOpsManager) systemService).noteOp(C0201.m82(17608), Process.myUid(), str) == 0) {
                        return true;
                    }
                    return false;
                }
                HMSLog.i(r0, C0201.m82(17609));
                return false;
            }
            if (Settings.Secure.getInt(context.getContentResolver(), C0201.m82(17610), 0) == 0) {
                z = false;
            }
            HMSLog.i(r0, C0201.m82(17611) + z);
            return z;
        } catch (SecurityException unused) {
            HMSLog.i(r0, C0201.m82(17613));
            return false;
        } catch (Exception unused2) {
            HMSLog.i(r0, C0201.m82(17612));
            return false;
        }
    }

    private static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.i(C0201.m82(17616), C0201.m82(17617));
            return false;
        } else if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        return b(context, str);
    }
}
