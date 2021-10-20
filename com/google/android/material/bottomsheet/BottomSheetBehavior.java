package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.i4;
import defpackage.w3;
import defpackage.z3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int L = wv1.Widget_Design_BottomSheet_Modal;
    public int A;
    public int B;
    public WeakReference<V> C;
    public WeakReference<View> D;
    private final ArrayList<e> E = new ArrayList<>();
    private VelocityTracker F;
    public int G;
    private int H;
    public boolean I;
    private Map<View, Integer> J;
    private final i4.c K = new c();
    private int a = 0;
    private boolean b = true;
    private boolean c = false;
    private float d;
    private int e;
    private boolean f;
    private int g;
    private boolean h;
    private rx1 i;
    private vx1 j;
    private boolean k;
    private BottomSheetBehavior<V>.g l = null;
    private ValueAnimator m;
    public int n;
    public int o;
    public int p;
    public float q = 0.5f;
    public int r;
    public float s = -1.0f;
    public boolean t;
    private boolean u;
    public int v = 4;
    public i4 w;
    private boolean x;
    private int y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public void run() {
            BottomSheetBehavior.this.g0(this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.i != null) {
                BottomSheetBehavior.this.i.W(floatValue);
            }
        }
    }

    class c extends i4.c {
        public c() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.B + bottomSheetBehavior.S()) / 2;
        }

        @Override // defpackage.i4.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // defpackage.i4.c
        public int b(View view, int i, int i2) {
            int S = BottomSheetBehavior.this.S();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a2.b(i, S, bottomSheetBehavior.t ? bottomSheetBehavior.B : bottomSheetBehavior.r);
        }

        @Override // defpackage.i4.c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.t) {
                return bottomSheetBehavior.B;
            }
            return bottomSheetBehavior.r;
        }

        @Override // defpackage.i4.c
        public void j(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.f0(1);
            }
        }

        @Override // defpackage.i4.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.Q(i2);
        }

        @Override // defpackage.i4.c
        public void l(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.t || !bottomSheetBehavior.i0(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i3 = bottomSheetBehavior2.p;
                            if (top < i3) {
                                if (top < Math.abs(top - bottomSheetBehavior2.r)) {
                                    i = BottomSheetBehavior.this.n;
                                } else {
                                    i = BottomSheetBehavior.this.p;
                                }
                            } else if (Math.abs(top - i3) < Math.abs(top - BottomSheetBehavior.this.r)) {
                                i = BottomSheetBehavior.this.p;
                            } else {
                                i = BottomSheetBehavior.this.r;
                                BottomSheetBehavior.this.j0(view, i2, i, true);
                            }
                            i2 = 6;
                            BottomSheetBehavior.this.j0(view, i2, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.o) < Math.abs(top - BottomSheetBehavior.this.r)) {
                            i = BottomSheetBehavior.this.o;
                        } else {
                            i = BottomSheetBehavior.this.r;
                            BottomSheetBehavior.this.j0(view, i2, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.b) {
                            i = BottomSheetBehavior.this.r;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.p) < Math.abs(top2 - BottomSheetBehavior.this.r)) {
                                i = BottomSheetBehavior.this.p;
                                i2 = 6;
                            } else {
                                i = BottomSheetBehavior.this.r;
                            }
                        }
                        BottomSheetBehavior.this.j0(view, i2, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || n(view)) {
                    i = BottomSheetBehavior.this.B;
                    i2 = 5;
                    BottomSheetBehavior.this.j0(view, i2, i, true);
                } else if (BottomSheetBehavior.this.b) {
                    i = BottomSheetBehavior.this.o;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.n) < Math.abs(view.getTop() - BottomSheetBehavior.this.p)) {
                    i = BottomSheetBehavior.this.n;
                } else {
                    i = BottomSheetBehavior.this.p;
                    i2 = 6;
                    BottomSheetBehavior.this.j0(view, i2, i, true);
                }
            } else if (BottomSheetBehavior.this.b) {
                i = BottomSheetBehavior.this.o;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i4 = bottomSheetBehavior3.p;
                if (top3 > i4) {
                    i = i4;
                    i2 = 6;
                    BottomSheetBehavior.this.j0(view, i2, i, true);
                }
                i = bottomSheetBehavior3.n;
            }
            i2 = 3;
            BottomSheetBehavior.this.j0(view, i2, i, true);
        }

        @Override // defpackage.i4.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.v;
            if (i2 == 1 || bottomSheetBehavior.I) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.G == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.D;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.C;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements z3 {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // defpackage.z3
        public boolean a(View view, z3.a aVar) {
            BottomSheetBehavior.this.e0(this.a);
            return true;
        }
    }

    public static abstract class e {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    /* access modifiers changed from: private */
    public class g implements Runnable {
        private final View a;
        private boolean b;
        public int c;

        public g(View view, int i) {
            this.a = view;
            this.c = i;
        }

        public void run() {
            i4 i4Var = BottomSheetBehavior.this.w;
            if (i4Var == null || !i4Var.m(true)) {
                BottomSheetBehavior.this.f0(this.c);
            } else {
                k3.a0(this.a, this);
            }
            this.b = false;
        }
    }

    public BottomSheetBehavior() {
    }

    private void J(V v2, w3.a aVar, int i2) {
        k3.e0(v2, aVar, null, new d(i2));
    }

    private void K() {
        int M = M();
        if (this.b) {
            this.r = Math.max(this.B - M, this.o);
        } else {
            this.r = this.B - M;
        }
    }

    private void L() {
        this.p = (int) (((float) this.B) * (1.0f - this.q));
    }

    private int M() {
        if (this.f) {
            return Math.max(this.g, this.B - ((this.A * 9) / 16));
        }
        return this.e;
    }

    private void N(Context context, AttributeSet attributeSet, boolean z2) {
        O(context, attributeSet, z2, null);
    }

    private void O(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.h) {
            this.j = vx1.e(context, attributeSet, nv1.bottomSheetStyle, L).m();
            rx1 rx1 = new rx1(this.j);
            this.i = rx1;
            rx1.L(context);
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
                return;
            }
            this.i.V(colorStateList);
        }
    }

    private void P() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.m = ofFloat;
        ofFloat.setDuration(500L);
        this.m.addUpdateListener(new b());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int S() {
        return this.b ? this.o : this.n;
    }

    private float T() {
        VelocityTracker velocityTracker = this.F;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(C0188.f18, this.d);
        return this.F.getYVelocity(this.G);
    }

    private void U() {
        this.G = -1;
        VelocityTracker velocityTracker = this.F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.F = null;
        }
    }

    private void V(f fVar) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = fVar.d;
            }
            int i3 = this.a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.b = fVar.e;
            }
            int i4 = this.a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.t = fVar.f;
            }
            int i5 = this.a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.u = fVar.g;
            }
        }
    }

    private void h0(int i2) {
        V v2 = this.C.get();
        if (v2 != null) {
            ViewParent parent = v2.getParent();
            if (parent == null || !parent.isLayoutRequested() || !k3.M(v2)) {
                g0(v2, i2);
            } else {
                v2.post(new a(v2, i2));
            }
        }
    }

    private void k0() {
        V v2;
        WeakReference<V> weakReference = this.C;
        if (weakReference != null && (v2 = weakReference.get()) != null) {
            k3.c0(v2, 524288);
            k3.c0(v2, 262144);
            k3.c0(v2, 1048576);
            if (this.t && this.v != 5) {
                J(v2, w3.a.m, 5);
            }
            int i2 = this.v;
            int i3 = 6;
            if (i2 == 3) {
                if (this.b) {
                    i3 = 4;
                }
                J(v2, w3.a.l, i3);
            } else if (i2 == 4) {
                if (this.b) {
                    i3 = 3;
                }
                J(v2, w3.a.k, i3);
            } else if (i2 == 6) {
                J(v2, w3.a.l, 4);
                J(v2, w3.a.k, 3);
            }
        }
    }

    private void l0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.k != z2) {
                this.k = z2;
                if (this.i != null && (valueAnimator = this.m) != null) {
                    if (valueAnimator.isRunning()) {
                        this.m.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.m.setFloatValues(1.0f - f2, f2);
                    this.m.start();
                }
            }
        }
    }

    private void m0(boolean z2) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.C;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.J == null) {
                        this.J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.C.get()) {
                        if (z2) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.c) {
                                k3.q0(childAt, 4);
                            }
                        } else if (this.c && (map = this.J) != null && map.containsKey(childAt)) {
                            k3.q0(childAt, this.J.get(childAt).intValue());
                        }
                    }
                }
                if (!z2) {
                    this.J = null;
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.y = 0;
        this.z = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4 = 3;
        if (v2.getTop() == S()) {
            f0(3);
            return;
        }
        WeakReference<View> weakReference = this.D;
        if (weakReference != null && view == weakReference.get() && this.z) {
            if (this.y > 0) {
                i3 = S();
            } else if (!this.t || !i0(v2, T())) {
                if (this.y == 0) {
                    int top = v2.getTop();
                    if (!this.b) {
                        int i5 = this.p;
                        if (top < i5) {
                            if (top < Math.abs(top - this.r)) {
                                i3 = this.n;
                            } else {
                                i3 = this.p;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.r)) {
                            i3 = this.p;
                        } else {
                            i3 = this.r;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.o) < Math.abs(top - this.r)) {
                        i3 = this.o;
                    } else {
                        i3 = this.r;
                    }
                } else if (this.b) {
                    i3 = this.r;
                } else {
                    int top2 = v2.getTop();
                    if (Math.abs(top2 - this.p) < Math.abs(top2 - this.r)) {
                        i3 = this.p;
                        i4 = 6;
                    } else {
                        i3 = this.r;
                    }
                }
                i4 = 4;
            } else {
                i3 = this.B;
                i4 = 5;
            }
            j0(v2, i4, i3, false);
            this.z = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.v == 1 && actionMasked == 0) {
            return true;
        }
        i4 i4Var = this.w;
        if (i4Var != null) {
            i4Var.E(motionEvent);
        }
        if (actionMasked == 0) {
            U();
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        if (actionMasked == 2 && !this.x && Math.abs(((float) this.H) - motionEvent.getY()) > ((float) this.w.y())) {
            this.w.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.x;
    }

    public void Q(int i2) {
        float f2;
        float f3;
        V v2 = this.C.get();
        if (!(v2 == null || this.E.isEmpty())) {
            int i3 = this.r;
            if (i2 > i3 || i3 == S()) {
                int i4 = this.r;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.B - i4);
            } else {
                int i5 = this.r;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - S());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.E.size(); i6++) {
                this.E.get(i6).a(v2, f4);
            }
        }
    }

    public View R(View view) {
        if (k3.P(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View R = R(viewGroup.getChildAt(i2));
            if (R != null) {
                return R;
            }
        }
        return null;
    }

    public void W(int i2) {
        if (i2 >= 0) {
            this.n = i2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(10342));
    }

    public void X(boolean z2) {
        if (this.b != z2) {
            this.b = z2;
            if (this.C != null) {
                K();
            }
            f0((!this.b || this.v != 6) ? this.v : 3);
            k0();
        }
    }

    public void Y(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException(C0201.m82(10343));
        }
        this.q = f2;
        if (this.C != null) {
            L();
        }
    }

    public void Z(boolean z2) {
        if (this.t != z2) {
            this.t = z2;
            if (!z2 && this.v == 5) {
                e0(4);
            }
            k0();
        }
    }

    public void a0(int i2) {
        b0(i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void b0(int i2, boolean z2) {
        V v2;
        boolean z3 = true;
        if (i2 == -1) {
            if (!this.f) {
                this.f = true;
                if (!z3 && this.C != null) {
                    K();
                    if (this.v == 4 && (v2 = this.C.get()) != null) {
                        if (z2) {
                            h0(this.v);
                            return;
                        } else {
                            v2.requestLayout();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (this.f || this.e != i2) {
            this.f = false;
            this.e = Math.max(0, i2);
            if (!z3) {
                return;
            }
            return;
        }
        z3 = false;
        if (!z3) {
        }
    }

    public void c0(int i2) {
        this.a = i2;
    }

    public void d0(boolean z2) {
        this.u = z2;
    }

    public void e0(int i2) {
        if (i2 != this.v) {
            if (this.C != null) {
                h0(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.t && i2 == 5)) {
                this.v = i2;
            }
        }
    }

    public void f0(int i2) {
        V v2;
        if (this.v != i2) {
            this.v = i2;
            WeakReference<V> weakReference = this.C;
            if (!(weakReference == null || (v2 = weakReference.get()) == null)) {
                if (i2 == 3) {
                    m0(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    m0(false);
                }
                l0(i2);
                for (int i3 = 0; i3 < this.E.size(); i3++) {
                    this.E.get(i3).b(v2, i2);
                }
                k0();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.C = null;
        this.w = null;
    }

    public void g0(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.r;
        } else if (i2 == 6) {
            int i5 = this.p;
            if (!this.b || i5 > (i4 = this.o)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = S();
        } else if (!this.t || i2 != 5) {
            throw new IllegalArgumentException(C0201.m82(10344) + i2);
        } else {
            i3 = this.B;
        }
        j0(view, i2, i3, false);
    }

    public boolean i0(View view, float f2) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.r)) / ((float) M()) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.C = null;
        this.w = null;
    }

    public void j0(View view, int i2, int i3, boolean z2) {
        boolean z3;
        if (z2) {
            z3 = this.w.M(view.getLeft(), i3);
        } else {
            z3 = this.w.O(view, view.getLeft(), i3);
        }
        if (z3) {
            f0(2);
            l0(i2);
            if (this.l == null) {
                this.l = new g(view, i2);
            }
            if (!((g) this.l).b) {
                BottomSheetBehavior<V>.g gVar = this.l;
                gVar.c = i2;
                k3.a0(view, gVar);
                ((g) this.l).b = true;
                return;
            }
            this.l.c = i2;
            return;
        }
        f0(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        i4 i4Var;
        if (!v2.isShown()) {
            this.x = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            U();
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.H = (int) motionEvent.getY();
            if (this.v != 2) {
                WeakReference<View> weakReference = this.D;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.G(view2, x2, this.H)) {
                    this.G = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.I = true;
                }
            }
            this.x = this.G == -1 && !coordinatorLayout.G(v2, x2, this.H);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
            this.G = -1;
            if (this.x) {
                this.x = false;
                return false;
            }
        }
        if (!this.x && (i4Var = this.w) != null && i4Var.N(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.D;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        if (actionMasked != 2 || view == null || this.x || this.v == 1 || coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.w == null || Math.abs(((float) this.H) - motionEvent.getY()) <= ((float) this.w.y())) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        rx1 rx1;
        if (k3.t(coordinatorLayout) && !k3.t(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.C == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(pv1.design_bottom_sheet_peek_height_min);
            this.C = new WeakReference<>(v2);
            if (this.h && (rx1 = this.i) != null) {
                k3.k0(v2, rx1);
            }
            rx1 rx12 = this.i;
            if (rx12 != null) {
                float f2 = this.s;
                if (f2 == -1.0f) {
                    f2 = k3.r(v2);
                }
                rx12.U(f2);
                boolean z2 = this.v == 3;
                this.k = z2;
                this.i.W(z2 ? 0.0f : 1.0f);
            }
            k0();
            if (k3.u(v2) == 0) {
                k3.q0(v2, 1);
            }
        }
        if (this.w == null) {
            this.w = i4.o(coordinatorLayout, this.K);
        }
        int top = v2.getTop();
        coordinatorLayout.N(v2, i2);
        this.A = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.B = height;
        this.o = Math.max(0, height - v2.getHeight());
        L();
        K();
        int i3 = this.v;
        if (i3 == 3) {
            k3.U(v2, S());
        } else if (i3 == 6) {
            k3.U(v2, this.p);
        } else if (!this.t || i3 != 5) {
            int i4 = this.v;
            if (i4 == 4) {
                k3.U(v2, this.r);
            } else if (i4 == 1 || i4 == 2) {
                k3.U(v2, top - v2.getTop());
            }
        } else {
            k3.U(v2, this.B);
        }
        this.D = new WeakReference<>(R(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.D;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.v != 3 || super.o(coordinatorLayout, v2, view, f2, f3)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1) {
            WeakReference<View> weakReference = this.D;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v2.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < S()) {
                        iArr[1] = top - S();
                        k3.U(v2, -iArr[1]);
                        f0(3);
                    } else {
                        iArr[1] = i3;
                        k3.U(v2, -i3);
                        f0(1);
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.r;
                    if (i5 <= i6 || this.t) {
                        iArr[1] = i3;
                        k3.U(v2, -i3);
                        f0(1);
                    } else {
                        iArr[1] = top - i6;
                        k3.U(v2, -iArr[1]);
                        f0(4);
                    }
                }
                Q(v2.getTop());
                this.y = i3;
                this.z = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, v2, fVar.a());
        V(fVar);
        int i2 = fVar.c;
        if (i2 == 1 || i2 == 2) {
            this.v = 4;
        } else {
            this.v = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v2) {
        return new f(super.y(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }

    /* access modifiers changed from: protected */
    public static class f extends f4 {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public final int c;
        public int d;
        public boolean e;
        public boolean f;
        public boolean g;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            boolean z = false;
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1 ? true : z;
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.c = bottomSheetBehavior.v;
            this.d = ((BottomSheetBehavior) bottomSheetBehavior).e;
            this.e = ((BottomSheetBehavior) bottomSheetBehavior).b;
            this.f = bottomSheetBehavior.t;
            this.g = ((BottomSheetBehavior) bottomSheetBehavior).u;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xv1.BottomSheetBehavior_Layout);
        this.h = obtainStyledAttributes.hasValue(xv1.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(xv1.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            O(context, attributeSet, hasValue, dx1.a(context, obtainStyledAttributes, xv1.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            N(context, attributeSet, hasValue);
        }
        P();
        if (Build.VERSION.SDK_INT >= 21) {
            this.s = obtainStyledAttributes.getDimension(xv1.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(xv1.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            a0(obtainStyledAttributes.getDimensionPixelSize(xv1.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            a0(i2);
        }
        Z(obtainStyledAttributes.getBoolean(xv1.BottomSheetBehavior_Layout_behavior_hideable, false));
        X(obtainStyledAttributes.getBoolean(xv1.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        d0(obtainStyledAttributes.getBoolean(xv1.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        c0(obtainStyledAttributes.getInt(xv1.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        Y(obtainStyledAttributes.getFloat(xv1.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        W(obtainStyledAttributes.getInt(xv1.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
