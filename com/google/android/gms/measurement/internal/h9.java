package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

public final class h9 {
    public h9(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
