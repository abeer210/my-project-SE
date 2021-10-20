package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

public final class d extends a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) f11.a(new e(sharedPreferences, str, num));
        } catch (Exception e) {
            String r3 = C0201.m82(31375);
            String valueOf = String.valueOf(e.getMessage());
            Log.w(C0201.m82(31376), valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
            return num;
        }
    }
}
