package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import vigqyno.C0201;

/* renamed from: sm2  reason: default package */
/* compiled from: ModalPresenter */
public class sm2 {
    private ViewGroup a;
    private CoordinatorLayout b;
    private ae2 c;
    private bf2 d = new bf2();

    /* access modifiers changed from: package-private */
    /* renamed from: sm2$a */
    /* compiled from: ModalPresenter */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ nl2 a;
        public final /* synthetic */ nl2 b;
        public final /* synthetic */ aj2 c;

        public a(nl2 nl2, nl2 nl22, aj2 aj2) {
            this.a = nl2;
            this.b = nl22;
            this.c = aj2;
        }

        public void onAnimationEnd(Animator animator) {
            sm2.this.g(this.a, this.b, this.c);
        }

        public void onAnimationStart(Animator animator) {
            this.a.B().setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: sm2$b */
    /* compiled from: ModalPresenter */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ nl2 a;
        public final /* synthetic */ aj2 b;

        public b(nl2 nl2, aj2 aj2) {
            this.a = nl2;
            this.b = aj2;
        }

        public void onAnimationEnd(Animator animator) {
            sm2.this.h(this.a, this.b);
        }
    }

    public sm2(ae2 ae2) {
        this.c = ae2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void f(nl2 nl2, nl2 nl22, aj2 aj2, bf2 bf2) {
        this.c.d(nl2.B(), bf2.h.e, new a(nl2, nl22, aj2));
    }

    private boolean e() {
        return this.b.getChildCount() == 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h(nl2 nl2, aj2 aj2) {
        aj2.a(nl2.x());
        nl2.q();
        if (e()) {
            this.b.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    public void g(nl2 nl2, nl2 nl22, aj2 aj2) {
        if (!(nl22 == null || nl2.f.j.a == ye2.OverCurrentContext)) {
            nl22.r();
        }
        aj2.a(nl2.x());
    }

    public void d(nl2 nl2, nl2 nl22, nl2 nl23, aj2 aj2) {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            aj2.onError(C0201.m82(22475));
            return;
        }
        if (nl22 != null) {
            if (nl22 == nl23) {
                viewGroup = this.a;
            }
            nl22.o(viewGroup, 0);
        }
        bf2 Z = nl2.Z(this.d);
        if (Z.h.f.b.j()) {
            this.c.c(nl2.B(), Z.h.f, new b(nl2, aj2));
        } else {
            h(nl2, aj2);
        }
    }

    public void j(bf2 bf2) {
        this.d = bf2;
    }

    public void k(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }

    public void l(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public void m(nl2 nl2, nl2 nl22, aj2 aj2) {
        if (this.b == null) {
            aj2.onError(C0201.m82(22476));
            return;
        }
        bf2 Z = nl2.Z(this.d);
        nl2.f0(Z.h.e.c);
        this.b.setVisibility(0);
        this.b.addView(nl2.B(), ej2.a());
        if (Z.h.e.b.j()) {
            nl2.B().setAlpha(0.0f);
            if (Z.h.e.c.i()) {
                nl2.i(new qm2(this, nl2, nl22, aj2, Z));
            } else {
                f(nl2, nl22, aj2, Z);
            }
        } else if (Z.h.e.c.i()) {
            nl2.i(new pm2(this, nl2, nl22, aj2));
        } else {
            g(nl2, nl22, aj2);
        }
    }
}
