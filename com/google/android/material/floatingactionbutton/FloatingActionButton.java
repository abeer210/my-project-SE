package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.g;
import androidx.core.widget.m;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.i;
import java.util.List;
import vigqyno.C0201;

public class FloatingActionButton extends i implements j3, m, xw1, yx1, CoordinatorLayout.b {
    private ColorStateList b;
    private PorterDuff.Mode c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private ColorStateList f;
    private int g;
    private int h;
    private int i;
    private int j;
    public boolean k;
    public final Rect l;
    private final Rect m;
    private final n n;
    private final yw1 o;
    private b p;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements b.j {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* access modifiers changed from: private */
    public class c implements kx1 {
        public c() {
        }

        @Override // defpackage.kx1
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.l.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.i, i2 + FloatingActionButton.this.i, i3 + FloatingActionButton.this.i, i4 + FloatingActionButton.this.i);
        }

        @Override // defpackage.kx1
        public boolean b() {
            return FloatingActionButton.this.k;
        }

        @Override // defpackage.kx1
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    class d<T extends FloatingActionButton> implements b.i {
        private final iw1<T> a;

        public d(iw1<T> iw1) {
            this.a = iw1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: iw1<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.b.i
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: iw1<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.b.i
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private b getImpl() {
        if (this.p == null) {
            this.p = h();
        }
        return this.p;
    }

    private b h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new c(this, new c());
        }
        return new b(this, new c());
    }

    private int k(int i2) {
        int i3 = this.h;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            if (i2 != 1) {
                return resources.getDimensionPixelSize(pv1.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(pv1.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    private void p(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.l;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.d;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(j.e(colorForState, mode));
        }
    }

    private static int r(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private b.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // defpackage.xw1
    public boolean a() {
        this.o.b();
        throw null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().C(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(iw1<? extends FloatingActionButton> iw1) {
        getImpl().f(new d(iw1));
    }

    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().j();
    }

    public int getCustomSize() {
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        this.o.a();
        throw null;
    }

    public fw1 getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public vx1 getShapeAppearanceModel() {
        vx1 t = getImpl().t();
        g.c(t);
        return t;
    }

    public fw1 getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return k(this.g);
    }

    @Override // defpackage.j3
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // defpackage.j3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    @Override // androidx.core.widget.m
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!k3.O(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().y();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    public void m(b bVar, boolean z) {
        getImpl().v(u(bVar), z);
    }

    public boolean n() {
        return getImpl().w();
    }

    public boolean o() {
        return getImpl().x();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().z();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().B();
    }

    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.i = (sizeDimension - this.j) / 2;
        getImpl().b0();
        int min = Math.min(r(sizeDimension, i2), r(sizeDimension, i3));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zx1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zx1 zx1 = (zx1) parcelable;
        super.onRestoreInstanceState(zx1.a());
        yw1 yw1 = this.o;
        Bundle bundle = zx1.c.get(C0201.m82(20477));
        g.c(bundle);
        yw1.c(bundle);
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new zx1(onSaveInstanceState);
        this.o.d();
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !i(this.m) || this.m.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    public void setBackgroundColor(int i2) {
        Log.i(C0201.m82(20478), C0201.m82(20479));
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(C0201.m82(20480), C0201.m82(20481));
    }

    public void setBackgroundResource(int i2) {
        Log.i(C0201.m82(20482), C0201.m82(20483));
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            getImpl().J(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            getImpl().K(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().L(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().O(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().Q(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C0201.m82(20484));
        } else if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().c0(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().n()) {
            getImpl().M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.o.e(i2);
        throw null;
    }

    public void setHideMotionSpec(fw1 fw1) {
        getImpl().N(fw1);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(fw1.c(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().a0();
            if (this.d != null) {
                q();
            }
        }
    }

    public void setImageResource(int i2) {
        this.n.g(i2);
        q();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().G();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().S(z);
    }

    @Override // defpackage.yx1
    public void setShapeAppearanceModel(vx1 vx1) {
        getImpl().T(vx1);
    }

    public void setShowMotionSpec(fw1 fw1) {
        getImpl().U(fw1);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(fw1.c(getContext(), i2));
    }

    public void setSize(int i2) {
        this.h = 0;
        if (i2 != this.g) {
            this.g = i2;
            requestLayout();
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            q();
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            q();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().H();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().H();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().A();
        }
    }

    @Override // com.google.android.material.internal.i
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public void t(b bVar, boolean z) {
        getImpl().Y(u(bVar), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;
        private b b;
        private boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.l;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    k3.U(floatingActionButton, i2);
                }
                if (i != 0) {
                    k3.T(floatingActionButton, i);
                }
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.c && fVar.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!F(view)) {
                return false;
            } else {
                L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> w = coordinatorLayout.w(floatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.N(floatingActionButton, i);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xv1.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(xv1.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            getImpl().R(this.f);
        }
    }
}
