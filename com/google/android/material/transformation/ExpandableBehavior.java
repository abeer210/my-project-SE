package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private int a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ xw1 c;

        public a(View view, int i, xw1 xw1) {
            this.a = view;
            this.b = i;
            this.c = xw1;
        }

        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                xw1 xw1 = this.c;
                expandableBehavior.H((View) xw1, this.a, xw1.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean F(boolean z) {
        if (z) {
            int i = this.a;
            return i == 0 || i == 2;
        } else if (this.a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public xw1 G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> w = coordinatorLayout.w(view);
        int size = w.size();
        for (int i = 0; i < size; i++) {
            View view2 = w.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (xw1) view2;
            }
        }
        return null;
    }

    public abstract boolean H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        xw1 xw1 = (xw1) view2;
        if (!F(xw1.a())) {
            return false;
        }
        this.a = xw1.a() ? 1 : 2;
        return H((View) xw1, view, xw1.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        xw1 G;
        if (k3.O(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i2 = G.a() ? 1 : 2;
        this.a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
