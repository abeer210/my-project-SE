package com.huawei.hianalytics.ab.cd.bc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.huawei.hianalytics.ab.bc.bc.ab;
import com.huawei.hianalytics.ab.bc.kl.bc;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public class cd extends ab {
    public static String cd() {
        String str;
        String r0 = C0201.m82(21270);
        String r1 = C0201.m82(21271);
        try {
            String str2 = (String) Class.forName(C0201.m82(21272)).getMethod(C0201.m82(21273), new Class[0]).invoke(null, new Object[0]);
            try {
                com.huawei.hianalytics.ab.bc.ef.ab.cd(r0, C0201.m82(21274));
                return str2;
            } catch (ClassNotFoundException unused) {
                r1 = str2;
            } catch (AndroidRuntimeException unused2) {
                r1 = str2;
                str = C0201.m82(21279);
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
                return r1;
            } catch (NoSuchMethodException unused3) {
                r1 = str2;
                str = C0201.m82(21278);
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
                return r1;
            } catch (IllegalAccessException unused4) {
                r1 = str2;
                str = C0201.m82(21277);
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
                return r1;
            } catch (IllegalArgumentException unused5) {
                r1 = str2;
                str = C0201.m82(21276);
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
                return r1;
            } catch (InvocationTargetException unused6) {
                r1 = str2;
                str = C0201.m82(21275);
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
                return r1;
            }
        } catch (ClassNotFoundException unused7) {
            str = C0201.m82(21280);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
            return r1;
        } catch (AndroidRuntimeException unused8) {
            str = C0201.m82(21279);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
            return r1;
        } catch (NoSuchMethodException unused9) {
            str = C0201.m82(21278);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
            return r1;
        } catch (IllegalAccessException unused10) {
            str = C0201.m82(21277);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
            return r1;
        } catch (IllegalArgumentException unused11) {
            str = C0201.m82(21276);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
            return r1;
        } catch (InvocationTargetException unused12) {
            str = C0201.m82(21275);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
            return r1;
        }
    }

    public static Pair<String, String> ef(Context context) {
        boolean ab = bc.ab(context, C0201.m82(21281));
        String r1 = C0201.m82(21282);
        if (ab) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(21283), C0201.m82(21284));
            return new Pair<>(r1, r1);
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C0201.m82(21285));
        if (telephonyManager == null) {
            return new Pair<>(r1, r1);
        }
        if (telephonyManager.getSimState() != 5) {
            return new Pair<>(r1, r1);
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, C0201.m82(21286))) ? new Pair<>(r1, r1) : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>(r1, r1);
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public static String fg(Context context) {
        boolean ab = bc.ab(context, C0201.m82(21287));
        String r1 = C0201.m82(21288);
        if (ab) {
            return r1;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C0201.m82(21289));
            return telephonyManager != null ? telephonyManager.getDeviceId() : r1;
        } catch (SecurityException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.bc(C0201.m82(21290), C0201.m82(21291));
            return r1;
        }
    }

    private static String gh(Context context) {
        String r0 = C0201.m82(21292);
        com.huawei.hianalytics.ab.bc.ef.ab.ab(r0, C0201.m82(21293));
        String r1 = C0201.m82(21294);
        if (context == null || bc.ab(context, C0201.m82(21295))) {
            return r1;
        }
        try {
            return Build.VERSION.SDK_INT >= 26 ? Build.getSerial() : r1;
        } catch (SecurityException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(21296));
            return r1;
        }
    }

    public static String hi(Context context) {
        String str = Build.SERIAL;
        return (TextUtils.isEmpty(str) || str.equalsIgnoreCase(C0201.m82(21297))) ? gh(context) : str;
    }
}
