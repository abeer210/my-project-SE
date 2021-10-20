package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.reactnativenavigation.views.n;
import vigqyno.C0188;

/* renamed from: ce2  reason: default package */
/* compiled from: TopBarAnimator */
public class ce2 {
    private static final TimeInterpolator e = new DecelerateInterpolator();
    private static final TimeInterpolator f = new LinearInterpolator();
    private com.reactnativenavigation.views.topbar.a a;
    private String b;
    private Animator c;
    private Animator d;

    /* access modifiers changed from: package-private */
    /* renamed from: ce2$a */
    /* compiled from: TopBarAnimator */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationStart(Animator animator) {
            ce2.this.a.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ce2$b */
    /* compiled from: TopBarAnimator */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        public void onAnimationEnd(Animator animator) {
            ce2.this.a.setVisibility(8);
            this.a.run();
        }
    }

    public ce2() {
    }

    private Animator c(float f2, float f3, TimeInterpolator timeInterpolator, int i) {
        com.reactnativenavigation.views.topbar.a aVar = this.a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, View.TRANSLATION_Y, f2, ((float) (-aVar.getMeasuredHeight())) - f3);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    private AnimatorSet d(float f2, TimeInterpolator timeInterpolator, int i) {
        com.reactnativenavigation.views.topbar.a aVar = this.a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, View.TRANSLATION_Y, ((float) (-zj2.g(aVar))) - f2, 0.0f);
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        return animatorSet;
    }

    private void g(Runnable runnable) {
        this.c.addListener(new b(runnable));
        if (i()) {
            this.d.cancel();
        }
        this.c.start();
    }

    public static /* synthetic */ void j() {
    }

    private void m() {
        this.d.addListener(new a());
        if (h()) {
            this.c.cancel();
        }
        this.d.start();
    }

    public void b(com.reactnativenavigation.views.topbar.a aVar, n nVar) {
        this.a = aVar;
        this.b = nVar.getStackId();
    }

    public void e(float f2, float f3) {
        this.c = c(f2, f3, f, 100);
        g(vd2.a);
    }

    public void f(he2 he2, Runnable runnable, float f2, float f3) {
        if (!he2.e() || (he2.a.f() && !((String) he2.a.d()).equals(this.b))) {
            this.c = c(f2, f3, e, C0188.f19);
        } else {
            he2.j(View.TRANSLATION_Y, f2, -f3);
            this.c = he2.a(this.a);
        }
        g(runnable);
    }

    public boolean h() {
        Animator animator = this.c;
        return animator != null && animator.isRunning();
    }

    public boolean i() {
        Animator animator = this.d;
        return animator != null && animator.isRunning();
    }

    public void k(float f2) {
        this.d = d(f2, f, 100);
        m();
    }

    public void l(he2 he2, int i) {
        this.a.setVisibility(0);
        if (!he2.e() || (he2.a.f() && !((String) he2.a.d()).equals(this.b))) {
            this.d = d((float) i, e, C0188.f19);
        } else {
            he2.j(View.TRANSLATION_Y, (float) (-i), 0.0f);
            this.d = he2.a(this.a);
        }
        m();
    }

    public ce2(com.reactnativenavigation.views.topbar.a aVar) {
        this.a = aVar;
    }
}
