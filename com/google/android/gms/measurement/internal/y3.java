package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.u;

public final class y3 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ t3 e;

    public y3(t3 t3Var, String str, long j) {
        this.e = t3Var;
        u.g(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.C().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.C().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
