package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int S;
    private final rx1 T;
    private Animator U;
    private Animator V;
    private int W;
    private int a0;
    private boolean b0;
    private int c0;
    private ArrayList<f> d0;
    private boolean e0;
    private Behavior f0;
    private int g0;
    private int h0;
    private int i0;
    public AnimatorListenerAdapter j0;
    public iw1<FloatingActionButton> k0;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends FloatingActionButton.b {
        public final /* synthetic */ int a;

        class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.i0();
            }
        }

        public b(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.n0(this.a));
            floatingActionButton.s(new a());
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
            BottomAppBar.this.V = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public d(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                BottomAppBar.this.u0(this.b, this.c, this.d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0.onAnimationStart(animator);
            FloatingActionButton k0 = BottomAppBar.this.k0();
            if (k0 != null) {
                k0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* access modifiers changed from: package-private */
    public static class g extends f4 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int c;
        public boolean d;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.j0);
        floatingActionButton.f(new e());
        floatingActionButton.g(this.k0);
    }

    private void e0() {
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.U;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void g0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k0(), C0201.m82(16942), n0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getBottomInset() {
        return this.g0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationX() {
        return n0(this.W);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getLeftInset() {
        return this.i0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getRightInset() {
        return this.h0;
    }

    private a getTopEdgeTreatment() {
        return (a) this.T.B().p();
    }

    private void h0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String r5 = C0201.m82(16943);
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, r5, 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - ((float) m0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, r5, 0.0f);
                ofFloat2.addListener(new d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i0() {
        ArrayList<f> arrayList;
        int i = this.c0 - 1;
        this.c0 = i;
        if (i == 0 && (arrayList = this.d0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j0() {
        ArrayList<f> arrayList;
        int i = this.c0;
        this.c0 = i + 1;
        if (i == 0 && (arrayList = this.d0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private FloatingActionButton k0() {
        View l0 = l0();
        if (l0 instanceof FloatingActionButton) {
            return (FloatingActionButton) l0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    private View l0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).x(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
            while (r0.hasNext()) {
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float n0(int i) {
        boolean c2 = h.c(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.S + (c2 ? this.i0 : this.h0));
        if (c2) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    private boolean o0() {
        FloatingActionButton k02 = k0();
        return k02 != null && k02.o();
    }

    private void p0(int i, boolean z) {
        if (k3.O(this)) {
            Animator animator = this.V;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!o0()) {
                i = 0;
                z = false;
            }
            h0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.V = animatorSet;
            animatorSet.addListener(new c());
            this.V.start();
        }
    }

    private void q0(int i) {
        if (this.W != i && k3.O(this)) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.a0 == 1) {
                g0(i, arrayList);
            } else {
                f0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.U = animatorSet;
            animatorSet.addListener(new a());
            this.U.start();
        }
    }

    private void r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!o0()) {
                u0(actionMenuView, 0, false);
            } else {
                u0(actionMenuView, this.W, this.e0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s0() {
        getTopEdgeTreatment().m(getFabTranslationX());
        View l0 = l0();
        this.T.W((!this.e0 || !o0()) ? 0.0f : 1.0f);
        if (l0 != null) {
            l0.setTranslationY(getFabTranslationY());
            l0.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void u0(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) m0(actionMenuView, i, z));
    }

    public void f0(int i, List<Animator> list) {
        FloatingActionButton k02 = k0();
        if (k02 != null && !k02.n()) {
            j0();
            k02.l(new b(i));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.T.D();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.W;
    }

    public int getFabAnimationMode() {
        return this.a0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().e();
    }

    public boolean getHideOnScroll() {
        return this.b0;
    }

    public int m0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean c2 = h.c(this);
        int measuredWidth = c2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                if (c2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((c2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (c2 ? this.h0 : -this.i0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sx1.f(this, this.T);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            e0();
            s0();
        }
        r0();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        this.W = gVar.c;
        this.e0 = gVar.d;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.c = this.W;
        gVar.d = this.e0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.T, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().g(f2);
            this.T.invalidateSelf();
            s0();
        }
    }

    public void setElevation(float f2) {
        this.T.U(f2);
        getBehavior().G(this, this.T.A() - this.T.z());
    }

    public void setFabAlignmentMode(int i) {
        q0(i);
        p0(i, this.e0);
        this.W = i;
    }

    public void setFabAnimationMode(int i) {
        this.a0 = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().i(f2);
            this.T.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().j(f2);
            this.T.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.b0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public boolean t0(int i) {
        float f2 = (float) i;
        if (f2 == getTopEdgeTreatment().f()) {
            return false;
        }
        getTopEdgeTreatment().l(f2);
        this.T.invalidateSelf();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f0 == null) {
            this.f0 = new Behavior();
        }
        return this.f0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect e = new Rect();
        private WeakReference<BottomAppBar> f;
        private int g;
        private final View.OnLayoutChangeListener h = new a();

        class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.e);
                int height = Behavior.this.e.height();
                bottomAppBar.t0(height);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(pv1.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (h.c(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.S;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.S;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View l0 = bottomAppBar.l0();
            if (l0 != null && !k3.O(l0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) l0.getLayoutParams();
                fVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (l0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) l0;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.d0(floatingActionButton);
                }
                bottomAppBar.s0();
            }
            coordinatorLayout.N(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
