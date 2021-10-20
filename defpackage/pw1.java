package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import defpackage.sw1;
import vigqyno.C0201;

/* renamed from: pw1  reason: default package */
/* compiled from: CircularRevealCompat */
public final class pw1 {

    /* renamed from: pw1$a */
    /* compiled from: CircularRevealCompat */
    static class a extends AnimatorListenerAdapter {
        public final /* synthetic */ sw1 a;

        public a(sw1 sw1) {
            this.a = sw1;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b();
        }

        public void onAnimationStart(Animator animator) {
            this.a.a();
        }
    }

    public static Animator a(sw1 sw1, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(sw1, sw1.c.a, sw1.b.b, new sw1.e(f, f2, f3));
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        sw1.e revealInfo = sw1.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) sw1, (int) f, (int) f2, revealInfo.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException(C0201.m82(28280));
    }

    public static Animator.AnimatorListener b(sw1 sw1) {
        return new a(sw1);
    }
}
