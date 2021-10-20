package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import defpackage.ja0;
import defpackage.u80;
import defpackage.y50;
import vigqyno.C0201;

/* renamed from: na0  reason: default package */
/* compiled from: DraweeHolder */
public class na0<DH extends ja0> implements aa0 {
    private boolean a = false;
    private boolean b = false;
    private boolean c = true;
    private DH d;
    private ia0 e = null;
    private final u80 f = u80.a();

    public na0(DH dh) {
        if (dh != null) {
            p(dh);
        }
    }

    private void c() {
        if (!this.a) {
            this.f.b(u80.a.ON_ATTACH_CONTROLLER);
            this.a = true;
            ia0 ia0 = this.e;
            if (ia0 != null && ia0.c() != null) {
                this.e.e();
            }
        }
    }

    private void d() {
        if (!this.b || !this.c) {
            f();
        } else {
            c();
        }
    }

    public static <DH extends ja0> na0<DH> e(DH dh, Context context) {
        na0<DH> na0 = new na0<>(dh);
        na0.n(context);
        return na0;
    }

    private void f() {
        if (this.a) {
            this.f.b(u80.a.ON_DETACH_CONTROLLER);
            this.a = false;
            if (j()) {
                this.e.b();
            }
        }
    }

    private void q(aa0 aa0) {
        Drawable i = i();
        if (i instanceof z90) {
            ((z90) i).k(aa0);
        }
    }

    @Override // defpackage.aa0
    public void a() {
        if (!this.a) {
            f60.y(u80.class, C0201.m82(26691), Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString());
            this.b = true;
            this.c = true;
            d();
        }
    }

    @Override // defpackage.aa0
    public void b(boolean z) {
        if (this.c != z) {
            this.f.b(z ? u80.a.ON_DRAWABLE_SHOW : u80.a.ON_DRAWABLE_HIDE);
            this.c = z;
            d();
        }
    }

    public ia0 g() {
        return this.e;
    }

    public DH h() {
        DH dh = this.d;
        z50.g(dh);
        return dh;
    }

    public Drawable i() {
        DH dh = this.d;
        if (dh == null) {
            return null;
        }
        return dh.f();
    }

    public boolean j() {
        ia0 ia0 = this.e;
        return ia0 != null && ia0.c() == this.d;
    }

    public void k() {
        this.f.b(u80.a.ON_HOLDER_ATTACH);
        this.b = true;
        d();
    }

    public void l() {
        this.f.b(u80.a.ON_HOLDER_DETACH);
        this.b = false;
        d();
    }

    public boolean m(MotionEvent motionEvent) {
        if (!j()) {
            return false;
        }
        return this.e.a(motionEvent);
    }

    public void n(Context context) {
    }

    public void o(ia0 ia0) {
        boolean z = this.a;
        if (z) {
            f();
        }
        if (j()) {
            this.f.b(u80.a.ON_CLEAR_OLD_CONTROLLER);
            this.e.f(null);
        }
        this.e = ia0;
        if (ia0 != null) {
            this.f.b(u80.a.ON_SET_CONTROLLER);
            this.e.f(this.d);
        } else {
            this.f.b(u80.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            c();
        }
    }

    public void p(DH dh) {
        this.f.b(u80.a.ON_SET_HIERARCHY);
        boolean j = j();
        q(null);
        z50.g(dh);
        DH dh2 = dh;
        this.d = dh2;
        Drawable f2 = dh2.f();
        b(f2 == null || f2.isVisible());
        q(this);
        if (j) {
            this.e.f(dh);
        }
    }

    public String toString() {
        y50.b d2 = y50.d(this);
        d2.c(C0201.m82(26692), this.a);
        d2.c(C0201.m82(26693), this.b);
        d2.c(C0201.m82(26694), this.c);
        d2.b(C0201.m82(26695), this.f.toString());
        return d2.toString();
    }
}
