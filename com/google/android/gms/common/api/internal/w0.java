package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class w0 implements n<Status> {
    private final /* synthetic */ r a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ f c;
    private final /* synthetic */ r0 d;

    public w0(r0 r0Var, r rVar, boolean z, f fVar) {
        this.d = r0Var;
        this.a = rVar;
        this.b = z;
        this.c = fVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.m] */
    @Override // com.google.android.gms.common.api.n
    public final /* synthetic */ void a(Status status) {
        Status status2 = status;
        c.b(this.d.g).l();
        if (status2.s() && this.d.u()) {
            this.d.v();
        }
        this.a.j(status2);
        if (this.b) {
            this.c.g();
        }
    }
}
