package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b3<O extends a.d> extends e<O> {
    private final a.f j;
    private final u2 k;
    private final com.google.android.gms.common.internal.e l;
    private final a.AbstractC0054a<? extends qs1, bs1> m;

    public b3(Context context, a<O> aVar, Looper looper, a.f fVar, u2 u2Var, com.google.android.gms.common.internal.e eVar, a.AbstractC0054a<? extends qs1, bs1> aVar2) {
        super(context, aVar, looper);
        this.j = fVar;
        this.k = u2Var;
        this.l = eVar;
        this.m = aVar2;
        this.i.i(this);
    }

    @Override // com.google.android.gms.common.api.e
    public final a.f p(Looper looper, g.a<O> aVar) {
        this.k.a(aVar);
        return this.j;
    }

    @Override // com.google.android.gms.common.api.e
    public final v1 r(Context context, Handler handler) {
        return new v1(context, handler, this.l, this.m);
    }

    public final a.f t() {
        return this.j;
    }
}
