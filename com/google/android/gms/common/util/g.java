package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class g {
    public static boolean a(Context context, Throwable th) {
        return b(context, th, 536870912);
    }

    private static boolean b(Context context, Throwable th, int i) {
        try {
            u.k(context);
            u.k(th);
            return false;
        } catch (Exception e) {
            Log.e(C0201.m82(21104), C0201.m82(21105), e);
            return false;
        }
    }
}
