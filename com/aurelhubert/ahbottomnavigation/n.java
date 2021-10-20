package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public /* synthetic */ n(View view) {
        this.a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s.l(this.a, valueAnimator);
    }
}
