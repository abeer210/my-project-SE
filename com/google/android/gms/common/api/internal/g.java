package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class g implements Handler.Callback {
    public static final Status n = new Status(4, C0201.m82(38927));
    private static final Status o = new Status(4, C0201.m82(38928));
    private static final Object p = new Object();
    private static g q;
    private long a = 5000;
    private long b = 120000;
    private long c = 10000;
    private final Context d;
    private final yo0 e;
    private final m f;
    private final AtomicInteger g = new AtomicInteger(1);
    private final AtomicInteger h = new AtomicInteger(0);
    private final Map<b<?>, a<?>> i = new ConcurrentHashMap(5, 0.75f, 1);
    private y j = null;
    private final Set<b<?>> k = new s0();
    private final Set<b<?>> l = new s0();
    private final Handler m;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class a<O extends a.d> implements f.b, f.c, w2 {
        private final Queue<s1> a = new LinkedList();
        private final a.f b;
        private final a.b c;
        private final b<O> d;
        private final e3 e;
        private final Set<o2> f = new HashSet();
        private final Map<k.a<?>, r1> g = new HashMap();
        private final int h;
        private final v1 i;
        private boolean j;
        private final List<c> k = new ArrayList();
        private vo0 l = null;

        public a(e<O> eVar) {
            a.f p = eVar.p(g.this.m.getLooper(), this);
            this.b = p;
            if (p instanceof x) {
                this.c = ((x) p).p0();
            } else {
                this.c = p;
            }
            this.d = eVar.b();
            this.e = new e3();
            this.h = eVar.n();
            if (this.b.r()) {
                this.i = eVar.r(g.this.d, g.this.m);
            } else {
                this.i = null;
            }
        }

        private final void D(s1 s1Var) {
            s1Var.c(this.e, d());
            try {
                s1Var.f(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.b.disconnect();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final boolean E(boolean z) {
            u.d(g.this.m);
            if (!this.b.isConnected() || this.g.size() != 0) {
                return false;
            }
            if (this.e.e()) {
                if (z) {
                    z();
                }
                return false;
            }
            this.b.disconnect();
            return true;
        }

        private final boolean J(vo0 vo0) {
            synchronized (g.p) {
                if (g.this.j == null || !g.this.k.contains(this.d)) {
                    return false;
                }
                g.this.j.n(vo0, this.h);
                return true;
            }
        }

        private final void K(vo0 vo0) {
            for (o2 o2Var : this.f) {
                String str = null;
                if (s.a(vo0, vo0.e)) {
                    str = this.b.h();
                }
                o2Var.b(this.d, vo0, str);
            }
            this.f.clear();
        }

        private final xo0 f(xo0[] xo0Arr) {
            if (!(xo0Arr == null || xo0Arr.length == 0)) {
                xo0[] q = this.b.q();
                if (q == null) {
                    q = new xo0[0];
                }
                r0 r0Var = new r0(q.length);
                for (xo0 xo0 : q) {
                    r0Var.put(xo0.o(), Long.valueOf(xo0.p()));
                }
                for (xo0 xo02 : xo0Arr) {
                    if (!r0Var.containsKey(xo02.o()) || ((Long) r0Var.get(xo02.o())).longValue() < xo02.p()) {
                        return xo02;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void h(c cVar) {
            if (!this.k.contains(cVar) || this.j) {
                return;
            }
            if (!this.b.isConnected()) {
                a();
            } else {
                t();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void p(c cVar) {
            xo0[] g2;
            if (this.k.remove(cVar)) {
                g.this.m.removeMessages(15, cVar);
                g.this.m.removeMessages(16, cVar);
                xo0 xo0 = cVar.b;
                ArrayList arrayList = new ArrayList(this.a.size());
                for (s1 s1Var : this.a) {
                    if ((s1Var instanceof v0) && (g2 = ((v0) s1Var).g(this)) != null && com.google.android.gms.common.util.b.b(g2, xo0)) {
                        arrayList.add(s1Var);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    s1 s1Var2 = (s1) obj;
                    this.a.remove(s1Var2);
                    s1Var2.d(new r(xo0));
                }
            }
        }

        private final boolean q(s1 s1Var) {
            if (!(s1Var instanceof v0)) {
                D(s1Var);
                return true;
            }
            v0 v0Var = (v0) s1Var;
            xo0 f2 = f(v0Var.g(this));
            if (f2 == null) {
                D(s1Var);
                return true;
            } else if (v0Var.h(this)) {
                c cVar = new c(this.d, f2, null);
                int indexOf = this.k.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.k.get(indexOf);
                    g.this.m.removeMessages(15, cVar2);
                    g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 15, cVar2), g.this.a);
                    return false;
                }
                this.k.add(cVar);
                g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 15, cVar), g.this.a);
                g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 16, cVar), g.this.b);
                vo0 vo0 = new vo0(2, null);
                if (J(vo0)) {
                    return false;
                }
                g.this.t(vo0, this.h);
                return false;
            } else {
                v0Var.d(new r(f2));
                return false;
            }
        }

        /* access modifiers changed from: private */
        public final void r() {
            w();
            K(vo0.e);
            y();
            Iterator<r1> it = this.g.values().iterator();
            while (it.hasNext()) {
                r1 next = it.next();
                if (f(next.a.c()) != null) {
                    it.remove();
                } else {
                    try {
                        next.a.d(this.c, new at1<>());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.b.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            t();
            z();
        }

        /* access modifiers changed from: private */
        public final void s() {
            w();
            this.j = true;
            this.e.g();
            g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 9, this.d), g.this.a);
            g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 11, this.d), g.this.b);
            g.this.f.a();
        }

        private final void t() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s1 s1Var = (s1) obj;
                if (!this.b.isConnected()) {
                    return;
                }
                if (q(s1Var)) {
                    this.a.remove(s1Var);
                }
            }
        }

        private final void y() {
            if (this.j) {
                g.this.m.removeMessages(11, this.d);
                g.this.m.removeMessages(9, this.d);
                this.j = false;
            }
        }

        private final void z() {
            g.this.m.removeMessages(12, this.d);
            g.this.m.sendMessageDelayed(g.this.m.obtainMessage(12, this.d), g.this.c);
        }

        public final boolean A() {
            return E(true);
        }

        public final qs1 B() {
            v1 v1Var = this.i;
            if (v1Var == null) {
                return null;
            }
            return v1Var.Y3();
        }

        public final void C(Status status) {
            u.d(g.this.m);
            for (s1 s1Var : this.a) {
                s1Var.b(status);
            }
            this.a.clear();
        }

        public final void I(vo0 vo0) {
            u.d(g.this.m);
            this.b.disconnect();
            onConnectionFailed(vo0);
        }

        public final void a() {
            u.d(g.this.m);
            if (!this.b.isConnected() && !this.b.isConnecting()) {
                int b2 = g.this.f.b(g.this.d, this.b);
                if (b2 != 0) {
                    onConnectionFailed(new vo0(b2, null));
                    return;
                }
                b bVar = new b(this.b, this.d);
                if (this.b.r()) {
                    this.i.X3(bVar);
                }
                this.b.i(bVar);
            }
        }

        public final int b() {
            return this.h;
        }

        public final boolean c() {
            return this.b.isConnected();
        }

        public final boolean d() {
            return this.b.r();
        }

        public final void e() {
            u.d(g.this.m);
            if (this.j) {
                a();
            }
        }

        @Override // com.google.android.gms.common.api.internal.w2
        public final void i(vo0 vo0, com.google.android.gms.common.api.a<?> aVar, boolean z) {
            if (Looper.myLooper() == g.this.m.getLooper()) {
                onConnectionFailed(vo0);
            } else {
                g.this.m.post(new f1(this, vo0));
            }
        }

        public final void j(s1 s1Var) {
            u.d(g.this.m);
            if (!this.b.isConnected()) {
                this.a.add(s1Var);
                vo0 vo0 = this.l;
                if (vo0 == null || !vo0.s()) {
                    a();
                } else {
                    onConnectionFailed(this.l);
                }
            } else if (q(s1Var)) {
                z();
            } else {
                this.a.add(s1Var);
            }
        }

        public final void k(o2 o2Var) {
            u.d(g.this.m);
            this.f.add(o2Var);
        }

        public final a.f m() {
            return this.b;
        }

        public final void n() {
            Status status;
            u.d(g.this.m);
            if (this.j) {
                y();
                if (g.this.e.i(g.this.d) == 18) {
                    status = new Status(8, C0201.m82(19694));
                } else {
                    status = new Status(8, C0201.m82(19695));
                }
                C(status);
                this.b.disconnect();
            }
        }

        @Override // com.google.android.gms.common.api.internal.f
        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == g.this.m.getLooper()) {
                r();
            } else {
                g.this.m.post(new e1(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.m
        public final void onConnectionFailed(vo0 vo0) {
            u.d(g.this.m);
            v1 v1Var = this.i;
            if (v1Var != null) {
                v1Var.Z3();
            }
            w();
            g.this.f.a();
            K(vo0);
            if (vo0.o() == 4) {
                C(g.o);
            } else if (this.a.isEmpty()) {
                this.l = vo0;
            } else if (!J(vo0) && !g.this.t(vo0, this.h)) {
                if (vo0.o() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    g.this.m.sendMessageDelayed(Message.obtain(g.this.m, 9, this.d), g.this.a);
                    return;
                }
                String a2 = this.d.a();
                String valueOf = String.valueOf(vo0);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63 + String.valueOf(valueOf).length());
                sb.append(C0201.m82(19696));
                sb.append(a2);
                sb.append(C0201.m82(19697));
                sb.append(valueOf);
                C(new Status(17, sb.toString()));
            }
        }

        @Override // com.google.android.gms.common.api.internal.f
        public final void onConnectionSuspended(int i2) {
            if (Looper.myLooper() == g.this.m.getLooper()) {
                s();
            } else {
                g.this.m.post(new g1(this));
            }
        }

        public final void u() {
            u.d(g.this.m);
            C(g.n);
            this.e.f();
            for (k.a aVar : (k.a[]) this.g.keySet().toArray(new k.a[this.g.size()])) {
                j(new m2(aVar, new at1()));
            }
            K(new vo0(4));
            if (this.b.isConnected()) {
                this.b.k(new i1(this));
            }
        }

        public final Map<k.a<?>, r1> v() {
            return this.g;
        }

        public final void w() {
            u.d(g.this.m);
            this.l = null;
        }

        public final vo0 x() {
            u.d(g.this.m);
            return this.l;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class b implements w1, c.AbstractC0058c {
        private final a.f a;
        private final b<?> b;
        private n c = null;
        private Set<Scope> d = null;
        private boolean e = false;

        public b(a.f fVar, b<?> bVar) {
            this.a = fVar;
            this.b = bVar;
        }

        /* access modifiers changed from: private */
        public final void g() {
            n nVar;
            if (this.e && (nVar = this.c) != null) {
                this.a.f(nVar, this.d);
            }
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC0058c
        public final void a(vo0 vo0) {
            g.this.m.post(new k1(this, vo0));
        }

        @Override // com.google.android.gms.common.api.internal.w1
        public final void b(n nVar, Set<Scope> set) {
            if (nVar == null || set == null) {
                Log.wtf(C0201.m82(19842), C0201.m82(19843), new Exception());
                c(new vo0(4));
                return;
            }
            this.c = nVar;
            this.d = set;
            g();
        }

        @Override // com.google.android.gms.common.api.internal.w1
        public final void c(vo0 vo0) {
            ((a) g.this.i.get(this.b)).I(vo0);
        }
    }

    private g(Context context, Looper looper, yo0 yo0) {
        this.d = context;
        this.m = new et0(looper, this);
        this.e = yo0;
        this.f = new m(yo0);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static void b() {
        synchronized (p) {
            if (q != null) {
                g gVar = q;
                gVar.h.incrementAndGet();
                gVar.m.sendMessageAtFrontOfQueue(gVar.m.obtainMessage(10));
            }
        }
    }

    public static g m(Context context) {
        g gVar;
        synchronized (p) {
            if (q == null) {
                HandlerThread handlerThread = new HandlerThread(C0201.m82(38929), 9);
                handlerThread.start();
                q = new g(context.getApplicationContext(), handlerThread.getLooper(), yo0.q());
            }
            gVar = q;
        }
        return gVar;
    }

    private final void n(e<?> eVar) {
        b<?> b2 = eVar.b();
        a<?> aVar = this.i.get(b2);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.i.put(b2, aVar);
        }
        if (aVar.d()) {
            this.l.add(b2);
        }
        aVar.a();
    }

    public static g o() {
        g gVar;
        synchronized (p) {
            u.l(q, C0201.m82(38930));
            gVar = q;
        }
        return gVar;
    }

    public final void B() {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void a() {
        this.h.incrementAndGet();
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(10));
    }

    public final PendingIntent c(b<?> bVar, int i2) {
        qs1 B;
        a<?> aVar = this.i.get(bVar);
        if (aVar == null || (B = aVar.B()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.d, i2, B.getSignInIntent(), 134217728);
    }

    public final <O extends a.d> zs1<Boolean> e(e<O> eVar, k.a<?> aVar) {
        at1 at1 = new at1();
        m2 m2Var = new m2(aVar, at1);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(13, new q1(m2Var, this.h.get(), eVar)));
        return at1.a();
    }

    public final <O extends a.d> zs1<Void> f(e<O> eVar, n<a.b, ?> nVar, u<a.b, ?> uVar) {
        at1 at1 = new at1();
        l2 l2Var = new l2(new r1(nVar, uVar), at1);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(8, new q1(l2Var, this.h.get(), eVar)));
        return at1.a();
    }

    public final zs1<Map<b<?>, String>> g(Iterable<? extends com.google.android.gms.common.api.g<?>> iterable) {
        o2 o2Var = new o2(iterable);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(2, o2Var));
        return o2Var.a();
    }

    public final void h(vo0 vo0, int i2) {
        if (!t(vo0, i2)) {
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, vo0));
        }
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        long j2 = 300000;
        String r5 = C0201.m82(38931);
        a<?> aVar = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.c = j2;
                this.m.removeMessages(12);
                for (b<?> bVar : this.i.keySet()) {
                    Handler handler = this.m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.c);
                }
                break;
            case 2:
                o2 o2Var = (o2) message.obj;
                Iterator<b<?>> it = o2Var.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        a<?> aVar2 = this.i.get(next);
                        if (aVar2 == null) {
                            o2Var.b(next, new vo0(13), null);
                            break;
                        } else if (aVar2.c()) {
                            o2Var.b(next, vo0.e, aVar2.m().h());
                        } else if (aVar2.x() != null) {
                            o2Var.b(next, aVar2.x(), null);
                        } else {
                            aVar2.k(o2Var);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a<?> aVar3 : this.i.values()) {
                    aVar3.w();
                    aVar3.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                q1 q1Var = (q1) message.obj;
                a<?> aVar4 = this.i.get(q1Var.c.b());
                if (aVar4 == null) {
                    n(q1Var.c);
                    aVar4 = this.i.get(q1Var.c.b());
                }
                if (!aVar4.d() || this.h.get() == q1Var.b) {
                    aVar4.j(q1Var.a);
                    break;
                } else {
                    q1Var.a.b(n);
                    aVar4.u();
                    break;
                }
            case 5:
                int i3 = message.arg1;
                vo0 vo0 = (vo0) message.obj;
                Iterator<a<?>> it2 = this.i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.b() == i3) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String g2 = this.e.g(vo0.o());
                    String p2 = vo0.p();
                    StringBuilder sb = new StringBuilder(String.valueOf(g2).length() + 69 + String.valueOf(p2).length());
                    sb.append(C0201.m82(38933));
                    sb.append(g2);
                    sb.append(C0201.m82(38934));
                    sb.append(p2);
                    aVar.C(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append(C0201.m82(38935));
                    sb2.append(i3);
                    sb2.append(C0201.m82(38936));
                    Log.wtf(r5, sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (l.a() && (this.d.getApplicationContext() instanceof Application)) {
                    c.c((Application) this.d.getApplicationContext());
                    c.b().a(new d1(this));
                    if (!c.b().f(true)) {
                        this.c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                n((e) message.obj);
                break;
            case 9:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (b<?> bVar2 : this.l) {
                    this.i.remove(bVar2).u();
                }
                this.l.clear();
                break;
            case 11:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).n();
                    break;
                }
                break;
            case 12:
                if (this.i.containsKey(message.obj)) {
                    this.i.get(message.obj).A();
                    break;
                }
                break;
            case 14:
                z zVar = (z) message.obj;
                b<?> a2 = zVar.a();
                if (!this.i.containsKey(a2)) {
                    zVar.b().c(Boolean.FALSE);
                    break;
                } else {
                    zVar.b().c(Boolean.valueOf(this.i.get(a2).E(false)));
                    break;
                }
            case 15:
                c cVar = (c) message.obj;
                if (this.i.containsKey(cVar.a)) {
                    this.i.get(cVar.a).h(cVar);
                    break;
                }
                break;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.i.containsKey(cVar2.a)) {
                    this.i.get(cVar2.a).p(cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append(C0201.m82(38932));
                sb3.append(i2);
                Log.w(r5, sb3.toString());
                return false;
        }
        return true;
    }

    public final void i(e<?> eVar) {
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d> void j(e<O> eVar, int i2, d<? extends com.google.android.gms.common.api.m, a.b> dVar) {
        i2 i2Var = new i2(i2, dVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(4, new q1(i2Var, this.h.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void k(e<O> eVar, int i2, s<a.b, ResultT> sVar, at1<ResultT> at1, q qVar) {
        k2 k2Var = new k2(i2, sVar, at1, qVar);
        Handler handler = this.m;
        handler.sendMessage(handler.obtainMessage(4, new q1(k2Var, this.h.get(), eVar)));
    }

    public final int p() {
        return this.g.getAndIncrement();
    }

    public final boolean t(vo0 vo0, int i2) {
        return this.e.B(this.d, vo0, i2);
    }

    /* access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class c {
        private final b<?> a;
        private final xo0 b;

        private c(b<?> bVar, xo0 xo0) {
            this.a = bVar;
            this.b = xo0;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (!s.a(this.a, cVar.a) || !s.a(this.b, cVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return s.b(this.a, this.b);
        }

        public final String toString() {
            s.a c = s.c(this);
            c.a(C0201.m82(19780), this.a);
            c.a(C0201.m82(19781), this.b);
            return c.toString();
        }

        public /* synthetic */ c(b bVar, xo0 xo0, d1 d1Var) {
            this(bVar, xo0);
        }
    }
}
