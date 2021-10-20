package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    private AnimatorSet b;

    class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.b != null;
        if (z3) {
            this.b.cancel();
        }
        AnimatorSet J = J(view, view2, z, z3);
        this.b = J;
        J.addListener(new a());
        this.b.start();
        if (!z2) {
            this.b.end();
        }
        return true;
    }

    public abstract AnimatorSet J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
