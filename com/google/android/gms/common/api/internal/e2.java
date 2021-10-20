package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class e2 implements g2 {
    private final /* synthetic */ f2 a;

    public e2(f2 f2Var) {
        this.a = f2Var;
    }

    @Override // com.google.android.gms.common.api.internal.g2
    public final void a(BasePendingResult<?> basePendingResult) {
        this.a.a.remove(basePendingResult);
        basePendingResult.r();
    }
}
