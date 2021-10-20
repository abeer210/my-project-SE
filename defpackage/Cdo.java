package defpackage;

import defpackage.yn;

/* renamed from: do  reason: invalid class name and default package */
/* compiled from: ThumbnailRequestCoordinator */
public class Cdo implements yn, xn {
    private final yn a;
    private final Object b;
    private volatile xn c;
    private volatile xn d;
    private yn.a e;
    private yn.a f;
    private boolean g;

    public Cdo(Object obj, yn ynVar) {
        yn.a aVar = yn.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = ynVar;
    }

    private boolean m() {
        yn ynVar = this.a;
        return ynVar == null || ynVar.l(this);
    }

    private boolean n() {
        yn ynVar = this.a;
        return ynVar == null || ynVar.g(this);
    }

    private boolean o() {
        yn ynVar = this.a;
        return ynVar == null || ynVar.i(this);
    }

    @Override // defpackage.yn
    public void a(xn xnVar) {
        synchronized (this.b) {
            if (!xnVar.equals(this.c)) {
                this.f = yn.a.FAILED;
                return;
            }
            this.e = yn.a.FAILED;
            if (this.a != null) {
                this.a.a(this);
            }
        }
    }

    @Override // defpackage.yn, defpackage.xn
    public boolean b() {
        boolean z;
        synchronized (this.b) {
            if (!this.d.b()) {
                if (!this.c.b()) {
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
        synchronized (this.b) {
            c2 = this.a != null ? this.a.c() : this;
        }
        return c2;
    }

    @Override // defpackage.xn
    public void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = yn.a.CLEARED;
            this.f = yn.a.CLEARED;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.xn
    public void d() {
        synchronized (this.b) {
            this.g = true;
            try {
                if (!(this.e == yn.a.SUCCESS || this.f == yn.a.RUNNING)) {
                    this.f = yn.a.RUNNING;
                    this.d.d();
                }
                if (this.g && this.e != yn.a.RUNNING) {
                    this.e = yn.a.RUNNING;
                    this.c.d();
                }
            } finally {
                this.g = false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // defpackage.xn
    public boolean e(xn xnVar) {
        if (!(xnVar instanceof Cdo)) {
            return false;
        }
        Cdo doVar = (Cdo) xnVar;
        if (this.c == null) {
            if (doVar.c != null) {
                return false;
            }
        } else if (!this.c.e(doVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (doVar.d == null) {
                return true;
            }
            return false;
        } else if (!this.d.e(doVar.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xn
    public void f() {
        synchronized (this.b) {
            if (!this.f.b()) {
                this.f = yn.a.PAUSED;
                this.d.f();
            }
            if (!this.e.b()) {
                this.e = yn.a.PAUSED;
                this.c.f();
            }
        }
    }

    @Override // defpackage.yn
    public boolean g(xn xnVar) {
        boolean z;
        synchronized (this.b) {
            z = n() && xnVar.equals(this.c) && !b();
        }
        return z;
    }

    @Override // defpackage.xn
    public boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.e == yn.a.CLEARED;
        }
        return z;
    }

    @Override // defpackage.yn
    public boolean i(xn xnVar) {
        boolean z;
        synchronized (this.b) {
            z = o() && (xnVar.equals(this.c) || this.e != yn.a.SUCCESS);
        }
        return z;
    }

    @Override // defpackage.xn
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == yn.a.RUNNING;
        }
        return z;
    }

    @Override // defpackage.yn
    public void j(xn xnVar) {
        synchronized (this.b) {
            if (xnVar.equals(this.d)) {
                this.f = yn.a.SUCCESS;
                return;
            }
            this.e = yn.a.SUCCESS;
            if (this.a != null) {
                this.a.j(this);
            }
            if (!this.f.b()) {
                this.d.clear();
            }
        }
    }

    @Override // defpackage.xn
    public boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.e == yn.a.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.yn
    public boolean l(xn xnVar) {
        boolean z;
        synchronized (this.b) {
            z = m() && xnVar.equals(this.c) && this.e != yn.a.PAUSED;
        }
        return z;
    }

    public void p(xn xnVar, xn xnVar2) {
        this.c = xnVar;
        this.d = xnVar2;
    }
}
