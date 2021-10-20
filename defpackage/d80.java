package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import defpackage.w90;
import defpackage.y50;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: d80  reason: default package */
/* compiled from: PipelineDraweeController */
public class d80 extends w80<v60<ye0>, bf0> {
    private static final Class<?> F = d80.class;
    private v50<ve0> A;
    private o80 B;
    private Set<gf0> C;
    private j80 D;
    private h80 E;
    private final ve0 u;
    private final v50<ve0> v;
    private final gd0<m40, ye0> w;
    private m40 x;
    private c60<n70<v60<ye0>>> y;
    private boolean z;

    public d80(Resources resources, t80 t80, ve0 ve0, Executor executor, gd0<m40, ye0> gd0, v50<ve0> v50) {
        super(t80, executor, null, null);
        this.u = new a80(resources, ve0);
        this.v = v50;
        this.w = gd0;
    }

    private void Z(c60<n70<v60<ye0>>> c60) {
        this.y = c60;
        d0(null);
    }

    private Drawable c0(v50<ve0> v50, ye0 ye0) {
        Drawable b;
        if (v50 == null) {
            return null;
        }
        Iterator<ve0> it = v50.iterator();
        while (it.hasNext()) {
            ve0 next = it.next();
            if (next.a(ye0) && (b = next.b(ye0)) != null) {
                return b;
            }
        }
        return null;
    }

    private void d0(ye0 ye0) {
        if (this.z) {
            if (o() == null) {
                c90 c90 = new c90();
                d90 d90 = new d90(c90);
                this.E = new h80();
                j(d90);
                K(c90);
            }
            if (this.D == null) {
                R(this.E);
            }
            if (o() instanceof c90) {
                k0(ye0, (c90) o());
            }
        }
    }

    @Override // defpackage.w80
    public void F(Drawable drawable) {
        if (drawable instanceof y70) {
            ((y70) drawable).a();
        }
    }

    public synchronized void R(j80 j80) {
        if (this.D instanceof i80) {
            ((i80) this.D).b(j80);
        } else if (this.D != null) {
            this.D = new i80(this.D, j80);
        } else {
            this.D = j80;
        }
    }

    public synchronized void S(gf0 gf0) {
        if (this.C == null) {
            this.C = new HashSet();
        }
        this.C.add(gf0);
    }

    public void T() {
        synchronized (this) {
            this.D = null;
        }
    }

    /* renamed from: U */
    public Drawable k(v60<ye0> v60) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(2425));
            }
            z50.i(v60.z(v60));
            ye0 w2 = v60.w();
            d0(w2);
            Drawable c0 = c0(this.A, w2);
            if (c0 != null) {
                return c0;
            }
            Drawable c02 = c0(this.v, w2);
            if (c02 != null) {
                if (oh0.d()) {
                    oh0.b();
                }
                return c02;
            }
            Drawable b = this.u.b(w2);
            if (b != null) {
                if (oh0.d()) {
                    oh0.b();
                }
                return b;
            }
            throw new UnsupportedOperationException(C0201.m82(2426) + w2);
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    /* renamed from: V */
    public v60<ye0> m() {
        if (oh0.d()) {
            oh0.a(C0201.m82(2427));
        }
        try {
            if (this.w != null) {
                if (this.x != null) {
                    v60<ye0> v60 = this.w.get(this.x);
                    if (v60 == null || v60.w().h().a()) {
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return v60;
                    }
                    v60.close();
                    if (oh0.d()) {
                        oh0.b();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    /* renamed from: W */
    public int t(v60<ye0> v60) {
        if (v60 != null) {
            return v60.x();
        }
        return 0;
    }

    /* renamed from: X */
    public bf0 u(v60<ye0> v60) {
        z50.i(v60.z(v60));
        return v60.w();
    }

    public synchronized gf0 Y() {
        k80 k80 = null;
        if (this.D != null) {
            k80 = new k80(r(), this.D);
        }
        if (this.C == null) {
            return k80;
        }
        ff0 ff0 = new ff0(this.C);
        if (k80 != null) {
            ff0.l(k80);
        }
        return ff0;
    }

    public void a0(c60<n70<v60<ye0>>> c60, String str, m40 m40, Object obj, v50<ve0> v50, j80 j80) {
        if (oh0.d()) {
            oh0.a(C0201.m82(2428));
        }
        super.x(str, obj);
        Z(c60);
        this.x = m40;
        i0(v50);
        T();
        d0(null);
        R(j80);
        if (oh0.d()) {
            oh0.b();
        }
    }

    public synchronized void b0(n80 n80) {
        if (this.B != null) {
            this.B.f();
        }
        if (n80 != null) {
            if (this.B == null) {
                this.B = new o80(AwakeTimeSinceBootClock.get(), this);
            }
            this.B.a(n80);
            this.B.g(true);
        }
    }

    /* renamed from: e0 */
    public void C(String str, v60<ye0> v60) {
        super.C(str, v60);
        synchronized (this) {
            if (this.D != null) {
                this.D.a(str, 5, true, C0201.m82(2429));
            }
        }
    }

    @Override // defpackage.ia0, defpackage.w80
    public void f(ja0 ja0) {
        super.f(ja0);
        d0(null);
    }

    /* renamed from: f0 */
    public void H(v60<ye0> v60) {
        v60.s(v60);
    }

    public synchronized void g0(j80 j80) {
        if (this.D instanceof i80) {
            ((i80) this.D).c(j80);
        } else if (this.D != null) {
            this.D = new i80(this.D, j80);
        } else {
            this.D = j80;
        }
    }

    public synchronized void h0(gf0 gf0) {
        if (this.C != null) {
            this.C.remove(gf0);
        }
    }

    public void i0(v50<ve0> v50) {
        this.A = v50;
    }

    public void j0(boolean z2) {
        this.z = z2;
    }

    public void k0(ye0 ye0, c90 c90) {
        v90 a;
        c90.f(r());
        ja0 c = c();
        w90.c cVar = null;
        if (!(c == null || (a = w90.a(c.f())) == null)) {
            cVar = a.t();
        }
        c90.j(cVar);
        c90.i(this.E.b());
        if (ye0 != null) {
            c90.g(ye0.c(), ye0.a());
            c90.h(ye0.k());
            return;
        }
        c90.e();
    }

    @Override // defpackage.w80
    public n70<v60<ye0>> p() {
        if (oh0.d()) {
            oh0.a(C0201.m82(2430));
        }
        if (f60.o(2)) {
            f60.q(F, C0201.m82(2431), Integer.valueOf(System.identityHashCode(this)));
        }
        n70<v60<ye0>> n70 = this.y.get();
        if (oh0.d()) {
            oh0.b();
        }
        return n70;
    }

    @Override // defpackage.w80
    public String toString() {
        y50.b d = y50.d(this);
        d.b(C0201.m82(2432), super.toString());
        d.b(C0201.m82(2433), this.y);
        return d.toString();
    }
}
