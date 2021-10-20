package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: be2  reason: default package */
/* compiled from: NavigationAnimator */
public class be2 extends wd2 {
    private final ko2 d;
    private Map<View, Animator> e = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: be2$a */
    /* compiled from: NavigationAnimator */
    public class a extends AnimatorListenerAdapter {
        private boolean a;
        public final /* synthetic */ nl2 b;
        public final /* synthetic */ Runnable c;

        public a(nl2 nl2, Runnable runnable) {
            this.b = nl2;
            this.c = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
            be2.this.e.remove(this.b.B());
            this.c.run();
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                be2.this.e.remove(this.b.B());
                this.c.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: be2$b */
    /* compiled from: NavigationAnimator */
    public class b extends AnimatorListenerAdapter {
        private boolean a;
        public final /* synthetic */ Runnable b;

        public b(be2 be2, Runnable runnable) {
            this.b = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: be2$c */
    /* compiled from: NavigationAnimator */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ Runnable b;

        public c(be2 be2, View view, Runnable runnable) {
            this.a = view;
            this.b = runnable;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.run();
        }

        public void onAnimationStart(Animator animator) {
            this.a.setVisibility(0);
        }
    }

    public be2(Context context, ko2 ko2) {
        super(context);
        this.d = ko2;
    }

    private AnimatorSet e(nl2 nl2, Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a(nl2, runnable));
        return animatorSet;
    }

    private void j(nl2 nl2, nl2 nl22, bf2 bf2, AnimatorSet animatorSet) {
        nl2.B().setAlpha(0.0f);
        this.d.b(bf2.h.a, nl22, nl2, new td2(this, animatorSet, bf2, nl2));
    }

    private void k(nl2 nl2, bf2 bf2, AnimatorSet animatorSet) {
        if (bf2.h.a.b.i()) {
            nl2.B().setAlpha(0.0f);
            nl2.i(new ud2(this, nl2, animatorSet, bf2));
            return;
        }
        animatorSet.playTogether(bf2.h.a.c.b(nl2.B(), b(nl2.B())));
        animatorSet.start();
    }

    public void d() {
        for (View view : this.e.keySet()) {
            this.e.get(view).cancel();
            this.e.remove(view);
        }
    }

    public /* synthetic */ void f(AnimatorSet animatorSet, bf2 bf2, nl2 nl2, oo2 oo2) {
        if (oo2.g()) {
            animatorSet.playTogether(bf2.h.a.c.b(nl2.B(), b(nl2.B())));
        } else {
            he2 he2 = (bf2.h.a.c.f() ? bf2.h.a : new se2()).c;
            AnimatorSet a2 = this.d.a(he2, oo2);
            ArrayList<Animator.AnimatorListener> listeners = a2.getListeners();
            animatorSet.playTogether(he2.a(nl2.B()), a2);
            animatorSet.getClass();
            yi2.i(listeners, new sd2(animatorSet));
            a2.removeAllListeners();
        }
        animatorSet.start();
    }

    public /* synthetic */ void g(nl2 nl2, AnimatorSet animatorSet, bf2 bf2) {
        nl2.B().setAlpha(1.0f);
        animatorSet.playTogether(bf2.h.a.c.b(nl2.B(), b(nl2.B())));
        animatorSet.start();
    }

    public void h(View view, af2 af2, Runnable runnable) {
        if (this.e.containsKey(view)) {
            this.e.get(view).cancel();
            runnable.run();
            return;
        }
        AnimatorSet b2 = af2.c.b(view, a(view));
        b2.addListener(new b(this, runnable));
        b2.start();
    }

    public void i(nl2 nl2, nl2 nl22, bf2 bf2, Runnable runnable) {
        AnimatorSet e2 = e(nl2, runnable);
        this.e.put(nl2.B(), e2);
        if (bf2.h.a.f.c()) {
            j(nl2, nl22, bf2, e2);
        } else {
            k(nl2, bf2, e2);
        }
    }

    public void l(View view, he2 he2, Runnable runnable) {
        view.setVisibility(4);
        AnimatorSet a2 = he2.a(view);
        a2.addListener(new c(this, view, runnable));
        a2.start();
    }
}
