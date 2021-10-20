package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: lambda */
public final /* synthetic */ class l implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView a;

    public /* synthetic */ l(TextView textView) {
        this.a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
