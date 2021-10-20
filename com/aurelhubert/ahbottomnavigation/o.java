package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;

/* compiled from: lambda */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AHTextView a;

    public /* synthetic */ o(AHTextView aHTextView) {
        this.a = aHTextView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setTextColor((AHTextView) ((Integer) valueAnimator.getAnimatedValue()));
    }
}
