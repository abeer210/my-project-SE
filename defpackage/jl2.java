package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.Collection;

/* renamed from: jl2  reason: default package */
/* compiled from: ParentController */
public abstract class jl2<T extends ViewGroup> extends cl2<T> {
    public jl2(Activity activity, dl2 dl2, String str, ii2 ii2, bf2 bf2) {
        super(activity, dl2, str, ii2, bf2);
    }

    public void A0(bf2 bf2, nl2 nl2) {
    }

    public void B0(nl2 nl2) {
    }

    public bf2 C0(nl2 nl2) {
        if (nl2 == this) {
            return Y();
        }
        bf2 i = nl2.Y().i();
        i.m(this.e);
        return i;
    }

    public void D0(ViewPager viewPager) {
    }

    @Override // defpackage.nl2
    public boolean E() {
        return t0() != null && t0().E();
    }

    @Override // defpackage.nl2
    public bf2 Y() {
        if (yi2.l(s0())) {
            return this.e;
        }
        bf2 i = t0().Y().i();
        i.m(this.e);
        return i;
    }

    @Override // defpackage.nl2
    public bf2 Z(bf2 bf2) {
        bf2 Y = Y();
        Y.m(bf2);
        return Y;
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void c0(bf2 bf2) {
        super.c0(bf2);
        yi2.g(s0(), new hk2(bf2));
    }

    @Override // defpackage.nl2
    public void f0(sf2 sf2) {
        super.f0(sf2);
        l(t0(), new kk2(sf2));
    }

    @Override // defpackage.nl2
    public void k() {
        yi2.g(s0(), lk2.a);
    }

    @Override // defpackage.nl2
    public void n() {
        yi2.g(s0(), al2.a);
    }

    public void o0(bf2 bf2, nl2 nl2) {
        this.f = this.e.j(bf2);
    }

    public void p0() {
        S(ak2.a);
        bf2 i = this.e.i();
        i.e();
        this.f = i;
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void q() {
        super.q();
        yi2.g(s0(), mk2.a);
    }

    public void q0() {
    }

    public int r0(nl2 nl2) {
        return ((Integer) qj2.c(y(), 0, new ik2(nl2))).intValue();
    }

    @Override // defpackage.nl2
    public nl2 s(View view) {
        nl2 s = super.s(view);
        if (s != null) {
            return s;
        }
        for (nl2 nl2 : s0()) {
            nl2 s2 = nl2.s(view);
            if (s2 != null) {
                return s2;
            }
        }
        return null;
    }

    public abstract Collection<? extends nl2> s0();

    @Override // defpackage.nl2
    public nl2 t(String str) {
        nl2 t = super.t(str);
        if (t != null) {
            return t;
        }
        for (nl2 nl2 : s0()) {
            nl2 t2 = nl2.t(str);
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    public abstract nl2 t0();

    public int u0(nl2 nl2) {
        return ((Integer) qj2.c(y(), 0, new jk2(nl2))).intValue();
    }

    public boolean v0(nl2 nl2) {
        return t0() == nl2;
    }

    @Override // defpackage.nl2
    public String w() {
        return t0().w();
    }
}
