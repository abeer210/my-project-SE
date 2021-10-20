package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.g;
import java.lang.ref.WeakReference;
import java.util.List;
import vigqyno.C0201;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private t3 g;
    private List<c> h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private WeakReference<View> n;
    private ValueAnimator o;
    private int[] p;
    private Drawable q;

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.b<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                k3.U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.j()) {
                    appBarLayout.q(appBarLayout.s(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        public float J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        public int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = H(coordinatorLayout.w(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.n(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xv1.ScrollingViewBehavior_Layout);
            O(obtainStyledAttributes.getDimensionPixelSize(xv1.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements g3 {
        public a() {
        }

        @Override // defpackage.g3
        public t3 a(View view, t3 t3Var) {
            AppBarLayout.this.l(t3Var);
            return t3Var;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ rx1 a;

        public b(rx1 rx1) {
            this.a = rx1;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.U(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void a() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    private View b(View view) {
        int i2;
        if (this.n == null && (i2 = this.m) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (findViewById != null) {
                this.n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((d) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void i() {
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    private void o(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.f = i3 | i2;
        requestLayout();
    }

    private boolean p(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    private boolean r() {
        return this.q != null && getTopInset() > 0;
    }

    private boolean t() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || k3.t(childAt)) {
            return false;
        }
        return true;
    }

    private void u(rx1 rx1, boolean z) {
        float dimension = getResources().getDimension(pv1.design_appbar_elevation);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
        this.o = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(sv1.app_bar_elevation_anim_duration));
        this.o.setInterpolator(yv1.a);
        this.o.addUpdateListener(new b(rx1));
        this.o.start();
    }

    private void v() {
        setWillNotDraw(!r());
    }

    /* renamed from: c */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    /* renamed from: d */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.a));
            this.q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public boolean f() {
        return this.e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int x;
        int i3 = this.c;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = dVar.a;
            if ((i5 & 5) == 5) {
                int i6 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i5 & 8) != 0) {
                    x = k3.x(childAt);
                } else if ((i5 & 2) != 0) {
                    x = measuredHeight - k3.x(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && k3.t(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = i6 + x;
                i2 = Math.min(i2, measuredHeight - getTopInset());
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i5 = dVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= k3.x(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int x = k3.x(this);
        if (x == 0) {
            int childCount = getChildCount();
            x = childCount >= 1 ? k3.x(getChildAt(childCount - 1)) : 0;
            if (x == 0) {
                return getHeight() / 3;
            }
        }
        return (x * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        t3 t3Var = this.g;
        if (t3Var != null) {
            return t3Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = dVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i3 == 0 && k3.t(childAt)) {
                i4 -= getTopInset();
            }
            if ((i5 & 2) != 0) {
                i4 -= k3.x(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return getTotalScrollRange() != 0;
    }

    public boolean j() {
        return this.l;
    }

    public void k(int i2) {
        this.a = i2;
        if (!willNotDraw()) {
            k3.Z(this);
        }
        List<c> list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c cVar = this.h.get(i3);
                if (cVar != null) {
                    cVar.a(this, i2);
                }
            }
        }
    }

    public t3 l(t3 t3Var) {
        t3 t3Var2 = k3.t(this) ? t3Var : null;
        if (!androidx.core.util.c.a(this.g, t3Var2)) {
            this.g = t3Var2;
            v();
            requestLayout();
        }
        return t3Var;
    }

    public void m() {
        this.f = 0;
    }

    public void n(boolean z, boolean z2) {
        o(z, z2, true);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sx1.e(this);
    }

    public int[] onCreateDrawableState(int i2) {
        if (this.p == null) {
            this.p = new int[4];
        }
        int[] iArr = this.p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.j ? nv1.state_liftable : -nv1.state_liftable;
        iArr[1] = (!this.j || !this.k) ? -nv1.state_lifted : nv1.state_lifted;
        iArr[2] = this.j ? nv1.state_collapsible : -nv1.state_collapsible;
        iArr[3] = (!this.j || !this.k) ? -nv1.state_collapsed : nv1.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (k3.t(this) && t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                k3.U(getChildAt(childCount), topInset);
            }
        }
        i();
        this.e = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((d) getChildAt(i6).getLayoutParams()).b() != null) {
                this.e = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.i) {
            if (!this.l && !g()) {
                z2 = false;
            }
            p(z2);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && k3.t(this) && t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = a2.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        i();
    }

    public boolean q(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!this.l || !(getBackground() instanceof rx1)) {
            return true;
        }
        u((rx1) getBackground(), z);
        return true;
    }

    public boolean s(View view) {
        View b2 = b(view);
        if (b2 != null) {
            view = b2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        sx1.d(this, f2);
    }

    public void setExpanded(boolean z) {
        n(z, k3.O(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.m = i2;
        a();
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(33794));
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.q, k3.w(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            v();
            k3.Z(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(n.d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.b(this, f2);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    /* access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        private int k;
        private int l;
        private ValueAnimator m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private b r;

        /* access modifiers changed from: package-private */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            T(coordinatorLayout, t, i, i2);
        }

        private void T(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = M();
            if (M == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(yv1.e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(i2, 600));
            this.m.setIntValues(M, i);
            this.m.start();
        }

        private boolean V(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean W(int i, int i2) {
            return (i & i2) == i2;
        }

        private View X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof a3) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View Y(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int Z(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (W(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int c0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b2 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = dVar.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= k3.x(childAt);
                        }
                    }
                    if (k3.t(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b2.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        private boolean o0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> x = coordinatorLayout.x(t);
            int size = x.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c f = ((CoordinatorLayout.f) x.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f).K() != 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        private void p0(CoordinatorLayout coordinatorLayout, T t) {
            int M = M();
            int Z = Z(t, M);
            if (Z >= 0) {
                View childAt = t.getChildAt(Z);
                d dVar = (d) childAt.getLayoutParams();
                int a2 = dVar.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (Z == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (W(a2, 2)) {
                        i2 += k3.x(childAt);
                    } else if (W(a2, 5)) {
                        int x = k3.x(childAt) + i2;
                        if (M < x) {
                            i = x;
                        } else {
                            i2 = x;
                        }
                    }
                    if (W(a2, 32)) {
                        i += ((LinearLayout.LayoutParams) dVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    S(coordinatorLayout, t, a2.b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void q0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View Y = Y(t, i);
            if (Y != null) {
                int a2 = ((d) Y.getLayoutParams()).a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int x = k3.x(Y);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (Y.getBottom() - x) - t.getTopInset()) : (-i) >= (Y.getBottom() - x) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.j()) {
                    z2 = t.s(X(coordinatorLayout));
                }
                boolean q2 = t.q(z2);
                if (z || (q2 && o0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.a
        public int M() {
            return E() + this.k;
        }

        /* renamed from: U */
        public boolean H(T t) {
            b bVar = this.r;
            if (bVar != null) {
                return bVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: a0 */
        public int K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b0 */
        public int L(T t) {
            return t.getTotalScrollRange();
        }

        /* renamed from: d0 */
        public void N(CoordinatorLayout coordinatorLayout, T t) {
            p0(coordinatorLayout, t);
            if (t.j()) {
                t.q(t.s(X(coordinatorLayout)));
            }
        }

        /* renamed from: e0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean l2 = super.l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.o) {
                    i2 = k3.x(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.p);
                }
                P(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        S(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        P(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        S(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m();
            this.n = -1;
            G(a2.b(E(), -t.getTotalScrollRange(), 0));
            q0(coordinatorLayout, t, E(), 0, true);
            t.k(E());
            return l2;
        }

        /* renamed from: f0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.O(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: g0 */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.j()) {
                t.q(t.s(view));
            }
        }

        /* renamed from: h0 */
        public void t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: i0 */
        public void x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof c) {
                c cVar = (c) parcelable;
                super.x(coordinatorLayout, t, cVar.a());
                this.n = cVar.c;
                this.p = cVar.d;
                this.o = cVar.e;
                return;
            }
            super.x(coordinatorLayout, t, parcelable);
            this.n = -1;
        }

        /* renamed from: j0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.y(coordinatorLayout, t);
            int E = E();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    c cVar = new c(y);
                    cVar.c = i;
                    if (bottom == k3.x(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.e = z;
                    cVar.d = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return y;
        }

        /* renamed from: k0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.j() || V(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        /* renamed from: l0 */
        public void C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                p0(coordinatorLayout, t);
                if (t.j()) {
                    t.q(t.s(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        public void m0(b bVar) {
            this.r = bVar;
        }

        /* renamed from: n0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.k = 0;
            } else {
                int b2 = a2.b(i, i2, i3);
                if (M != b2) {
                    int c0 = t.f() ? c0(t, b2) : b2;
                    boolean G = G(c0);
                    i4 = M - b2;
                    this.k = b2 - c0;
                    if (!G && t.f()) {
                        coordinatorLayout.q(t);
                    }
                    t.k(E());
                    q0(coordinatorLayout, t, b2, b2 < M ? -1 : 1, false);
                }
            }
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public static class c extends f4 {
            public static final Parcelable.Creator<c> CREATOR = new a();
            public int c;
            public float d;
            public boolean e;

            static class a implements Parcelable.ClassLoaderCreator<c> {
                /* renamed from: a */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                /* renamed from: b */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                /* renamed from: c */
                public c[] newArray(int i) {
                    return new c[i];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readInt();
                this.d = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            @Override // defpackage.f4
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.c);
                parcel.writeFloat(this.d);
                parcel.writeByte(this.e ? (byte) 1 : 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this);
            e.c(this, attributeSet, i2, wv1.Widget_Design_AppBarLayout);
        }
        TypedArray h2 = g.h(context, attributeSet, xv1.AppBarLayout, i2, wv1.Widget_Design_AppBarLayout, new int[0]);
        k3.k0(this, h2.getDrawable(xv1.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            rx1 rx1 = new rx1();
            rx1.V(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            rx1.L(context);
            k3.k0(this, rx1);
        }
        if (h2.hasValue(xv1.AppBarLayout_expanded)) {
            o(h2.getBoolean(xv1.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && h2.hasValue(xv1.AppBarLayout_elevation)) {
            e.b(this, (float) h2.getDimensionPixelSize(xv1.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (h2.hasValue(xv1.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(h2.getBoolean(xv1.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (h2.hasValue(xv1.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(h2.getBoolean(xv1.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.l = h2.getBoolean(xv1.AppBarLayout_liftOnScroll, false);
        this.m = h2.getResourceId(xv1.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(h2.getDrawable(xv1.AppBarLayout_statusBarForeground));
        h2.recycle();
        k3.t0(this, new a());
    }

    public static class d extends LinearLayout.LayoutParams {
        public int a = 1;
        public Interpolator b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xv1.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(xv1.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(xv1.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(xv1.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.b;
        }

        public boolean c() {
            int i = this.a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void d(int i) {
            this.a = i;
        }

        public d(int i, int i2) {
            super(i, i2);
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
