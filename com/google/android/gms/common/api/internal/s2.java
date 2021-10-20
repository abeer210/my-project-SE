package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class s2 extends l1 {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ q2 b;

    public s2(q2 q2Var, Dialog dialog) {
        this.b = q2Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.l1
    public final void a() {
        this.b.b.p();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
