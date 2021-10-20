package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import vigqyno.C0201;

/* renamed from: jo2  reason: default package */
/* compiled from: ElementTransition.kt */
public final class jo2 extends mo2 {
    public nl2<?> a;
    public View b;
    private final oe2 c;

    public jo2(oe2 oe2) {
        ow2.c(oe2, C0201.m82(13050));
        this.c = oe2;
    }

    @Override // defpackage.mo2
    public int a() {
        return c().A();
    }

    @Override // defpackage.mo2
    public View b() {
        View view = this.b;
        if (view != null) {
            return view;
        }
        ow2.i(C0201.m82(13051));
        throw null;
    }

    @Override // defpackage.mo2
    public nl2<?> c() {
        nl2<?> nl2 = this.a;
        if (nl2 != null) {
            return nl2;
        }
        ow2.i(C0201.m82(13052));
        throw null;
    }

    public AnimatorSet d() {
        return this.c.a(b());
    }

    public final String e() {
        return this.c.b();
    }

    public final boolean f() {
        return this.b != null;
    }

    public void g(View view) {
        ow2.c(view, C0201.m82(13053));
        this.b = view;
    }

    public void h(nl2<?> nl2) {
        ow2.c(nl2, C0201.m82(13054));
        this.a = nl2;
    }
}
