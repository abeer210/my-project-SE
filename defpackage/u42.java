package defpackage;

import com.google.android.gms.maps.model.p;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.v;
import java.util.Observable;
import vigqyno.C0201;

/* renamed from: u42  reason: default package */
/* compiled from: Style */
public abstract class u42 extends Observable {
    public p a = new p();
    public v b = new v();
    public t c = new t();

    public void b(float f) {
        this.b.T(f);
    }

    public void c(float f, float f2, String str, String str2) {
        String r0 = C0201.m82(33797);
        if (!str.equals(r0)) {
            f = 0.5f;
        }
        if (!str2.equals(r0)) {
            f2 = 1.0f;
        }
        this.a.p(f, f2);
    }

    public void d(float f) {
        this.a.f0(f);
    }

    public void e(int i) {
        this.c.r(i);
    }

    public void f(float f) {
        this.c.Q(f);
    }
}
