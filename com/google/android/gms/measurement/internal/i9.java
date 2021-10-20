package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.m;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

public final class i9 extends l5 {
    private Boolean b;
    private k9 c = l9.a;
    private Boolean d;

    public i9(o4 o4Var) {
        super(o4Var);
        l.c(o4Var);
    }

    public static boolean B() {
        return l.e.a(null).booleanValue();
    }

    public static boolean D() {
        return l.Y.a(null).booleanValue();
    }

    public static String s() {
        return l.f.a(null);
    }

    private final Bundle u() {
        try {
            if (getContext().getPackageManager() == null) {
                e().E().d(C0201.m82(20796));
                return null;
            }
            ApplicationInfo b2 = hq0.a(getContext()).b(getContext().getPackageName(), 128);
            if (b2 != null) {
                return b2.metaData;
            }
            e().E().d(C0201.m82(20797));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e().E().a(C0201.m82(20798), e);
            return null;
        }
    }

    public static long y() {
        return l.I.a(null).longValue();
    }

    public static long z() {
        return l.i.a(null).longValue();
    }

    public final String A() {
        String r1 = C0201.m82(20799);
        try {
            return (String) Class.forName(C0201.m82(20800)).getMethod(C0201.m82(20801), String.class, String.class).invoke(null, C0201.m82(20802), r1);
        } catch (ClassNotFoundException e) {
            e().E().a(C0201.m82(20806), e);
            return r1;
        } catch (NoSuchMethodException e2) {
            e().E().a(C0201.m82(20805), e2);
            return r1;
        } catch (IllegalAccessException e3) {
            e().E().a(C0201.m82(20804), e3);
            return r1;
        } catch (InvocationTargetException e4) {
            e().E().a(C0201.m82(20803), e4);
            return r1;
        }
    }

    public final boolean C() {
        if (this.b == null) {
            Boolean I = I(C0201.m82(20807));
            this.b = I;
            if (I == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.D();
    }

    public final double E(String str, y2<Double> y2Var) {
        if (str == null) {
            return y2Var.a(null).doubleValue();
        }
        String d2 = this.c.d(str, y2Var.b());
        if (TextUtils.isEmpty(d2)) {
            return y2Var.a(null).doubleValue();
        }
        try {
            return y2Var.a(Double.valueOf(Double.parseDouble(d2))).doubleValue();
        } catch (NumberFormatException unused) {
            return y2Var.a(null).doubleValue();
        }
    }

    public final boolean F(String str, y2<Boolean> y2Var) {
        if (str == null) {
            return y2Var.a(null).booleanValue();
        }
        String d2 = this.c.d(str, y2Var.b());
        if (TextUtils.isEmpty(d2)) {
            return y2Var.a(null).booleanValue();
        }
        return y2Var.a(Boolean.valueOf(Boolean.parseBoolean(d2))).booleanValue();
    }

    public final boolean G(String str, y2<Boolean> y2Var) {
        return F(str, y2Var);
    }

    public final int H(String str) {
        return r(str, l.t);
    }

    public final Boolean I(String str) {
        u.g(str);
        Bundle u = u();
        if (u == null) {
            e().E().d(C0201.m82(20808));
            return null;
        } else if (!u.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(u.getBoolean(str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A[SYNTHETIC, Splitter:B:9:0x0030] */
    public final List<String> J(String str) {
        Integer num;
        u.g(str);
        Bundle u = u();
        if (u == null) {
            e().E().d(C0201.m82(20809));
        } else if (u.containsKey(str)) {
            num = Integer.valueOf(u.getInt(str));
            if (num != null) {
                return null;
            }
            try {
                String[] stringArray = getContext().getResources().getStringArray(num.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (Resources.NotFoundException e) {
                e().E().a(C0201.m82(20810), e);
                return null;
            }
        }
        num = null;
        if (num != null) {
        }
    }

    public final boolean K(String str) {
        return C0201.m82(20812).equals(this.c.d(str, C0201.m82(20811)));
    }

    public final boolean L(String str) {
        return C0201.m82(20814).equals(this.c.d(str, C0201.m82(20813)));
    }

    public final boolean M(String str) {
        return F(str, l.S);
    }

    public final boolean N(String str) {
        return F(str, l.M);
    }

    public final String O(String str) {
        y2<String> y2Var = l.N;
        if (str == null) {
            return y2Var.a(null);
        }
        return y2Var.a(this.c.d(str, y2Var.b()));
    }

    public final boolean P(String str) {
        return F(str, l.T);
    }

    public final boolean Q(String str) {
        return F(str, l.U);
    }

    public final boolean R(String str) {
        return F(str, l.V);
    }

    public final boolean S(String str) {
        return F(str, l.X);
    }

    public final boolean T(String str) {
        return F(str, l.W);
    }

    public final boolean U(String str) {
        return F(str, l.Z);
    }

    public final boolean V(String str) {
        return F(str, l.a0);
    }

    public final boolean W(String str) {
        return F(str, l.b0);
    }

    public final boolean X(String str) {
        return F(str, l.c0);
    }

    public final boolean Y(String str) {
        return F(str, l.h0);
    }

    public final long n(String str, y2<Long> y2Var) {
        if (str == null) {
            return y2Var.a(null).longValue();
        }
        String d2 = this.c.d(str, y2Var.b());
        if (TextUtils.isEmpty(d2)) {
            return y2Var.a(null).longValue();
        }
        try {
            return y2Var.a(Long.valueOf(Long.parseLong(d2))).longValue();
        } catch (NumberFormatException unused) {
            return y2Var.a(null).longValue();
        }
    }

    public final void o(k9 k9Var) {
        this.c = k9Var;
    }

    public final boolean p(y2<Boolean> y2Var) {
        return F(null, y2Var);
    }

    public final long q() {
        a();
        return 16250;
    }

    public final int r(String str, y2<Integer> y2Var) {
        if (str == null) {
            return y2Var.a(null).intValue();
        }
        String d2 = this.c.d(str, y2Var.b());
        if (TextUtils.isEmpty(d2)) {
            return y2Var.a(null).intValue();
        }
        try {
            return y2Var.a(Integer.valueOf(Integer.parseInt(d2))).intValue();
        } catch (NumberFormatException unused) {
            return y2Var.a(null).intValue();
        }
    }

    public final boolean t() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String a = m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        e().E().d(C0201.m82(20815));
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final boolean v() {
        a();
        Boolean I = I(C0201.m82(20816));
        return I != null && I.booleanValue();
    }

    public final Boolean w() {
        a();
        return I(C0201.m82(20817));
    }

    public final Boolean x() {
        h();
        Boolean I = I(C0201.m82(20818));
        return Boolean.valueOf(I == null || I.booleanValue());
    }
}
