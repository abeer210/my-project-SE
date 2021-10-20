package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class f0 implements x0 {
    private final a1 a;
    private final Lock b;
    private final Context c;
    private final zo0 d;
    private vo0 e;
    private int f;
    private int g = 0;
    private int h;
    private final Bundle i = new Bundle();
    private final Set<a.c> j = new HashSet();
    private qs1 k;
    private boolean l;
    private boolean m;
    private boolean n;
    private n o;
    private boolean p;
    private boolean q;
    private final e r;
    private final Map<a<?>, Boolean> s;
    private final a.AbstractC0054a<? extends qs1, bs1> t;
    private ArrayList<Future<?>> u = new ArrayList<>();

    public f0(a1 a1Var, e eVar, Map<a<?>, Boolean> map, zo0 zo0, a.AbstractC0054a<? extends qs1, bs1> aVar, Lock lock, Context context) {
        this.a = a1Var;
        this.r = eVar;
        this.s = map;
        this.d = zo0;
        this.t = aVar;
        this.b = lock;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public final void A(vo0 vo0) {
        p();
        t(!vo0.s());
        this.a.q(vo0);
        this.a.o.a(vo0);
    }

    /* access modifiers changed from: private */
    public final void g(ns1 ns1) {
        if (w(0)) {
            vo0 o2 = ns1.o();
            if (o2.u()) {
                w p2 = ns1.p();
                vo0 p3 = p2.p();
                if (!p3.u()) {
                    String valueOf = String.valueOf(p3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append(C0201.m82(7450));
                    sb.append(valueOf);
                    Log.wtf(C0201.m82(7451), sb.toString(), new Exception());
                    A(p3);
                    return;
                }
                this.n = true;
                this.o = p2.o();
                this.p = p2.r();
                this.q = p2.s();
                m();
            } else if (z(o2)) {
                o();
                m();
            } else {
                A(o2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean l() {
        int i2 = this.h - 1;
        this.h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            String F = this.a.n.F();
            String r1 = C0201.m82(7452);
            Log.w(r1, F);
            Log.wtf(r1, C0201.m82(7453), new Exception());
            A(new vo0(8, null));
            return false;
        }
        vo0 vo0 = this.e;
        if (vo0 == null) {
            return true;
        }
        this.a.m = this.f;
        A(vo0);
        return false;
    }

    /* access modifiers changed from: private */
    public final void m() {
        if (this.h == 0) {
            if (!this.m || this.n) {
                ArrayList arrayList = new ArrayList();
                this.g = 1;
                this.h = this.a.f.size();
                for (a.c<?> cVar : this.a.f.keySet()) {
                    if (!this.a.g.containsKey(cVar)) {
                        arrayList.add(this.a.f.get(cVar));
                    } else if (l()) {
                        n();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(b1.a().submit(new l0(this, arrayList)));
                }
            }
        }
    }

    private final void n() {
        this.a.m();
        b1.a().execute(new e0(this));
        qs1 qs1 = this.k;
        if (qs1 != null) {
            if (this.p) {
                qs1.c(this.o, this.q);
            }
            t(false);
        }
        for (a.c<?> cVar : this.a.g.keySet()) {
            this.a.f.get(cVar).disconnect();
        }
        this.a.o.b(this.i.isEmpty() ? null : this.i);
    }

    /* access modifiers changed from: private */
    public final void o() {
        this.m = false;
        this.a.n.q = Collections.emptySet();
        for (a.c<?> cVar : this.j) {
            if (!this.a.g.containsKey(cVar)) {
                this.a.g.put(cVar, new vo0(17, null));
            }
        }
    }

    private final void p() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.u.clear();
    }

    /* access modifiers changed from: private */
    public final Set<Scope> q() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.r.j());
        Map<a<?>, e.b> g2 = this.r.g();
        for (a<?> aVar : g2.keySet()) {
            if (!this.a.g.containsKey(aVar.a())) {
                hashSet.addAll(g2.get(aVar).a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    public final void s(vo0 vo0, a<?> aVar, boolean z) {
        boolean z2;
        int b2 = aVar.c().b();
        boolean z3 = false;
        if (z) {
            if (!vo0.s() && this.d.c(vo0.o()) == null) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (this.e == null || b2 < this.f) {
            z3 = true;
        }
        if (z3) {
            this.e = vo0;
            this.f = b2;
        }
        this.a.g.put(aVar.a(), vo0);
    }

    private final void t(boolean z) {
        qs1 qs1 = this.k;
        if (qs1 != null) {
            if (qs1.isConnected() && z) {
                this.k.l();
            }
            this.k.disconnect();
            if (this.r.l()) {
                this.k = null;
            }
            this.o = null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean w(int i2) {
        if (this.g == i2) {
            return true;
        }
        String F = this.a.n.F();
        String r1 = C0201.m82(7454);
        Log.w(r1, F);
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append(C0201.m82(7455));
        sb.append(valueOf);
        Log.w(r1, sb.toString());
        int i3 = this.h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append(C0201.m82(7456));
        sb2.append(i3);
        Log.w(r1, sb2.toString());
        String y = y(this.g);
        String y2 = y(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(y).length() + 70 + String.valueOf(y2).length());
        sb3.append(C0201.m82(7457));
        sb3.append(y);
        sb3.append(C0201.m82(7458));
        sb3.append(y2);
        Log.e(r1, sb3.toString(), new Exception());
        A(new vo0(8, null));
        return false;
    }

    private static String y(int i2) {
        return i2 != 0 ? i2 != 1 ? C0201.m82(7459) : C0201.m82(7460) : C0201.m82(7461);
    }

    /* access modifiers changed from: private */
    public final boolean z(vo0 vo0) {
        return this.l && !vo0.s();
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void d() {
        this.a.g.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (a<?> aVar : this.s.keySet()) {
            a.f fVar = this.a.f.get(aVar.a());
            z |= aVar.c().b() == 1;
            boolean booleanValue = this.s.get(aVar).booleanValue();
            if (fVar.r()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(aVar.a());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(fVar, new h0(this, aVar, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            this.r.m(Integer.valueOf(System.identityHashCode(this.a.n)));
            m0 m0Var = new m0(this, null);
            a.AbstractC0054a<? extends qs1, bs1> aVar2 = this.t;
            Context context = this.c;
            Looper m2 = this.a.n.m();
            e eVar = this.r;
            this.k = (qs1) aVar2.c(context, m2, eVar, eVar.k(), m0Var, m0Var);
        }
        this.h = this.a.f.size();
        this.u.add(b1.a().submit(new g0(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final boolean disconnect() {
        p();
        t(true);
        this.a.q(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void i(vo0 vo0, a<?> aVar, boolean z) {
        if (w(1)) {
            s(vo0, aVar, z);
            if (l()) {
                n();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t2) {
        throw new IllegalStateException(C0201.m82(7462));
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final <A extends a.b, R extends m, T extends d<R, A>> T k(T t2) {
        this.a.n.i.add(t2);
        return t2;
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void onConnected(Bundle bundle) {
        if (w(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (l()) {
                n();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.x0
    public final void onConnectionSuspended(int i2) {
        A(new vo0(8, null));
    }
}
