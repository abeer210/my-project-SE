package defpackage;

import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: h12  reason: default package */
public final class h12<ResultT> extends s02<ResultT> {
    private final Object a = new Object();
    private final c12<ResultT> b = new c12<>();
    private boolean c;
    private ResultT d;
    private Exception e;

    private final void h() {
        sy1.c(this.c, C0201.m82(36004));
    }

    private final void k() {
        sy1.c(!this.c, C0201.m82(36005));
    }

    private final void n() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    @Override // defpackage.s02
    public final s02<ResultT> a(o02<ResultT> o02) {
        this.b.b(new w02(t02.a, o02));
        n();
        return this;
    }

    @Override // defpackage.s02
    public final s02<ResultT> b(Executor executor, p02 p02) {
        this.b.b(new y02(executor, p02));
        n();
        return this;
    }

    @Override // defpackage.s02
    public final s02<ResultT> c(Executor executor, q02<? super ResultT> q02) {
        this.b.b(new a12(executor, q02));
        n();
        return this;
    }

    @Override // defpackage.s02
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.s02
    public final ResultT e() {
        ResultT resultt;
        synchronized (this.a) {
            h();
            Exception exc = this.e;
            if (exc == null) {
                resultt = this.d;
            } else {
                throw new r02(exc);
            }
        }
        return resultt;
    }

    @Override // defpackage.s02
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.s02
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void i(Exception exc) {
        synchronized (this.a) {
            k();
            this.c = true;
            this.e = exc;
        }
        this.b.a(this);
    }

    public final void j(ResultT resultt) {
        synchronized (this.a) {
            k();
            this.c = true;
            this.d = resultt;
        }
        this.b.a(this);
    }

    public final boolean l(Exception exc) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean m(ResultT resultt) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = resultt;
            this.b.a(this);
            return true;
        }
    }
}
