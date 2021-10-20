package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

public class AGCUtils {
    private static boolean a(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageName());
    }

    private static String b(Context context) {
        Object obj;
        String r0 = C0201.m82(33697);
        PackageManager packageManager = context.getPackageManager();
        String r2 = C0201.m82(33698);
        String r3 = C0201.m82(33699);
        if (packageManager == null) {
            HMSLog.e(r3, C0201.m82(33700));
            return r2;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get(C0201.m82(33701))) == null) {
                HMSLog.e(r3, r0);
                return r2;
            }
            String valueOf = String.valueOf(obj);
            return valueOf.startsWith(C0201.m82(33702)) ? valueOf.substring(6) : valueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(r3, r0);
            return r2;
        }
    }

    private static String c(Context context) {
        Object obj;
        String r0 = C0201.m82(33703);
        PackageManager packageManager = context.getPackageManager();
        String r2 = C0201.m82(33704);
        String r3 = C0201.m82(33705);
        if (packageManager == null) {
            HMSLog.e(r3, C0201.m82(33706));
            return r2;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get(C0201.m82(33707))) == null) {
                HMSLog.i(r3, r0);
                return r2;
            }
            String valueOf = String.valueOf(obj);
            return valueOf.startsWith(C0201.m82(33708)) ? valueOf.substring(5) : valueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(r3, r0);
            return r2;
        }
    }

    public static String getAppId(Context context) {
        boolean a = a(context);
        String r1 = C0201.m82(33709);
        if (a) {
            return a(context, r1);
        }
        String str = null;
        try {
            str = ib2.a(context).c(r1);
        } catch (NullPointerException unused) {
            HMSLog.e(C0201.m82(33710), C0201.m82(33711));
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b = b(context);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        return a(context, r1);
    }

    public static String getCpId(Context context) {
        boolean a = a(context);
        String r1 = C0201.m82(33712);
        if (a) {
            return a(context, r1);
        }
        String str = null;
        try {
            str = ib2.a(context).c(r1);
        } catch (NullPointerException unused) {
            HMSLog.e(C0201.m82(33713), C0201.m82(33714));
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String c = c(context);
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        return a(context, r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0086  */
    private static String a(Context context, String str) {
        String str2;
        String r0 = C0201.m82(33689);
        String r1 = C0201.m82(33690);
        String r2 = C0201.m82(33691);
        ib2 a = ib2.a(context);
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().getAssets().open(C0201.m82(33692));
            a.d(inputStream);
            str2 = a.c(str);
            IOUtils.closeQuietly(inputStream);
        } catch (IOException e) {
            HMSLog.e(r2, r0 + str + C0201.m82(33694) + e);
        } catch (NullPointerException e2) {
            HMSLog.e(r2, r0 + str + C0201.m82(33693) + e2);
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStream);
            throw th;
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        HMSLog.e(r2, C0201.m82(33695) + str + C0201.m82(33696));
        return r1;
        IOUtils.closeQuietly(inputStream);
        str2 = r1;
        if (TextUtils.isEmpty(str2)) {
        }
    }
}
