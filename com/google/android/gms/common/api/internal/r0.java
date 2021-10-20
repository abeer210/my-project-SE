package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class r0 extends f implements o1 {
    private final Lock b;
    private boolean c;
    private final j d;
    private n1 e = null;
    private final int f;
    private final Context g;
    private final Looper h;
    public final Queue<d<?, ?>> i = new LinkedList();
    private volatile boolean j;
    private long k;
    private long l;
    private final u0 m;
    private final yo0 n;
    private m1 o;
    public final Map<a.c<?>, a.f> p;
    public Set<Scope> q;
    private final e r;
    private final Map<a<?>, Boolean> s;
    private final a.AbstractC0054a<? extends qs1, bs1> t;
    private final l u;
    private final ArrayList<u2> v;
    private Integer w;
    public Set<a2> x;
    public final f2 y;
    private final j.a z;

    public r0(Context context, Lock lock, Looper looper, e eVar, yo0 yo0, a.AbstractC0054a<? extends qs1, bs1> aVar, Map<a<?>, Boolean> map, List<f.b> list, List<f.c> list2, Map<a.c<?>, a.f> map2, int i2, int i3, ArrayList<u2> arrayList, boolean z2) {
        this.k = d.a() ? 10000 : 120000;
        this.l = 5000;
        this.q = new HashSet();
        this.u = new l();
        this.w = null;
        this.x = null;
        q0 q0Var = new q0(this);
        this.z = q0Var;
        this.g = context;
        this.b = lock;
        this.c = false;
        this.d = new j(looper, q0Var);
        this.h = looper;
        this.m = new u0(this, looper);
        this.n = yo0;
        this.f = i2;
        if (i2 >= 0) {
            this.w = Integer.valueOf(i3);
        }
        this.s = map;
        this.p = map2;
        this.v = arrayList;
        this.y = new f2(this.p);
        for (f.b bVar : list) {
            this.d.f(bVar);
        }
        for (f.c cVar : list2) {
            this.d.g(cVar);
        }
        this.r = eVar;
        this.t = aVar;
    }

    private final void B() {
        this.d.b();
        this.e.a();
    }

    /* access modifiers changed from: private */
    public final void C() {
        this.b.lock();
        try {
            if (D()) {
                B();
            }
        } finally {
            this.b.unlock();
        }
    }

    private final void I(int i2) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String J = J(i2);
            String J2 = J(this.w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(J).length() + 51 + String.valueOf(J2).length());
            sb.append(C0201.m82(24635));
            sb.append(J);
            sb.append(C0201.m82(24636));
            sb.append(J2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.e == null) {
            boolean z2 = false;
            boolean z3 = false;
            for (a.f fVar : this.p.values()) {
                if (fVar.r()) {
                    z2 = true;
                }
                if (fVar.d()) {
                    z3 = true;
                }
            }
            int intValue = this.w.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z2) {
                    if (this.c) {
                        this.e = new a3(this.g, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this, true);
                        return;
                    } else {
                        this.e = v2.i(this.g, this, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v);
                        return;
                    }
                }
            } else if (!z2) {
                throw new IllegalStateException(C0201.m82(24634));
            } else if (z3) {
                throw new IllegalStateException(C0201.m82(24633));
            }
            if (!this.c || z3) {
                this.e = new a1(this.g, this, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this);
            } else {
                this.e = new a3(this.g, this.b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this, false);
            }
        }
    }

    private static String J(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? C0201.m82(24637) : C0201.m82(24638) : C0201.m82(24639) : C0201.m82(24640);
    }

    /* access modifiers changed from: private */
    public final void w() {
        this.b.lock();
        try {
            if (this.j) {
                B();
            }
        } finally {
            this.b.unlock();
        }
    }

    public static int x(Iterable<a.f> iterable, boolean z2) {
        boolean z3 = false;
        boolean z4 = false;
        for (a.f fVar : iterable) {
            if (fVar.r()) {
                z3 = true;
            }
            if (fVar.d()) {
                z4 = true;
            }
        }
        if (!z3) {
            return 3;
        }
        if (!z4 || !z2) {
            return 1;
        }
        return 2;
    }

    /* access modifiers changed from: private */
    public final void y(f fVar, r rVar, boolean z2) {
        lp0.d.a(fVar).d(new w0(this, rVar, z2, fVar));
    }

    public final boolean D() {
        if (!this.j) {
            return false;
        }
        this.j = false;
        this.m.removeMessages(2);
        this.m.removeMessages(1);
        m1 m1Var = this.o;
        if (m1Var != null) {
            m1Var.a();
            this.o = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final boolean E() {
        this.b.lock();
        try {
            if (this.x == null) {
                this.b.unlock();
                return false;
            }
            boolean z2 = !this.x.isEmpty();
            this.b.unlock();
            return z2;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final String F() {
        StringWriter stringWriter = new StringWriter();
        h(C0201.m82(24641), null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void a(vo0 vo0) {
        if (!this.n.k(this.g, vo0.o())) {
            D();
        }
        if (!this.j) {
            this.d.c(vo0);
            this.d.a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void b(Bundle bundle) {
        while (!this.i.isEmpty()) {
            j(this.i.remove());
        }
        this.d.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void c(int i2, boolean z2) {
        if (i2 == 1 && !z2 && !this.j) {
            this.j = true;
            if (this.o == null && !d.a()) {
                try {
                    this.o = this.n.w(this.g.getApplicationContext(), new y0(this));
                } catch (SecurityException unused) {
                }
            }
            u0 u0Var = this.m;
            u0Var.sendMessageDelayed(u0Var.obtainMessage(1), this.k);
            u0 u0Var2 = this.m;
            u0Var2.sendMessageDelayed(u0Var2.obtainMessage(2), this.l);
        }
        this.y.b();
        this.d.e(i2);
        this.d.a();
        if (i2 == 2) {
            B();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final vo0 d() {
        boolean z2 = true;
        u.o(Looper.myLooper() != Looper.getMainLooper(), C0201.m82(24642));
        this.b.lock();
        try {
            if (this.f >= 0) {
                if (this.w == null) {
                    z2 = false;
                }
                u.o(z2, C0201.m82(24643));
            } else if (this.w == null) {
                this.w = Integer.valueOf(x(this.p.values(), false));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException(C0201.m82(24644));
            }
            I(this.w.intValue());
            this.d.b();
            return this.e.f();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final h<Status> e() {
        u.o(u(), C0201.m82(24645));
        u.o(this.w.intValue() != 2, C0201.m82(24646));
        r rVar = new r(this);
        if (this.p.containsKey(lp0.a)) {
            y(this, rVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            t0 t0Var = new t0(this, atomicReference, rVar);
            s0 s0Var = new s0(this, rVar);
            f.a aVar = new f.a(this.g);
            aVar.a(lp0.c);
            aVar.c(t0Var);
            aVar.d(s0Var);
            aVar.g(this.m);
            f e2 = aVar.e();
            atomicReference.set(e2);
            e2.f();
        }
        return rVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final void f() {
        this.b.lock();
        try {
            boolean z2 = false;
            if (this.f >= 0) {
                if (this.w != null) {
                    z2 = true;
                }
                u.o(z2, C0201.m82(24647));
            } else if (this.w == null) {
                this.w = Integer.valueOf(x(this.p.values(), false));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException(C0201.m82(24648));
            }
            t(this.w.intValue());
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void g() {
        this.b.lock();
        try {
            this.y.a();
            if (this.e != null) {
                this.e.disconnect();
            }
            this.u.c();
            for (d<?, ?> dVar : this.i) {
                dVar.n(null);
                dVar.e();
            }
            this.i.clear();
            if (this.e != null) {
                D();
                this.d.a();
                this.b.unlock();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(24649)).println(this.g);
        printWriter.append((CharSequence) str).append((CharSequence) C0201.m82(24650)).print(this.j);
        printWriter.append((CharSequence) C0201.m82(24651)).print(this.i.size());
        printWriter.append((CharSequence) C0201.m82(24652)).println(this.y.a.size());
        n1 n1Var = this.e;
        if (n1Var != null) {
            n1Var.b(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends m, T extends d<R, A>> T i(T t2) {
        u.b(t2.w() != null, C0201.m82(24653));
        boolean containsKey = this.p.containsKey(t2.w());
        String b2 = t2.v() != null ? t2.v().b() : C0201.m82(24654);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 65);
        sb.append(C0201.m82(24655));
        sb.append(b2);
        sb.append(C0201.m82(24656));
        u.b(containsKey, sb.toString());
        this.b.lock();
        try {
            if (this.e == null) {
                this.i.add(t2);
                return t2;
            }
            T t3 = (T) this.e.k(t2);
            this.b.unlock();
            return t3;
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends m, A>> T j(T t2) {
        u.b(t2.w() != null, C0201.m82(24657));
        boolean containsKey = this.p.containsKey(t2.w());
        String b2 = t2.v() != null ? t2.v().b() : C0201.m82(24658);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 65);
        sb.append(C0201.m82(24659));
        sb.append(b2);
        sb.append(C0201.m82(24660));
        u.b(containsKey, sb.toString());
        this.b.lock();
        try {
            if (this.e == null) {
                throw new IllegalStateException(C0201.m82(24661));
            } else if (this.j) {
                this.i.add(t2);
                while (!this.i.isEmpty()) {
                    d<?, ?> remove = this.i.remove();
                    this.y.c(remove);
                    remove.A(Status.g);
                }
                return t2;
            } else {
                T t3 = (T) this.e.j(t2);
                this.b.unlock();
                return t3;
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final Context l() {
        return this.g;
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper m() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean n(p pVar) {
        n1 n1Var = this.e;
        return n1Var != null && n1Var.c(pVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void o() {
        n1 n1Var = this.e;
        if (n1Var != null) {
            n1Var.d();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void p(f.c cVar) {
        this.d.g(cVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void q(f.c cVar) {
        this.d.h(cVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void r(a2 a2Var) {
        this.b.lock();
        try {
            Set<a2> set = this.x;
            String r1 = C0201.m82(24662);
            if (set == null) {
                Log.wtf(r1, C0201.m82(24663), new Exception());
            } else if (!this.x.remove(a2Var)) {
                Log.wtf(r1, C0201.m82(24664), new Exception());
            } else if (!E()) {
                this.e.e();
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void t(int i2) {
        this.b.lock();
        boolean z2 = true;
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z2 = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append(C0201.m82(24665));
            sb.append(i2);
            u.b(z2, sb.toString());
            I(i2);
            B();
        } finally {
            this.b.unlock();
        }
    }

    public final boolean u() {
        n1 n1Var = this.e;
        return n1Var != null && n1Var.isConnected();
    }

    public final void v() {
        g();
        f();
    }
}
