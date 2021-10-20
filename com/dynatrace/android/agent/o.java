package com.dynatrace.android.agent;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import vigqyno.C0201;

/* compiled from: DTXActionImpl */
public class o extends m implements n {
    private static final String v = (u.b + C0201.m82(3457));
    public static AtomicLong w = new AtomicLong(0);
    private static CopyOnWriteArrayList<p30> x = null;
    private static ConcurrentHashMap<Long, Vector<m>> y = new ConcurrentHashMap<>();
    public int o = -1;
    public Vector<m> p = new Vector<>();
    public o q = null;
    public long r;
    public String s = v30.b().a();
    public String t;
    public int u = 0;

    /* access modifiers changed from: private */
    /* compiled from: DTXActionImpl */
    public class a extends Thread {
        private ArrayList<p30> a;
        private o b;

        public a(o oVar, ArrayList<p30> arrayList, o oVar2) {
            this.a = arrayList;
            this.b = oVar2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void b() {
            Iterator<p30> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().f(this.b);
            }
            this.a.clear();
            this.a = null;
            this.b = null;
        }

        public void run() {
            b();
        }
    }

    public o(String str, t tVar, long j, g30 g30, int i) {
        super(str, 5, tVar, j, g30, i);
        long j2 = w.get();
        if (j2 > 0) {
            this.r = t() - j2;
        }
        if (this.r < 0) {
            this.r = 0;
        }
        if (u.c) {
            s30.r(v, String.format(C0201.m82(3458), str, this.s, Long.valueOf(this.r)));
        }
        if (y()) {
            if (u.c) {
                s30.r(v, String.format(C0201.m82(3459), new Object[0]));
            }
            j();
        }
    }

    private void F(String str, int i, String... strArr) {
        m a2;
        if (O() && (a2 = j.a(str, i, u(), null, this.h, this.i, strArr)) != null) {
            E(a2);
        }
    }

    @Deprecated
    public static void G(m mVar) {
        b20 b = b.d().b();
        if (b == null || b.c != z10.SAAS) {
            Vector<m> vector = y.get(Long.valueOf(Thread.currentThread().getId()));
            if (vector == null) {
                vector = new Vector<>();
                y.put(Long.valueOf(Thread.currentThread().getId()), vector);
            }
            vector.add(mVar);
        }
    }

    public static n J(String str, n nVar) {
        int i;
        g30 g30;
        long j;
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar == null || oVar.x()) {
            g30 = g30.b(false, true);
            i = b.d().c;
            j = 0;
        } else {
            j = oVar.u();
            g30 = oVar.h;
            i = oVar.i;
        }
        o oVar2 = new o(str, t.ACTION_MANUAL, j, g30, i);
        if (oVar != null && !oVar.w()) {
            oVar2.j();
        }
        if (j != 0) {
            oVar2.q = oVar;
            oVar2.u = oVar.u + 1;
            oVar.E(oVar2);
            if (oVar2.u >= 10) {
                if (u.c) {
                    s30.w(v, String.format(C0201.m82(3460), oVar2.o()));
                }
                return oVar2;
            }
        }
        a.a(oVar2);
        j.a(str, 1, j, oVar2, g30, i, new String[0]);
        return oVar2;
    }

    @Deprecated
    public static Vector<m> M() {
        b20 b = b.d().b();
        if (b == null || b.c != z10.SAAS) {
            return y.remove(Long.valueOf(Thread.currentThread().getId()));
        }
        return null;
    }

    public static void U(p30 p30) {
        if (p30 != null) {
            if (x == null) {
                x = new CopyOnWriteArrayList<>();
            }
            if (x.indexOf(p30) < 0) {
                x.add(p30);
            }
        }
    }

    public static void V(p30 p30) {
        CopyOnWriteArrayList<p30> copyOnWriteArrayList;
        if (p30 != null && (copyOnWriteArrayList = x) != null) {
            copyOnWriteArrayList.remove(p30);
        }
    }

    public final void E(m mVar) {
        if (mVar != null && mVar.w()) {
            this.p.add(mVar);
            T(mVar);
        }
    }

    public void H(StringBuilder sb, String... strArr) {
        if (q() == 0) {
            if (this.s != null) {
                sb.append(strArr[0]);
                sb.append(this.s);
            }
            String str = this.t;
            if (str != null && !str.equals(this.s)) {
                sb.append(strArr[1]);
                sb.append(this.t);
            }
            if (this.r > 0) {
                sb.append(strArr[2]);
                sb.append(this.r);
            }
        }
    }

    @Deprecated
    public void I() {
        Vector<m> M = M();
        if (M != null) {
            Iterator<m> it = M.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.t() > t() && next.t() < l()) {
                    if (u.c) {
                        s30.r(v, String.format(C0201.m82(3461), o(), next.o(), Long.valueOf(next.u())));
                    }
                    next.A(u());
                    E(next);
                } else if (u.c) {
                    s30.r(v, String.format(C0201.m82(3462), o(), next.o(), Long.valueOf(next.u())));
                }
            }
        }
    }

    public Vector<m> K() {
        Vector<m> vector;
        synchronized (this.p) {
            vector = new Vector<>(this.p);
        }
        return vector;
    }

    public b0 L() {
        if (!O() || !this.h.c().e(t.WEB_REQUEST)) {
            return null;
        }
        return new b0(u(), this.i, this.h);
    }

    public o N() {
        return this.q;
    }

    public boolean O() {
        if (x()) {
            return false;
        }
        if (this.u < 10) {
            return q.e();
        }
        if (u.c) {
            s30.w(v, String.format(C0201.m82(3463), o()));
        }
        return false;
    }

    public b0 P() {
        b0 L = L();
        if (L == null) {
            return null;
        }
        E(new m(L.toString(), 110, t.PLACEHOLDER, u(), this.h, this.i));
        return L;
    }

    public b0 Q(HttpURLConnection httpURLConnection) {
        b0 P;
        if (httpURLConnection == null || (P = P()) == null) {
            return null;
        }
        try {
            httpURLConnection.setRequestProperty(q.h(), P.toString());
        } catch (Exception e) {
            if (u.c) {
                s30.t(v, e.toString());
            }
        }
        return P;
    }

    public void R(boolean z) {
        if (!x()) {
            this.t = v30.b().a();
            if (u.c) {
                s30.r(v, String.format(C0201.m82(3465), o(), Boolean.valueOf(z), this.t));
            }
            a.d(this);
            boolean O = O();
            if (O) {
                this.c = this.h.d();
                I();
                S();
                this.o = s30.c();
                if (z) {
                    j.a(o(), 2, q(), this, this.h, this.i, new String[0]);
                    if (q() == 0) {
                        if (u.c) {
                            s30.r(v, String.format(C0201.m82(3466), o(), Long.valueOf(w.get()), Long.valueOf(this.c)));
                        }
                        w.set(this.c);
                    }
                } else {
                    C();
                    j.k(this);
                }
            } else {
                S();
                C();
                j.k(this);
            }
            if (x != null) {
                a aVar = new a(this, new ArrayList(x), this);
                if (k.e() || u30.n().p()) {
                    aVar.b();
                } else {
                    aVar.start();
                }
            }
            if (u.c) {
                String str = v;
                Object[] objArr = new Object[4];
                objArr[0] = o();
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = Boolean.valueOf(O);
                CopyOnWriteArrayList<p30> copyOnWriteArrayList = x;
                objArr[3] = Integer.valueOf(copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size());
                s30.r(str, String.format(C0201.m82(3467), objArr));
                if (!O) {
                    s30.w(v, String.format(C0201.m82(3468), o(), Long.valueOf(u()), Boolean.valueOf(O)));
                }
            }
        } else if (u.c) {
            s30.r(v, String.format(C0201.m82(3464), o()));
        }
    }

    public void S() {
        Vector<m> vector = this.p;
        if (vector != null) {
            synchronized (vector) {
                for (int size = this.p.size() - 1; size >= 0; size--) {
                    m mVar = this.p.get(size);
                    if (mVar.v() == 5) {
                        ((o) mVar).c();
                    }
                }
            }
        }
    }

    public void T(m mVar) {
    }

    public void W(String str) {
        if (str != null) {
            Iterator<m> it = K().iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.o().equals(str)) {
                    this.p.remove(next);
                    j.k(next);
                    if (u.c) {
                        String str2 = v;
                        s30.r(str2, C0201.m82(3469) + str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.dynatrace.android.agent.n
    public final void a(String str) {
        F(str, 4, new String[0]);
    }

    @Override // com.dynatrace.android.agent.n
    public final void b(String str, String str2) {
        F(str, 8, str2);
    }

    @Override // com.dynatrace.android.agent.n
    public void c() {
        R(true);
    }

    @Override // com.dynatrace.android.agent.n
    public final void d(String str, double d) {
        F(str, 7, String.valueOf(d));
    }

    @Override // com.dynatrace.android.agent.n
    public final void e(String str, int i) {
        F(str, 6, String.valueOf(i));
    }

    @Override // com.dynatrace.android.agent.n
    public final void g(String str, int i) {
        if (j.r()) {
            F(str, 9, String.valueOf(i));
        }
    }

    @Override // com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(3470));
        sb.append(this.j.d());
        sb.append(C0201.m82(3471));
        sb.append(s30.q(o()));
        sb.append(C0201.m82(3472));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(3473));
        sb.append(u());
        sb.append(C0201.m82(3474));
        sb.append(q());
        sb.append(C0201.m82(3475));
        sb.append(n());
        sb.append(C0201.m82(3476));
        sb.append(t());
        sb.append(C0201.m82(3477));
        sb.append(this.o);
        sb.append(C0201.m82(3478));
        sb.append(l() - t());
        H(sb, C0201.m82(3479), C0201.m82(3480), C0201.m82(3481));
        return sb;
    }
}
