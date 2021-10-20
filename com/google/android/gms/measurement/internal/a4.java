package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.u;

public final class a4 {
    private final String a;
    private boolean b;
    private String c;
    private final /* synthetic */ t3 d;

    public a4(t3 t3Var, String str, String str2) {
        this.d = t3Var;
        u.g(str);
        this.a = str;
    }

    public final void a(String str) {
        if (!y8.z0(str, this.c)) {
            SharedPreferences.Editor edit = this.d.C().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.c = str;
        }
    }

    public final String b() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.C().getString(this.a, null);
        }
        return this.c;
    }
}
