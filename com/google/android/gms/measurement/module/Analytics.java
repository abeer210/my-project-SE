package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.internal.o4;

public class Analytics {
    private static volatile Analytics a;

    private Analytics(o4 o4Var) {
        u.k(o4Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(o4.g(context, null));
                }
            }
        }
        return a;
    }
}
