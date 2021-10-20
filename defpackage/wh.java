package defpackage;

import android.util.Log;
import androidx.core.util.e;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import defpackage.aj;
import defpackage.bi;
import defpackage.gp;
import defpackage.hj;
import defpackage.th;
import java.util.Map;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: wh  reason: default package */
/* compiled from: Engine */
public class wh implements yh, hj.a, bi.a {
    private static final boolean i = Log.isLoggable(C0201.m82(14581), 2);
    private final ei a;
    private final ai b;
    private final hj c;
    private final b d;
    private final ki e;
    private final c f;
    private final a g;
    private final mh h;

    /* access modifiers changed from: package-private */
    /* renamed from: wh$a */
    /* compiled from: Engine */
    public static class a {
        public final th.e a;
        public final e<th<?>> b = gp.d(150, new C0223a());
        private int c;

        /* renamed from: wh$a$a  reason: collision with other inner class name */
        /* compiled from: Engine */
        class C0223a implements gp.d<th<?>> {
            public C0223a() {
            }

            /* renamed from: a */
            public th<?> create() {
                a aVar = a.this;
                return new th<>(aVar.a, aVar.b);
            }
        }

        public a(th.e eVar) {
            this.a = eVar;
        }

        public <R> th<R> a(com.bumptech.glide.e eVar, Object obj, zh zhVar, g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, vh vhVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, boolean z3, i iVar, th.b<R> bVar) {
            th<?> b2 = this.b.b();
            ep.d(b2);
            th<R> thVar = (th<R>) b2;
            int i3 = this.c;
            this.c = i3 + 1;
            thVar.q(eVar, obj, zhVar, gVar, i, i2, cls, cls2, gVar2, vhVar, map, z, z2, z3, iVar, bVar, i3);
            return thVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: wh$b */
    /* compiled from: Engine */
    public static class b {
        public final kj a;
        public final kj b;
        public final kj c;
        public final kj d;
        public final yh e;
        public final bi.a f;
        public final e<xh<?>> g = gp.d(150, new a());

        /* renamed from: wh$b$a */
        /* compiled from: Engine */
        class a implements gp.d<xh<?>> {
            public a() {
            }

            /* renamed from: a */
            public xh<?> create() {
                b bVar = b.this;
                return new xh<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(kj kjVar, kj kjVar2, kj kjVar3, kj kjVar4, yh yhVar, bi.a aVar) {
            this.a = kjVar;
            this.b = kjVar2;
            this.c = kjVar3;
            this.d = kjVar4;
            this.e = yhVar;
            this.f = aVar;
        }

        public <R> xh<R> a(g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            xh<?> b2 = this.g.b();
            ep.d(b2);
            xh<R> xhVar = (xh<R>) b2;
            xhVar.l(gVar, z, z2, z3, z4);
            return xhVar;
        }
    }

    /* renamed from: wh$c */
    /* compiled from: Engine */
    private static class c implements th.e {
        private final aj.a a;
        private volatile aj b;

        public c(aj.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.th.e
        public aj a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new bj();
                    }
                }
            }
            return this.b;
        }
    }

    /* renamed from: wh$d */
    /* compiled from: Engine */
    public class d {
        private final xh<?> a;
        private final bo b;

        public d(bo boVar, xh<?> xhVar) {
            this.b = boVar;
            this.a = xhVar;
        }

        public void a() {
            synchronized (wh.this) {
                this.a.r(this.b);
            }
        }
    }

    public wh(hj hjVar, aj.a aVar, kj kjVar, kj kjVar2, kj kjVar3, kj kjVar4, boolean z) {
        this(hjVar, aVar, kjVar, kjVar2, kjVar3, kjVar4, null, null, null, null, null, null, z);
    }

    private bi<?> e(g gVar) {
        hi<?> d2 = this.c.d(gVar);
        if (d2 == null) {
            return null;
        }
        if (d2 instanceof bi) {
            return (bi) d2;
        }
        return new bi<>(d2, true, true, gVar, this);
    }

    private bi<?> g(g gVar) {
        bi<?> e2 = this.h.e(gVar);
        if (e2 != null) {
            e2.c();
        }
        return e2;
    }

    private bi<?> h(g gVar) {
        bi<?> e2 = e(gVar);
        if (e2 != null) {
            e2.c();
            this.h.a(gVar, e2);
        }
        return e2;
    }

    private bi<?> i(zh zhVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        bi<?> g2 = g(zhVar);
        if (g2 != null) {
            if (i) {
                j(C0201.m82(14582), j, zhVar);
            }
            return g2;
        }
        bi<?> h2 = h(zhVar);
        if (h2 == null) {
            return null;
        }
        if (i) {
            j(C0201.m82(14583), j, zhVar);
        }
        return h2;
    }

    private static void j(String str, long j, g gVar) {
        Log.v(C0201.m82(14586), str + C0201.m82(14584) + ap.a(j) + C0201.m82(14585) + gVar);
    }

    private <R> d l(com.bumptech.glide.e eVar, Object obj, g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, vh vhVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, i iVar, boolean z3, boolean z4, boolean z5, boolean z6, bo boVar, Executor executor, zh zhVar, long j) {
        xh<?> a2 = this.a.a(zhVar, z6);
        if (a2 != null) {
            a2.b(boVar, executor);
            if (i) {
                j(C0201.m82(14587), j, zhVar);
            }
            return new d(boVar, a2);
        }
        xh<R> a3 = this.d.a(zhVar, z3, z4, z5, z6);
        th<R> a4 = this.g.a(eVar, obj, zhVar, gVar, i2, i3, cls, cls2, gVar2, vhVar, map, z, z2, z6, iVar, a3);
        this.a.c(zhVar, a3);
        a3.b(boVar, executor);
        a3.s(a4);
        if (i) {
            j(C0201.m82(14588), j, zhVar);
        }
        return new d(boVar, a3);
    }

    @Override // defpackage.hj.a
    public void a(hi<?> hiVar) {
        this.e.a(hiVar, true);
    }

    @Override // defpackage.yh
    public synchronized void b(xh<?> xhVar, g gVar, bi<?> biVar) {
        if (biVar != null) {
            if (biVar.e()) {
                this.h.a(gVar, biVar);
            }
        }
        this.a.d(gVar, xhVar);
    }

    @Override // defpackage.yh
    public synchronized void c(xh<?> xhVar, g gVar) {
        this.a.d(gVar, xhVar);
    }

    @Override // defpackage.bi.a
    public void d(g gVar, bi<?> biVar) {
        this.h.d(gVar);
        if (biVar.e()) {
            this.c.c(gVar, biVar);
        } else {
            this.e.a(biVar, false);
        }
    }

    public <R> d f(com.bumptech.glide.e eVar, Object obj, g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, vh vhVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, i iVar, boolean z3, boolean z4, boolean z5, boolean z6, bo boVar, Executor executor) {
        long b2 = i ? ap.b() : 0;
        zh a2 = this.b.a(obj, gVar, i2, i3, map, cls, cls2, iVar);
        synchronized (this) {
            bi<?> i4 = i(a2, z3, b2);
            if (i4 == null) {
                return l(eVar, obj, gVar, i2, i3, cls, cls2, gVar2, vhVar, map, z, z2, iVar, z3, z4, z5, z6, boVar, executor, a2, b2);
            }
            boVar.c(i4, com.bumptech.glide.load.a.MEMORY_CACHE);
            return null;
        }
    }

    public void k(hi<?> hiVar) {
        if (hiVar instanceof bi) {
            ((bi) hiVar).f();
            return;
        }
        throw new IllegalArgumentException(C0201.m82(14589));
    }

    public wh(hj hjVar, aj.a aVar, kj kjVar, kj kjVar2, kj kjVar3, kj kjVar4, ei eiVar, ai aiVar, mh mhVar, b bVar, a aVar2, ki kiVar, boolean z) {
        this.c = hjVar;
        this.f = new c(aVar);
        mh mhVar2 = mhVar == null ? new mh(z) : mhVar;
        this.h = mhVar2;
        mhVar2.f(this);
        this.b = aiVar == null ? new ai() : aiVar;
        this.a = eiVar == null ? new ei() : eiVar;
        this.d = bVar == null ? new b(kjVar, kjVar2, kjVar3, kjVar4, this, this) : bVar;
        this.g = aVar2 == null ? new a(this.f) : aVar2;
        this.e = kiVar == null ? new ki() : kiVar;
        hjVar.e(this);
    }
}
