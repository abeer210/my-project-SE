package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class d0 extends z0 {
    private final /* synthetic */ a0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(a0 a0Var, x0 x0Var) {
        super(x0Var);
        this.b = a0Var;
    }

    @Override // com.google.android.gms.common.api.internal.z0
    public final void b() {
        this.b.onConnectionSuspended(1);
    }
}
