package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class q2 implements Runnable {
    private final r2 a;
    public final /* synthetic */ p2 b;

    public q2(p2 p2Var, r2 r2Var) {
        this.b = p2Var;
        this.a = r2Var;
    }

    public final void run() {
        if (this.b.b) {
            vo0 a2 = this.a.a();
            if (a2.s()) {
                p2 p2Var = this.b;
                p2Var.a.startActivityForResult(GoogleApiActivity.b(p2Var.b(), a2.r(), this.a.b(), false), 1);
            } else if (this.b.e.m(a2.o())) {
                p2 p2Var2 = this.b;
                p2Var2.e.A(p2Var2.b(), this.b.a, a2.o(), 2, this.b);
            } else if (a2.o() == 18) {
                Dialog u = yo0.u(this.b.b(), this.b);
                p2 p2Var3 = this.b;
                p2Var3.e.w(p2Var3.b().getApplicationContext(), new s2(this, u));
            } else {
                this.b.m(a2, this.a.b());
            }
        }
    }
}
