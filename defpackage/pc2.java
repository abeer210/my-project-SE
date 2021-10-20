package defpackage;

import android.util.Log;
import vigqyno.C0201;

/* renamed from: pc2  reason: default package */
public class pc2 {
    public static void a(String str, String str2, Throwable th) {
        Log.e(f(str), str2, th);
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2) {
        Log.i(f(str), str2);
    }

    public static void d(String str, String str2) {
        Log.w(f(str), str2);
    }

    public static void e(String str, String str2) {
        Log.e(f(str), str2);
    }

    private static String f(String str) {
        return C0201.m82(15942) + str;
    }
}
