package com.huawei.hianalytics.ab.bc.bc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public abstract class ab {

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hianalytics.ab.bc.bc.ab$ab  reason: collision with other inner class name */
    public static class C0079ab extends Exception {
        public C0079ab(String str) {
            super(str);
        }
    }

    private static Object ab(Class cls, String str, Class[] clsArr, Object[] objArr) {
        String r4;
        String r0 = C0201.m82(15513);
        if (cls != null) {
            if (clsArr == null) {
                if (objArr != null) {
                    throw new C0079ab(C0201.m82(15514));
                }
            } else if (objArr == null) {
                throw new C0079ab(C0201.m82(15521));
            } else if (clsArr.length != objArr.length) {
                throw new C0079ab(C0201.m82(15519) + clsArr.length + C0201.m82(15520) + objArr.length);
            }
            try {
                try {
                    return cls.getMethod(str, clsArr).invoke(null, objArr);
                } catch (IllegalAccessException unused) {
                    r4 = C0201.m82(15517);
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, r4);
                    return null;
                } catch (IllegalArgumentException unused2) {
                    r4 = C0201.m82(15516);
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, r4);
                    return null;
                } catch (InvocationTargetException unused3) {
                    r4 = C0201.m82(15515);
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, r4);
                    return null;
                }
            } catch (NoSuchMethodException unused4) {
                com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(15518));
                return null;
            }
        } else {
            throw new C0079ab(C0201.m82(15522));
        }
    }

    private static Object ab(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        String r0 = C0201.m82(15523);
        try {
            return ab(Class.forName(str), str2, clsArr, objArr);
        } catch (ClassNotFoundException unused) {
            str3 = C0201.m82(15525);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str3);
            return null;
        } catch (C0079ab unused2) {
            str3 = C0201.m82(15524);
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str3);
            return null;
        }
    }

    public static String ab() {
        return ab(C0201.m82(15526), C0201.m82(15527));
    }

    @SuppressLint({"HardwareIds"})
    public static String ab(Context context) {
        return context == null ? C0201.m82(15528) : Settings.Secure.getString(context.getContentResolver(), C0201.m82(15529));
    }

    public static String ab(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String ab = ab(C0201.m82(15530), str, str2);
        return TextUtils.isEmpty(ab) ? ab(C0201.m82(15531), str, str2) : ab;
    }

    private static String ab(String str, String str2, String str3) {
        Object ab = ab(str, C0201.m82(15532), new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return ab != null ? (String) ab : str3;
    }

    public static String bc() {
        String ab = ab(C0201.m82(15533), C0201.m82(15534), C0201.m82(15535));
        String r2 = C0201.m82(15537);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(15536) + ab);
        if (!TextUtils.isEmpty(ab)) {
            return ab;
        }
        String str = Build.DISPLAY;
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(15538) + str);
        return str;
    }

    public static String bc(Context context) {
        Object obj;
        String r0 = C0201.m82(15539);
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get(C0201.m82(15540))) == null) {
                return r0;
            }
            String obj2 = obj.toString();
            return obj2.length() > 256 ? r0 : obj2;
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(15541), C0201.m82(15542));
            return r0;
        }
    }

    public static String cd(Context context) {
        return context == null ? C0201.m82(15543) : context.getPackageName();
    }

    public static String de(Context context) {
        String r0 = C0201.m82(15544);
        if (context == null) {
            return r0;
        }
        try {
            return context.getPackageManager().getPackageInfo(cd(context), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(15545), C0201.m82(15546));
            return r0;
        }
    }
}
