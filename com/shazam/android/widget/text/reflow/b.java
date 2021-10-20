package com.shazam.android.widget.text.reflow;

import android.graphics.Rect;
import android.view.View;
import com.shazam.android.widget.text.reflow.ReflowTextAnimatorHelper;

/* compiled from: lambda */
public final /* synthetic */ class b implements BoundsCalculator {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.shazam.android.widget.text.reflow.BoundsCalculator
    public final Rect a(View view) {
        return ReflowTextAnimatorHelper.Builder.p(view);
    }
}
