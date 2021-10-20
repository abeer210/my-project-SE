package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a() {
        return C0201.m82(20970).equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        if (a == null) {
            a = Boolean.valueOf(l.f() && context.getPackageManager().hasSystemFeature(C0201.m82(20971)));
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (!b(context)) {
            return false;
        }
        if (l.h()) {
            return d(context) && !l.i();
        }
        return true;
    }

    @TargetApi(21)
    private static boolean d(Context context) {
        if (b == null) {
            b = Boolean.valueOf(l.g() && context.getPackageManager().hasSystemFeature(C0201.m82(20972)));
        }
        return b.booleanValue();
    }

    public static boolean e(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature(C0201.m82(20973)) || context.getPackageManager().hasSystemFeature(C0201.m82(20974)));
        }
        return c.booleanValue();
    }
}
