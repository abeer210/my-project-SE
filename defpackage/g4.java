package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import defpackage.h4;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: g4  reason: default package */
/* compiled from: ExploreByTouchHelper */
public abstract class g4 extends r2 {
    private static final Rect n = new Rect(C0188.f24, C0188.f24, C0188.f23, C0188.f23);
    private static final h4.a<w3> o = new a();
    private static final h4.b<y0<w3>, w3> p = new b();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    private final AccessibilityManager h;
    private final View i;
    private c j;
    public int k = C0188.f23;
    public int l = C0188.f23;
    private int m = C0188.f23;

    /* renamed from: g4$a */
    /* compiled from: ExploreByTouchHelper */
    static class a implements h4.a<w3> {
        /* renamed from: b */
        public void a(w3 w3Var, Rect rect) {
            w3Var.l(rect);
        }
    }

    /* renamed from: g4$b */
    /* compiled from: ExploreByTouchHelper */
    static class b implements h4.b<y0<w3>, w3> {
        /* renamed from: c */
        public w3 a(y0<w3> y0Var, int i) {
            return y0Var.o(i);
        }

        /* renamed from: d */
        public int b(y0<w3> y0Var) {
            return y0Var.n();
        }
    }

    /* renamed from: g4$c */
    /* compiled from: ExploreByTouchHelper */
    private class c extends x3 {
        public c() {
        }

        @Override // defpackage.x3
        public w3 a(int i) {
            return w3.O(g4.this.K(i));
        }

        @Override // defpackage.x3
        public w3 c(int i) {
            int i2 = i == 2 ? g4.this.k : g4.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // defpackage.x3
        public boolean e(int i, int i2, Bundle bundle) {
            return g4.this.S(i, i2, bundle);
        }
    }

    public g4(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService(C0201.m82(13152));
            view.setFocusable(true);
            if (k3.u(view) == 0) {
                k3.q0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(13153));
    }

    private static Rect E(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException(C0201.m82(13154));
        }
        return rect;
    }

    private boolean H(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int I(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean J(int i2, Rect rect) {
        w3 w3Var;
        w3 w3Var2;
        y0<w3> y = y();
        int i3 = this.l;
        int i4 = C0188.f23;
        if (i3 == Integer.MIN_VALUE) {
            w3Var = null;
        } else {
            w3Var = y.e(i3);
        }
        if (i2 == 1 || i2 == 2) {
            w3Var2 = (w3) h4.d(y, p, o, w3Var, i2, k3.w(this.i) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.l;
            if (i5 != Integer.MIN_VALUE) {
                z(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.i, i2, rect2);
            }
            w3Var2 = (w3) h4.c(y, p, o, w3Var, rect2, i2);
        } else {
            throw new IllegalArgumentException(C0201.m82(13155));
        }
        if (w3Var2 != null) {
            i4 = y.j(y.i(w3Var2));
        }
        return W(i4);
    }

    private boolean T(int i2, int i3, Bundle bundle) {
        if (i3 == 1) {
            return W(i2);
        }
        if (i3 == 2) {
            return o(i2);
        }
        if (i3 == 64) {
            return V(i2);
        }
        if (i3 != 128) {
            return M(i2, i3, bundle);
        }
        return n(i2);
    }

    private boolean U(int i2, Bundle bundle) {
        return k3.Y(this.i, i2, bundle);
    }

    private boolean V(int i2) {
        int i3;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i3 = this.k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            n(i3);
        }
        this.k = i2;
        this.i.invalidate();
        X(i2, 32768);
        return true;
    }

    private void Y(int i2) {
        int i3 = this.m;
        if (i3 != i2) {
            this.m = i2;
            X(i2, 128);
            X(i3, 256);
        }
    }

    private boolean n(int i2) {
        if (this.k != i2) {
            return false;
        }
        this.k = C0188.f23;
        this.i.invalidate();
        X(i2, 65536);
        return true;
    }

    private boolean p() {
        int i2 = this.l;
        return i2 != Integer.MIN_VALUE && M(i2, 16, null);
    }

    private AccessibilityEvent q(int i2, int i3) {
        if (i2 != -1) {
            return r(i2, i3);
        }
        return s(i3);
    }

    private AccessibilityEvent r(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        w3 K = K(i2);
        obtain.getText().add(K.v());
        obtain.setContentDescription(K.q());
        obtain.setScrollable(K.I());
        obtain.setPassword(K.H());
        obtain.setEnabled(K.D());
        obtain.setChecked(K.B());
        O(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(K.o());
            y3.c(obtain, this.i, i2);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException(C0201.m82(13156));
    }

    private AccessibilityEvent s(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private w3 t(int i2) {
        w3 M = w3.M();
        M.e0(true);
        M.g0(true);
        M.Z(C0201.m82(13157));
        M.V(n);
        M.W(n);
        M.o0(this.i);
        Q(i2, M);
        if (M.v() == null && M.q() == null) {
            throw new RuntimeException(C0201.m82(13158));
        }
        M.l(this.e);
        if (!this.e.equals(n)) {
            int j2 = M.j();
            if ((j2 & 64) != 0) {
                throw new RuntimeException(C0201.m82(13160));
            } else if ((j2 & 128) == 0) {
                M.m0(this.i.getContext().getPackageName());
                M.x0(this.i, i2);
                if (this.k == i2) {
                    M.T(true);
                    M.a(128);
                } else {
                    M.T(false);
                    M.a(64);
                }
                boolean z = this.l == i2;
                if (z) {
                    M.a(2);
                } else if (M.E()) {
                    M.a(1);
                }
                M.h0(z);
                this.i.getLocationOnScreen(this.g);
                M.m(this.d);
                if (this.d.equals(n)) {
                    M.l(this.d);
                    if (M.b != -1) {
                        w3 M2 = w3.M();
                        for (int i3 = M.b; i3 != -1; i3 = M2.b) {
                            M2.p0(this.i, -1);
                            M2.V(n);
                            Q(i3, M2);
                            M2.l(this.e);
                            Rect rect = this.d;
                            Rect rect2 = this.e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        M2.Q();
                    }
                    this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f)) {
                    this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.d.intersect(this.f)) {
                        M.W(this.d);
                        if (H(this.d)) {
                            M.z0(true);
                        }
                    }
                }
                return M;
            } else {
                throw new RuntimeException(C0201.m82(13159));
            }
        } else {
            throw new RuntimeException(C0201.m82(13161));
        }
    }

    private w3 u() {
        w3 N = w3.N(this.i);
        k3.W(this.i, N);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (N.n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                N.d(this.i, ((Integer) arrayList.get(i2)).intValue());
            }
            return N;
        }
        throw new RuntimeException(C0201.m82(13162));
    }

    private y0<w3> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        y0<w3> y0Var = new y0<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            y0Var.l(i2, t(i2));
        }
        return y0Var;
    }

    private void z(int i2, Rect rect) {
        K(i2).l(rect);
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.l;
    }

    public abstract int C(float f2, float f3);

    public abstract void D(List<Integer> list);

    public final void F() {
        G(-1, 1);
    }

    public final void G(int i2, int i3) {
        ViewParent parent;
        if (i2 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = this.i.getParent()) != null) {
            AccessibilityEvent q = q(i2, 2048);
            v3.b(q, i3);
            o3.h(parent, this.i, q);
        }
    }

    public w3 K(int i2) {
        if (i2 == -1) {
            return u();
        }
        return t(i2);
    }

    public final void L(boolean z, int i2, Rect rect) {
        int i3 = this.l;
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        if (z) {
            J(i2, rect);
        }
    }

    public abstract boolean M(int i2, int i3, Bundle bundle);

    public void N(AccessibilityEvent accessibilityEvent) {
    }

    public void O(int i2, AccessibilityEvent accessibilityEvent) {
    }

    public void P(w3 w3Var) {
    }

    public abstract void Q(int i2, w3 w3Var);

    public void R(int i2, boolean z) {
    }

    public boolean S(int i2, int i3, Bundle bundle) {
        if (i2 != -1) {
            return T(i2, i3, bundle);
        }
        return U(i3, bundle);
    }

    public final boolean W(int i2) {
        int i3;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i3 = this.l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            o(i3);
        }
        this.l = i2;
        R(i2, true);
        X(i2, 8);
        return true;
    }

    public final boolean X(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return o3.h(parent, this.i, q(i2, i3));
    }

    @Override // defpackage.r2
    public x3 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.r2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        N(accessibilityEvent);
    }

    @Override // defpackage.r2
    public void g(View view, w3 w3Var) {
        super.g(view, w3Var);
        P(w3Var);
    }

    public final boolean o(int i2) {
        if (this.l != i2) {
            return false;
        }
        this.l = C0188.f23;
        R(i2, false);
        X(i2, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int C = C(motionEvent.getX(), motionEvent.getY());
            Y(C);
            if (C != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            Y(C0188.f23);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int I = I(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && J(I, null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return J(2, null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return J(1, null);
            }
            return false;
        }
    }

    public final int x() {
        return this.k;
    }
}
