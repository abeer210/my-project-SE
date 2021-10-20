package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.j;
import java.util.Collections;
import java.util.Set;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class i<T extends IInterface> extends c<T> implements a.f, j.a {
    private final e B;
    private final Set<Scope> C;
    private final Account D;

    /* JADX WARNING: Illegal instructions before constructor call */
    public i(Context context, Looper looper, int i, e eVar, f fVar, m mVar) {
        this(context, looper, r3, r4, i, eVar, fVar, mVar);
        k a = k.a(context);
        yo0 q = yo0.q();
        u.k(fVar);
        u.k(mVar);
    }

    private static c.a m0(f fVar) {
        if (fVar == null) {
            return null;
        }
        return new c0(fVar);
    }

    private static c.b n0(m mVar) {
        if (mVar == null) {
            return null;
        }
        return new d0(mVar);
    }

    private final Set<Scope> o0(Set<Scope> set) {
        l0(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException(C0201.m82(7955));
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Set<Scope> D() {
        return this.C;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> e() {
        return r() ? this.C : Collections.emptySet();
    }

    public final e k0() {
        return this.B;
    }

    public Set<Scope> l0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public int p() {
        return super.p();
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account y() {
        return this.D;
    }

    @Deprecated
    public i(Context context, Looper looper, int i, e eVar, f.b bVar, f.c cVar) {
        this(context, looper, i, eVar, (com.google.android.gms.common.api.internal.f) bVar, (m) cVar);
    }

    public i(Context context, Looper looper, k kVar, yo0 yo0, int i, e eVar, com.google.android.gms.common.api.internal.f fVar, m mVar) {
        super(context, looper, kVar, yo0, i, m0(fVar), n0(mVar), eVar.h());
        this.B = eVar;
        this.D = eVar.a();
        Set<Scope> d = eVar.d();
        o0(d);
        this.C = d;
    }
}
