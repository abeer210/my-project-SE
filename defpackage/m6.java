package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import defpackage.e6;

/* renamed from: m6  reason: default package */
/* compiled from: TranslationAnimationCreator */
public class m6 {

    /* renamed from: m6$a */
    /* compiled from: TranslationAnimationCreator */
    private static class a extends AnimatorListenerAdapter implements e6.f {
        private final View a;
        private final View b;
        private final int c;
        private final int d;
        private int[] e;
        private float f;
        private float g;
        private final float h;
        private final float i;

        public a(View view, View view2, int i2, int i3, float f2, float f3) {
            this.b = view;
            this.a = view2;
            this.c = i2 - Math.round(view.getTranslationX());
            this.d = i3 - Math.round(this.b.getTranslationY());
            this.h = f2;
            this.i = f3;
            int[] iArr = (int[]) this.a.getTag(z5.transition_position);
            this.e = iArr;
            if (iArr != null) {
                this.a.setTag(z5.transition_position, null);
            }
        }

        @Override // defpackage.e6.f
        public void a(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void b(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
            e6Var.W(this);
        }

        @Override // defpackage.e6.f
        public void d(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void e(e6 e6Var) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(((float) this.c) + this.b.getTranslationX());
            this.e[1] = Math.round(((float) this.d) + this.b.getTranslationY());
            this.a.setTag(z5.transition_position, this.e);
        }

        public void onAnimationPause(Animator animator) {
            this.f = this.b.getTranslationX();
            this.g = this.b.getTranslationY();
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
        }

        public void onAnimationResume(Animator animator) {
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }
    }

    public static Animator a(View view, k6 k6Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, e6 e6Var) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) k6Var.b.getTag(z5.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        a aVar = new a(view, k6Var.b, round, round2, translationX, translationY);
        e6Var.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        h5.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
