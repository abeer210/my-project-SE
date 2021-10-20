package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class o {
    public static boolean a(Context context, int i) {
        String r0 = C0201.m82(24243);
        if (!b(context, i, r0)) {
            return false;
        }
        try {
            return ep0.a(context).b(context.getPackageManager().getPackageInfo(r0, 64));
        } catch (PackageManager.NameNotFoundException unused) {
            String r5 = C0201.m82(24244);
            if (Log.isLoggable(r5, 3)) {
                Log.d(r5, C0201.m82(24245));
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i, String str) {
        return hq0.a(context).h(i, str);
    }
}
