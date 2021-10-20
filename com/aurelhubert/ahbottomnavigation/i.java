package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: lambda */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Drawable b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ i(ImageView imageView, Drawable drawable, boolean z) {
        this.a = imageView;
        this.b = drawable;
        this.c = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s.f(this.a, this.b, this.c, valueAnimator);
    }
}
