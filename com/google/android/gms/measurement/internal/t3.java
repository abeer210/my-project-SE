package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.yn0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import vigqyno.C0201;

public final class t3 extends k5 {
    public static final Pair<String, Long> A = new Pair<>(C0201.m82(5231), 0L);
    private SharedPreferences c;
    public x3 d;
    public final y3 e = new y3(this, C0201.m82(5232), 0);
    public final y3 f = new y3(this, C0201.m82(5233), 0);
    public final y3 g = new y3(this, C0201.m82(5234), 0);
    public final y3 h = new y3(this, C0201.m82(5235), 0);
    public final y3 i = new y3(this, C0201.m82(5244), 0);
    public final y3 j = new y3(this, C0201.m82(5245), 0);
    public final y3 k = new y3(this, C0201.m82(5246), 0);
    public final a4 l = new a4(this, C0201.m82(5247), null);
    private String m;
    private boolean n;
    private long o;
    public final y3 p = new y3(this, C0201.m82(5236), 10000);
    public final y3 q = new y3(this, C0201.m82(5237), 1800000);
    public final v3 r = new v3(this, C0201.m82(5238), true);
    public final a4 s = new a4(this, C0201.m82(5241), null);
    public final v3 t = new v3(this, C0201.m82(5242), false);
    public final v3 u = new v3(this, C0201.m82(5243), false);
    public final y3 v = new y3(this, C0201.m82(5239), 0);
    public final y3 w = new y3(this, C0201.m82(5240), 0);
    public boolean x;
    public v3 y = new v3(this, C0201.m82(5248), false);
    public y3 z = new y3(this, C0201.m82(5249), -1);

    public t3(o4 o4Var) {
        super(o4Var);
    }

    /* access modifiers changed from: private */
    public final SharedPreferences C() {
        j();
        p();
        return this.c;
    }

    public final boolean A(boolean z2) {
        j();
        return C().getBoolean(C0201.m82(5250), z2);
    }

    public final void B(boolean z2) {
        j();
        e().M().a(C0201.m82(5251), Boolean.valueOf(z2));
        SharedPreferences.Editor edit = C().edit();
        edit.putBoolean(C0201.m82(5252), z2);
        edit.apply();
    }

    public final String D() {
        j();
        return C().getString(C0201.m82(5253), null);
    }

    public final String E() {
        j();
        return C().getString(C0201.m82(5254), null);
    }

    public final Boolean F() {
        j();
        SharedPreferences C = C();
        String r1 = C0201.m82(5255);
        if (!C.contains(r1)) {
            return null;
        }
        return Boolean.valueOf(C().getBoolean(r1, false));
    }

    public final void G() {
        j();
        e().M().d(C0201.m82(5256));
        if (g().p(l.l0)) {
            Boolean H = H();
            SharedPreferences.Editor edit = C().edit();
            edit.clear();
            edit.apply();
            if (H != null) {
                t(H.booleanValue());
                return;
            }
            return;
        }
        boolean contains = C().contains(C0201.m82(5257));
        boolean z2 = true;
        if (contains) {
            z2 = A(true);
        }
        SharedPreferences.Editor edit2 = C().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            t(z2);
        }
    }

    public final Boolean H() {
        j();
        SharedPreferences C = C();
        String r1 = C0201.m82(5258);
        if (C.contains(r1)) {
            return Boolean.valueOf(C().getBoolean(r1, true));
        }
        return null;
    }

    public final String I() {
        j();
        SharedPreferences C = C();
        String r1 = C0201.m82(5259);
        String string = C.getString(r1, null);
        k().p();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = C().edit();
            edit.putString(r1, str);
            edit.apply();
        }
        return string;
    }

    public final boolean J() {
        j();
        return C().getBoolean(C0201.m82(5260), false);
    }

    public final boolean K() {
        return this.c.contains(C0201.m82(5261));
    }

    public final boolean L(long j2) {
        return j2 - this.q.a() > this.v.a();
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final boolean r() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final void s() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(C0201.m82(5262), 0);
        this.c = sharedPreferences;
        String r1 = C0201.m82(5263);
        boolean z2 = sharedPreferences.getBoolean(r1, false);
        this.x = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean(r1, true);
            edit.apply();
        }
        this.d = new x3(this, C0201.m82(5264), Math.max(0L, l.h.a(null).longValue()));
    }

    public final void t(boolean z2) {
        j();
        e().M().a(C0201.m82(5265), Boolean.valueOf(z2));
        SharedPreferences.Editor edit = C().edit();
        edit.putBoolean(C0201.m82(5266), z2);
        edit.apply();
    }

    public final Pair<String, Boolean> v(String str) {
        String r0 = C0201.m82(5267);
        j();
        long b = b().b();
        if (this.m != null && b < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        this.o = b + g().n(str, l.g);
        yn0.d(true);
        try {
            yn0.a b2 = yn0.b(getContext());
            if (b2 != null) {
                this.m = b2.a();
                this.n = b2.b();
            }
            if (this.m == null) {
                this.m = r0;
            }
        } catch (Exception e2) {
            e().L().a(C0201.m82(5268), e2);
            this.m = r0;
        }
        yn0.d(false);
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    public final String w(String str) {
        j();
        String str2 = (String) v(str).first;
        MessageDigest t2 = y8.t();
        if (t2 == null) {
            return null;
        }
        return String.format(Locale.US, C0201.m82(5269), new BigInteger(1, t2.digest(str2.getBytes())));
    }

    public final void x(String str) {
        j();
        SharedPreferences.Editor edit = C().edit();
        edit.putString(C0201.m82(5270), str);
        edit.apply();
    }

    public final void y(String str) {
        j();
        SharedPreferences.Editor edit = C().edit();
        edit.putString(C0201.m82(5271), str);
        edit.apply();
    }

    public final void z(boolean z2) {
        j();
        e().M().a(C0201.m82(5272), Boolean.valueOf(z2));
        SharedPreferences.Editor edit = C().edit();
        edit.putBoolean(C0201.m82(5273), z2);
        edit.apply();
    }
}
