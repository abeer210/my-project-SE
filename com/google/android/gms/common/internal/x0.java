package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class x0 {
    private static Object a = new Object();
    private static boolean b;
    private static String c;
    private static int d;

    public static String a(Context context) {
        c(context);
        return c;
    }

    public static int b(Context context) {
        c(context);
        return d;
    }

    private static void c(Context context) {
        synchronized (a) {
            if (!b) {
                b = true;
                try {
                    Bundle bundle = hq0.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        c = bundle.getString(C0201.m82(30475));
                        d = bundle.getInt(C0201.m82(30476));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf(C0201.m82(30477), C0201.m82(30478), e);
                }
            }
        }
    }
}
