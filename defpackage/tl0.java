package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;

/* renamed from: tl0  reason: default package */
/* compiled from: AnimationManager */
public class tl0 {
    private xl0 a;
    private ValueAnimator b;
    private OverScroller c;
    private boolean d = false;
    private boolean e = false;

    /* access modifiers changed from: package-private */
    /* renamed from: tl0$a */
    /* compiled from: AnimationManager */
    public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            tl0.this.a.Q();
            tl0.this.e = false;
        }

        public void onAnimationEnd(Animator animator) {
            tl0.this.a.Q();
            tl0.this.e = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            tl0.this.a.S(((Float) valueAnimator.getAnimatedValue()).floatValue(), tl0.this.a.getCurrentYOffset());
            tl0.this.a.P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tl0$b */
    /* compiled from: AnimationManager */
    public class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationCancel(Animator animator) {
            tl0.this.a.Q();
            tl0.this.e = false;
        }

        public void onAnimationEnd(Animator animator) {
            tl0.this.a.Q();
            tl0.this.e = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            tl0.this.a.S(tl0.this.a.getCurrentXOffset(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            tl0.this.a.P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tl0$c */
    /* compiled from: AnimationManager */
    public class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
        private final float a;
        private final float b;

        public c(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            tl0.this.a.Q();
            tl0.this.e();
            tl0.this.a.X();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            tl0.this.a.g0(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.a, this.b));
        }
    }

    public tl0(xl0 xl0) {
        this.a = xl0;
        this.c = new OverScroller(xl0.getContext());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        if (this.a.getScrollHandle() != null) {
            this.a.getScrollHandle().d();
        }
    }

    public void d() {
        if (this.c.computeScrollOffset()) {
            this.a.S((float) this.c.getCurrX(), (float) this.c.getCurrY());
            this.a.P();
        } else if (this.d) {
            this.d = false;
            this.a.Q();
            e();
            this.a.X();
        }
    }

    public boolean f() {
        return this.d || this.e;
    }

    public void g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        l();
        this.d = true;
        this.c.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public void h(float f) {
        if (this.a.H()) {
            j(this.a.getCurrentYOffset(), f);
        } else {
            i(this.a.getCurrentXOffset(), f);
        }
        this.e = true;
    }

    public void i(float f, float f2) {
        l();
        this.b = ValueAnimator.ofFloat(f, f2);
        a aVar = new a();
        this.b.setInterpolator(new DecelerateInterpolator());
        this.b.addUpdateListener(aVar);
        this.b.addListener(aVar);
        this.b.setDuration(400L);
        this.b.start();
    }

    public void j(float f, float f2) {
        l();
        this.b = ValueAnimator.ofFloat(f, f2);
        b bVar = new b();
        this.b.setInterpolator(new DecelerateInterpolator());
        this.b.addUpdateListener(bVar);
        this.b.addListener(bVar);
        this.b.setDuration(400L);
        this.b.start();
    }

    public void k(float f, float f2, float f3, float f4) {
        l();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f4);
        this.b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f, f2);
        this.b.addUpdateListener(cVar);
        this.b.addListener(cVar);
        this.b.setDuration(400L);
        this.b.start();
    }

    public void l() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        m();
    }

    public void m() {
        this.d = false;
        this.c.forceFinished(true);
    }
}
