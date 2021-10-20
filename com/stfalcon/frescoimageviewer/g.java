package com.stfalcon.frescoimageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import vigqyno.C0201;

/* compiled from: SwipeToDismissListener */
public class g implements View.OnTouchListener {
    private final View a;
    private int b;
    private e c;
    private c d;
    private boolean e = false;
    private float f;

    /* access modifiers changed from: package-private */
    /* compiled from: SwipeToDismissListener */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.a) {
                g.this.e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: SwipeToDismissListener */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            g.this.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), g.this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: SwipeToDismissListener */
    public interface c {
        void a(float f, int i);
    }

    public g(View view, e eVar, c cVar) {
        this.a = view;
        this.c = eVar;
        this.d = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    private void d(int i) {
        float f2;
        float translationY = this.a.getTranslationY();
        int i2 = this.b;
        if (translationY < ((float) (-i2))) {
            i = -i;
        } else if (translationY <= ((float) i2)) {
            f2 = 0.0f;
            boolean z = f2 == 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, C0201.m82(26678), translationY, f2);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.addListener(new a(z));
            ofFloat.addUpdateListener(new b());
            ofFloat.start();
        }
        f2 = (float) i;
        if (f2 == 0.0f) {
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.a, C0201.m82(26678), translationY, f2);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(new AccelerateInterpolator());
        ofFloat2.addListener(new a(z));
        ofFloat2.addUpdateListener(new b());
        ofFloat2.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.onDismiss();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f(float f2, int i) {
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(f2, i);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.b = view.getHeight() / 4;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.e) {
                        float y = motionEvent.getY() - this.f;
                        this.a.setTranslationY(y);
                        f(y, this.b);
                    }
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            if (this.e) {
                this.e = false;
                d(view.getHeight());
            }
            return true;
        }
        Rect rect = new Rect();
        this.a.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.e = true;
        }
        this.f = motionEvent.getY();
        return true;
    }
}
