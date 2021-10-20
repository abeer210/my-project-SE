package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import vigqyno.C0201;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private final d u;
    private final d v;
    private final d w;
    private final d x;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        private boolean a;
        public final /* synthetic */ d b;
        public final /* synthetic */ d c;

        public a(d dVar, d dVar2) {
            this.b = dVar;
            this.c = dVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.b.a();
        }

        public void onAnimationEnd(Animator animator) {
            this.b.onAnimationEnd();
            if (!this.a) {
                this.b.h(this.c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.b.onAnimationStart(animator);
            this.a = false;
        }
    }

    static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    public static abstract class d {
    }

    static {
        new b(Float.class, C0201.m82(37261));
        new c(Float.class, C0201.m82(37262));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(d dVar, d dVar2) {
        if (!dVar.d()) {
            if (!m()) {
                dVar.b();
                dVar.h(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet f = dVar.f();
            f.addListener(new a(dVar, dVar2));
            for (Animator.AnimatorListener animatorListener : dVar.g()) {
                f.addListener(animatorListener);
            }
            f.start();
        }
    }

    private boolean m() {
        return k3.O(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.y;
    }

    public int getCollapsedSize() {
        return (Math.min(k3.B(this), k3.A(this)) * 2) + getIconSize();
    }

    public fw1 getExtendMotionSpec() {
        return this.v.c();
    }

    public fw1 getHideMotionSpec() {
        return this.x.c();
    }

    public fw1 getShowMotionSpec() {
        return this.w.c();
    }

    public fw1 getShrinkMotionSpec() {
        return this.u.c();
    }

    @Override // com.google.android.material.button.MaterialButton
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.z = false;
            this.u.b();
        }
    }

    public void setExtendMotionSpec(fw1 fw1) {
        this.v.e(fw1);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(fw1.c(getContext(), i));
    }

    public void setExtended(boolean z2) {
        if (this.z != z2) {
            d dVar = z2 ? this.v : this.u;
            if (!dVar.d()) {
                dVar.b();
            }
        }
    }

    public void setHideMotionSpec(fw1 fw1) {
        this.x.e(fw1);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(fw1.c(getContext(), i));
    }

    public void setShowMotionSpec(fw1 fw1) {
        this.w.e(fw1);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(fw1.c(getContext(), i));
    }

    public void setShrinkMotionSpec(fw1 fw1) {
        this.u.e(fw1);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(fw1.c(getContext(), i));
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;
        private d b;
        private d c;
        private boolean d;
        private boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.d || this.e) && fVar.e() == view.getId()) {
                return true;
            }
            return false;
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            d dVar;
            d dVar2 = this.e ? this.c : this.b;
            if (this.e) {
                dVar = extendedFloatingActionButton.v;
            } else {
                dVar = extendedFloatingActionButton.w;
            }
            extendedFloatingActionButton.l(dVar, dVar2);
        }

        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!G(view)) {
                return false;
            } else {
                M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> w = coordinatorLayout.w(extendedFloatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.N(extendedFloatingActionButton, i);
            return true;
        }

        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            d dVar;
            d dVar2 = this.e ? this.c : this.b;
            if (this.e) {
                dVar = extendedFloatingActionButton.u;
            } else {
                dVar = extendedFloatingActionButton.x;
            }
            extendedFloatingActionButton.l(dVar, dVar2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xv1.ExtendedFloatingActionButton_Behavior_Layout);
            this.d = obtainStyledAttributes.getBoolean(xv1.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = obtainStyledAttributes.getBoolean(xv1.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }
}
