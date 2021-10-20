package com.aurelhubert.ahbottomnavigation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.aurelhubert.ahbottomnavigation.q;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.android.material.tabs.TabLayout;

public class AHBottomNavigationBehavior<V extends View> extends VerticalScrollingBehavior<V> {
    private static final Interpolator p = new n4();
    private int e;
    private boolean f = false;
    private p3 g;
    private ObjectAnimator h;
    private TabLayout i;
    private Snackbar$SnackbarLayout j;
    private int k = -1;
    private float l = 0.0f;
    private float m = 0.0f;
    private boolean n = true;
    private q.d o;

    /* access modifiers changed from: package-private */
    public class a implements s3 {
        public a() {
        }

        @Override // defpackage.s3
        public void a(View view) {
            if (AHBottomNavigationBehavior.this.o != null) {
                AHBottomNavigationBehavior.this.o.a((int) ((((float) view.getMeasuredHeight()) - view.getTranslationY()) + AHBottomNavigationBehavior.this.m));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (AHBottomNavigationBehavior.this.j != null && (AHBottomNavigationBehavior.this.j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                AHBottomNavigationBehavior.this.l = ((float) this.a.getMeasuredHeight()) - this.a.getTranslationY();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) AHBottomNavigationBehavior.this.j.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) AHBottomNavigationBehavior.this.l);
                AHBottomNavigationBehavior.this.j.requestLayout();
            }
            if (AHBottomNavigationBehavior.this.o != null) {
                AHBottomNavigationBehavior.this.o.a((int) ((((float) this.a.getMeasuredHeight()) - this.a.getTranslationY()) + AHBottomNavigationBehavior.this.m));
            }
        }
    }

    public AHBottomNavigationBehavior() {
    }

    private void M(V v, int i2, boolean z, boolean z2) {
        if (!this.n && !z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            O(v, i2, z2);
            this.h.start();
            return;
        }
        N(v, z2);
        p3 p3Var = this.g;
        p3Var.k((float) i2);
        p3Var.j();
    }

    private void N(V v, boolean z) {
        p3 p3Var = this.g;
        long j2 = 300;
        if (p3Var == null) {
            p3 c = k3.c(v);
            this.g = c;
            if (!z) {
                j2 = 0;
            }
            c.d(j2);
            this.g.i(new a());
            this.g.e(p);
            return;
        }
        if (!z) {
            j2 = 0;
        }
        p3Var.d(j2);
        this.g.b();
    }

    private void O(V v, int i2, boolean z) {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, View.TRANSLATION_Y, (float) i2);
        this.h = ofFloat;
        ofFloat.setDuration(z ? 300 : 0);
        this.h.setInterpolator(p);
        this.h.addUpdateListener(new b(v));
    }

    private TabLayout P(View view) {
        int i2 = this.e;
        if (i2 == 0) {
            return null;
        }
        return (TabLayout) view.findViewById(i2);
    }

    private void Q(V v, int i2) {
        if (this.n) {
            if (i2 == -1 && this.f) {
                this.f = false;
                M(v, 0, false, true);
            } else if (i2 == 1 && !this.f) {
                this.f = true;
                M(v, v.getHeight(), false, true);
            }
        }
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public void E(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public boolean F(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, int i2) {
        return false;
    }

    @Override // com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public void G(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
    }

    public void R(V v, int i2, boolean z) {
        if (!this.f) {
            this.f = true;
            M(v, i2, true, z);
        }
    }

    public void S(V v, boolean z) {
        if (this.f) {
            this.f = false;
            M(v, 0, true, z);
        }
    }

    public void T(boolean z, int i2) {
        this.n = z;
    }

    public void U(q.d dVar) {
        this.o = dVar;
    }

    public void V(View view, View view2) {
        if (view2 != null && (view2 instanceof Snackbar$SnackbarLayout)) {
            this.j = (Snackbar$SnackbarLayout) view2;
            if (this.k == -1) {
                this.k = view2.getHeight();
            }
            int measuredHeight = (int) (((float) view.getMeasuredHeight()) - view.getTranslationY());
            if (Build.VERSION.SDK_INT < 21) {
                view.bringToFront();
            }
            if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, measuredHeight);
                view2.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (view == null || !(view instanceof Snackbar$SnackbarLayout)) {
            return super.e(coordinatorLayout, v, view);
        }
        V(v, view);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
        return super.h(coordinatorLayout, v, view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.i(coordinatorLayout, v, view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean l2 = super.l(coordinatorLayout, v, i2);
        if (this.i == null && this.e != -1) {
            this.i = P(v);
        }
        return l2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c, com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        super.r(coordinatorLayout, v, view, i2, i3, i4, i5);
        if (i3 < 0) {
            Q(v, -1);
        } else if (i3 > 0) {
            Q(v, 1);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c, com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior
    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        return i2 == 2 || super.z(coordinatorLayout, v, view, view2, i2);
    }

    public AHBottomNavigationBehavior(boolean z, int i2) {
        this.n = z;
    }

    public AHBottomNavigationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.AHBottomNavigationBehavior_Params);
        this.e = obtainStyledAttributes.getResourceId(y.AHBottomNavigationBehavior_Params_tabLayoutId, -1);
        obtainStyledAttributes.recycle();
    }
}
