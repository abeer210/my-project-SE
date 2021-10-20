package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.m;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class j1<O extends a.d> extends b0 {
    private final e<O> c;

    public j1(e<O> eVar) {
        super(C0201.m82(2876));
        this.c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends m, T extends d<R, A>> T i(T t) {
        this.c.f(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        this.c.j(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final Context l() {
        return this.c.m();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper m() {
        return this.c.o();
    }

    @Override // com.google.android.gms.common.api.f
    public final void r(a2 a2Var) {
    }
}
