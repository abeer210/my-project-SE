package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

public final class f extends a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) f11.a(new g(sharedPreferences, str, l));
        } catch (Exception e) {
            String r3 = C0201.m82(31287);
            String valueOf = String.valueOf(e.getMessage());
            Log.w(C0201.m82(31288), valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
            return l;
        }
    }
}
