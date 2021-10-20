package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class VerticalScrollingBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;

    public VerticalScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.B(coordinatorLayout, v, view);
    }

    public abstract void E(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    public abstract boolean F(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i);

    public abstract void G(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public t3 f(CoordinatorLayout coordinatorLayout, V v, t3 t3Var) {
        super.f(coordinatorLayout, v, t3Var);
        return t3Var;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        super.n(coordinatorLayout, v, view, f, f2, z);
        int i = f2 > 0.0f ? 1 : -1;
        this.d = i;
        return F(coordinatorLayout, v, view, f, f2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return super.o(coordinatorLayout, v, view, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        super.p(coordinatorLayout, v, view, i, i2, iArr);
        if (i2 > 0 && this.b < 0) {
            this.b = 0;
            this.d = 1;
        } else if (i2 < 0 && this.b > 0) {
            this.b = 0;
            this.d = -1;
        }
        this.b += i2;
        E(coordinatorLayout, v, view, i, i2, iArr, this.d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        super.r(coordinatorLayout, v, view, i, i2, i3, i4);
        if (i4 > 0 && this.a < 0) {
            this.a = 0;
            this.c = 1;
        } else if (i4 < 0 && this.a > 0) {
            this.a = 0;
            this.c = -1;
        }
        int i5 = this.a + i4;
        this.a = i5;
        G(coordinatorLayout, v, this.c, i2, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        super.u(coordinatorLayout, v, view, view2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return super.y(coordinatorLayout, v);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public VerticalScrollingBehavior() {
    }
}
