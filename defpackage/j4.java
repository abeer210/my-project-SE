package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import defpackage.i4;
import defpackage.w3;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: j4  reason: default package */
/* compiled from: DrawerLayout */
public class j4 extends ViewGroup {
    private static final int[] N = {16843828};
    public static final int[] O = {16842931};
    public static final boolean P = (Build.VERSION.SDK_INT >= 19);
    private static final boolean Q;
    private Drawable A;
    private Drawable B;
    private CharSequence C;
    private CharSequence D;
    private Object E;
    private boolean F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private Drawable J;
    private final ArrayList<View> K;
    private Rect L;
    private Matrix M;
    private final c a;
    private float b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final i4 g;
    private final i4 h;
    private final g i;
    private final g j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean u;
    private d v;
    private List<d> w;
    private float x;
    private float y;
    private Drawable z;

    /* renamed from: j4$a */
    /* compiled from: DrawerLayout */
    class a implements View.OnApplyWindowInsetsListener {
        public a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((j4) view).R(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: j4$b */
    /* compiled from: DrawerLayout */
    class b extends r2 {
        private final Rect d = new Rect();

        public b() {
        }

        private void n(w3 w3Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (j4.A(childAt)) {
                    w3Var.c(childAt);
                }
            }
        }

        private void o(w3 w3Var, w3 w3Var2) {
            Rect rect = this.d;
            w3Var2.l(rect);
            w3Var.V(rect);
            w3Var2.m(rect);
            w3Var.W(rect);
            w3Var.z0(w3Var2.L());
            w3Var.m0(w3Var2.t());
            w3Var.Z(w3Var2.o());
            w3Var.d0(w3Var2.q());
            w3Var.e0(w3Var2.D());
            w3Var.a0(w3Var2.C());
            w3Var.g0(w3Var2.E());
            w3Var.h0(w3Var2.F());
            w3Var.T(w3Var2.z());
            w3Var.u0(w3Var2.J());
            w3Var.k0(w3Var2.G());
            w3Var.a(w3Var2.j());
        }

        @Override // defpackage.r2
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p = j4.this.p();
            if (p == null || (s = j4.this.s(j4.this.t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        @Override // defpackage.r2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(j4.class.getName());
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            if (j4.P) {
                super.g(view, w3Var);
            } else {
                w3 O = w3.O(w3Var);
                super.g(view, O);
                w3Var.w0(view);
                ViewParent C = k3.C(view);
                if (C instanceof View) {
                    w3Var.o0((View) C);
                }
                o(w3Var, O);
                O.Q();
                n(w3Var, (ViewGroup) view);
            }
            w3Var.Z(j4.class.getName());
            w3Var.g0(false);
            w3Var.h0(false);
            w3Var.R(w3.a.e);
            w3Var.R(w3.a.f);
        }

        @Override // defpackage.r2
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (j4.P || j4.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: j4$c */
    /* compiled from: DrawerLayout */
    static final class c extends r2 {
        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            if (!j4.A(view)) {
                w3Var.o0(null);
            }
        }
    }

    /* renamed from: j4$d */
    /* compiled from: DrawerLayout */
    public interface d {
        void d(View view);

        void e(View view);

        void f(int i);

        void h(View view, float f);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4$g */
    /* compiled from: DrawerLayout */
    public class g extends i4.c {
        private final int a;
        private i4 b;
        private final Runnable c = new a();

        /* renamed from: j4$g$a */
        /* compiled from: DrawerLayout */
        class a implements Runnable {
            public a() {
            }

            public void run() {
                g.this.o();
            }
        }

        public g(int i) {
            this.a = i;
        }

        private void n() {
            int i = 3;
            if (this.a == 3) {
                i = 5;
            }
            View n = j4.this.n(i);
            if (n != null) {
                j4.this.f(n);
            }
        }

        @Override // defpackage.i4.c
        public int a(View view, int i, int i2) {
            if (j4.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = j4.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // defpackage.i4.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.i4.c
        public int d(View view) {
            if (j4.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // defpackage.i4.c
        public void f(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = j4.this.n(3);
            } else {
                view = j4.this.n(5);
            }
            if (view != null && j4.this.r(view) == 0) {
                this.b.b(view, i2);
            }
        }

        @Override // defpackage.i4.c
        public boolean g(int i) {
            return false;
        }

        @Override // defpackage.i4.c
        public void h(int i, int i2) {
            j4.this.postDelayed(this.c, 160);
        }

        @Override // defpackage.i4.c
        public void i(View view, int i) {
            ((e) view.getLayoutParams()).c = false;
            n();
        }

        @Override // defpackage.i4.c
        public void j(int i) {
            j4.this.V(this.a, i, this.b.v());
        }

        @Override // defpackage.i4.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (j4.this.c(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (j4.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            j4.this.T(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            j4.this.invalidate();
        }

        @Override // defpackage.i4.c
        public void l(View view, float f, float f2) {
            int i;
            float u = j4.this.u(view);
            int width = view.getWidth();
            if (j4.this.c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = j4.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.M(i, view.getTop());
            j4.this.invalidate();
        }

        @Override // defpackage.i4.c
        public boolean m(View view, int i) {
            return j4.this.E(view) && j4.this.c(view, this.a) && j4.this.r(view) == 0;
        }

        public void o() {
            View view;
            int i;
            int w = this.b.w();
            int i2 = 0;
            boolean z = this.a == 3;
            if (z) {
                view = j4.this.n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + w;
            } else {
                view = j4.this.n(5);
                i = j4.this.getWidth() - w;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && j4.this.r(view) == 0) {
                this.b.O(view, i, view.getTop());
                ((e) view.getLayoutParams()).c = true;
                j4.this.invalidate();
                n();
                j4.this.b();
            }
        }

        public void p() {
            j4.this.removeCallbacks(this.c);
        }

        public void q(i4 i4Var) {
            this.b = i4Var;
        }
    }

    static {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = false;
        }
        Q = z2;
    }

    public j4(Context context) {
        this(context, null);
    }

    public static boolean A(View view) {
        return (k3.u(view) == 4 || k3.u(view) == 2) ? false : true;
    }

    private boolean G(float f2, float f3, View view) {
        if (this.L == null) {
            this.L = new Rect();
        }
        view.getHitRect(this.L);
        return this.L.contains((int) f2, (int) f3);
    }

    private boolean H(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.a.h(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.m(drawable, i2);
        return true;
    }

    private Drawable O() {
        int w2 = k3.w(this);
        if (w2 == 0) {
            Drawable drawable = this.G;
            if (drawable != null) {
                H(drawable, w2);
                return this.G;
            }
        } else {
            Drawable drawable2 = this.H;
            if (drawable2 != null) {
                H(drawable2, w2);
                return this.H;
            }
        }
        return this.I;
    }

    private Drawable P() {
        int w2 = k3.w(this);
        if (w2 == 0) {
            Drawable drawable = this.H;
            if (drawable != null) {
                H(drawable, w2);
                return this.H;
            }
        } else {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                H(drawable2, w2);
                return this.G;
            }
        }
        return this.J;
    }

    private void Q() {
        if (!Q) {
            this.A = O();
            this.B = P();
        }
    }

    private void U(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z2 || E(childAt)) && (!z2 || childAt != view)) {
                k3.q0(childAt, 4);
            } else {
                k3.q0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v2 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v2);
            v2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.M == null) {
                this.M = new Matrix();
            }
            matrix.invert(this.M);
            obtain.transform(this.M);
        }
        return obtain;
    }

    public static String w(int i2) {
        if ((i2 & 3) == 3) {
            return C0201.m82(20554);
        }
        return (i2 & 5) == 5 ? C0201.m82(20555) : Integer.toHexString(i2);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((e) getChildAt(i2).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    public boolean B(View view) {
        return ((e) view.getLayoutParams()).a == 0;
    }

    public boolean C(int i2) {
        View n2 = n(i2);
        if (n2 != null) {
            return D(n2);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((e) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException(C0201.m82(20556) + view + C0201.m82(20557));
    }

    public boolean E(View view) {
        int b2 = u2.b(((e) view.getLayoutParams()).a, k3.w(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean F(View view) {
        if (E(view)) {
            return ((e) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException(C0201.m82(20558) + view + C0201.m82(20559));
    }

    public void I(View view, float f2) {
        float u2 = u(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (u2 * width));
        if (!c(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        T(view, f2);
    }

    public void J(int i2) {
        K(i2, true);
    }

    public void K(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            M(n2, z2);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(20560) + w(i2));
    }

    public void L(View view) {
        M(view, true);
    }

    public void M(View view, boolean z2) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.m) {
                eVar.b = 1.0f;
                eVar.d = 1;
                U(view, true);
            } else if (z2) {
                eVar.d |= 2;
                if (c(view, 3)) {
                    this.g.O(view, 0, view.getTop());
                } else {
                    this.h.O(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                I(view, 1.0f);
                V(eVar.a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException(C0201.m82(20561) + view + C0201.m82(20562));
    }

    public void N(d dVar) {
        List<d> list;
        if (dVar != null && (list = this.w) != null) {
            list.remove(dVar);
        }
    }

    public void R(Object obj, boolean z2) {
        this.E = obj;
        this.F = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void S(int i2, int i3) {
        View n2;
        int b2 = u2.b(i3, k3.w(this));
        if (i3 == 3) {
            this.n = i2;
        } else if (i3 == 5) {
            this.o = i2;
        } else if (i3 == 8388611) {
            this.p = i2;
        } else if (i3 == 8388613) {
            this.q = i2;
        }
        if (i2 != 0) {
            (b2 == 3 ? this.g : this.h).a();
        }
        if (i2 == 1) {
            View n3 = n(b2);
            if (n3 != null) {
                f(n3);
            }
        } else if (i2 == 2 && (n2 = n(b2)) != null) {
            L(n2);
        }
    }

    public void T(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 != eVar.b) {
            eVar.b = f2;
            l(view, f2);
        }
    }

    public void V(int i2, int i3, View view) {
        int z2 = this.g.z();
        int z3 = this.h.z();
        int i4 = 2;
        if (z2 == 1 || z3 == 1) {
            i4 = 1;
        } else if (!(z2 == 2 || z3 == 2)) {
            i4 = 0;
        }
        if (view != null && i3 == 0) {
            float f2 = ((e) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                j(view);
            } else if (f2 == 1.0f) {
                k(view);
            }
        }
        if (i4 != this.k) {
            this.k = i4;
            List<d> list = this.w;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.w.get(size).f(i4);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar != null) {
            if (this.w == null) {
                this.w = new ArrayList();
            }
            this.w.add(dVar);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!E(childAt)) {
                    this.K.add(childAt);
                } else if (D(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.K.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.K.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.K.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (o() != null || E(view)) {
            k3.q0(view, 4);
        } else {
            k3.q0(view, 1);
        }
        if (!P) {
            k3.h0(view, this.a);
        }
    }

    public void b() {
        if (!this.u) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.u = true;
        }
    }

    public boolean c(View view, int i2) {
        return (t(view) & i2) == i2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((e) getChildAt(i2).getLayoutParams()).b);
        }
        this.e = f2;
        boolean m2 = this.g.m(true);
        boolean m3 = this.h.m(true);
        if (m2 || m3) {
            k3.Z(this);
        }
    }

    public void d(int i2) {
        e(i2, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (G(x2, y2, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        int height = getHeight();
        boolean B2 = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (B2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.e;
        if (f2 > 0.0f && B2) {
            int i5 = this.d;
            this.f.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) width, (float) getHeight(), this.f);
        } else if (this.A != null && c(view, 3)) {
            int intrinsicWidth = this.A.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.g.w()), 1.0f));
            this.A.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.A.setAlpha((int) (max * 255.0f));
            this.A.draw(canvas);
        } else if (this.B != null && c(view, 5)) {
            int intrinsicWidth2 = this.B.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.h.w()), 1.0f));
            this.B.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.B.setAlpha((int) (max2 * 255.0f));
            this.B.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i2, boolean z2) {
        View n2 = n(i2);
        if (n2 != null) {
            g(n2, z2);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(20563) + w(i2));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z2) {
        if (E(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.m) {
                eVar.b = 0.0f;
                eVar.d = 0;
            } else if (z2) {
                eVar.d |= 4;
                if (c(view, 3)) {
                    this.g.O(view, -view.getWidth(), view.getTop());
                } else {
                    this.h.O(view, getWidth(), view.getTop());
                }
            } else {
                I(view, 0.0f);
                V(eVar.a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException(C0201.m82(20564) + view + C0201.m82(20565));
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (Q) {
            return this.b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.z;
    }

    public void h() {
        i(false);
    }

    public void i(boolean z2) {
        boolean z3;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (E(childAt) && (!z2 || eVar.c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    z3 = this.g.O(childAt, -width, childAt.getTop());
                } else {
                    z3 = this.h.O(childAt, getWidth(), childAt.getTop());
                }
                z4 |= z3;
                eVar.c = false;
            }
        }
        this.i.p();
        this.j.p();
        if (z4) {
            invalidate();
        }
    }

    public void j(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 1) {
            eVar.d = 0;
            List<d> list = this.w;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.w.get(size).e(view);
                }
            }
            U(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void k(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 0) {
            eVar.d = 1;
            List<d> list = this.w;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.w.get(size).d(view);
                }
            }
            U(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void l(View view, float f2) {
        List<d> list = this.w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.w.get(size).h(view, f2);
            }
        }
    }

    public View n(int i2) {
        int b2 = u2.b(i2, k3.w(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((t(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    public View o() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (this.F && this.z != null) {
            int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.E) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.z.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.z.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View t;
        int actionMasked = motionEvent.getActionMasked();
        boolean N2 = this.g.N(motionEvent) | this.h.N(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.g.d(3)) {
                        this.i.p();
                        this.j.p();
                    }
                }
                z2 = false;
            }
            i(true);
            this.u = false;
            z2 = false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.x = x2;
            this.y = y2;
            z2 = this.e > 0.0f && (t = this.g.t((int) x2, (int) y2)) != null && B(t);
            this.u = false;
        }
        if (N2 || z2 || y() || this.u) {
            return true;
        }
        return false;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !z()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View p2 = p();
        if (p2 != null && r(p2) == 0) {
            h();
        }
        return p2 != null;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        this.l = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i9, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (eVar.b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i10 = i7 - ((int) (eVar.b * f4));
                        f2 = ((float) (i7 - i10)) / f4;
                        i6 = i10;
                    }
                    boolean z3 = f2 != eVar.b;
                    int i11 = eVar.a & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i15 > i12 - i16) {
                                i13 = (i12 - i16) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i13, measuredWidth + i6, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i6, i17, measuredWidth + i6, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i6, (i18 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i18 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z3) {
                        T(childAt, f2);
                    }
                    int i19 = eVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.l = false;
        this.m = false;
    }

    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = C0188.f19;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = C0188.f19;
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(20575));
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.E != null && k3.t(this);
        int w2 = k3.w(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z2) {
                    int b2 = u2.b(eVar.a, w2);
                    if (k3.t(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.E;
                            if (b2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (b2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.E;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (Q) {
                        float r = k3.r(childAt);
                        float f2 = this.b;
                        if (r != f2) {
                            k3.o0(childAt, f2);
                        }
                    }
                    int t = t(childAt) & 7;
                    boolean z5 = t == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.c + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                        i5++;
                        i4 = 0;
                    } else {
                        throw new IllegalStateException(C0201.m82(20566) + w(t) + C0201.m82(20567) + C0201.m82(20568) + C0201.m82(20569) + C0201.m82(20570));
                    }
                } else {
                    throw new IllegalStateException(C0201.m82(20571) + childAt + C0201.m82(20572) + i5 + C0201.m82(20573) + C0201.m82(20574));
                }
            }
            i5++;
            i4 = 0;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View n2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        int i2 = fVar.c;
        if (!(i2 == 0 || (n2 = n(i2)) == null)) {
            L(n2);
        }
        int i3 = fVar.d;
        if (i3 != 3) {
            S(i3, 3);
        }
        int i4 = fVar.e;
        if (i4 != 3) {
            S(i4, 5);
        }
        int i5 = fVar.f;
        if (i5 != 3) {
            S(i5, 8388611);
        }
        int i6 = fVar.g;
        if (i6 != 3) {
            S(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        Q();
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            e eVar = (e) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = eVar.d == 1;
            if (eVar.d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                fVar.c = eVar.a;
            } else {
                i2++;
            }
        }
        fVar.d = this.n;
        fVar.e = this.o;
        fVar.f = this.p;
        fVar.g = this.q;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r(r7) != 2) goto L_0x005e;
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.g.E(motionEvent);
        this.h.E(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z2 = false;
        if (action == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.x = x2;
            this.y = y2;
            this.u = false;
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            View t = this.g.t((int) x3, (int) y3);
            if (t != null && B(t)) {
                float f2 = x3 - this.x;
                float f3 = y3 - this.y;
                int y4 = this.g.y();
                if ((f2 * f2) + (f3 * f3) < ((float) (y4 * y4))) {
                    View o2 = o();
                    if (o2 != null) {
                    }
                }
            }
            z2 = true;
            i(z2);
        } else if (action == 3) {
            i(true);
            this.u = false;
        }
        return true;
    }

    public View p() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt) && F(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i2) {
        int w2 = k3.w(this);
        if (i2 == 3) {
            int i3 = this.n;
            if (i3 != 3) {
                return i3;
            }
            int i4 = w2 == 0 ? this.p : this.q;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.o;
            if (i5 != 3) {
                return i5;
            }
            int i6 = w2 == 0 ? this.q : this.p;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.p;
            if (i7 != 3) {
                return i7;
            }
            int i8 = w2 == 0 ? this.n : this.o;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.q;
            if (i9 != 3) {
                return i9;
            }
            int i10 = w2 == 0 ? this.o : this.n;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (E(view)) {
            return q(((e) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException(C0201.m82(20576) + view + C0201.m82(20577));
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.l) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i2) {
        int b2 = u2.b(i2, k3.w(this));
        if (b2 == 3) {
            return this.C;
        }
        if (b2 == 5) {
            return this.D;
        }
        return null;
    }

    public void setDrawerElevation(float f2) {
        this.b = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E(childAt)) {
                k3.o0(childAt, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.v;
        if (dVar2 != null) {
            N(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.v = dVar;
    }

    public void setDrawerLockMode(int i2) {
        S(i2, 3);
        S(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.d = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.z = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.z = new ColorDrawable(i2);
        invalidate();
    }

    public int t(View view) {
        return u2.b(((e) view.getLayoutParams()).a, k3.w(this));
    }

    public float u(View view) {
        return ((e) view.getLayoutParams()).b;
    }

    public j4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public j4(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new c();
        this.d = -1728053248;
        this.f = new Paint();
        this.m = true;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.i = new g(3);
        this.j = new g(5);
        i4 n2 = i4.n(this, 1.0f, this.i);
        this.g = n2;
        n2.K(1);
        this.g.L(f3);
        this.i.q(this.g);
        i4 n3 = i4.n(this, 1.0f, this.j);
        this.h = n3;
        n3.K(2);
        this.h.L(f3);
        this.j.q(this.h);
        setFocusableInTouchMode(true);
        k3.q0(this, 1);
        k3.h0(this, new b());
        setMotionEventSplittingEnabled(false);
        if (k3.t(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(N);
                try {
                    this.z = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.z = null;
            }
        }
        this.b = f2 * 10.0f;
        this.K = new ArrayList<>();
    }

    public void setStatusBarBackground(int i2) {
        this.z = i2 != 0 ? androidx.core.content.b.f(getContext(), i2) : null;
        invalidate();
    }

    /* renamed from: j4$e */
    /* compiled from: DrawerLayout */
    public static class e extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.O);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public e(int i, int i2, int i3) {
            this(i, i2);
            this.a = i3;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.a = 0;
            this.a = eVar.a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j4$f */
    /* compiled from: DrawerLayout */
    public static class f extends f4 {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public int c = 0;
        public int d;
        public int e;
        public int f;
        public int g;

        /* renamed from: j4$f$a */
        /* compiled from: DrawerLayout */
        static class a implements Parcelable.ClassLoaderCreator<f> {
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
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
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
