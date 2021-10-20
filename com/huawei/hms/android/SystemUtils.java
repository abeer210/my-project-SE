package com.huawei.hms.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import vigqyno.C0201;

public class SystemUtils {
    private static String a() {
        return getSystemProperties(C0201.m82(2309), C0201.m82(2310));
    }

    private static String b() {
        return getSystemProperties(C0201.m82(2311), C0201.m82(2312));
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : C0201.m82(2313);
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(2314))) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? C0201.m82(2315) : activeNetworkInfo.getTypeName();
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            Class<?> cls = Class.forName(C0201.m82(2316));
            return (String) cls.getDeclaredMethod(C0201.m82(2317), String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e(C0201.m82(2319), C0201.m82(2318) + str);
            return str2;
        }
    }

    public static boolean isChinaROM() {
        String a = a();
        boolean isEmpty = TextUtils.isEmpty(a);
        String r2 = C0201.m82(2320);
        if (!isEmpty) {
            return r2.equalsIgnoreCase(a);
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            return b.toLowerCase(Locale.US).contains(r2);
        }
        String localCountry = getLocalCountry();
        if (!TextUtils.isEmpty(localCountry)) {
            return r2.equalsIgnoreCase(localCountry);
        }
        return false;
    }

    public static boolean isEMUI() {
        HMSLog.i(C0201.m82(2322), C0201.m82(2321) + HwBuildEx.VERSION.EMUI_SDK_INT);
        return HwBuildEx.VERSION.EMUI_SDK_INT > 0;
    }

    public static boolean isSystemApp(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (PackageManager.NameNotFoundException e) {
            HMSLog.e(C0201.m82(2324), C0201.m82(2323) + e);
            packageInfo = null;
        }
        if (packageInfo == null || (packageInfo.applicationInfo.flags & 1) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isTVDevice() {
        return getSystemProperties(C0201.m82(2325), C0201.m82(2326)).equalsIgnoreCase(C0201.m82(2327));
    }
}
