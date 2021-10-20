package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import vigqyno.C0188;
import vigqyno.C0201;

public class ActionBarOverlayLayout extends ViewGroup implements c0, e3, c3, d3 {
    public static final int[] E = {defpackage.d.actionBarSize, 16842841};
    public final AnimatorListenerAdapter A = new a();
    private final Runnable B = new b();
    private final Runnable C = new c();
    private final f3 D;
    private int a;
    private int b = 0;
    private ContentFrameLayout c;
    public ActionBarContainer d;
    private d0 e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    public boolean k;
    private int l;
    private int m;
    private final Rect n = new Rect();
    private final Rect o = new Rect();
    private final Rect p = new Rect();
    private final Rect q = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private d x;
    private OverScroller y;
    public ViewPropertyAnimator z;

    class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.z = null;
            actionBarOverlayLayout.k = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.z = null;
            actionBarOverlayLayout.k = false;
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.z = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.A);
        }
    }

    class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.z = actionBarOverlayLayout.d.animate().translationY((float) (-ActionBarOverlayLayout.this.d.getHeight())).setListener(ActionBarOverlayLayout.this.A);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void f(int i);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v(context);
        this.D = new f3(this);
    }

    private void A() {
        u();
        this.B.run();
    }

    private boolean B(float f2, float f3) {
        this.y.fling(0, 0, 0, (int) f3, 0, 0, C0188.f23, C0188.f24);
        return this.y.getFinalY() > this.d.getHeight();
    }

    private void p() {
        u();
        this.C.run();
    }

    private boolean q(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || ((ViewGroup.MarginLayoutParams) eVar).leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z6 = true;
        }
        if (z3 && ((ViewGroup.MarginLayoutParams) eVar).topMargin != (i4 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z6 = true;
        }
        if (z5 && ((ViewGroup.MarginLayoutParams) eVar).rightMargin != (i3 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i3;
            z6 = true;
        }
        if (!z4 || ((ViewGroup.MarginLayoutParams) eVar).bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i2;
        return true;
    }

    private d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(C0201.m82(5648) + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(E);
        boolean z2 = false;
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.g = z2;
        this.y = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.C, 600);
    }

    private void y() {
        u();
        postDelayed(this.B, 600);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, m.a aVar) {
        z();
        this.e.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean b() {
        z();
        return this.e.b();
    }

    @Override // androidx.appcompat.widget.c0
    public void c() {
        z();
        this.e.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean d() {
        z();
        return this.e.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f != null && !this.g) {
            int bottom = this.d.getVisibility() == 0 ? (int) (((float) this.d.getBottom()) + this.d.getTranslationY() + 0.5f) : 0;
            this.f.setBounds(0, bottom, getWidth(), this.f.getIntrinsicHeight() + bottom);
            this.f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        z();
        return this.e.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        z();
        return this.e.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        z();
        int F = k3.F(this) & 256;
        boolean q2 = q(this.d, rect, true, true, false, true);
        this.q.set(rect);
        d1.a(this, this.q, this.n);
        if (!this.u.equals(this.q)) {
            this.u.set(this.q);
            q2 = true;
        }
        if (!this.o.equals(this.n)) {
            this.o.set(this.n);
            q2 = true;
        }
        if (q2) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean g() {
        z();
        return this.e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.D.a();
    }

    public CharSequence getTitle() {
        z();
        return this.e.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public void h(int i2) {
        z();
        if (i2 == 2) {
            this.e.t();
        } else if (i2 == 5) {
            this.e.u();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void i() {
        z();
        this.e.h();
    }

    @Override // defpackage.d3
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        k(view, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.c3
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // defpackage.c3
    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // defpackage.c3
    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // defpackage.c3
    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.c3
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        k3.f0(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        z();
        measureChildWithMargins(this.d, i2, 0, i3, 0);
        e eVar = (e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        boolean z2 = (k3.F(this) & 256) != 0;
        if (z2) {
            i4 = this.a;
            if (this.i && this.d.getTabContainer() != null) {
                i4 += this.a;
            }
        } else {
            i4 = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.p.set(this.n);
        this.v.set(this.q);
        if (this.h || z2) {
            Rect rect = this.v;
            rect.top += i4;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.p;
            rect2.top += i4;
            rect2.bottom += 0;
        }
        q(this.c, this.p, true, true, true, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.c.a(this.v);
        }
        measureChildWithMargins(this.c, i2, 0, i3, 0);
        e eVar2 = (e) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // defpackage.e3
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.j || !z2) {
            return false;
        }
        if (B(f2, f3)) {
            p();
        } else {
            A();
        }
        this.k = true;
        return true;
    }

    @Override // defpackage.e3
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // defpackage.e3
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.e3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.l + i3;
        this.l = i6;
        setActionBarHideOffset(i6);
    }

    @Override // defpackage.e3
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.D.b(view, view2, i2);
        this.l = getActionBarHideOffset();
        u();
        d dVar = this.x;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // defpackage.e3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // defpackage.e3
    public void onStopNestedScroll(View view) {
        if (this.j && !this.k) {
            if (this.l <= this.d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.x;
        if (dVar != null) {
            dVar.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.m ^ i2;
        this.m = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.x;
        if (dVar != null) {
            dVar.c(!z2);
            if (z3 || !z2) {
                this.x.a();
            } else {
                this.x.d();
            }
        }
        if ((i3 & 256) != 0 && this.x != null) {
            k3.f0(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.b = i2;
        d dVar = this.x;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.d.setTranslationY((float) (-Math.max(0, Math.min(i2, this.d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.x = dVar;
        if (getWindowToken() != null) {
            this.x.f(this.b);
            int i2 = this.m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                k3.f0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.j) {
            this.j = z2;
            if (!z2) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        z();
        this.e.setIcon(i2);
    }

    public void setLogo(int i2) {
        z();
        this.e.m(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.h = z2;
        this.g = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void u() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
        ViewPropertyAnimator viewPropertyAnimator = this.z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.h;
    }

    public void z() {
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(i.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(i.action_bar_container);
            this.e = t(findViewById(i.action_bar));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.e.setIcon(drawable);
    }
}
