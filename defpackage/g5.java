package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import vigqyno.C0201;

/* renamed from: g5  reason: default package */
/* compiled from: SwipeRefreshLayout */
public class g5 extends ViewGroup implements d3, c3, a3, e3 {
    private static final String T = g5.class.getSimpleName();
    private static final int[] U = {16842766};
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public f5 F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    private Animation K;
    public boolean L;
    private int M;
    public boolean N;
    private i O;
    private boolean P;
    private Animation.AnimationListener Q;
    private final Animation R;
    private final Animation S;
    private View a;
    public j b;
    public boolean c;
    private int d;
    private float e;
    private float f;
    private final f3 g;
    private final b3 h;
    private final int[] i;
    private final int[] j;
    private final int[] k;
    private boolean l;
    private int m;
    public int n;
    private float o;
    private float p;
    private boolean q;
    private int u;
    public boolean v;
    private boolean w;
    private final DecelerateInterpolator x;
    public e5 y;
    private int z;

    /* renamed from: g5$a */
    /* compiled from: SwipeRefreshLayout */
    class a implements Animation.AnimationListener {
        public a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            g5 g5Var = g5.this;
            if (g5Var.c) {
                g5Var.F.setAlpha(255);
                g5.this.F.start();
                g5 g5Var2 = g5.this;
                if (g5Var2.L && (jVar = g5Var2.b) != null) {
                    jVar.a();
                }
                g5 g5Var3 = g5.this;
                g5Var3.n = g5Var3.y.getTop();
                return;
            }
            g5Var.r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g5$b */
    /* compiled from: SwipeRefreshLayout */
    public class b extends Animation {
        public b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            g5.this.setAnimationProgress(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g5$c */
    /* compiled from: SwipeRefreshLayout */
    public class c extends Animation {
        public c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            g5.this.setAnimationProgress(1.0f - f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g5$d */
    /* compiled from: SwipeRefreshLayout */
    public class d extends Animation {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            f5 f5Var = g5.this.F;
            int i = this.a;
            f5Var.setAlpha((int) (((float) i) + (((float) (this.b - i)) * f)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g5$e */
    /* compiled from: SwipeRefreshLayout */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        public void onAnimationEnd(Animation animation) {
            g5 g5Var = g5.this;
            if (!g5Var.v) {
                g5Var.y(null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: g5$f */
    /* compiled from: SwipeRefreshLayout */
    class f extends Animation {
        public f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            g5 g5Var = g5.this;
            if (!g5Var.N) {
                i = g5Var.D - Math.abs(g5Var.C);
            } else {
                i = g5Var.D;
            }
            g5 g5Var2 = g5.this;
            int i2 = g5Var2.A;
            g5.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - g5Var2.y.getTop());
            g5.this.F.e(1.0f - f);
        }
    }

    /* renamed from: g5$g */
    /* compiled from: SwipeRefreshLayout */
    class g extends Animation {
        public g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            g5.this.p(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g5$h */
    /* compiled from: SwipeRefreshLayout */
    public class h extends Animation {
        public h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            g5 g5Var = g5.this;
            float f2 = g5Var.B;
            g5Var.setAnimationProgress(f2 + ((-f2) * f));
            g5.this.p(f);
        }
    }

    /* renamed from: g5$i */
    /* compiled from: SwipeRefreshLayout */
    public interface i {
        boolean a(g5 g5Var, View view);
    }

    /* renamed from: g5$j */
    /* compiled from: SwipeRefreshLayout */
    public interface j {
        void a();
    }

    public g5(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.y.setVisibility(0);
        this.F.setAlpha(255);
        b bVar = new b();
        this.G = bVar;
        bVar.setDuration((long) this.m);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.G);
    }

    private void a(int i2, Animation.AnimationListener animationListener) {
        this.A = i2;
        this.R.reset();
        this.R.setDuration(200);
        this.R.setInterpolator(this.x);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.R);
    }

    private void b(int i2, Animation.AnimationListener animationListener) {
        if (this.v) {
            z(i2, animationListener);
            return;
        }
        this.A = i2;
        this.S.reset();
        this.S.setDuration(200);
        this.S.setInterpolator(this.x);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.S);
    }

    private void d() {
        this.y = new e5(getContext());
        f5 f5Var = new f5(getContext());
        this.F = f5Var;
        f5Var.l(1);
        this.y.setImageDrawable(this.F);
        this.y.setVisibility(8);
        addView(this.y);
    }

    private void f() {
        if (this.a == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.y)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f2) {
        if (f2 > this.e) {
            t(true, true);
            return;
        }
        this.c = false;
        this.F.j(0.0f, 0.0f);
        e eVar = null;
        if (!this.v) {
            eVar = new e();
        }
        b(this.n, eVar);
        this.F.d(false);
    }

    private boolean h(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void i(float f2) {
        this.F.d(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.e));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (((float) Math.max(d2 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.e;
        int i2 = this.E;
        if (i2 <= 0) {
            if (this.N) {
                i2 = this.D - this.C;
            } else {
                i2 = this.D;
            }
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.C + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        if (!this.v) {
            this.y.setScaleX(1.0f);
            this.y.setScaleY(1.0f);
        }
        if (this.v) {
            setAnimationProgress(Math.min(1.0f, f2 / this.e));
        }
        if (f2 < this.e) {
            if (this.F.getAlpha() > 76 && !h(this.I)) {
                x();
            }
        } else if (this.F.getAlpha() < 255 && !h(this.J)) {
            w();
        }
        this.F.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.F.e(Math.min(1.0f, max));
        this.F.g((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.u) {
            this.u = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i2) {
        this.y.getBackground().setAlpha(i2);
        this.F.setAlpha(i2);
    }

    private void t(boolean z2, boolean z3) {
        if (this.c != z2) {
            this.L = z3;
            f();
            this.c = z2;
            if (z2) {
                a(this.n, this.Q);
            } else {
                y(this.Q);
            }
        }
    }

    private Animation u(int i2, int i3) {
        d dVar = new d(i2, i3);
        dVar.setDuration(300);
        this.y.b(null);
        this.y.clearAnimation();
        this.y.startAnimation(dVar);
        return dVar;
    }

    private void v(float f2) {
        float f3 = this.p;
        int i2 = this.d;
        if (f2 - f3 > ((float) i2) && !this.q) {
            this.o = f3 + ((float) i2);
            this.q = true;
            this.F.setAlpha(76);
        }
    }

    private void w() {
        this.J = u(this.F.getAlpha(), 255);
    }

    private void x() {
        this.I = u(this.F.getAlpha(), 76);
    }

    private void z(int i2, Animation.AnimationListener animationListener) {
        this.A = i2;
        this.B = this.y.getScaleX();
        h hVar = new h();
        this.K = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.y.b(animationListener);
        }
        this.y.clearAnimation();
        this.y.startAnimation(this.K);
    }

    public boolean c() {
        i iVar = this.O;
        if (iVar != null) {
            return iVar.a(this, this.a);
        }
        View view = this.a;
        if (view instanceof ListView) {
            return androidx.core.widget.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.h.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.h.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.h.c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.h.f(i2, i3, i4, i5, iArr);
    }

    public void e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        if (i6 == 0) {
            this.h.e(i2, i3, i4, i5, iArr, i6, iArr2);
        }
    }

    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.z;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        return i3 >= i4 ? i3 + 1 : i3;
    }

    public int getNestedScrollAxes() {
        return this.g.a();
    }

    public int getProgressCircleDiameter() {
        return this.M;
    }

    public int getProgressViewEndOffset() {
        return this.D;
    }

    public int getProgressViewStartOffset() {
        return this.C;
    }

    public boolean hasNestedScrollingParent() {
        return this.h.k();
    }

    @Override // defpackage.a3
    public boolean isNestedScrollingEnabled() {
        return this.h.m();
    }

    @Override // defpackage.d3
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            int i7 = iArr[1];
            e(i2, i3, i4, i5, this.j, i6, iArr);
            int i8 = i5 - (iArr[1] - i7);
            int i9 = i8 == 0 ? i5 + this.j[1] : i8;
            if (i9 < 0 && !c()) {
                float abs = this.f + ((float) Math.abs(i9));
                this.f = abs;
                i(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    @Override // defpackage.c3
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        j(view, i2, i3, i4, i5, i6, this.k);
    }

    @Override // defpackage.c3
    public boolean l(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i2);
        }
        return false;
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

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.w && actionMasked == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || c() || this.c || this.l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.u;
                    if (i2 == -1) {
                        Log.e(T, C0201.m82(13522));
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.q = false;
            this.u = -1;
        } else {
            setTargetOffsetTopAndBottom(this.C - this.y.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.u = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.p = motionEvent.getY(findPointerIndex2);
        }
        return this.q;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.a == null) {
                f();
            }
            View view = this.a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.y.getMeasuredWidth();
                int measuredHeight2 = this.y.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.n;
                this.y.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.a == null) {
            f();
        }
        View view = this.a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.y.measure(View.MeasureSpec.makeMeasureSpec(this.M, 1073741824), View.MeasureSpec.makeMeasureSpec(this.M, 1073741824));
            this.z = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.y) {
                    this.z = i4;
                    return;
                }
            }
        }
    }

    @Override // defpackage.e3
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // defpackage.e3
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // defpackage.e3
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.f;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f = 0.0f;
                } else {
                    this.f = f2 - f3;
                    iArr[1] = i3;
                }
                i(this.f);
            }
        }
        if (this.N && i3 > 0 && this.f == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.y.setVisibility(8);
        }
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // defpackage.e3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        j(view, i2, i3, i4, i5, 0, this.k);
    }

    @Override // defpackage.e3
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.g.b(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.f = 0.0f;
        this.l = true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.a);
    }

    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.c);
    }

    @Override // defpackage.e3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return isEnabled() && !this.w && !this.c && (i2 & 2) != 0;
    }

    @Override // defpackage.e3
    public void onStopNestedScroll(View view) {
        this.g.d(view);
        this.l = false;
        float f2 = this.f;
        if (f2 > 0.0f) {
            g(f2);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.w && actionMasked == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || c() || this.c || this.l) {
            return false;
        }
        if (actionMasked == 0) {
            this.u = motionEvent.getPointerId(0);
            this.q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.u);
            if (findPointerIndex < 0) {
                Log.e(T, C0201.m82(13525));
                return false;
            }
            if (this.q) {
                this.q = false;
                g((motionEvent.getY(findPointerIndex) - this.o) * 0.5f);
            }
            this.u = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.u);
            if (findPointerIndex2 < 0) {
                Log.e(T, C0201.m82(13524));
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            v(y2);
            if (this.q) {
                float f2 = (y2 - this.o) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                i(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(T, C0201.m82(13523));
                    return false;
                }
                this.u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    public void p(float f2) {
        int i2 = this.A;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.C - i2)) * f2))) - this.y.getTop());
    }

    public void r() {
        this.y.clearAnimation();
        this.F.stop();
        this.y.setVisibility(8);
        setColorViewAlpha(255);
        if (this.v) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.C - this.n);
        }
        this.n = this.y.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        ViewParent parent;
        View view;
        if ((Build.VERSION.SDK_INT >= 21 || !(this.a instanceof AbsListView)) && ((view = this.a) == null || k3.P(view))) {
            super.requestDisallowInterceptTouchEvent(z2);
        } else if (!this.P && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void s(boolean z2, int i2, int i3) {
        this.v = z2;
        this.C = i2;
        this.D = i3;
        this.N = true;
        r();
        this.c = false;
    }

    public void setAnimationProgress(float f2) {
        this.y.setScaleX(f2);
        this.y.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.F.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.b.d(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.e = (float) i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            r();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z2) {
        this.P = z2;
    }

    @Override // defpackage.a3
    public void setNestedScrollingEnabled(boolean z2) {
        this.h.n(z2);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.O = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.y.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.d(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        int i2;
        if (!z2 || this.c == z2) {
            t(z2, false);
            return;
        }
        this.c = z2;
        if (!this.N) {
            i2 = this.D + this.C;
        } else {
            i2 = this.D;
        }
        setTargetOffsetTopAndBottom(i2 - this.n);
        this.L = false;
        A(this.Q);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.M = (int) (displayMetrics.density * 56.0f);
            } else {
                this.M = (int) (displayMetrics.density * 40.0f);
            }
            this.y.setImageDrawable(null);
            this.F.l(i2);
            this.y.setImageDrawable(this.F);
        }
    }

    public void setSlingshotDistance(int i2) {
        this.E = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        this.y.bringToFront();
        k3.U(this.y, i2);
        this.n = this.y.getTop();
    }

    public boolean startNestedScroll(int i2) {
        return this.h.p(i2);
    }

    @Override // defpackage.a3
    public void stopNestedScroll() {
        this.h.r();
    }

    public void y(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.H = cVar;
        cVar.setDuration(150);
        this.y.b(animationListener);
        this.y.clearAnimation();
        this.y.startAnimation(this.H);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g5$k */
    /* compiled from: SwipeRefreshLayout */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public final boolean a;

        /* renamed from: g5$k$a */
        /* compiled from: SwipeRefreshLayout */
        class a implements Parcelable.Creator<k> {
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }
    }

    public g5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.u = -1;
        this.z = -1;
        this.Q = new a();
        this.R = new f();
        this.S = new g();
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.M = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.D = i2;
        this.e = (float) i2;
        this.g = new f3(this);
        this.h = new b3(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.M;
        this.n = i3;
        this.C = i3;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
