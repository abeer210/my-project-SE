package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class e4 {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    private final g4 a;

    static {
        C0201.m83(e4.class, 92);
    }

    public e4(g4 g4Var) {
        u.k(g4Var);
        this.a = g4Var;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        u.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, C0201.m82(29752)), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        o4 g2 = o4.g(context, null);
        k3 e2 = g2.e();
        if (intent == null) {
            e2.H().d(m);
            return;
        }
        g2.a();
        String action = intent.getAction();
        e2.M().a(h, action);
        String str = i;
        if (str.equals(action)) {
            Intent className = new Intent().setClassName(context, c);
            className.setAction(str);
            e2.M().d(k);
            this.a.a(context, className);
        } else if (l.equals(action)) {
            try {
                g2.c().y(new d4(this, g2, e2));
            } catch (Exception e3) {
                e2.H().a(g, e3);
            }
            BroadcastReceiver.PendingResult b2 = this.a.b();
            String stringExtra = intent.getStringExtra(j);
            if (stringExtra == null) {
                e2.M().d(n);
                if (b2 != null) {
                    b2.finish();
                    return;
                }
                return;
            }
            e2.K().a(d, stringExtra);
            String str2 = o;
            if (!stringExtra.contains(str2)) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            Bundle u = g2.T().u(Uri.parse(stringExtra));
            if (u == null) {
                e2.M().d(e);
                if (b2 != null) {
                    b2.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra(b, 0) * 1000;
            if (longExtra == 0) {
                e2.H().d(f);
            }
            g2.c().y(new h4(this, g2, longExtra, u, context, e2, b2));
        }
    }
}
