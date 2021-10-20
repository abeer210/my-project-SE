package com.huawei.updatesdk.a.a.c.h;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.updatesdk.a.a.b.a.a.a;
import com.huawei.updatesdk.a.a.c.c;
import com.huawei.updatesdk.a.a.c.e;
import com.huawei.updatesdk.service.otaupdate.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import vigqyno.C0201;

public class b {
    private static b c = new b();
    private static String d = null;
    private int a = 0;
    private int b = 0;

    private b() {
        if (a(C0201.m82(12505), 0) == 1) {
            this.a = 1;
        }
        this.b = a(C0201.m82(12506), 0);
    }

    public static int a(String str, int i) {
        try {
            Class<?> cls = Class.forName(C0201.m82(12507));
            return ((Integer) cls.getMethod(C0201.m82(12508), String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            a.a(C0201.m82(12509), C0201.m82(12510), th);
            return i;
        }
    }

    public static String a(Context context) {
        if (d == null) {
            d = e.a(b(context), C0201.m82(12511));
        }
        return d;
    }

    public static String a(Context context, String str) {
        String r0 = C0201.m82(12512);
        if (TextUtils.isEmpty(str)) {
            str = C0201.m82(12513);
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 16).versionName + r0;
        } catch (PackageManager.NameNotFoundException unused) {
            return r0;
        }
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(46));
        } catch (Exception e) {
            a.b(C0201.m82(12514), e.toString());
            return null;
        }
    }

    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(C0201.m82(12515));
            return (String) cls.getMethod(C0201.m82(12516), String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            a.a(C0201.m82(12517), C0201.m82(12518), th);
            return str2;
        }
    }

    public static List<String> a(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a(str, strArr)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static boolean a(String str, String[] strArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (String str2 : strArr) {
            String r8 = C0201.m82(12519);
            if (str2.startsWith(r8)) {
                i = 1;
            } else if (!str2.contains(C0201.m82(12520))) {
                i2++;
            }
            if (str2.endsWith(r8 + str)) {
                i3++;
            }
        }
        return i + i2 == i3;
    }

    public static String b(Context context, String str) {
        String a2 = a(context, str);
        int i = 0;
        int i2 = 0;
        while (i < a2.length() && i2 < 3) {
            if (a2.charAt(i) == '.') {
                i2++;
            }
            i++;
        }
        return 3 == i2 ? a2.substring(0, i - 1) : a2;
    }

    private static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                String str = featureInfo.name;
                if (str != null) {
                    arrayList.add(c.a(str));
                }
            }
        }
        return arrayList;
    }

    private static DisplayMetrics c(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService(C0201.m82(12521));
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String c() {
        try {
            Object obj = Class.forName(C0201.m82(12522)).getField(C0201.m82(12523)).get(null);
            return obj == null ? Build.DISPLAY : obj.toString();
        } catch (IllegalAccessException unused) {
            return Build.DISPLAY;
        } catch (NoSuchFieldException unused2) {
            return Build.DISPLAY;
        } catch (ClassNotFoundException unused3) {
            return Build.DISPLAY;
        } catch (Throwable unused4) {
            return Build.DISPLAY;
        }
    }

    public static String c(Context context, String str) {
        String r5;
        String a2 = h.g().a();
        boolean isEmpty = TextUtils.isEmpty(a2);
        String r2 = C0201.m82(12524);
        if (isEmpty) {
            r5 = C0201.m82(12525);
        } else {
            String str2 = null;
            try {
                GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
                grsBaseInfo.setSerCountry(a2);
                str2 = new GrsClient(context, grsBaseInfo).synGetGrsUrl(h.g().e() ? C0201.m82(12526) : C0201.m82(12527), C0201.m82(12528));
            } catch (Throwable th) {
                Log.w(r2, C0201.m82(12529) + th.toString());
            }
            if (TextUtils.isEmpty(str2)) {
                r5 = C0201.m82(12530);
            } else {
                Log.i(r2, C0201.m82(12531) + a(str2));
                return str2;
            }
        }
        Log.i(r2, r5);
        return str;
    }

    public static b d() {
        return c;
    }

    public static List<String> d(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        Configuration configuration = context.getResources().getConfiguration();
        if (i >= 24) {
            LocaleList locales = configuration.getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                String language = locales.get(i2).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
        } else {
            arrayList.add(configuration.locale.getLanguage());
        }
        return arrayList;
    }

    public static String e(Context context) {
        DisplayMetrics c2 = c(context);
        if (c2 == null) {
            return C0201.m82(12533);
        }
        String valueOf = String.valueOf(c2.widthPixels);
        String valueOf2 = String.valueOf(c2.heightPixels);
        return valueOf + C0201.m82(12532) + valueOf2;
    }

    public static String[] e() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            return strArr == null ? new String[0] : strArr;
        }
        return new String[]{Build.CPU_ABI};
    }

    public static String f() {
        String str;
        String str2;
        Locale locale = Locale.getDefault();
        String r1 = C0201.m82(12534);
        if (locale != null) {
            str = locale.getLanguage();
            if (Build.VERSION.SDK_INT >= 21) {
                r1 = locale.getScript();
            }
            str2 = locale.getCountry();
        } else {
            str = C0201.m82(12535);
            str2 = C0201.m82(12536);
        }
        boolean isEmpty = TextUtils.isEmpty(r1);
        String r4 = C0201.m82(12537);
        if (isEmpty) {
            return str + r4 + str2;
        }
        return str + r4 + r1 + r4 + str2;
    }

    public static String f(Context context) {
        DisplayMetrics c2 = c(context);
        return c2 != null ? String.valueOf(c2.densityDpi) : C0201.m82(12538);
    }

    public static int g(Context context) {
        try {
            return Integer.parseInt(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode + C0201.m82(12539));
        } catch (Exception unused) {
            return 1;
        }
    }

    public static boolean g() {
        String str = Build.BRAND;
        String r1 = C0201.m82(12540);
        return r1.equalsIgnoreCase(str) || r1.equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static String h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName + C0201.m82(12541);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean i(Context context) {
        String r0 = C0201.m82(12542);
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo(C0201.m82(12543), 16);
            packageManager.getPackageInfo(C0201.m82(12544), 16);
            return (packageManager.getPackageInfo(C0201.m82(12545), 16).applicationInfo.flags & 1) != 0;
        } catch (Exception e) {
            a.b(r0, e.getMessage());
            return false;
        }
    }

    public int a() {
        return this.a;
    }

    public void a(Window window) {
        if (com.huawei.updatesdk.b.f.a.d().a() >= 21 && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                Class<?> cls = Class.forName(C0201.m82(12546));
                Object newInstance = cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes);
                cls.getMethod(C0201.m82(12547), Integer.TYPE).invoke(newInstance, 1);
            } catch (Throwable unused) {
                a.b(C0201.m82(12548), C0201.m82(12549));
            }
        }
    }

    public int b() {
        return this.b;
    }
}
