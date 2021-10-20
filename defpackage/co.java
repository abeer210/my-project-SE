package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import defpackage.wh;
import java.util.List;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: co  reason: default package */
/* compiled from: SingleRequest */
public final class co<R> implements xn, mo, bo {
    private static final boolean D = Log.isLoggable(C0201.m82(8449), 2);
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    private int A;
    private boolean B;
    private RuntimeException C;
    private final String a;
    private final ip b;
    private final Object c;
    private final zn<R> d;
    private final yn e;
    private final Context f;
    private final e g;
    private final Object h;
    private final Class<R> i;
    private final vn<?> j;
    private final int k;
    private final int l;
    private final g m;
    private final no<R> n;
    private final List<zn<R>> o;
    private final ro<? super R> p;
    private final Executor q;
    private hi<R> r;
    private wh.d s;
    private long t;
    private volatile wh u;
    private a v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private int z;

    /* access modifiers changed from: private */
    /* renamed from: co$a */
    /* compiled from: SingleRequest */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    static {
        C0201.m83(co.class, 27);
    }

    private co(Context context, e eVar, Object obj, Object obj2, Class<R> cls, vn<?> vnVar, int i2, int i3, g gVar, no<R> noVar, zn<R> znVar, List<zn<R>> list, yn ynVar, wh whVar, ro<? super R> roVar, Executor executor) {
        this.a = D ? String.valueOf(super.hashCode()) : null;
        this.b = ip.a();
        this.c = obj;
        this.f = context;
        this.g = eVar;
        this.h = obj2;
        this.i = cls;
        this.j = vnVar;
        this.k = i2;
        this.l = i3;
        this.m = gVar;
        this.n = noVar;
        this.d = znVar;
        this.o = list;
        this.e = ynVar;
        this.u = whVar;
        this.p = roVar;
        this.q = executor;
        this.v = a.PENDING;
        if (this.C == null && eVar.i()) {
            this.C = new RuntimeException(C0201.m82(8450));
        }
    }

    /* JADX INFO: finally extract failed */
    private void A(hi<R> hiVar, R r2, com.bumptech.glide.load.a aVar) {
        boolean z2;
        boolean s2 = s();
        this.v = a.COMPLETE;
        this.r = hiVar;
        if (this.g.g() <= 3) {
            Log.d(C0201.m82(8458), C0201.m82(8451) + r2.getClass().getSimpleName() + C0201.m82(8452) + aVar + C0201.m82(8453) + this.h + C0201.m82(8454) + this.z + C0201.m82(8455) + this.A + C0201.m82(8456) + ap.a(this.t) + C0201.m82(8457));
        }
        boolean z3 = true;
        this.B = true;
        try {
            if (this.o != null) {
                z2 = false;
                for (zn<R> znVar : this.o) {
                    z2 |= znVar.b(r2, this.h, this.n, aVar, s2);
                }
            } else {
                z2 = false;
            }
            if (this.d == null || !this.d.b(r2, this.h, this.n, aVar, s2)) {
                z3 = false;
            }
            if (!z3 && !z2) {
                this.n.b(r2, this.p.a(aVar, s2));
            }
            this.B = false;
            x();
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    private void B() {
        if (m()) {
            Drawable drawable = null;
            if (this.h == null) {
                drawable = q();
            }
            if (drawable == null) {
                drawable = p();
            }
            if (drawable == null) {
                drawable = r();
            }
            this.n.d(drawable);
        }
    }

    private void j() {
        if (this.B) {
            throw new IllegalStateException(C0201.m82(8459));
        }
    }

    private boolean l() {
        yn ynVar = this.e;
        return ynVar == null || ynVar.l(this);
    }

    private boolean m() {
        yn ynVar = this.e;
        return ynVar == null || ynVar.g(this);
    }

    private boolean n() {
        yn ynVar = this.e;
        return ynVar == null || ynVar.i(this);
    }

    private void o() {
        j();
        this.b.c();
        this.n.a(this);
        wh.d dVar = this.s;
        if (dVar != null) {
            dVar.a();
            this.s = null;
        }
    }

    private Drawable p() {
        if (this.w == null) {
            Drawable j2 = this.j.j();
            this.w = j2;
            if (j2 == null && this.j.i() > 0) {
                this.w = t(this.j.i());
            }
        }
        return this.w;
    }

    private Drawable q() {
        if (this.y == null) {
            Drawable l2 = this.j.l();
            this.y = l2;
            if (l2 == null && this.j.m() > 0) {
                this.y = t(this.j.m());
            }
        }
        return this.y;
    }

    private Drawable r() {
        if (this.x == null) {
            Drawable t2 = this.j.t();
            this.x = t2;
            if (t2 == null && this.j.u() > 0) {
                this.x = t(this.j.u());
            }
        }
        return this.x;
    }

    private boolean s() {
        yn ynVar = this.e;
        return ynVar == null || !ynVar.c().b();
    }

    private Drawable t(int i2) {
        return xl.a(this.g, i2, this.j.z() != null ? this.j.z() : this.f.getTheme());
    }

    private void u(String str) {
        Log.v(C0201.m82(8461), str + C0201.m82(8460) + this.a);
    }

    private static int v(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * ((float) i2));
    }

    private void w() {
        yn ynVar = this.e;
        if (ynVar != null) {
            ynVar.a(this);
        }
    }

    private void x() {
        yn ynVar = this.e;
        if (ynVar != null) {
            ynVar.j(this);
        }
    }

    public static <R> co<R> y(Context context, e eVar, Object obj, Object obj2, Class<R> cls, vn<?> vnVar, int i2, int i3, g gVar, no<R> noVar, zn<R> znVar, List<zn<R>> list, yn ynVar, wh whVar, ro<? super R> roVar, Executor executor) {
        return new co<>(context, eVar, obj, obj2, cls, vnVar, i2, i3, gVar, noVar, znVar, list, ynVar, whVar, roVar, executor);
    }

    /* JADX INFO: finally extract failed */
    private void z(ci ciVar, int i2) {
        boolean z2;
        this.b.c();
        synchronized (this.c) {
            ciVar.k(this.C);
            int g2 = this.g.g();
            if (g2 <= i2) {
                String r11 = C0201.m82(8462);
                Log.w(r11, C0201.m82(8463) + this.h + C0201.m82(8464) + this.z + C0201.m82(8465) + this.A + C0201.m82(8466), ciVar);
                if (g2 <= 4) {
                    ciVar.g(C0201.m82(8467));
                }
            }
            this.s = null;
            this.v = a.FAILED;
            boolean z3 = true;
            this.B = true;
            try {
                if (this.o != null) {
                    z2 = false;
                    for (zn<R> znVar : this.o) {
                        z2 |= znVar.a(ciVar, this.h, this.n, s());
                    }
                } else {
                    z2 = false;
                }
                if (this.d == null || !this.d.a(ciVar, this.h, this.n, s())) {
                    z3 = false;
                }
                if (!z2 && !z3) {
                    B();
                }
                this.B = false;
                w();
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    @Override // defpackage.bo
    public void a(ci ciVar) {
        z(ciVar, 5);
    }

    @Override // defpackage.xn
    public boolean b() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: co<R> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: wh */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [hi<R>, hi, wh$d] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r6.u.k(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.bo
    public void c(hi<?> hiVar, com.bumptech.glide.load.a aVar) {
        Throwable th;
        this.b.c();
        ?? r0 = (hi<R>) false;
        try {
            synchronized (this.c) {
                try {
                    this.s = r0;
                    if (hiVar == null) {
                        a(new ci(C0201.m82(8468) + this.i + C0201.m82(8469)));
                        return;
                    }
                    Object obj = hiVar.get();
                    if (obj != null) {
                        if (this.i.isAssignableFrom(obj.getClass())) {
                            if (!n()) {
                                try {
                                    this.r = r0;
                                    this.v = a.COMPLETE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                A(hiVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.r = r0;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0201.m82(8470));
                    sb.append(this.i);
                    sb.append(C0201.m82(8471));
                    sb.append(obj != null ? obj.getClass() : C0201.m82(8472));
                    sb.append(C0201.m82(8473));
                    sb.append(obj);
                    sb.append(C0201.m82(8474));
                    sb.append(hiVar);
                    sb.append(C0201.m82(8475));
                    sb.append(obj != null ? C0201.m82(8476) : C0201.m82(8477));
                    a(new ci(sb.toString()));
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } finally {
            if (r0 != 0) {
                this.u.k(r0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4.u.k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    @Override // defpackage.xn
    public void clear() {
        synchronized (this.c) {
            j();
            this.b.c();
            if (this.v != a.CLEARED) {
                o();
                hi<?> hiVar = null;
                if (this.r != null) {
                    hi<R> hiVar2 = this.r;
                    this.r = null;
                    hiVar = hiVar2;
                }
                if (l()) {
                    this.n.g(r());
                }
                this.v = a.CLEARED;
            }
        }
    }

    @Override // defpackage.xn
    public void d() {
        synchronized (this.c) {
            j();
            this.b.c();
            this.t = ap.b();
            if (this.h == null) {
                if (fp.r(this.k, this.l)) {
                    this.z = this.k;
                    this.A = this.l;
                }
                z(new ci(C0201.m82(8478)), q() == null ? 5 : 3);
            } else if (this.v == a.RUNNING) {
                throw new IllegalArgumentException(C0201.m82(8480));
            } else if (this.v == a.COMPLETE) {
                c(this.r, com.bumptech.glide.load.a.MEMORY_CACHE);
            } else {
                this.v = a.WAITING_FOR_SIZE;
                if (fp.r(this.k, this.l)) {
                    g(this.k, this.l);
                } else {
                    this.n.h(this);
                }
                if ((this.v == a.RUNNING || this.v == a.WAITING_FOR_SIZE) && m()) {
                    this.n.e(r());
                }
                if (D) {
                    u(C0201.m82(8479) + ap.a(this.t));
                }
            }
        }
    }

    @Override // defpackage.xn
    public boolean e(xn xnVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        vn<?> vnVar;
        g gVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        vn<?> vnVar2;
        g gVar2;
        int size2;
        if (!(xnVar instanceof co)) {
            return false;
        }
        synchronized (this.c) {
            i2 = this.k;
            i3 = this.l;
            obj = this.h;
            cls = this.i;
            vnVar = this.j;
            gVar = this.m;
            size = this.o != null ? this.o.size() : 0;
        }
        co coVar = (co) xnVar;
        synchronized (coVar.c) {
            i4 = coVar.k;
            i5 = coVar.l;
            obj2 = coVar.h;
            cls2 = coVar.i;
            vnVar2 = coVar.j;
            gVar2 = coVar.m;
            size2 = coVar.o != null ? coVar.o.size() : 0;
        }
        return i2 == i4 && i3 == i5 && fp.b(obj, obj2) && cls.equals(cls2) && vnVar.equals(vnVar2) && gVar == gVar2 && size == size2;
    }

    @Override // defpackage.xn
    public void f() {
        synchronized (this.c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // defpackage.mo
    public void g(int i2, int i3) {
        Object obj;
        this.b.c();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                if (D) {
                    u(E + ap.a(this.t));
                }
                if (this.v == a.WAITING_FOR_SIZE) {
                    this.v = a.RUNNING;
                    float y2 = this.j.y();
                    this.z = v(i2, y2);
                    this.A = v(i3, y2);
                    if (D) {
                        u(G + ap.a(this.t));
                    }
                    obj = obj2;
                    try {
                        this.s = this.u.f(this.g, this.h, this.j.x(), this.z, this.A, this.j.w(), this.i, this.m, this.j.g(), this.j.B(), this.j.M(), this.j.I(), this.j.o(), this.j.F(), this.j.D(), this.j.C(), this.j.n(), this, this.q);
                        if (this.v != a.RUNNING) {
                            this.s = null;
                        }
                        if (D) {
                            u(F + ap.a(this.t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    @Override // defpackage.xn
    public boolean h() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.CLEARED;
        }
        return z2;
    }

    @Override // defpackage.bo
    public Object i() {
        this.b.c();
        return this.c;
    }

    @Override // defpackage.xn
    public boolean isRunning() {
        boolean z2;
        synchronized (this.c) {
            if (this.v != a.RUNNING) {
                if (this.v != a.WAITING_FOR_SIZE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    @Override // defpackage.xn
    public boolean k() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }
}
