package com.huawei.hianalytics.ab.bc.ij;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.cd;
import java.util.Map;
import vigqyno.C0201;

@SuppressLint({"ApplySharedPref"})
public class ab {
    public static long ab(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(1940), C0201.m82(1941));
            return j;
        }
        SharedPreferences cd = cd(context, str);
        return cd != null ? cd.getLong(str2, j) : j;
    }

    public static String ab(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(1942), C0201.m82(1943));
            return str3;
        }
        SharedPreferences cd = cd(context, str);
        return cd != null ? cd.getString(str2, str3) : str3;
    }

    public static void ab(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(1944), C0201.m82(1945));
            return;
        }
        boolean equals = C0201.m82(1946).equals(str);
        String r1 = C0201.m82(1947);
        String r2 = C0201.m82(1948);
        if (equals) {
            ab(context, r2, str);
            ab(context, r1, str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String r5 = C0201.m82(1949);
        sb.append(r5);
        sb.append(C0201.m82(1950));
        String sb2 = sb.toString();
        String str2 = str + r5 + C0201.m82(1951);
        String str3 = str + r5 + C0201.m82(1952);
        ab(context, r2, sb2);
        ab(context, r1, sb2);
        ab(context, r2, str2);
        ab(context, r1, str2);
        ab(context, r2, str3);
        ab(context, r1, str3);
    }

    public static void ab(Context context, String str, String... strArr) {
        String r4;
        String r0 = C0201.m82(1953);
        if (context == null || TextUtils.isEmpty(str)) {
            r4 = C0201.m82(1955);
        } else if (strArr == null) {
            r4 = C0201.m82(1954);
        } else {
            SharedPreferences cd = cd(context, str);
            if (cd != null) {
                SharedPreferences.Editor edit = cd.edit();
                if (strArr.length == 0) {
                    edit.clear();
                    edit.commit();
                    return;
                }
                for (String str2 : strArr) {
                    if (cd.contains(str2)) {
                        edit.remove(str2);
                        edit.commit();
                    }
                }
                return;
            }
            return;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, r4);
    }

    public static Map<String, ?> bc(Context context, String str) {
        return cd(context, str).getAll();
    }

    public static void bc(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(1956), C0201.m82(1957));
            return;
        }
        SharedPreferences cd = cd(context, str);
        if (cd != null) {
            SharedPreferences.Editor edit = cd.edit();
            edit.putLong(str2, j);
            edit.commit();
        }
    }

    public static void bc(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(C0201.m82(1958), C0201.m82(1959));
            return;
        }
        SharedPreferences cd = cd(context, str);
        if (cd != null) {
            SharedPreferences.Editor edit = cd.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    private static SharedPreferences cd(Context context, String str) {
        return context.getSharedPreferences(de(context, str), 0);
    }

    public static String de(Context context, String str) {
        String packageName = context.getPackageName();
        String kl = cd.kl(C0201.m82(1960), C0201.m82(1961));
        boolean isEmpty = TextUtils.isEmpty(kl);
        String r2 = C0201.m82(1962);
        String r3 = C0201.m82(1963);
        if (isEmpty) {
            return r2 + str + r3 + packageName;
        }
        return r2 + str + r3 + packageName + r3 + kl;
    }
}
