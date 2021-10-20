package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.a2;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.n2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.api.internal.u2;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class f {
    private static final Set<f> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a {
        public static final String s = null;
        public static final String t = null;
        public static final String u = null;
        public static final String v = null;
        public static final String w = null;
        public static final String x = null;
        private Account a;
        private final Set<Scope> b = new HashSet();
        private final Set<Scope> c = new HashSet();
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map<a<?>, e.b> h = new r0();
        private final Context i;
        private final Map<a<?>, a.d> j = new r0();
        private i k;
        private int l = -1;
        private c m;
        private Looper n;
        private yo0 o = yo0.q();
        private a.AbstractC0054a<? extends qs1, bs1> p = ps1.c;
        private final ArrayList<b> q = new ArrayList<>();
        private final ArrayList<c> r = new ArrayList<>();

        static {
            C0201.m83(a.class, 36);
        }

        public a(Context context) {
            this.i = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        public final a a(a<? extends Object> aVar) {
            u.l(aVar, C0201.m82(11561));
            this.j.put(aVar, null);
            List<Scope> a2 = aVar.c().a(null);
            this.c.addAll(a2);
            this.b.addAll(a2);
            return this;
        }

        public final <O extends a.d.c> a b(a<O> aVar, O o2) {
            u.l(aVar, C0201.m82(11562));
            u.l(o2, C0201.m82(11563));
            this.j.put(aVar, o2);
            List<Scope> a2 = aVar.c().a(o2);
            this.c.addAll(a2);
            this.b.addAll(a2);
            return this;
        }

        public final a c(b bVar) {
            u.l(bVar, C0201.m82(11564));
            this.q.add(bVar);
            return this;
        }

        public final a d(c cVar) {
            u.l(cVar, C0201.m82(11565));
            this.r.add(cVar);
            return this;
        }

        public final f e() {
            u.b(!this.j.isEmpty(), x);
            e f2 = f();
            a<?> aVar = null;
            Map<a<?>, e.b> g2 = f2.g();
            r0 r0Var = new r0();
            r0 r0Var2 = new r0();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (a<?> aVar2 : this.j.keySet()) {
                a.d dVar = this.j.get(aVar2);
                boolean z2 = g2.get(aVar2) != null;
                r0Var.put(aVar2, Boolean.valueOf(z2));
                u2 u2Var = new u2(aVar2, z2);
                arrayList.add(u2Var);
                a.AbstractC0054a<?, ?> d2 = aVar2.d();
                a.f c2 = d2.c(this.i, this.n, f2, dVar, u2Var, u2Var);
                r0Var2.put(aVar2.a(), c2);
                if (d2.b() == 1) {
                    z = dVar != null;
                }
                if (c2.d()) {
                    if (aVar == null) {
                        aVar = aVar2;
                    } else {
                        String b2 = aVar2.b();
                        String b3 = aVar.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 21 + String.valueOf(b3).length());
                        sb.append(b2);
                        sb.append(w);
                        sb.append(b3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    u.p(this.a == null, s, aVar.b());
                    u.p(this.b.equals(this.c), v, aVar.b());
                } else {
                    String b4 = aVar.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b4).length() + 82);
                    sb2.append(t);
                    sb2.append(b4);
                    sb2.append(u);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            r0 r0Var3 = new r0(this.i, new ReentrantLock(), this.n, f2, this.o, this.p, r0Var, this.q, this.r, r0Var2, this.l, r0.x(r0Var2.values(), true), arrayList, false);
            synchronized (f.a) {
                f.a.add(r0Var3);
            }
            if (this.l >= 0) {
                n2.q(this.k).s(this.l, r0Var3, this.m);
            }
            return r0Var3;
        }

        public final e f() {
            bs1 bs1 = bs1.j;
            if (this.j.containsKey(ps1.e)) {
                bs1 = (bs1) this.j.get(ps1.e);
            }
            return new e(this.a, this.b, this.h, this.d, this.e, this.f, this.g, bs1, false);
        }

        public final a g(Handler handler) {
            u.l(handler, C0201.m82(11566));
            this.n = handler.getLooper();
            return this;
        }
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b extends com.google.android.gms.common.api.internal.f {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface c extends m {
    }

    public static Set<f> k() {
        Set<f> set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public abstract vo0 d();

    public abstract h<Status> e();

    public abstract void f();

    public abstract void g();

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends a.b, R extends m, T extends d<R, A>> T i(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends d<? extends m, A>> T j(T t) {
        throw new UnsupportedOperationException();
    }

    public Context l() {
        throw new UnsupportedOperationException();
    }

    public Looper m() {
        throw new UnsupportedOperationException();
    }

    public boolean n(p pVar) {
        throw new UnsupportedOperationException();
    }

    public void o() {
        throw new UnsupportedOperationException();
    }

    public abstract void p(c cVar);

    public abstract void q(c cVar);

    public void r(a2 a2Var) {
        throw new UnsupportedOperationException();
    }
}
