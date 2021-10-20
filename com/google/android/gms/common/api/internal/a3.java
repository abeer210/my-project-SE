package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a3 implements n1 {
    private final Map<a.c<?>, b3<?>> a = new HashMap();
    private final Map<a.c<?>, b3<?>> b = new HashMap();
    private final Map<a<?>, Boolean> c;
    private final g d;
    private final r0 e;
    private final Lock f;
    private final Looper g;
    private final zo0 h;
    private final Condition i;
    private final e j;
    private final boolean k;
    private final boolean l;
    private final Queue<d<?, ?>> m = new LinkedList();
    private boolean n;
    private Map<b<?>, vo0> o;
    private Map<b<?>, vo0> p;
    private v q;
    private vo0 r;

    public a3(Context context, Lock lock, Looper looper, zo0 zo0, Map<a.c<?>, a.f> map, e eVar, Map<a<?>, Boolean> map2, a.AbstractC0054a<? extends qs1, bs1> aVar, ArrayList<u2> arrayList, r0 r0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f = lock;
        this.g = looper;
        this.i = lock.newCondition();
        this.h = zo0;
        this.e = r0Var;
        this.c = map2;
        this.j = eVar;
        this.k = z;
        HashMap hashMap = new HashMap();
        for (a<?> aVar2 : map2.keySet()) {
            hashMap.put(aVar2.a(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            u2 u2Var = arrayList.get(i2);
            i2++;
            u2 u2Var2 = u2Var;
            hashMap2.put(u2Var2.a, u2Var2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a aVar3 = (a) hashMap.get(entry.getKey());
            a.f value = entry.getValue();
            if (value.o()) {
                z3 = z6;
                if (!this.c.get(aVar3).booleanValue()) {
                    z4 = true;
                    z2 = true;
                } else {
                    z2 = z7;
                    z4 = true;
                }
            } else {
                z4 = z5;
                z2 = z7;
                z3 = false;
            }
            b3<?> b3Var = new b3<>(context, aVar3, looper, value, (u2) hashMap2.get(aVar3), eVar, aVar);
            this.a.put(entry.getKey(), b3Var);
            if (value.r()) {
                this.b.put(entry.getKey(), b3Var);
            }
            z5 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.l = z5 && !z6 && !z7;
        this.d = g.o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    private final boolean I() {
        this.f.lock();
        try {
            if (this.n) {
                if (this.k) {
                    for (a.c<?> cVar : this.b.keySet()) {
                        vo0 i2 = i(cVar);
                        if (i2 == null || !i2.u()) {
                            this.f.unlock();
                            return false;
                        }
                        while (r0.hasNext()) {
                        }
                    }
                    this.f.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f.unlock();
        }
    }

    private final vo0 i(a.c<?> cVar) {
        this.f.lock();
        try {
            b3<?> b3Var = this.a.get(cVar);
            if (this.o != null && b3Var != null) {
                return this.o.get(b3Var.b());
            }
            this.f.unlock();
            return null;
        } finally {
            this.f.unlock();
        }
    }

    /* access modifiers changed from: private */
    public final boolean q(b3<?> b3Var, vo0 vo0) {
        return !vo0.u() && !vo0.s() && this.c.get(b3Var.l()).booleanValue() && b3Var.t().o() && this.h.m(vo0.o());
    }

    /* access modifiers changed from: private */
    public final void r() {
        if (this.j == null) {
            this.e.q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.j.j());
        Map<a<?>, e.b> g2 = this.j.g();
        for (a<?> aVar : g2.keySet()) {
            vo0 g3 = g(aVar);
            if (g3 != null && g3.u()) {
                hashSet.addAll(g2.get(aVar).a);
            }
        }
        this.e.q = hashSet;
    }

    /* access modifiers changed from: private */
    public final void s() {
        while (!this.m.isEmpty()) {
            j(this.m.remove());
        }
        this.e.b(null);
    }

    /* access modifiers changed from: private */
    public final vo0 t() {
        int i2 = 0;
        vo0 vo0 = null;
        vo0 vo02 = null;
        int i3 = 0;
        for (b3<?> b3Var : this.a.values()) {
            a<?> l2 = b3Var.l();
            vo0 vo03 = this.o.get(b3Var.b());
            if (!vo03.u() && (!this.c.get(l2).booleanValue() || vo03.s() || this.h.m(vo03.o()))) {
                if (vo03.o() != 4 || !this.k) {
                    int b2 = l2.c().b();
                    if (vo0 == null || i2 > b2) {
                        vo0 = vo03;
                        i2 = b2;
                    }
                } else {
                    int b3 = l2.c().b();
                    if (vo02 == null || i3 > b3) {
                        vo02 = vo03;
                        i3 = b3;
                    }
                }
            }
        }
        return (vo0 == null || vo02 == null || i2 <= i3) ? vo0 : vo02;
    }

    private final <T extends d<? extends m, ? extends a.b>> boolean v(T t) {
        a.c<?> w = t.w();
        vo0 i2 = i(w);
        if (i2 == null || i2.o() != 4) {
            return false;
        }
        t.A(new Status(4, null, this.d.c(this.a.get(w).b(), System.identityHashCode(this.e))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a() {
        this.f.lock();
        try {
            if (!this.n) {
                this.n = true;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.d.B();
                this.d.g(this.a.values()).c(new bq0(this.g), new c3(this));
                this.f.unlock();
            }
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.common.api.internal.n1
    public final boolean c(p pVar) {
        this.f.lock();
        try {
            if (!this.n || I()) {
                this.f.unlock();
                return false;
            }
            this.d.B();
            this.q = new v(this, pVar);
            this.d.g(this.b.values()).c(new bq0(this.g), this.q);
            this.f.unlock();
            return true;
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void d() {
        this.f.lock();
        try {
            this.d.a();
            if (this.q != null) {
                this.q.b();
                this.q = null;
            }
            if (this.p == null) {
                this.p = new r0(this.b.size());
            }
            vo0 vo0 = new vo0(4);
            for (b3<?> b3Var : this.b.values()) {
                this.p.put(b3Var.b(), vo0);
            }
            if (this.o != null) {
                this.o.putAll(this.p);
            }
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void disconnect() {
        this.f.lock();
        try {
            this.n = false;
            this.o = null;
            this.p = null;
            if (this.q != null) {
                this.q.b();
                this.q = null;
            }
            this.r = null;
            while (!this.m.isEmpty()) {
                d<?, ?> remove = this.m.remove();
                remove.n(null);
                remove.e();
            }
            this.i.signalAll();
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final vo0 f() {
        a();
        while (h()) {
            try {
                this.i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new vo0(15, null);
            }
        }
        if (isConnected()) {
            return vo0.e;
        }
        vo0 vo0 = this.r;
        if (vo0 != null) {
            return vo0;
        }
        return new vo0(13, null);
    }

    public final vo0 g(a<?> aVar) {
        return i(aVar.a());
    }

    public final boolean h() {
        this.f.lock();
        try {
            return this.o == null && this.n;
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final boolean isConnected() {
        this.f.lock();
        try {
            return this.o != null && this.r == null;
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        a.c<A> w = t.w();
        if (this.k && v(t)) {
            return t;
        }
        this.e.y.c(t);
        this.a.get(w).j(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final <A extends a.b, R extends m, T extends d<R, A>> T k(T t) {
        if (this.k && v(t)) {
            return t;
        }
        if (!isConnected()) {
            this.m.add(t);
            return t;
        }
        this.e.y.c(t);
        this.a.get(t.w()).f(t);
        return t;
    }
}
