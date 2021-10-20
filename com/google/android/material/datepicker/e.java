package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings */
public class e {
    public static String a(long j) {
        return b(j, Locale.getDefault());
    }

    public static String b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o.b(locale).format(new Date(j));
        }
        return o.f(locale).format(new Date(j));
    }

    public static String c(long j) {
        return d(j, Locale.getDefault());
    }

    public static String d(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o.m(locale).format(new Date(j));
        }
        return o.f(locale).format(new Date(j));
    }
}
