package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.dynatrace.android.agent.u;
import defpackage.n20;
import defpackage.r20;
import org.json.JSONException;
import vigqyno.C0201;

/* renamed from: k20  reason: default package */
/* compiled from: PreferencesManager */
public class k20 {
    private static final String c = (u.b + C0201.m82(17533));
    private SharedPreferences a;
    private o20 b;

    public k20(SharedPreferences sharedPreferences, o20 o20) {
        this.a = sharedPreferences;
        this.b = o20;
    }

    public static k20 a(Context context, o20 o20) {
        return new k20(context.getSharedPreferences(C0201.m82(17534), 0), o20);
    }

    private String e(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (ClassCastException unused) {
            this.a.edit().remove(str).apply();
            return str2;
        }
    }

    private boolean f(String str, boolean z) {
        try {
            return this.a.getBoolean(str, z);
        } catch (ClassCastException unused) {
            this.a.edit().remove(str).apply();
            return z;
        }
    }

    private n20 g(n20 n20, int i) {
        n20.b bVar;
        if (n20 != null) {
            bVar = n20.M();
        } else {
            bVar = new n20.b();
            bVar.D(i);
        }
        bVar.H(0);
        bVar.s(1);
        bVar.x(1);
        bVar.G(false);
        bVar.I(-1);
        return bVar.r();
    }

    private n20 h() {
        SharedPreferences sharedPreferences = this.a;
        String r1 = C0201.m82(17535);
        if (!sharedPreferences.contains(r1)) {
            return null;
        }
        String e = e(r1, null);
        if (u.c) {
            String str = c;
            s30.r(str, C0201.m82(17536) + e);
        }
        try {
            return this.b.f(e);
        } catch (Exception e2) {
            if (u.c) {
                s30.s(c, C0201.m82(17537), e2);
            }
            l();
            return null;
        }
    }

    @Deprecated
    public String b() {
        return e(C0201.m82(17538), C0201.m82(17539));
    }

    public boolean c() {
        return f(C0201.m82(17540), true);
    }

    public n20 d(int i) {
        return g(h(), i);
    }

    public r20 i() {
        r20 r20 = l20.c;
        try {
            boolean z = this.a.getBoolean(C0201.m82(17541), r20.h());
            f20 valueOf = f20.valueOf(this.a.getString(C0201.m82(17542), r20.f().name()));
            r20.b bVar = new r20.b();
            bVar.f(valueOf);
            bVar.e(z);
            return bVar.d();
        } catch (Exception e) {
            if (u.c) {
                s30.s(c, C0201.m82(17543), e);
            }
            k();
            return r20;
        }
    }

    @Deprecated
    public void j() {
        this.a.edit().remove(C0201.m82(17544)).apply();
    }

    public void k() {
        this.a.edit().remove(C0201.m82(17545)).remove(C0201.m82(17546)).apply();
    }

    public void l() {
        this.a.edit().remove(C0201.m82(17547)).apply();
    }

    @Deprecated
    public void m(String str) {
        if (C0201.m82(17548).equals(str)) {
            j();
        } else {
            this.a.edit().putString(C0201.m82(17549), str).apply();
        }
    }

    public void n(boolean z) {
        this.a.edit().putBoolean(C0201.m82(17550), z).apply();
    }

    public void o(n20 n20) {
        String r0 = C0201.m82(17551);
        SharedPreferences.Editor edit = this.a.edit();
        try {
            edit.putString(r0, this.b.k(n20));
        } catch (JSONException e) {
            if (u.c) {
                s30.s(c, C0201.m82(17552), e);
            }
            edit.remove(r0);
        }
        edit.apply();
    }

    public void p(r20 r20) {
        this.a.edit().putBoolean(C0201.m82(17553), r20.h()).putString(C0201.m82(17554), r20.f().name()).apply();
    }
}
