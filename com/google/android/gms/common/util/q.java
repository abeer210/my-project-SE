package com.google.android.gms.common.util;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class q {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
