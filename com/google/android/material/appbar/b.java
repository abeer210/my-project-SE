package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import vigqyno.C0188;

/* compiled from: HeaderScrollingViewBehavior */
public abstract class b extends c<View> {
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    private int f = 0;
    private int g;

    public b() {
    }

    private static int N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = H(coordinatorLayout.w(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            t3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && k3.t(coordinatorLayout) && !k3.t(view)) {
                rect.left += lastWindowInsets.b();
                rect.right -= lastWindowInsets.c();
            }
            Rect rect2 = this.e;
            u2.a(N(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f = rect2.top - H.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i);
        this.f = 0;
    }

    public abstract View H(List<View> list);

    public final int I(View view) {
        if (this.g == 0) {
            return 0;
        }
        float J = J(view);
        int i = this.g;
        return a2.b((int) (J * ((float) i)), 0, i);
    }

    public abstract float J(View view);

    public final int K() {
        return this.g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f;
    }

    public final void O(int i) {
        this.g = i;
    }

    public boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        t3 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = H(coordinatorLayout.w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (k3.t(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.d() + lastWindowInsets.a();
        }
        int L = size + L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.O(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : C0188.f23), i4);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
