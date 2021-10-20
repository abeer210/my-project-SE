package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.u;

public final class v3 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ t3 e;

    public v3(t3 t3Var, String str, boolean z) {
        this.e = t3Var;
        u.g(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.C().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.e.C().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
