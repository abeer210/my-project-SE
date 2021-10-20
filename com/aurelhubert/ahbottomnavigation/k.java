package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public /* synthetic */ k(View view) {
        this.a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
