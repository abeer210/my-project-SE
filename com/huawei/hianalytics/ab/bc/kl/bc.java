package com.huawei.hianalytics.ab.bc.kl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.ij.ab;
import java.io.File;
import vigqyno.C0201;

public class bc {
    public static boolean ab(Context context) {
        return System.currentTimeMillis() - ab.ab(context, C0201.m82(21724), C0201.m82(21725), -1) > 43200000;
    }

    public static boolean ab(Context context, String str) {
        if (context == null) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        String r3 = C0201.m82(21726);
        String r4 = C0201.m82(21727);
        if (i < 23) {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return false;
            }
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r4, r3);
            return true;
        } else if (context.checkSelfPermission(str) == 0) {
            return false;
        } else {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r4, r3);
            return true;
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean ab(Context context, String str, int i) {
        String str2 = ab.de(context, str) + C0201.m82(21728);
        long length = new File(context.getFilesDir(), C0201.m82(21729) + str2).length();
        if (length <= ((long) i)) {
            return false;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(21731), String.format(C0201.m82(21730), Long.valueOf(length), Integer.valueOf(i)));
        return true;
    }

    public static boolean ab(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(21732), C0201.m82(21733));
            return true;
        }
    }
}
