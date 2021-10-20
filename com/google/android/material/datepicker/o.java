package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import vigqyno.C0201;

/* compiled from: UtcDates */
public class o {
    public static long a(long j) {
        Calendar k = k();
        k.setTimeInMillis(j);
        return d(k).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c(C0201.m82(15046), locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar l = l(calendar);
        Calendar k = k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    private static java.text.DateFormat e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    private static SimpleDateFormat g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(h());
        return simpleDateFormat;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone(C0201.m82(15047));
    }

    public static Calendar i() {
        return d(Calendar.getInstance());
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone(C0201.m82(15048));
    }

    public static Calendar k() {
        return l(null);
    }

    public static Calendar l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c(C0201.m82(15049), locale);
    }

    public static SimpleDateFormat n() {
        return o(Locale.getDefault());
    }

    private static SimpleDateFormat o(Locale locale) {
        return g(C0201.m82(15050), locale);
    }
}
