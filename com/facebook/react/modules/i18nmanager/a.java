package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: I18nUtil */
public class a {
    private static a a;

    private a() {
    }

    public static a d() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    private boolean e() {
        return q2.b(Locale.getDefault()) == 1;
    }

    private boolean f(Context context, String str, boolean z) {
        return context.getSharedPreferences(C0201.m82(10331), 0).getBoolean(str, z);
    }

    private boolean h(Context context) {
        return f(context, C0201.m82(10332), true);
    }

    private boolean i(Context context) {
        return f(context, C0201.m82(10333), false);
    }

    private void j(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C0201.m82(10334), 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void a(Context context, boolean z) {
        j(context, C0201.m82(10335), z);
    }

    public boolean b(Context context) {
        return f(context, C0201.m82(10336), true);
    }

    public void c(Context context, boolean z) {
        j(context, C0201.m82(10337), z);
    }

    public boolean g(Context context) {
        if (i(context)) {
            return true;
        }
        if (!h(context) || !e()) {
            return false;
        }
        return true;
    }

    public void k(Context context, boolean z) {
        j(context, C0201.m82(10338), z);
    }
}
