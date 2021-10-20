package defpackage;

import vigqyno.C0201;

/* renamed from: ie0  reason: default package */
/* compiled from: AbstractProducerToDataSourceAdapter */
public abstract class ie0<T> extends l70<T> {
    private final xg0 g;
    private final gf0 h;

    /* access modifiers changed from: package-private */
    /* renamed from: ie0$a */
    /* compiled from: AbstractProducerToDataSourceAdapter */
    public class a extends jf0<T> {
        public a() {
        }

        @Override // defpackage.jf0
        public void g() {
            ie0.this.y();
        }

        @Override // defpackage.jf0
        public void h(Throwable th) {
            ie0.this.z(th);
        }

        @Override // defpackage.jf0
        public void i(T t, int i) {
            ie0.this.A(t, i);
        }

        @Override // defpackage.jf0
        public void j(float f) {
            ie0.this.p(f);
        }
    }

    public ie0(rg0<T> rg0, xg0 xg0, gf0 gf0) {
        if (oh0.d()) {
            oh0.a(C0201.m82(31071));
        }
        this.g = xg0;
        this.h = gf0;
        if (oh0.d()) {
            oh0.a(C0201.m82(31072));
        }
        this.h.a(xg0.c(), this.g.a(), this.g.t(), this.g.e());
        if (oh0.d()) {
            oh0.b();
        }
        if (oh0.d()) {
            oh0.a(C0201.m82(31073));
        }
        rg0.b(x(), xg0);
        if (oh0.d()) {
            oh0.b();
        }
        if (oh0.d()) {
            oh0.b();
        }
    }

    private sf0<T> x() {
        return new a();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void y() {
        z50.i(j());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void z(Throwable th) {
        if (super.n(th)) {
            this.h.g(this.g.c(), this.g.t(), th, this.g.e());
        }
    }

    public void A(T t, int i) {
        boolean e = jf0.e(i);
        if (super.r(t, e) && e) {
            this.h.c(this.g.c(), this.g.t(), this.g.e());
        }
    }

    @Override // defpackage.l70, defpackage.n70
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.b()) {
            return true;
        }
        this.h.k(this.g.t());
        this.g.m();
        return true;
    }
}
