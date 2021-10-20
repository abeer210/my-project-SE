package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import vigqyno.C0201;

public final class y6 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ w6 b;
    private final /* synthetic */ w6 c;
    private final /* synthetic */ v6 d;

    public y6(v6 v6Var, boolean z, w6 w6Var, w6 w6Var2) {
        this.d = v6Var;
        this.a = z;
        this.b = w6Var;
        this.c = w6Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (com.google.android.gms.measurement.internal.y8.z0(r10.b.a, r10.c.a) != false) goto L_0x0064;
     */
    public final void run() {
        boolean z;
        v6 v6Var;
        w6 w6Var;
        boolean z2 = false;
        if (this.d.g().Y(this.d.q().C())) {
            z = this.a && this.d.c != null;
            if (z) {
                v6 v6Var2 = this.d;
                v6Var2.L(v6Var2.c, true);
            }
        } else {
            if (this.a && (w6Var = (v6Var = this.d).c) != null) {
                v6Var.L(w6Var, true);
            }
            z = false;
        }
        w6 w6Var2 = this.b;
        if (w6Var2 != null) {
            long j = w6Var2.c;
            w6 w6Var3 = this.c;
            if (j == w6Var3.c) {
                if (y8.z0(w6Var2.b, w6Var3.b)) {
                }
            }
        }
        z2 = true;
        if (z2) {
            Bundle bundle = new Bundle();
            v6.K(this.c, bundle, true);
            w6 w6Var4 = this.b;
            if (w6Var4 != null) {
                String str = w6Var4.a;
                if (str != null) {
                    bundle.putString(C0201.m82(38834), str);
                }
                bundle.putString(C0201.m82(38835), this.b.b);
                bundle.putLong(C0201.m82(38836), this.b.c);
            }
            if (this.d.g().Y(this.d.q().C()) && z) {
                long M = this.d.u().M();
                if (M > 0) {
                    this.d.m().R(bundle, M);
                }
            }
            this.d.p().a0(C0201.m82(38837), C0201.m82(38838), bundle);
        }
        v6 v6Var3 = this.d;
        v6Var3.c = this.c;
        v6Var3.r().N(this.c);
    }
}
