package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class x3 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ t3 e;

    private x3(t3 t3Var, String str, long j) {
        this.e = t3Var;
        u.g(str);
        u.a(j > 0);
        this.a = String.valueOf(str).concat(C0201.m82(36083));
        this.b = String.valueOf(str).concat(C0201.m82(36084));
        this.c = String.valueOf(str).concat(C0201.m82(36085));
        this.d = j;
    }

    private final void b() {
        this.e.j();
        long a2 = this.e.b().a();
        SharedPreferences.Editor edit = this.e.C().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a2);
        edit.apply();
    }

    private final long d() {
        return this.e.C().getLong(this.a, 0);
    }

    public final void a(String str, long j) {
        this.e.j();
        if (d() == 0) {
            b();
        }
        if (str == null) {
            str = C0201.m82(36086);
        }
        long j2 = this.e.C().getLong(this.b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.C().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.m().t0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.e.C().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    public final Pair<String, Long> c() {
        long j;
        this.e.j();
        this.e.j();
        long d2 = d();
        if (d2 == 0) {
            b();
            j = 0;
        } else {
            j = Math.abs(d2 - this.e.b().a());
        }
        long j2 = this.d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            b();
            return null;
        }
        String string = this.e.C().getString(this.c, null);
        long j3 = this.e.C().getLong(this.b, 0);
        b();
        if (string == null || j3 <= 0) {
            return t3.A;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }
}
