package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

public final class b extends a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) f11.a(new c(sharedPreferences, str, bool));
        } catch (Exception e) {
            String r3 = C0201.m82(30784);
            String valueOf = String.valueOf(e.getMessage());
            Log.w(C0201.m82(30785), valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
            return bool;
        }
    }
}
