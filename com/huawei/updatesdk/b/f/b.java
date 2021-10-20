package com.huawei.updatesdk.b.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.updatesdk.a.a.c.d;
import com.huawei.updatesdk.service.otaupdate.h;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Field;
import vigqyno.C0201;

public class b {
    private static Integer a;
    private static boolean b;
    private static boolean c;
    private static Field d;

    /* access modifiers changed from: package-private */
    public static class a implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread thread, Throwable th) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(986), thread.getName() + C0201.m82(985) + th.getMessage());
        }
    }

    /* renamed from: com.huawei.updatesdk.b.f.b$b  reason: collision with other inner class name */
    public enum EnumC0114b {
        NOT_INSTALLED,
        INSTALLED,
        INSTALLED_LOWCODE
    }

    /* access modifiers changed from: private */
    public static class c implements Runnable {
        private c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public void run() {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(210), C0201.m82(211));
            d.a(new File(com.huawei.updatesdk.a.b.b.c.b()));
        }
    }

    static {
        C0201.m83(b.class, 403);
    }

    public static int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return a(applicationInfo) ? 1 : 2;
    }

    public static int a(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageInfo packageInfo = com.huawei.updatesdk.a.b.a.a.c().a().getPackageManager().getPackageInfo(str, 128);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(C0201.m82(27519))) ? 0 : 1;
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(27521), C0201.m82(27520) + str);
            return 0;
        }
    }

    public static PackageInfo a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(27523), C0201.m82(27522) + str);
            return null;
        }
    }

    public static EnumC0114b a(Context context, String str) {
        String r0 = C0201.m82(27524);
        String r1 = C0201.m82(27525);
        EnumC0114b bVar = EnumC0114b.NOT_INSTALLED;
        if (context == null) {
            return bVar;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return bVar;
            }
            Log.i(r1, C0201.m82(27526) + r0 + packageInfo.versionCode + r0 + packageInfo.versionName);
            return packageInfo.versionCode < 70203000 ? EnumC0114b.INSTALLED_LOWCODE : EnumC0114b.INSTALLED;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.b.a.a.a.d(r1, C0201.m82(27527) + e.toString());
            return bVar;
        }
    }

    public static void a() {
        Thread thread = new Thread(new c(null));
        thread.setName(C0201.m82(27528));
        thread.setUncaughtExceptionHandler(new a());
        thread.start();
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        String str;
        StringBuilder sb;
        String r0 = C0201.m82(27529);
        String r1 = C0201.m82(27530);
        int i = applicationInfo.flags;
        Integer c2 = c();
        if (c2 != null && (i & c2.intValue()) != 0) {
            return true;
        }
        Field b2 = b();
        if (b2 == null) {
            return false;
        }
        try {
            return (b2.getInt(applicationInfo) & 33554432) != 0;
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e.toString();
            sb.append(str);
            com.huawei.updatesdk.a.a.b.a.a.a.a(r0, sb.toString());
            return false;
        } catch (IllegalArgumentException e2) {
            sb = new StringBuilder();
            sb.append(r1);
            str = e2.toString();
            sb.append(str);
            com.huawei.updatesdk.a.a.b.a.a.a.a(r0, sb.toString());
            return false;
        }
    }

    private static int b(Context context, String str) {
        StringBuilder sb;
        String str2;
        String r0 = C0201.m82(27531);
        if (TextUtils.isEmpty(str)) {
            str = C0201.m82(27532);
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            sb = new StringBuilder();
            sb.append(C0201.m82(27534));
            str2 = e.toString();
            sb.append(str2);
            com.huawei.updatesdk.a.a.b.a.a.a.d(r0, sb.toString());
            return 0;
        } catch (UnsupportedOperationException e2) {
            sb = new StringBuilder();
            sb.append(C0201.m82(27533));
            str2 = e2.toString();
            sb.append(str2);
            com.huawei.updatesdk.a.a.b.a.a.a.d(r0, sb.toString());
            return 0;
        }
    }

    public static Field b() {
        if (c) {
            return d;
        }
        try {
            d = ApplicationInfo.class.getField(C0201.m82(27535));
        } catch (NoSuchFieldException unused) {
            com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(27536), C0201.m82(27537));
        }
        c = true;
        return d;
    }

    public static Integer c() {
        String str;
        StringBuilder sb;
        String str2;
        String r0 = C0201.m82(27538);
        if (b) {
            return a;
        }
        try {
            Class<?> cls = Class.forName(C0201.m82(27539));
            a = Integer.valueOf(cls.getDeclaredField(C0201.m82(27540)).getInt(cls));
        } catch (NoSuchFieldException e) {
            sb = new StringBuilder();
            sb.append(C0201.m82(27544));
            str2 = e.toString();
        } catch (ClassNotFoundException e2) {
            sb = new StringBuilder();
            sb.append(C0201.m82(27543));
            str2 = e2.toString();
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append(C0201.m82(27542));
            str2 = e3.toString();
        } catch (IllegalArgumentException e4) {
            sb = new StringBuilder();
            sb.append(C0201.m82(27541));
            str2 = e4.toString();
        } catch (Exception e5) {
            str = e5.toString();
            com.huawei.updatesdk.a.a.b.a.a.a.a(r0, str);
            b = true;
            return a;
        }
        b = true;
        return a;
        sb.append(str2);
        str = sb.toString();
        com.huawei.updatesdk.a.a.b.a.a.a.a(r0, str);
        b = true;
        return a;
    }

    public static boolean c(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0) != null;
            } catch (Exception e) {
                com.huawei.updatesdk.a.a.b.a.a.a.d(C0201.m82(27546), C0201.m82(27545) + e.toString());
            }
        }
        return false;
    }

    public static boolean d(Context context, String str) {
        return h.g().e() || b(context, str) > 90000000;
    }

    public static boolean e(Context context, String str) {
        return h.g().e() || b(context, str) > 100200000;
    }
}
