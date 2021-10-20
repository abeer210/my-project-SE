package defpackage;

import com.reactnativenavigation.views.f;

/* renamed from: ci2  reason: default package */
/* compiled from: ComponentPresenter */
public class ci2 extends di2 {
    public bf2 a;

    public ci2(bf2 bf2) {
        this.a = bf2;
    }

    private void d(f fVar, bf2 bf2) {
        if (bf2.m.b.f()) {
            fVar.setBackgroundColor(((Integer) bf2.m.b.d()).intValue());
        }
    }

    public void c(f fVar, bf2 bf2) {
        d(fVar, bf2);
    }

    public void e(f fVar, bf2 bf2) {
        if (bf2.f.a.f()) {
            fVar.setInterceptTouchOutside(bf2.f.a);
        }
        d(fVar, bf2);
    }

    public void f(bf2 bf2) {
        this.a = bf2;
    }
}
