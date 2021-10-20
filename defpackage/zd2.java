package defpackage;

import defpackage.fe2;

/* renamed from: zd2  reason: default package */
/* compiled from: FabCollapseBehaviour */
public class zd2 implements fe2.b, fe2.a {
    private yd2 a;
    private fe2 b;

    public zd2(yd2 yd2) {
        this.a = yd2;
    }

    @Override // defpackage.fe2.b
    public void a(float f) {
    }

    @Override // defpackage.fe2.a
    public void b() {
        this.a.b();
    }

    @Override // defpackage.fe2.a
    public void c() {
        this.a.a();
    }

    @Override // defpackage.fe2.b
    public void d(float f) {
    }

    public void e() {
        fe2 fe2 = this.b;
        if (fe2 != null) {
            fe2.h();
        }
    }

    public void f(fe2 fe2) {
        this.b = fe2;
        fe2.g(null, this, this);
    }
}
