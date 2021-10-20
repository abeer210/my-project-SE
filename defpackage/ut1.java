package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: ut1  reason: default package */
public final class ut1<TResult> extends zs1<TResult> {
    private final Object a = new Object();
    private final st1<TResult> b = new st1<>();
    private boolean c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    private final void w() {
        u.o(this.c, C0201.m82(24773));
    }

    private final void x() {
        u.o(!this.c, C0201.m82(24774));
    }

    private final void y() {
        if (this.d) {
            throw new CancellationException(C0201.m82(24775));
        }
    }

    private final void z() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    @Override // defpackage.zs1
    public final zs1<TResult> a(Executor executor, ts1 ts1) {
        this.b.b(new ht1(executor, ts1));
        z();
        return this;
    }

    @Override // defpackage.zs1
    public final zs1<TResult> b(us1<TResult> us1) {
        c(bt1.a, us1);
        return this;
    }

    @Override // defpackage.zs1
    public final zs1<TResult> c(Executor executor, us1<TResult> us1) {
        this.b.b(new jt1(executor, us1));
        z();
        return this;
    }

    @Override // defpackage.zs1
    public final zs1<TResult> d(vs1 vs1) {
        e(bt1.a, vs1);
        return this;
    }

    @Override // defpackage.zs1
    public final zs1<TResult> e(Executor executor, vs1 vs1) {
        this.b.b(new lt1(executor, vs1));
        z();
        return this;
    }

    @Override // defpackage.zs1
    public final zs1<TResult> f(ws1<? super TResult> ws1) {
        g(bt1.a, ws1);
        return this;
    }

    @Override // defpackage.zs1
    public final zs1<TResult> g(Executor executor, ws1<? super TResult> ws1) {
        this.b.b(new nt1(executor, ws1));
        z();
        return this;
    }

    @Override // defpackage.zs1
    public final <TContinuationResult> zs1<TContinuationResult> h(ss1<TResult, TContinuationResult> ss1) {
        return i(bt1.a, ss1);
    }

    @Override // defpackage.zs1
    public final <TContinuationResult> zs1<TContinuationResult> i(Executor executor, ss1<TResult, TContinuationResult> ss1) {
        ut1 ut1 = new ut1();
        this.b.b(new dt1(executor, ss1, ut1));
        z();
        return ut1;
    }

    @Override // defpackage.zs1
    public final <TContinuationResult> zs1<TContinuationResult> j(Executor executor, ss1<TResult, zs1<TContinuationResult>> ss1) {
        ut1 ut1 = new ut1();
        this.b.b(new ft1(executor, ss1, ut1));
        z();
        return ut1;
    }

    @Override // defpackage.zs1
    public final Exception k() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.zs1
    public final TResult l() {
        TResult tresult;
        synchronized (this.a) {
            w();
            y();
            if (this.f == null) {
                tresult = this.e;
            } else {
                throw new xs1(this.f);
            }
        }
        return tresult;
    }

    @Override // defpackage.zs1
    public final <X extends Throwable> TResult m(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.a) {
            w();
            y();
            if (cls.isInstance(this.f)) {
                throw cls.cast(this.f);
            } else if (this.f == null) {
                tresult = this.e;
            } else {
                throw new xs1(this.f);
            }
        }
        return tresult;
    }

    @Override // defpackage.zs1
    public final boolean n() {
        return this.d;
    }

    @Override // defpackage.zs1
    public final boolean o() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.zs1
    public final boolean p() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    @Override // defpackage.zs1
    public final <TContinuationResult> zs1<TContinuationResult> q(Executor executor, ys1<TResult, TContinuationResult> ys1) {
        ut1 ut1 = new ut1();
        this.b.b(new pt1(executor, ys1, ut1));
        z();
        return ut1;
    }

    public final void r(Exception exc) {
        u.l(exc, C0201.m82(24776));
        synchronized (this.a) {
            x();
            this.c = true;
            this.f = exc;
        }
        this.b.a(this);
    }

    public final void s(TResult tresult) {
        synchronized (this.a) {
            x();
            this.c = true;
            this.e = tresult;
        }
        this.b.a(this);
    }

    public final boolean t(Exception exc) {
        u.l(exc, C0201.m82(24777));
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean u(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a(this);
            return true;
        }
    }

    public final boolean v() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a(this);
            return true;
        }
    }
}
