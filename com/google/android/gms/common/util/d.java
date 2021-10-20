package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class d {
    public static boolean a() {
        return false;
    }

    public static boolean b(Context context, String str) {
        C0201.m82(20854).equals(str);
        try {
            if ((hq0.a(context).b(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
