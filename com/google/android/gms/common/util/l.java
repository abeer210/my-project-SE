package com.google.android.gms.common.util;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class l {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 15;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }
}
