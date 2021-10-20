package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import java.util.Map;
import vigqyno.C0201;

public final class a extends d2 {
    private final Map<String, Long> b = new r0();
    private final Map<String, Integer> c = new r0();
    private long d;

    public a(o4 o4Var) {
        super(o4Var);
    }

    /* access modifiers changed from: private */
    public final void A(String str, long j) {
        h();
        j();
        u.g(str);
        if (this.c.isEmpty()) {
            this.d = j;
        }
        Integer num = this.c.get(str);
        if (num != null) {
            this.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.c.size() >= 100) {
            e().H().d(C0201.m82(33166));
        } else {
            this.c.put(str, 1);
            this.b.put(str, Long.valueOf(j));
        }
    }

    private final void B(String str, long j, w6 w6Var) {
        if (w6Var == null) {
            e().M().d(C0201.m82(33167));
        } else if (j < 1000) {
            e().M().a(C0201.m82(33168), Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(C0201.m82(33169), str);
            bundle.putLong(C0201.m82(33170), j);
            v6.K(w6Var, bundle, true);
            p().I(C0201.m82(33171), C0201.m82(33172), bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void D(String str, long j) {
        h();
        j();
        u.g(str);
        Integer num = this.c.get(str);
        if (num != null) {
            w6 O = s().O();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.c.remove(str);
                Long l = this.b.get(str);
                if (l == null) {
                    e().E().d(C0201.m82(33173));
                } else {
                    this.b.remove(str);
                    B(str, j - l.longValue(), O);
                }
                if (this.c.isEmpty()) {
                    long j2 = this.d;
                    if (j2 == 0) {
                        e().E().d(C0201.m82(33174));
                        return;
                    }
                    x(j - j2, O);
                    this.d = 0;
                    return;
                }
                return;
            }
            this.c.put(str, Integer.valueOf(intValue));
            return;
        }
        e().E().a(C0201.m82(33175), str);
    }

    /* access modifiers changed from: private */
    public final void F(long j) {
        for (String str : this.b.keySet()) {
            this.b.put(str, Long.valueOf(j));
        }
        if (!this.b.isEmpty()) {
            this.d = j;
        }
    }

    private final void x(long j, w6 w6Var) {
        if (w6Var == null) {
            e().M().d(C0201.m82(33176));
        } else if (j < 1000) {
            e().M().a(C0201.m82(33177), Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong(C0201.m82(33178), j);
            v6.K(w6Var, bundle, true);
            p().I(C0201.m82(33179), C0201.m82(33180), bundle);
        }
    }

    public final void E(long j) {
        w6 O = s().O();
        for (String str : this.b.keySet()) {
            B(str, j - this.b.get(str).longValue(), O);
        }
        if (!this.b.isEmpty()) {
            x(j - this.d, O);
        }
        F(j);
    }

    public final void v(String str, long j) {
        if (str == null || str.length() == 0) {
            e().E().d(C0201.m82(33181));
        } else {
            c().y(new c1(this, str, j));
        }
    }

    public final void w(String str, long j) {
        if (str == null || str.length() == 0) {
            e().E().d(C0201.m82(33182));
        } else {
            c().y(new b0(this, str, j));
        }
    }
}
