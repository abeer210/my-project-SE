package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.r5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class b {
    private static final List<String> a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open");
    private static final List<String> b = Arrays.asList("auto", "app", "am");
    private static final List<String> c = Arrays.asList("_r", "_dbg");
    private static final List<String> d = Arrays.asList((String[]) com.google.android.gms.common.util.b.a(r5.a, r5.b));
    private static final List<String> e = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    static {
        new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    }

    public static boolean a(String str, Bundle bundle) {
        if (a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String str2 : c) {
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        for (String str3 : c) {
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static boolean c(String str) {
        return !b.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (d.contains(str2)) {
            return false;
        }
        for (String str3 : e) {
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }
}
