package com.huawei.updatesdk.a.b.c;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import vigqyno.C0201;

public final class b {
    private Intent a;

    private b(Intent intent) {
        this.a = intent;
    }

    public static b a(Intent intent) {
        return new b(intent);
    }

    public int a(String str, int i) {
        if (d()) {
            try {
                return this.a.getIntExtra(str, i);
            } catch (Exception unused) {
                Log.e(C0201.m82(37920), C0201.m82(37921));
            }
        }
        return i;
    }

    public String a() {
        String action;
        boolean d = d();
        String r1 = C0201.m82(37922);
        return (!d || (action = this.a.getAction()) == null) ? r1 : action;
    }

    public String a(String str) {
        if (d()) {
            try {
                return this.a.getStringExtra(str);
            } catch (Exception unused) {
                Log.e(C0201.m82(37923), C0201.m82(37924));
            }
        }
        return C0201.m82(37925);
    }

    public boolean a(String str, boolean z) {
        if (d()) {
            try {
                return this.a.getBooleanExtra(str, z);
            } catch (Exception unused) {
                Log.e(C0201.m82(37926), C0201.m82(37927));
            }
        }
        return z;
    }

    public long b(String str, int i) {
        if (d()) {
            try {
                return this.a.getLongExtra(str, (long) i);
            } catch (Exception unused) {
                Log.e(C0201.m82(37928), C0201.m82(37929));
            }
        }
        return (long) i;
    }

    public Bundle b() {
        if (d()) {
            return this.a.getExtras();
        }
        return null;
    }

    public Intent c() {
        return this.a;
    }

    public boolean d() {
        return this.a != null;
    }
}
