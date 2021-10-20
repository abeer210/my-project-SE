package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

public final class h extends a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) f11.a(new i(sharedPreferences, str, str2));
        } catch (Exception e) {
            String r3 = C0201.m82(31390);
            String valueOf = String.valueOf(e.getMessage());
            Log.w(C0201.m82(31391), valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
            return str2;
        }
    }
}
