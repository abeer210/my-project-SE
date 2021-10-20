package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import vigqyno.C0201;

/* renamed from: rc2  reason: default package */
public class rc2 {
    private static SharedPreferences a;

    public static void a(String str, long j, Context context) {
        c(context).edit().putLong(str, j).apply();
    }

    public static long b(String str, long j, Context context) {
        return c(context).getLong(str, j);
    }

    public static synchronized SharedPreferences c(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (rc2.class) {
            if (a == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    a = context.createDeviceProtectedStorageContext().getSharedPreferences(C0201.m82(2063), 0);
                } else {
                    a = context.getApplicationContext().getSharedPreferences(C0201.m82(2064), 0);
                }
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
