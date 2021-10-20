package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: wd2  reason: default package */
/* compiled from: BaseAnimator */
public class wd2 {
    private static final TimeInterpolator b = new DecelerateInterpolator();
    private static final TimeInterpolator c = new AccelerateDecelerateInterpolator();
    private float a;

    public wd2(Context context) {
        this.a = xj2.g(context);
    }

    public AnimatorSet a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(c);
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, this.a), ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f));
        return animatorSet;
    }

    public AnimatorSet b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(b);
        animatorSet.setDuration(300L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.a, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat2.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }
}
