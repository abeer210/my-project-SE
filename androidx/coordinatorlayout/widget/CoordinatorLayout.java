package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class CoordinatorLayout extends ViewGroup implements c3, d3 {
    public static final Comparator<View> A;
    private static final androidx.core.util.e<Rect> B = new androidx.core.util.f(12);
    public static final String x;
    public static final Class<?>[] y = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> z = new ThreadLocal<>();
    private final List<View> a;
    private final a<View> b;
    private final List<View> c;
    private final List<View> d;
    private Paint e;
    private final int[] f;
    private final int[] g;
    private boolean h;
    private boolean i;
    private int[] j;
    private View k;
    private View l;
    private g m;
    private boolean n;
    private t3 o;
    private boolean p;
    private Drawable q;
    public ViewGroup.OnHierarchyChangeListener u;
    private g3 v;
    private final f3 w;

    /* access modifiers changed from: package-private */
    public class a implements g3 {
        public a() {
        }

        @Override // defpackage.g3
        public t3 a(View view, t3 t3Var) {
            return CoordinatorLayout.this.b0(t3Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                B(coordinatorLayout, v, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public t3 f(CoordinatorLayout coordinatorLayout, V v, t3 t3Var) {
            return t3Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                u(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            float G = k3.G(view);
            float G2 = k3.G(view2);
            if (G > G2) {
                return -1;
            }
            return G < G2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        x = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            A = new i();
        } else {
            A = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void A(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5;
        int i6;
        int b2 = u2.b(W(fVar.c), i2);
        int b3 = u2.b(X(fVar.d), i2);
        int i7 = b2 & 7;
        int i8 = b2 & 112;
        int i9 = b3 & 7;
        int i10 = b3 & 112;
        if (i9 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i10 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i7 == 1) {
            i5 -= i3 / 2;
        } else if (i7 != 5) {
            i5 -= i3;
        }
        if (i8 == 16) {
            i6 -= i4 / 2;
        } else if (i8 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    private int B(int i2) {
        int[] iArr = this.j;
        String r2 = C0201.m82(18478);
        if (iArr == null) {
            Log.e(r2, C0201.m82(18479) + this + C0201.m82(18480) + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e(r2, C0201.m82(18481) + i2 + C0201.m82(18482) + this);
            return 0;
        }
    }

    private void E(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean F(View view) {
        return this.b.j(view);
    }

    private void H(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect e2 = e();
        e2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.o != null && k3.t(this) && !k3.t(view)) {
            e2.left += this.o.b();
            e2.top += this.o.d();
            e2.right -= this.o.c();
            e2.bottom -= this.o.a();
        }
        Rect e3 = e();
        u2.a(X(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), e2, e3, i2);
        view.layout(e3.left, e3.top, e3.right, e3.bottom);
        T(e2);
        T(e3);
    }

    private void I(View view, View view2, int i2) {
        Rect e2 = e();
        Rect e3 = e();
        try {
            y(view2, e2);
            z(view, i2, e2, e3);
            view.layout(e3.left, e3.top, e3.right, e3.bottom);
        } finally {
            T(e2);
            T(e3);
        }
    }

    private void J(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int b2 = u2.b(Y(fVar.c), i3);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int B2 = B(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            B2 += measuredWidth / 2;
        } else if (i4 == 5) {
            B2 += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(B2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void K(View view, Rect rect, int i2) {
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (k3.O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            Rect e2 = e();
            Rect e3 = e();
            e3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 == null || !f2.b(this, view, e2)) {
                e2.set(e3);
            } else if (!e3.contains(e2)) {
                throw new IllegalArgumentException(C0201.m82(18483) + e2.toShortString() + C0201.m82(18484) + e3.toShortString());
            }
            T(e3);
            if (e2.isEmpty()) {
                T(e2);
                return;
            }
            int b2 = u2.b(fVar.h, i2);
            boolean z4 = true;
            if ((b2 & 48) != 48 || (i7 = (e2.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.j) >= (i8 = rect.top)) {
                z2 = false;
            } else {
                a0(view, i8 - i7);
                z2 = true;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - e2.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.j) < (i6 = rect.bottom)) {
                a0(view, height - i6);
                z2 = true;
            }
            if (!z2) {
                a0(view, 0);
            }
            if ((b2 & 3) != 3 || (i4 = (e2.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.i) >= (i5 = rect.left)) {
                z3 = false;
            } else {
                Z(view, i5 - i4);
                z3 = true;
            }
            if ((b2 & 5) != 5 || (width = ((getWidth() - e2.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.i) >= (i3 = rect.right)) {
                z4 = z3;
            } else {
                Z(view, width - i3);
            }
            if (!z4) {
                Z(view, 0);
            }
            T(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static c P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(C0201.m82(18485))) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(x)) {
            str = x + '.' + str;
        }
        try {
            Map<String, Constructor<c>> map = z.get();
            if (map == null) {
                map = new HashMap<>();
                z.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(y);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException(C0201.m82(18486) + str, e2);
        }
    }

    private boolean Q(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.c;
        E(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && f2 != null) {
                    if (i2 == 0) {
                        z2 = f2.k(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z2 = f2.D(this, view, motionEvent);
                    }
                    if (z2) {
                        this.k = view;
                    }
                }
                boolean c2 = fVar.c();
                boolean i4 = fVar.i(this, view);
                z3 = i4 && !c2;
                if (i4 && !z3) {
                    break;
                }
            } else if (f2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f2.k(this, view, motionEvent2);
                } else if (i2 == 1) {
                    f2.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    private void R() {
        this.a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f D = D(childAt);
            D.d(this, childAt);
            this.b.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (D.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.a.addAll(this.b.i());
        Collections.reverse(this.a);
    }

    private static void T(Rect rect) {
        rect.setEmpty();
        B.a(rect);
    }

    private void V(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    f2.k(this, childAt, obtain);
                } else {
                    f2.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.k = null;
        this.h = false;
    }

    private static int W(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int X(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int Y(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void Z(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            k3.T(view, i2 - i3);
            fVar.i = i2;
        }
    }

    private void a0(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            k3.U(view, i2 - i3);
            fVar.j = i2;
        }
    }

    private void c0() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (k3.t(this)) {
                if (this.v == null) {
                    this.v = new a();
                }
                k3.t0(this, this.v);
                setSystemUiVisibility(1280);
                return;
            }
            k3.t0(this, null);
        }
    }

    private static Rect e() {
        Rect b2 = B.b();
        return b2 == null ? new Rect() : b2;
    }

    private static int h(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void i(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private t3 p(t3 t3Var) {
        c f2;
        if (t3Var.e()) {
            return t3Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (k3.t(childAt) && (f2 = ((f) childAt.getLayoutParams()).f()) != null) {
                t3Var = f2.f(this, childAt, t3Var);
                if (t3Var.e()) {
                    break;
                }
            }
        }
        return t3Var;
    }

    public void C(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    public f D(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            boolean z2 = view instanceof b;
            String r2 = C0201.m82(18487);
            if (z2) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(r2, C0201.m82(18488));
                }
                fVar.o(behavior);
                fVar.b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e(r2, C0201.m82(18489) + dVar.value().getName() + C0201.m82(18490), e2);
                    }
                }
                fVar.b = true;
            }
        }
        return fVar;
    }

    public boolean G(View view, int i2, int i3) {
        Rect e2 = e();
        y(view, e2);
        try {
            return e2.contains(i2, i3);
        } finally {
            T(e2);
        }
    }

    public void L(View view, int i2) {
        c f2;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect e2 = e();
            Rect e3 = e();
            Rect e4 = e();
            y(fVar.k, e2);
            boolean z2 = false;
            v(view, false, e3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            A(view, i2, e2, e4, fVar, measuredWidth, measuredHeight);
            if (!(e4.left == e3.left && e4.top == e3.top)) {
                z2 = true;
            }
            i(fVar, e4, measuredWidth, measuredHeight);
            int i3 = e4.left - e3.left;
            int i4 = e4.top - e3.top;
            if (i3 != 0) {
                k3.T(view, i3);
            }
            if (i4 != 0) {
                k3.U(view, i4);
            }
            if (z2 && (f2 = fVar.f()) != null) {
                f2.h(this, view, fVar.k);
            }
            T(e2);
            T(e3);
            T(e4);
        }
    }

    public final void M(int i2) {
        boolean z2;
        int w2 = k3.w(this);
        int size = this.a.size();
        Rect e2 = e();
        Rect e3 = e();
        Rect e4 = e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.a.get(i3);
            f fVar = (f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.l == this.a.get(i4)) {
                        L(view, w2);
                    }
                }
                v(view, true, e3);
                if (fVar.g != 0 && !e3.isEmpty()) {
                    int b2 = u2.b(fVar.g, w2);
                    int i5 = b2 & 112;
                    if (i5 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i5 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    int i6 = b2 & 7;
                    if (i6 == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (i6 == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    K(view, e2, w2);
                }
                if (i2 != 2) {
                    C(view, e4);
                    if (!e4.equals(e3)) {
                        S(view, e3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.a.get(i7);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f2 = fVar2.f();
                    if (f2 != null && f2.e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.g()) {
                            if (i2 != 2) {
                                z2 = f2.h(this, view2, view);
                            } else {
                                f2.i(this, view2, view);
                                z2 = true;
                            }
                            if (i2 == 1) {
                                fVar2.p(z2);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        T(e2);
        T(e3);
        T(e4);
    }

    public void N(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.k;
            if (view2 != null) {
                I(view, view2, i2);
                return;
            }
            int i3 = fVar.e;
            if (i3 >= 0) {
                J(view, i3, i2);
            } else {
                H(view, i2);
            }
        } else {
            throw new IllegalStateException(C0201.m82(18491));
        }
    }

    public void O(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void S(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void U() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    public final t3 b0(t3 t3Var) {
        if (androidx.core.util.c.a(this.o, t3Var)) {
            return t3Var;
        }
        this.o = t3Var;
        boolean z2 = true;
        boolean z3 = t3Var != null && t3Var.d() > 0;
        this.p = z3;
        if (z3 || getBackground() != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        t3 p2 = p(t3Var);
        requestLayout();
        return p2;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float d2 = cVar.d(this, view);
            if (d2 > 0.0f) {
                if (this.e == null) {
                    this.e = new Paint();
                }
                this.e.setColor(fVar.a.c(this, view));
                this.e.setAlpha(h(Math.round(d2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public void g() {
        if (this.i) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    public final List<View> getDependencySortedChildren() {
        R();
        return Collections.unmodifiableList(this.a);
    }

    public final t3 getLastWindowInsets() {
        return this.o;
    }

    public int getNestedScrollAxes() {
        return this.w.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.d3
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c f2;
        int i7;
        int i8;
        int childCount = getChildCount();
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i6) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.t(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f;
                    if (i4 > 0) {
                        i7 = Math.max(i9, iArr3[0]);
                    } else {
                        i7 = Math.min(i9, iArr3[0]);
                    }
                    i9 = i7;
                    if (i5 > 0) {
                        i8 = Math.max(i10, this.f[1]);
                    } else {
                        i8 = Math.min(i10, this.f[1]);
                    }
                    i10 = i8;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z2) {
            M(1);
        }
    }

    @Override // defpackage.c3
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        j(view, i2, i3, i4, i5, 0, this.g);
    }

    @Override // defpackage.c3
    public boolean l(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f2 = fVar.f();
                if (f2 != null) {
                    boolean A2 = f2.A(this, childAt, view, view2, i2, i3);
                    z2 |= A2;
                    fVar.r(i3, A2);
                } else {
                    fVar.r(i3, false);
                }
            }
        }
        return z2;
    }

    @Override // defpackage.c3
    public void m(View view, View view2, int i2, int i3) {
        c f2;
        this.w.c(view, view2, i2, i3);
        this.l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i3) && (f2 = fVar.f()) != null) {
                f2.v(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // defpackage.c3
    public void n(View view, int i2) {
        this.w.e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2)) {
                c f2 = fVar.f();
                if (f2 != null) {
                    f2.C(this, childAt, view, i2);
                }
                fVar.l(i2);
                fVar.k();
            }
        }
        this.l = null;
    }

    @Override // defpackage.c3
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        c f2;
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i4) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.q(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr3[0]);
                    } else {
                        i5 = Math.min(i7, iArr3[0]);
                    }
                    i7 = i5;
                    int[] iArr4 = this.f;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr4[1]);
                    } else {
                        i6 = Math.min(i8, iArr4[1]);
                    }
                    i8 = i6;
                    z2 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z2) {
            M(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && k3.t(this)) {
            k3.f0(this);
        }
        this.i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p && this.q != null) {
            t3 t3Var = this.o;
            int d2 = t3Var != null ? t3Var.d() : 0;
            if (d2 > 0) {
                this.q.setBounds(0, 0, getWidth(), d2);
                this.q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean Q = Q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            V(true);
        }
        return Q;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c f2;
        int w2 = k3.w(this);
        int size = this.a.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.a.get(i6);
            if (view.getVisibility() != 8 && ((f2 = ((f) view.getLayoutParams()).f()) == null || !f2.l(this, view, w2))) {
                N(view, w2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c f2;
        int i11;
        f fVar;
        int i12;
        int i13;
        R();
        r();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int w2 = k3.w(this);
        boolean z2 = w2 == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i14 = paddingLeft + paddingRight;
        int i15 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z3 = this.o != null && k3.t(this);
        int size3 = this.a.size();
        int i16 = suggestedMinimumWidth;
        int i17 = suggestedMinimumHeight;
        int i18 = 0;
        int i19 = 0;
        while (i19 < size3) {
            View view = this.a.get(i19);
            if (view.getVisibility() == 8) {
                i6 = i19;
                i4 = size3;
                i5 = paddingLeft;
            } else {
                f fVar2 = (f) view.getLayoutParams();
                int i20 = fVar2.e;
                if (i20 < 0 || mode == 0) {
                    i7 = i18;
                } else {
                    int B2 = B(i20);
                    int b2 = u2.b(Y(fVar2.c), w2) & 7;
                    i7 = i18;
                    if ((b2 == 3 && !z2) || (b2 == 5 && z2)) {
                        i8 = Math.max(0, (size - paddingRight) - B2);
                        if (z3) {
                        }
                        i10 = i2;
                        i9 = i3;
                        f2 = fVar2.f();
                        if (f2 != null) {
                        }
                        O(view, i10, i8, i9, 0);
                        int max = Math.max(i13, i14 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int max2 = Math.max(i11, i15 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i18 = View.combineMeasuredStates(i12, view.getMeasuredState());
                        i16 = max;
                        i17 = max2;
                    } else if ((b2 == 5 && !z2) || (b2 == 3 && z2)) {
                        i8 = Math.max(0, B2 - paddingLeft);
                        if (z3 || k3.t(view)) {
                            i10 = i2;
                            i9 = i3;
                        } else {
                            i10 = View.MeasureSpec.makeMeasureSpec(size - (this.o.b() + this.o.c()), mode);
                            i9 = View.MeasureSpec.makeMeasureSpec(size2 - (this.o.d() + this.o.a()), mode2);
                        }
                        f2 = fVar2.f();
                        if (f2 != null) {
                            fVar = fVar2;
                            i12 = i7;
                            i6 = i19;
                            i11 = i17;
                            i5 = paddingLeft;
                            i13 = i16;
                            i4 = size3;
                        } else {
                            fVar = fVar2;
                            i11 = i17;
                            i4 = size3;
                            i5 = paddingLeft;
                            i12 = i7;
                            i6 = i19;
                            i13 = i16;
                        }
                        O(view, i10, i8, i9, 0);
                        int max3 = Math.max(i13, i14 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int max22 = Math.max(i11, i15 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i18 = View.combineMeasuredStates(i12, view.getMeasuredState());
                        i16 = max3;
                        i17 = max22;
                    }
                }
                i8 = 0;
                if (z3) {
                }
                i10 = i2;
                i9 = i3;
                f2 = fVar2.f();
                if (f2 != null) {
                }
                O(view, i10, i8, i9, 0);
                int max32 = Math.max(i13, i14 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max222 = Math.max(i11, i15 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i18 = View.combineMeasuredStates(i12, view.getMeasuredState());
                i16 = max32;
                i17 = max222;
            }
            i19 = i6 + 1;
            paddingLeft = i5;
            size3 = i4;
        }
        setMeasuredDimension(View.resolveSizeAndState(i16, i2, -16777216 & i18), View.resolveSizeAndState(i17, i3, i18 << 16));
    }

    @Override // defpackage.e3
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c f4;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z3 |= f4.n(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (z3) {
            M(1);
        }
        return z3;
    }

    @Override // defpackage.e3
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    z2 |= f4.o(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    @Override // defpackage.e3
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // defpackage.e3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        k(view, i2, i3, i4, i5, 0);
    }

    @Override // defpackage.e3
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = D(childAt).f();
            if (!(id == -1 || f2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f2.x(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable y2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (!(id == -1 || f2 == null || (y2 = f2.y(this, childAt)) == null)) {
                sparseArray.append(id, y2);
            }
        }
        hVar.c = sparseArray;
        return hVar;
    }

    @Override // defpackage.e3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    @Override // defpackage.e3
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.k == null) {
            z3 = Q(motionEvent, 1);
        } else {
            z3 = false;
        }
        c f2 = ((f) this.k.getLayoutParams()).f();
        if (f2 != null) {
            z2 = f2.D(this, this.k, motionEvent);
            motionEvent2 = null;
            if (this.k != null) {
                z2 |= super.onTouchEvent(motionEvent);
            } else if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 || actionMasked == 3) {
                V(false);
            }
            return z2;
        }
        z2 = false;
        motionEvent2 = null;
        if (this.k != null) {
        }
        if (motionEvent2 != null) {
        }
        V(false);
        return z2;
    }

    public void q(View view) {
        List g2 = this.b.g(view);
        if (!(g2 == null || g2.isEmpty())) {
            for (int i2 = 0; i2 < g2.size(); i2++) {
                View view2 = (View) g2.get(i2);
                c f2 = ((f) view2.getLayoutParams()).f();
                if (f2 != null) {
                    f2.h(this, view2, view);
                }
            }
        }
    }

    public void r() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (F(getChildAt(i2))) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (z2 == this.n) {
            return;
        }
        if (z2) {
            g();
        } else {
            U();
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c f2 = ((f) view.getLayoutParams()).f();
        if (f2 == null || !f2.w(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.h) {
            V(false);
            this.h = true;
        }
    }

    /* renamed from: s */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        c0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
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
            k3.Z(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? androidx.core.content.b.f(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z2) {
            this.q.setVisible(z2, false);
        }
    }

    /* renamed from: t */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* renamed from: u */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public void v(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public List<View> w(View view) {
        List<View> h2 = this.b.h(view);
        this.d.clear();
        if (h2 != null) {
            this.d.addAll(h2);
        }
        return this.d;
    }

    public List<View> x(View view) {
        List g2 = this.b.g(view);
        this.d.clear();
        if (g2 != null) {
            this.d.addAll(g2);
        }
        return this.d;
    }

    public void y(View view, Rect rect) {
        b.a(this, view, rect);
    }

    public void z(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        i(fVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z0.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        this.a = new ArrayList();
        this.b = new a<>();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.w = new f3(this);
        if (i2 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, b1.CoordinatorLayout, 0, a1.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, b1.CoordinatorLayout, i2, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, b1.CoordinatorLayout, attributeSet, typedArray, 0, a1.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, b1.CoordinatorLayout, attributeSet, typedArray, i2, 0);
            }
        }
        int resourceId = typedArray.getResourceId(b1.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.j;
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.q = typedArray.getDrawable(b1.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        c0();
        super.setOnHierarchyChangeListener(new e());
        if (k3.u(this) == 0) {
            k3.q0(this, 1);
        }
    }

    /* access modifiers changed from: protected */
    public static class h extends f4 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public SparseArray<Parcelable> c;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.c.keyAt(i2);
                parcelableArr[i2] = this.c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        public int f = -1;
        public int g = 0;
        public int h = 0;
        public int i;
        public int j;
        public View k;
        public View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        public final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        } else {
                            throw new IllegalStateException(C0201.m82(13385));
                        }
                    }
                    this.l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                } else {
                    throw new IllegalStateException(C0201.m82(13384));
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
            } else {
                throw new IllegalStateException(C0201.m82(13386) + coordinatorLayout.getResources().getResourceName(this.f) + C0201.m82(13387) + view);
            }
        }

        private boolean s(View view, int i2) {
            int b2 = u2.b(((f) view.getLayoutParams()).g, i2);
            return b2 != 0 && (u2.b(this.h, i2) & b2) == b2;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.l = view2;
            return true;
        }

        public boolean a() {
            return this.k == null && this.f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.l || s(view2, k3.w(coordinatorLayout)) || ((cVar = this.a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f;
        }

        public c f() {
            return this.a;
        }

        public boolean g() {
            return this.p;
        }

        public Rect h() {
            return this.q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean a2 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.m = a2;
            return a2;
        }

        public boolean j(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        public void k() {
            this.p = false;
        }

        public void l(int i2) {
            r(i2, false);
        }

        public void m() {
            this.m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        public void p(boolean z) {
            this.p = z;
        }

        public void q(Rect rect) {
            this.q.set(rect);
        }

        public void r(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b1.CoordinatorLayout_Layout);
            this.c = obtainStyledAttributes.getInteger(b1.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(b1.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = obtainStyledAttributes.getInteger(b1.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(b1.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(b1.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(b1.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(b1.CoordinatorLayout_Layout_layout_behavior);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.P(context, attributeSet, obtainStyledAttributes.getString(b1.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
