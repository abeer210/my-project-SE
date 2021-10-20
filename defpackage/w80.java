package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import defpackage.ha0;
import defpackage.t80;
import defpackage.u80;
import defpackage.y50;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: w80  reason: default package */
/* compiled from: AbstractDraweeController */
public abstract class w80<T, INFO> implements ia0, t80.b, ha0.a {
    private static final Class<?> t = w80.class;
    private final u80 a = u80.a();
    private final t80 b;
    private final Executor c;
    private v80 d;
    private ha0 e;
    public z80<INFO> f;
    private ka0 g;
    private Drawable h;
    private String i;
    private Object j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private n70<T> p;
    private T q;
    private Drawable r;
    private boolean s = true;

    /* access modifiers changed from: package-private */
    /* renamed from: w80$a */
    /* compiled from: AbstractDraweeController */
    public class a extends m70<T> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // defpackage.m70, defpackage.p70
        public void d(n70<T> n70) {
            boolean b2 = n70.b();
            w80.this.E(this.a, n70, n70.d(), b2);
        }

        @Override // defpackage.m70
        public void e(n70<T> n70) {
            w80.this.B(this.a, n70, n70.c(), true);
        }

        @Override // defpackage.m70
        public void f(n70<T> n70) {
            boolean b2 = n70.b();
            boolean e = n70.e();
            float d = n70.d();
            T f = n70.f();
            if (f != null) {
                w80.this.D(this.a, n70, f, d, b2, this.b, e);
            } else if (b2) {
                w80.this.B(this.a, n70, new NullPointerException(), true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w80$b */
    /* compiled from: AbstractDraweeController */
    public static class b<INFO> extends b90<INFO> {
        private b() {
        }

        public static <INFO> b<INFO> k(z80<? super INFO> z80, z80<? super INFO> z802) {
            if (oh0.d()) {
                oh0.a(C0201.m82(10426));
            }
            b<INFO> bVar = new b<>();
            bVar.g(z80);
            bVar.g(z802);
            if (oh0.d()) {
                oh0.b();
            }
            return bVar;
        }
    }

    public w80(t80 t80, Executor executor, String str, Object obj) {
        this.b = t80;
        this.c = executor;
        w(str, obj);
    }

    private void A(String str, T t2) {
        if (f60.o(2)) {
            f60.u(t, C0201.m82(29243), Integer.valueOf(System.identityHashCode(this)), this.i, str, s(t2), Integer.valueOf(t(t2)));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void B(String str, n70<T> n70, Throwable th, boolean z) {
        Drawable drawable;
        if (oh0.d()) {
            oh0.a(C0201.m82(29244));
        }
        if (!y(str, n70)) {
            z(C0201.m82(29245), th);
            n70.close();
            if (oh0.d()) {
                oh0.b();
                return;
            }
            return;
        }
        this.a.b(z ? u80.a.ON_DATASOURCE_FAILURE : u80.a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            z(C0201.m82(29246), th);
            this.p = null;
            this.m = true;
            if (this.n && (drawable = this.r) != null) {
                this.g.g(drawable, 1.0f, true);
            } else if (P()) {
                this.g.c(th);
            } else {
                this.g.d(th);
            }
            n().c(this.i, th);
        } else {
            z(C0201.m82(29247), th);
            n().f(this.i, th);
        }
        if (oh0.d()) {
            oh0.b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void D(String str, n70<T> n70, T t2, float f2, boolean z, boolean z2, boolean z3) {
        boolean d2;
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(29248));
            }
            if (!y(str, n70)) {
                A(C0201.m82(29249), t2);
                H(t2);
                n70.close();
                if (!d2) {
                    return;
                }
                return;
            }
            this.a.b(z ? u80.a.ON_DATASOURCE_RESULT : u80.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable k2 = k(t2);
                T t3 = this.q;
                Drawable drawable = this.r;
                this.q = t2;
                this.r = k2;
                String r2 = C0201.m82(29250);
                if (z) {
                    try {
                        A(C0201.m82(29251), t2);
                        this.p = null;
                        this.g.g(k2, 1.0f, z2);
                        n().b(str, u(t2), l());
                    } finally {
                        if (!(drawable == null || drawable == k2)) {
                            F(drawable);
                        }
                        if (!(t3 == null || t3 == t2)) {
                            A(r2, t3);
                            H(t3);
                        }
                    }
                } else if (z3) {
                    A(C0201.m82(29252), t2);
                    this.g.g(k2, 1.0f, z2);
                    n().b(str, u(t2), l());
                } else {
                    A(C0201.m82(29253), t2);
                    this.g.g(k2, f2, z2);
                    n().a(str, u(t2));
                }
                if (oh0.d()) {
                    oh0.b();
                }
            } catch (Exception e2) {
                A(C0201.m82(29254), t2);
                H(t2);
                B(str, n70, e2, z);
                if (oh0.d()) {
                    oh0.b();
                }
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void E(String str, n70<T> n70, float f2, boolean z) {
        if (!y(str, n70)) {
            z(C0201.m82(29255), null);
            n70.close();
        } else if (!z) {
            this.g.e(f2, false);
        }
    }

    private void G() {
        boolean z = this.l;
        this.l = false;
        this.m = false;
        n70<T> n70 = this.p;
        if (n70 != null) {
            n70.close();
            this.p = null;
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            F(drawable);
        }
        if (this.o != null) {
            this.o = null;
        }
        this.r = null;
        T t2 = this.q;
        if (t2 != null) {
            A(C0201.m82(29256), t2);
            H(this.q);
            this.q = null;
        }
        if (z) {
            n().d(this.i);
        }
    }

    private boolean P() {
        v80 v80;
        return this.m && (v80 = this.d) != null && v80.e();
    }

    private synchronized void w(String str, Object obj) {
        if (oh0.d()) {
            oh0.a(C0201.m82(29257));
        }
        this.a.b(u80.a.ON_INIT_CONTROLLER);
        if (!this.s && this.b != null) {
            this.b.c(this);
        }
        this.k = false;
        G();
        this.n = false;
        if (this.d != null) {
            this.d.a();
        }
        if (this.e != null) {
            this.e.a();
            this.e.f(this);
        }
        if (this.f instanceof b) {
            ((b) this.f).h();
        } else {
            this.f = null;
        }
        if (this.g != null) {
            this.g.a();
            this.g.b(null);
            this.g = null;
        }
        this.h = null;
        if (f60.o(2)) {
            f60.s(t, C0201.m82(29258), Integer.valueOf(System.identityHashCode(this)), this.i, str);
        }
        this.i = str;
        this.j = obj;
        if (oh0.d()) {
            oh0.b();
        }
    }

    private boolean y(String str, n70<T> n70) {
        if (n70 == null && this.p == null) {
            return true;
        }
        if (!str.equals(this.i) || n70 != this.p || !this.l) {
            return false;
        }
        return true;
    }

    private void z(String str, Throwable th) {
        if (f60.o(2)) {
            f60.t(t, C0201.m82(29259), Integer.valueOf(System.identityHashCode(this)), this.i, str, th);
        }
    }

    public void C(String str, T t2) {
    }

    public abstract void F(Drawable drawable);

    public abstract void H(T t2);

    public void I(z80<? super INFO> z80) {
        z50.g(z80);
        z80<INFO> z802 = this.f;
        if (z802 instanceof b) {
            ((b) z802).j(z80);
        } else if (z802 == z80) {
            this.f = null;
        }
    }

    public void J(String str) {
        this.o = str;
    }

    public void K(Drawable drawable) {
        this.h = drawable;
        ka0 ka0 = this.g;
        if (ka0 != null) {
            ka0.b(drawable);
        }
    }

    public void L(a90 a90) {
    }

    public void M(ha0 ha0) {
        this.e = ha0;
        if (ha0 != null) {
            ha0.f(this);
        }
    }

    public void N(boolean z) {
        this.n = z;
    }

    public boolean O() {
        return P();
    }

    public void Q() {
        if (oh0.d()) {
            oh0.a(C0201.m82(29260));
        }
        T m2 = m();
        if (m2 != null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(29261));
            }
            this.p = null;
            this.l = true;
            this.m = false;
            this.a.b(u80.a.ON_SUBMIT_CACHE_HIT);
            n().e(this.i, this.j);
            C(this.i, m2);
            D(this.i, this.p, m2, 1.0f, true, true, true);
            if (oh0.d()) {
                oh0.b();
            }
            if (oh0.d()) {
                oh0.b();
                return;
            }
            return;
        }
        this.a.b(u80.a.ON_DATASOURCE_SUBMIT);
        n().e(this.i, this.j);
        this.g.e(0.0f, true);
        this.l = true;
        this.m = false;
        this.p = p();
        if (f60.o(2)) {
            f60.s(t, C0201.m82(29262), Integer.valueOf(System.identityHashCode(this)), this.i, Integer.valueOf(System.identityHashCode(this.p)));
        }
        this.p.g(new a(this.i, this.p.a()), this.c);
        if (oh0.d()) {
            oh0.b();
        }
    }

    @Override // defpackage.ia0
    public boolean a(MotionEvent motionEvent) {
        if (f60.o(2)) {
            f60.s(t, C0201.m82(29263), Integer.valueOf(System.identityHashCode(this)), this.i, motionEvent);
        }
        ha0 ha0 = this.e;
        if (ha0 == null) {
            return false;
        }
        if (!ha0.b() && !O()) {
            return false;
        }
        this.e.d(motionEvent);
        return true;
    }

    @Override // defpackage.ia0
    public void b() {
        if (oh0.d()) {
            oh0.a(C0201.m82(29264));
        }
        if (f60.o(2)) {
            f60.r(t, C0201.m82(29265), Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        this.a.b(u80.a.ON_DETACH_CONTROLLER);
        this.k = false;
        this.b.f(this);
        if (oh0.d()) {
            oh0.b();
        }
    }

    @Override // defpackage.ia0
    public ja0 c() {
        return this.g;
    }

    @Override // defpackage.ha0.a
    public boolean d() {
        if (f60.o(2)) {
            f60.r(t, C0201.m82(29266), Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        if (!P()) {
            return false;
        }
        this.d.b();
        this.g.a();
        Q();
        return true;
    }

    @Override // defpackage.ia0
    public void e() {
        if (oh0.d()) {
            oh0.a(C0201.m82(29267));
        }
        if (f60.o(2)) {
            f60.s(t, C0201.m82(29270), Integer.valueOf(System.identityHashCode(this)), this.i, this.l ? C0201.m82(29268) : C0201.m82(29269));
        }
        this.a.b(u80.a.ON_ATTACH_CONTROLLER);
        z50.g(this.g);
        this.b.c(this);
        this.k = true;
        if (!this.l) {
            Q();
        }
        if (oh0.d()) {
            oh0.b();
        }
    }

    @Override // defpackage.ia0
    public void f(ja0 ja0) {
        if (f60.o(2)) {
            f60.s(t, C0201.m82(29271), Integer.valueOf(System.identityHashCode(this)), this.i, ja0);
        }
        this.a.b(ja0 != null ? u80.a.ON_SET_HIERARCHY : u80.a.ON_CLEAR_HIERARCHY);
        if (this.l) {
            this.b.c(this);
            release();
        }
        ka0 ka0 = this.g;
        if (ka0 != null) {
            ka0.b(null);
            this.g = null;
        }
        if (ja0 != null) {
            z50.b(ja0 instanceof ka0);
            ka0 ka02 = (ka0) ja0;
            this.g = ka02;
            ka02.b(this.h);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: z80<? super INFO> */
    /* JADX WARN: Multi-variable type inference failed */
    public void j(z80<? super INFO> z80) {
        z50.g(z80);
        z80<INFO> z802 = this.f;
        if (z802 instanceof b) {
            ((b) z802).g(z80);
        } else if (z802 != null) {
            this.f = b.k(z802, z80);
        } else {
            this.f = z80;
        }
    }

    public abstract Drawable k(T t2);

    public Animatable l() {
        Drawable drawable = this.r;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    public T m() {
        return null;
    }

    public z80<INFO> n() {
        z80<INFO> z80 = this.f;
        return z80 == null ? y80.g() : z80;
    }

    public Drawable o() {
        return this.h;
    }

    public abstract n70<T> p();

    public ha0 q() {
        return this.e;
    }

    public String r() {
        return this.i;
    }

    @Override // defpackage.t80.b
    public void release() {
        this.a.b(u80.a.ON_RELEASE_CONTROLLER);
        v80 v80 = this.d;
        if (v80 != null) {
            v80.c();
        }
        ha0 ha0 = this.e;
        if (ha0 != null) {
            ha0.e();
        }
        ka0 ka0 = this.g;
        if (ka0 != null) {
            ka0.a();
        }
        G();
    }

    public String s(T t2) {
        return t2 != null ? t2.getClass().getSimpleName() : C0201.m82(29272);
    }

    public int t(T t2) {
        return System.identityHashCode(t2);
    }

    public String toString() {
        y50.b d2 = y50.d(this);
        d2.c(C0201.m82(29273), this.k);
        d2.c(C0201.m82(29274), this.l);
        d2.c(C0201.m82(29275), this.m);
        d2.a(C0201.m82(29276), t(this.q));
        d2.b(C0201.m82(29277), this.a.toString());
        return d2.toString();
    }

    public abstract INFO u(T t2);

    public v80 v() {
        if (this.d == null) {
            this.d = new v80();
        }
        return this.d;
    }

    public void x(String str, Object obj) {
        w(str, obj);
        this.s = false;
    }
}
