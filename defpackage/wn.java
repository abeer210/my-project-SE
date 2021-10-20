package defpackage;

import defpackage.yn;

/* renamed from: wn  reason: default package */
/* compiled from: ErrorRequestCoordinator */
public final class wn implements yn, xn {
    private final Object a;
    private final yn b;
    private volatile xn c;
    private volatile xn d;
    private yn.a e;
    private yn.a f;

    public wn(Object obj, yn ynVar) {
        yn.a aVar = yn.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = ynVar;
    }

    private boolean m(xn xnVar) {
        return xnVar.equals(this.c) || (this.e == yn.a.FAILED && xnVar.equals(this.d));
    }

    private boolean n() {
        yn ynVar = this.b;
        return ynVar == null || ynVar.l(this);
    }

    private boolean o() {
        yn ynVar = this.b;
        return ynVar == null || ynVar.g(this);
    }

    private boolean p() {
        yn ynVar = this.b;
        return ynVar == null || ynVar.i(this);
    }

    @Override // defpackage.yn
    public void a(xn xnVar) {
        synchronized (this.a) {
            if (!xnVar.equals(this.d)) {
                this.e = yn.a.FAILED;
                if (this.f != yn.a.RUNNING) {
                    this.f = yn.a.RUNNING;
                    this.d.d();
                }
                return;
            }
            this.f = yn.a.FAILED;
            if (this.b != null) {
                this.b.a(this);
            }
        }
    }

    @Override // defpackage.yn, defpackage.xn
    public boolean b() {
        boolean z;
        synchronized (this.a) {
            if (!this.c.b()) {
                if (!this.d.b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.yn
    public yn c() {
        yn c2;
        synchronized (this.a) {
            c2 = this.b != null ? this.b.c() : this;
        }
        return c2;
    }

    @Override // defpackage.xn
    public void clear() {
        synchronized (this.a) {
            this.e = yn.a.CLEARED;
            this.c.clear();
            if (this.f != yn.a.CLEARED) {
                this.f = yn.a.CLEARED;
                this.d.clear();
            }
        }
    }

    @Override // defpackage.xn
    public void d() {
        synchronized (this.a) {
            if (this.e != yn.a.RUNNING) {
                this.e = yn.a.RUNNING;
                this.c.d();
            }
        }
    }

    @Override // defpackage.xn
    public boolean e(xn xnVar) {
        if (!(xnVar instanceof wn)) {
            return false;
        }
        wn wnVar = (wn) xnVar;
        if (!this.c.e(wnVar.c) || !this.d.e(wnVar.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xn
    public void f() {
        synchronized (this.a) {
            if (this.e == yn.a.RUNNING) {
                this.e = yn.a.PAUSED;
                this.c.f();
            }
            if (this.f == yn.a.RUNNING) {
                this.f = yn.a.PAUSED;
                this.d.f();
            }
        }
    }

    @Override // defpackage.yn
    public boolean g(xn xnVar) {
        boolean z;
        synchronized (this.a) {
            z = o() && m(xnVar);
        }
        return z;
    }

    @Override // defpackage.xn
    public boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.e == yn.a.CLEARED && this.f == yn.a.CLEARED;
        }
        return z;
    }

    @Override // defpackage.yn
    public boolean i(xn xnVar) {
        boolean z;
        synchronized (this.a) {
            z = p() && m(xnVar);
        }
        return z;
    }

    @Override // defpackage.xn
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            if (this.e != yn.a.RUNNING) {
                if (this.f != yn.a.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.yn
    public void j(xn xnVar) {
        synchronized (this.a) {
            if (xnVar.equals(this.c)) {
                this.e = yn.a.SUCCESS;
            } else if (xnVar.equals(this.d)) {
                this.f = yn.a.SUCCESS;
            }
            if (this.b != null) {
                this.b.j(this);
            }
        }
    }

    @Override // defpackage.xn
    public boolean k() {
        boolean z;
        synchronized (this.a) {
            if (this.e != yn.a.SUCCESS) {
                if (this.f != yn.a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.yn
    public boolean l(xn xnVar) {
        boolean z;
        synchronized (this.a) {
            z = n() && m(xnVar);
        }
        return z;
    }

    public void q(xn xnVar, xn xnVar2) {
        this.c = xnVar;
        this.d = xnVar2;
    }
}
