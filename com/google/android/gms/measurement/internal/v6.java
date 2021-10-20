package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import java.util.Map;
import vigqyno.C0201;

public final class v6 extends f5 {
    public w6 c;
    private volatile w6 d;
    private w6 e;
    private final Map<Activity, w6> f = new r0();
    private String g;

    public v6(o4 o4Var) {
        super(o4Var);
    }

    private final w6 H(Activity activity) {
        u.k(activity);
        w6 w6Var = this.f.get(activity);
        if (w6Var != null) {
            return w6Var;
        }
        w6 w6Var2 = new w6(null, N(activity.getClass().getCanonicalName()), m().s0());
        this.f.put(activity, w6Var2);
        return w6Var2;
    }

    private final void I(Activity activity, w6 w6Var, boolean z) {
        w6 w6Var2 = this.d == null ? this.e : this.d;
        if (w6Var.b == null) {
            w6Var = new w6(w6Var.a, N(activity.getClass().getCanonicalName()), w6Var.c);
        }
        this.e = this.d;
        this.d = w6Var;
        c().y(new y6(this, z, w6Var2, w6Var));
    }

    public static void K(w6 w6Var, Bundle bundle, boolean z) {
        String r0 = C0201.m82(29763);
        String r1 = C0201.m82(29764);
        String r2 = C0201.m82(29765);
        if (bundle != null && w6Var != null && (!bundle.containsKey(r2) || z)) {
            String str = w6Var.a;
            if (str != null) {
                bundle.putString(r1, str);
            } else {
                bundle.remove(r1);
            }
            bundle.putString(r2, w6Var.b);
            bundle.putLong(r0, w6Var.c);
        } else if (bundle != null && w6Var == null && z) {
            bundle.remove(r1);
            bundle.remove(r2);
            bundle.remove(r0);
        }
    }

    /* access modifiers changed from: private */
    public final void L(w6 w6Var, boolean z) {
        o().E(b().b());
        if (u().E(w6Var.d, z)) {
            w6Var.d = false;
        }
    }

    private static String N(String str) {
        String[] split = str.split(C0201.m82(29766));
        String r2 = split.length > 0 ? split[split.length - 1] : C0201.m82(29767);
        return r2.length() > 100 ? r2.substring(0, 100) : r2;
    }

    public final void B(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle(C0201.m82(29768))) != null) {
            this.f.put(activity, new w6(bundle2.getString(C0201.m82(29769)), bundle2.getString(C0201.m82(29770)), bundle2.getLong(C0201.m82(29771))));
        }
    }

    public final void C(Activity activity) {
        this.f.remove(activity);
    }

    public final void D(Activity activity) {
        w6 H = H(activity);
        this.e = this.d;
        this.d = null;
        c().y(new x6(this, H));
    }

    public final void E(Activity activity) {
        I(activity, H(activity), false);
        a o = o();
        o.c().y(new e3(o, o.b().b()));
    }

    public final void F(Activity activity, Bundle bundle) {
        w6 w6Var;
        if (bundle != null && (w6Var = this.f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(C0201.m82(29772), w6Var.c);
            bundle2.putString(C0201.m82(29773), w6Var.a);
            bundle2.putString(C0201.m82(29774), w6Var.b);
            bundle.putBundle(C0201.m82(29775), bundle2);
        }
    }

    public final void G(Activity activity, String str, String str2) {
        if (this.d == null) {
            e().J().d(C0201.m82(29776));
        } else if (this.f.get(activity) == null) {
            e().J().d(C0201.m82(29777));
        } else {
            if (str2 == null) {
                str2 = N(activity.getClass().getCanonicalName());
            }
            boolean equals = this.d.b.equals(str2);
            boolean z0 = y8.z0(this.d.a, str);
            if (equals && z0) {
                e().J().d(C0201.m82(29778));
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                e().J().a(C0201.m82(29779), Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                e().M().b(C0201.m82(29782), str == null ? C0201.m82(29781) : str, str2);
                w6 w6Var = new w6(str, str2, m().s0());
                this.f.put(activity, w6Var);
                I(activity, w6Var, true);
            } else {
                e().J().a(C0201.m82(29780), Integer.valueOf(str2.length()));
            }
        }
    }

    public final void M(String str, w6 w6Var) {
        j();
        synchronized (this) {
            if (this.g == null || this.g.equals(str) || w6Var != null) {
                this.g = str;
            }
        }
    }

    public final w6 O() {
        x();
        j();
        return this.c;
    }

    public final w6 P() {
        h();
        return this.d;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    public final boolean z() {
        return false;
    }
}
