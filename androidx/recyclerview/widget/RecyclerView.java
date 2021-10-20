package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import defpackage.w3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public class RecyclerView extends ViewGroup implements a3 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    public static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 0;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = 0;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = 0;
    public static final int INVALID_TYPE = 0;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 0;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = 0;
    public static final int NO_POSITION = 0;
    public static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 0;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 0;
    public static final String TAG = null;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 0;
    public static final String TRACE_BIND_VIEW_TAG = null;
    public static final String TRACE_CREATE_VIEW_TAG = null;
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = null;
    public static final String TRACE_NESTED_PREFETCH_TAG = null;
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = null;
    private static final String TRACE_ON_LAYOUT_TAG = null;
    public static final String TRACE_PREFETCH_TAG = null;
    public static final String TRACE_SCROLL_TAG = null;
    public static final int UNDEFINED_DURATION = 0;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 0;
    public static final Interpolator sQuinticInterpolator = new c();
    public k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public g mAdapter;
    public a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    public b mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public e mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public o mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    public final List<d0> mPendingAccessibilityImportanceChange;
    private y mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final v mRecycler;
    public w mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private b3 mScrollingChildHelper;
    public final a0 mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final c0 mViewFlinger;
    private final p.b mViewInfoProcessCallback;
    public final p mViewInfoStore;

    class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    public static class a0 {
        public int a = -1;
        private SparseArray<Object> b;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;

        public void a(int i2) {
            if ((this.e & i2) == 0) {
                throw new IllegalStateException(C0201.m82(37595) + Integer.toBinaryString(i2) + C0201.m82(37596) + Integer.toBinaryString(this.e));
            }
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(g gVar) {
            this.e = 1;
            this.f = gVar.c();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return C0201.m82(37597) + this.a + C0201.m82(37598) + this.b + C0201.m82(37599) + this.f + C0201.m82(37600) + this.j + C0201.m82(37601) + this.c + C0201.m82(37602) + this.d + C0201.m82(37603) + this.g + C0201.m82(37604) + this.h + C0201.m82(37605) + this.k + C0201.m82(37606) + this.l + '}';
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static abstract class b0 {
        public abstract View a(v vVar, int i, int i2);
    }

    static class c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public class c0 implements Runnable {
        private int a;
        private int b;
        public OverScroller c;
        public Interpolator d = RecyclerView.sQuinticInterpolator;
        private boolean e = false;
        private boolean f = false;

        public c0() {
            this.c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i6;
            float b2 = f3 + (b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        private float b(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            k3.a0(RecyclerView.this, this);
        }

        public void c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            Interpolator interpolator = this.d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.d = interpolator2;
                this.c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.c.fling(0, 0, i, i2, C0188.f23, C0188.f24, C0188.f23, C0188.f24);
            e();
        }

        public void e() {
            if (this.e) {
                this.f = true;
            } else {
                d();
            }
        }

        public void f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            RecyclerView.this.setScrollState(2);
            this.c.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                g();
                return;
            }
            this.f = false;
            this.e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.a;
                int i4 = currY - this.b;
                this.a = currX;
                this.b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    z zVar = recyclerView4.mLayout.g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b2 = RecyclerView.this.mState.b();
                        if (b2 == 0) {
                            zVar.r();
                        } else if (zVar.f() >= b2) {
                            zVar.p(b2 - 1);
                            zVar.j(i, i2);
                        } else {
                            zVar.j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                z zVar2 = RecyclerView.this.mLayout.g;
                if ((zVar2 != null && zVar2.g()) || !z) {
                    e();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    e eVar = recyclerView6.mGapWorker;
                    if (eVar != null) {
                        eVar.f(recyclerView6, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.e = false;
            if (this.f) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    class d implements p.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m1(d0Var.a, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.mRecycler.J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    public static abstract class d0 {
        private static final List<Object> s = Collections.emptyList();
        public final View a;
        public WeakReference<RecyclerView> b;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public d0 h = null;
        public d0 i = null;
        public int j;
        public List<Object> k = null;
        public List<Object> l = null;
        private int m = 0;
        public v n = null;
        public boolean o = false;
        private int p = 0;
        public int q = -1;
        public RecyclerView r;

        public d0(View view) {
            if (view != null) {
                this.a = view;
                return;
            }
            throw new IllegalArgumentException(C0201.m82(21822));
        }

        private void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        public void A(int i2, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i2;
            }
            this.c += i2;
            if (this.a.getLayoutParams() != null) {
                ((p) this.a.getLayoutParams()).c = true;
            }
        }

        public void B(RecyclerView recyclerView) {
            int i2 = this.q;
            if (i2 != -1) {
                this.p = i2;
            } else {
                this.p = k3.u(this.a);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void C(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.p);
            this.p = 0;
        }

        public void D() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void E() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        public void F(int i2, int i3) {
            this.j = (i2 & i3) | (this.j & (i3 ^ -1));
        }

        public final void G(boolean z) {
            int i2 = this.m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.m = i3;
            if (i3 < 0) {
                this.m = 0;
                Log.e(C0201.m82(21824), C0201.m82(21823) + this);
            } else if (!z && i3 == 1) {
                this.j |= 16;
            } else if (z && this.m == 0) {
                this.j &= -17;
            }
        }

        public void H(v vVar, boolean z) {
            this.n = vVar;
            this.o = z;
        }

        public boolean I() {
            return (this.j & 16) != 0;
        }

        public boolean J() {
            return (this.j & 128) != 0;
        }

        public void K() {
            this.n.J(this);
        }

        public boolean L() {
            return (this.j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        public void b(int i2) {
            this.j = i2 | this.j;
        }

        public void c() {
            this.d = -1;
            this.g = -1;
        }

        public void d() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        public void e() {
            this.j &= -33;
        }

        public void f() {
            this.j &= -257;
        }

        public boolean h() {
            return (this.j & 16) == 0 && k3.K(this.a);
        }

        public void i(int i2, int i3, boolean z) {
            b(8);
            A(i3, z);
            this.c = i2;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long k() {
            return this.e;
        }

        public final int l() {
            return this.f;
        }

        public final int m() {
            int i2 = this.g;
            return i2 == -1 ? this.c : i2;
        }

        public final int n() {
            return this.d;
        }

        public List<Object> o() {
            if ((this.j & 1024) != 0) {
                return s;
            }
            List<Object> list = this.k;
            if (list == null || list.size() == 0) {
                return s;
            }
            return this.l;
        }

        public boolean p(int i2) {
            return (i2 & this.j) != 0;
        }

        public boolean q() {
            return (this.j & 512) != 0 || t();
        }

        public boolean r() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        public boolean s() {
            return (this.j & 1) != 0;
        }

        public boolean t() {
            return (this.j & 4) != 0;
        }

        public String toString() {
            String r0 = getClass().isAnonymousClass() ? C0201.m82(21825) : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(r0 + C0201.m82(21826) + Integer.toHexString(hashCode()) + C0201.m82(21827) + this.c + C0201.m82(21828) + this.e + C0201.m82(21829) + this.d + C0201.m82(21830) + this.g);
            if (w()) {
                sb.append(C0201.m82(21831));
                sb.append(this.o ? C0201.m82(21832) : C0201.m82(21833));
            }
            if (t()) {
                sb.append(C0201.m82(21834));
            }
            if (!s()) {
                sb.append(C0201.m82(21835));
            }
            if (z()) {
                sb.append(C0201.m82(21836));
            }
            if (v()) {
                sb.append(C0201.m82(21837));
            }
            if (J()) {
                sb.append(C0201.m82(21838));
            }
            if (x()) {
                sb.append(C0201.m82(21839));
            }
            if (!u()) {
                sb.append(C0201.m82(21840) + this.m + C0201.m82(21841));
            }
            if (q()) {
                sb.append(C0201.m82(21842));
            }
            if (this.a.getParent() == null) {
                sb.append(C0201.m82(21843));
            }
            sb.append(C0201.m82(21844));
            return sb.toString();
        }

        public final boolean u() {
            return (this.j & 16) == 0 && !k3.K(this.a);
        }

        public boolean v() {
            return (this.j & 8) != 0;
        }

        public boolean w() {
            return this.n != null;
        }

        public boolean x() {
            return (this.j & 256) != 0;
        }

        public boolean y() {
            return (this.j & 2) != 0;
        }

        public boolean z() {
            return (this.j & 2) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements b.AbstractC0021b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void a(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void b() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public int c(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public d0 d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void e(int i) {
            d0 childViewHolderInt;
            View childAt = getChildAt(i);
            if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
                if (!childViewHolderInt.x() || childViewHolderInt.J()) {
                    childViewHolderInt.b(256);
                } else {
                    throw new IllegalArgumentException(C0201.m82(19337) + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent((RecyclerView) i);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void f(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void g(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public View getChildAt(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.AbstractC0021b
        public void i(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.x() || childViewHolderInt.J()) {
                    childViewHolderInt.f();
                } else {
                    throw new IllegalArgumentException(C0201.m82(19338) + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements a.AbstractC0020a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public d0 e(int i) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.n(findViewHolderForPosition.a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.AbstractC0020a
        public void h(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.d += i2;
        }

        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.R0(recyclerView, bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.U0(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.W0(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.T0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    public static abstract class g<VH extends d0> {
        private final h a = new h();
        private boolean b = false;

        public final void a(VH vh, int i) {
            vh.c = i;
            if (g()) {
                vh.e = d(i);
            }
            vh.F(1, 519);
            g2.a(C0201.m82(18538));
            k(vh, i, vh.o());
            vh.d();
            ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).c = true;
            }
            g2.b();
        }

        public final VH b(ViewGroup viewGroup, int i) {
            try {
                g2.a(C0201.m82(18539));
                VH l = l(viewGroup, i);
                if (l.a.getParent() == null) {
                    l.f = i;
                    return l;
                }
                throw new IllegalStateException(C0201.m82(18540));
            } finally {
                g2.b();
            }
        }

        public abstract int c();

        public long d(int i) {
            return -1;
        }

        public int e(int i) {
            return 0;
        }

        public final boolean f() {
            return this.a.a();
        }

        public final boolean g() {
            return this.b;
        }

        public final void h() {
            this.a.b();
        }

        public void i(RecyclerView recyclerView) {
        }

        public abstract void j(VH vh, int i);

        public void k(VH vh, int i, List<Object> list) {
            j(vh, i);
        }

        public abstract VH l(ViewGroup viewGroup, int i);

        public void m(RecyclerView recyclerView) {
        }

        public boolean n(VH vh) {
            return false;
        }

        public void o(VH vh) {
        }

        public void p(VH vh) {
        }

        public void q(VH vh) {
        }

        public void r(i iVar) {
            this.a.registerObserver(iVar);
        }

        public void s(boolean z) {
            if (!f()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException(C0201.m82(18541));
        }

        public void t(i iVar) {
            this.a.unregisterObserver(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class h extends Observable<i> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class i {
        public void a() {
        }
    }

    public interface j {
        int a(int i, int i2);
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        private b a = null;
        private ArrayList<a> b = new ArrayList<>();
        private long c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        /* access modifiers changed from: package-private */
        public interface b {
            void a(d0 d0Var);
        }

        public static class c {
            public int a;
            public int b;

            public c a(d0 d0Var) {
                b(d0Var, 0);
                return this;
            }

            public c b(d0 d0Var, int i) {
                View view = d0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        public static int e(d0 d0Var) {
            int i = d0Var.j & 14;
            if (d0Var.t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.n();
            int j = d0Var.j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            c q = q();
            q.a(d0Var);
            return q;
        }

        public c t(a0 a0Var, d0 d0Var, int i, List<Object> list) {
            c q = q();
            q.a(d0Var);
            return q;
        }

        public abstract void u();

        public void v(b bVar) {
            this.a = bVar;
        }
    }

    private class m implements l.b {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.G(true);
            if (d0Var.h != null && d0Var.i == null) {
                d0Var.h = null;
            }
            d0Var.i = null;
            if (!d0Var.I() && !RecyclerView.this.removeAnimatingView(d0Var.a) && d0Var.x()) {
                RecyclerView.this.removeDetachedView(d0Var.a, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {
        public b a;
        public RecyclerView b;
        private final o.b c = new a();
        private final o.b d = new b();
        public o e = new o(this.c);
        public o f = new o(this.d);
        public z g;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        private boolean k = true;
        private boolean l = true;
        public int m;
        public boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public int a(View view) {
                return o.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.o0() - o.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View getChildAt(int i) {
                return o.this.I(i);
            }
        }

        class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public int a(View view) {
                return o.this.U(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.W() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return o.this.O(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View getChildAt(int i) {
                return o.this.I(i);
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        public static int K(int i2, int i3, int i4, int i5, boolean z) {
            int max = Math.max(0, i2 - i4);
            if (z) {
                if (i5 < 0) {
                    if (i5 == -1) {
                        if (i3 != Integer.MIN_VALUE) {
                            if (i3 != 0) {
                            }
                        }
                        i5 = max;
                        return View.MeasureSpec.makeMeasureSpec(i5, i3);
                    }
                    i3 = 0;
                    i5 = 0;
                    return View.MeasureSpec.makeMeasureSpec(i5, i3);
                }
            } else if (i5 < 0) {
                if (i5 != -1) {
                    if (i5 == -2) {
                        i3 = (i3 == Integer.MIN_VALUE || i3 == 1073741824) ? C0188.f23 : 0;
                    }
                    i3 = 0;
                    i5 = 0;
                    return View.MeasureSpec.makeMeasureSpec(i5, i3);
                }
                i5 = max;
                return View.MeasureSpec.makeMeasureSpec(i5, i3);
            }
            i3 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = e0();
            int g0 = g0();
            int o0 = o0() - f0();
            int W = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - e0;
            int min = Math.min(0, i2);
            int i3 = top - g0;
            int min2 = Math.min(0, i3);
            int i4 = width - o0;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - W);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void f(View view, int i2, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.v()) {
                this.b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.b.mViewInfoStore.p(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.L() || childViewHolderInt.w()) {
                if (childViewHolderInt.w()) {
                    childViewHolderInt.K();
                } else {
                    childViewHolderInt.e();
                }
                this.a.c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m2 = this.a.m(view);
                if (i2 == -1) {
                    i2 = this.a.g();
                }
                if (m2 == -1) {
                    throw new IllegalStateException(C0201.m82(18003) + this.b.indexOfChild(view) + this.b.exceptionLabel());
                } else if (m2 != i2) {
                    this.b.mLayout.B0(m2, i2);
                }
            } else {
                this.a.a(view, i2, false);
                pVar.c = true;
                z zVar = this.g;
                if (zVar != null && zVar.h()) {
                    this.g.k(view);
                }
            }
            if (pVar.d) {
                childViewHolderInt.a.invalidate();
                pVar.d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c5.RecyclerView, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(c5.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(c5.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(c5.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(c5.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i3, i4) : size;
            }
            return Math.min(size, Math.max(i3, i4));
        }

        private boolean t0(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = e0();
            int g0 = g0();
            int o0 = o0() - f0();
            int W = W() - d0();
            Rect rect = this.b.mTempRect;
            P(focusedChild, rect);
            if (rect.left - i2 >= o0 || rect.right - i2 <= e0 || rect.top - i3 >= W || rect.bottom - i3 <= g0) {
                return false;
            }
            return true;
        }

        private void v1(v vVar, int i2, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.J()) {
                if (!childViewHolderInt.t() || childViewHolderInt.v() || this.b.mAdapter.g()) {
                    x(i2);
                    vVar.D(view);
                    this.b.mViewInfoStore.k(childViewHolderInt);
                    return;
                }
                q1(i2);
                vVar.C(childViewHolderInt);
            }
        }

        private static boolean w0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void y(int i2, View view) {
            this.a.d(i2);
        }

        public void A(RecyclerView recyclerView, v vVar) {
            this.i = false;
            I0(recyclerView, vVar);
        }

        public void A0(View view, int i2, int i3) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.b.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int K = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).width, k());
            int K2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) pVar).height, l());
            if (F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        public void A1(int i2, int i3) {
            this.q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.r = 0;
            }
        }

        public View B(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.a.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public void B0(int i2, int i3) {
            View I = I(i2);
            if (I != null) {
                x(i2);
                h(I, i3);
                return;
            }
            throw new IllegalArgumentException(C0201.m82(18004) + i2 + this.b.toString());
        }

        public void B1(int i2, int i3) {
            this.b.setMeasuredDimension(i2, i3);
        }

        public View C(int i2) {
            int J = J();
            for (int i3 = 0; i3 < J; i3++) {
                View I = I(i3);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(I);
                if (childViewHolderInt != null && childViewHolderInt.m() == i2 && !childViewHolderInt.J() && (this.b.mState.e() || !childViewHolderInt.v())) {
                    return I;
                }
            }
            return null;
        }

        public void C0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void C1(Rect rect, int i2, int i3) {
            B1(n(i2, rect.width() + e0() + f0(), c0()), n(i3, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        public void D1(int i2, int i3) {
            int J = J();
            if (J == 0) {
                this.b.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = C0188.f23;
            int i5 = C0188.f23;
            int i6 = C0188.f24;
            int i7 = C0188.f24;
            for (int i8 = 0; i8 < J; i8++) {
                View I = I(i8);
                Rect rect = this.b.mTempRect;
                P(I, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.b.mTempRect.set(i6, i7, i4, i5);
            C1(this.b.mTempRect, i2, i3);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        public void E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.mChildHelper;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public boolean F1(View view, int i2, int i3, p pVar) {
            return view.isLayoutRequested() || !this.k || !w0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) || !w0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        public boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).b.bottom;
        }

        @Deprecated
        public void H0(RecyclerView recyclerView) {
        }

        public boolean H1(View view, int i2, int i3, p pVar) {
            return !this.k || !w0(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) || !w0(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public View I(int i2) {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i2);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, v vVar) {
            H0(recyclerView);
        }

        public void I1(RecyclerView recyclerView, a0 a0Var, int i2) {
            Log.e(C0201.m82(18005), C0201.m82(18006));
        }

        public int J() {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public View J0(View view, int i2, v vVar, a0 a0Var) {
            return null;
        }

        public void J1(z zVar) {
            z zVar2 = this.g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.h())) {
                this.g.r();
            }
            this.g = zVar;
            zVar.q(this.b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            L0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void K1() {
            z zVar = this.g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void L0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                g gVar = this.b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.c());
                }
            }
        }

        public boolean L1() {
            return false;
        }

        public boolean M() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public void M0(w3 w3Var) {
            RecyclerView recyclerView = this.b;
            N0(recyclerView.mRecycler, recyclerView.mState, w3Var);
        }

        public int N(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.mAdapter == null || !k()) {
                return 1;
            }
            return this.b.mAdapter.c();
        }

        public void N0(v vVar, a0 a0Var, w3 w3Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                w3Var.a(8192);
                w3Var.t0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                w3Var.a(4096);
                w3Var.t0(true);
            }
            w3Var.b0(w3.b.a(k0(vVar, a0Var), N(vVar, a0Var), v0(vVar, a0Var), l0(vVar, a0Var)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void O0(View view, w3 w3Var) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.v() && !this.a.n(childViewHolderInt.a)) {
                RecyclerView recyclerView = this.b;
                P0(recyclerView.mRecycler, recyclerView.mState, view, w3Var);
            }
        }

        public void P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void P0(v vVar, a0 a0Var, View view, w3 w3Var) {
            w3Var.c0(w3.c.b(l() ? h0(view) : 0, 1, k() ? h0(view) : 0, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i2) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int W() {
            return this.r;
        }

        public void W0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            V0(recyclerView, i2, i3);
        }

        public int X() {
            return this.p;
        }

        public void X0(v vVar, a0 a0Var) {
            Log.e(C0201.m82(18007), C0201.m82(18008));
        }

        public int Y() {
            RecyclerView recyclerView = this.b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public void Y0(a0 a0Var) {
        }

        public int Z() {
            return k3.w(this.b);
        }

        public void Z0(v vVar, a0 a0Var, int i2, int i3) {
            this.b.defaultOnMeasure(i2, i3);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).b.left;
        }

        @Deprecated
        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.isComputingLayout();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return k3.x(this.b);
        }

        public boolean b1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i2) {
            f(view, i2, true);
        }

        public int c0() {
            return k3.y(this.b);
        }

        public void c1(Parcelable parcelable) {
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable d1() {
            return null;
        }

        public void e(View view, int i2) {
            f(view, i2, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i2) {
        }

        public int f0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void f1(z zVar) {
            if (this.g == zVar) {
                this.g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean g1(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return h1(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        public void h(View view, int i2) {
            i(view, i2, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        public boolean h1(v vVar, a0 a0Var, int i2, Bundle bundle) {
            int i3;
            int i4;
            int i5;
            int i6;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                i5 = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    i6 = (o0() - e0()) - f0();
                }
                i3 = i5;
                i4 = 0;
                if (i3 != 0) {
                }
                this.b.smoothScrollBy(i4, i3, null, C0188.f23, true);
                return true;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
                if (i3 != 0 && i4 == 0) {
                    return false;
                }
                this.b.smoothScrollBy(i4, i3, null, C0188.f23, true);
                return true;
            } else {
                i5 = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    i6 = -((o0() - e0()) - f0());
                }
                i3 = i5;
                i4 = 0;
                if (i3 != 0) {
                }
                this.b.smoothScrollBy(i4, i3, null, C0188.f23, true);
                return true;
            }
            i3 = i5;
            i4 = i6;
            if (i3 != 0) {
            }
            this.b.smoothScrollBy(i4, i3, null, C0188.f23, true);
            return true;
        }

        public void i(View view, int i2, p pVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.v()) {
                this.b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.b.mViewInfoStore.p(childViewHolderInt);
            }
            this.a.c(view, i2, pVar, childViewHolderInt.v());
        }

        public boolean i1(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return j1(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).b.right;
        }

        public boolean j1(v vVar, a0 a0Var, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean k() {
            return false;
        }

        public int k0(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.mAdapter == null || !l()) {
                return 1;
            }
            return this.b.mAdapter.c();
        }

        public void k1(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                if (!RecyclerView.getChildViewHolderInt(I(J)).J()) {
                    n1(J, vVar);
                }
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(v vVar, a0 a0Var) {
            return 0;
        }

        public void l1(v vVar) {
            int j2 = vVar.j();
            for (int i2 = j2 - 1; i2 >= 0; i2--) {
                View n2 = vVar.n(i2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n2);
                if (!childViewHolderInt.J()) {
                    childViewHolderInt.G(false);
                    if (childViewHolderInt.x()) {
                        this.b.removeDetachedView(n2, false);
                    }
                    l lVar = this.b.mItemAnimator;
                    if (lVar != null) {
                        lVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.G(true);
                    vVar.y(n2);
                }
            }
            vVar.e();
            if (j2 > 0) {
                this.b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).b.top;
        }

        public void m1(View view, v vVar) {
            p1(view);
            vVar.B(view);
        }

        public void n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i2, v vVar) {
            View I = I(i2);
            q1(i2);
            vVar.B(I);
        }

        public void o(int i2, int i3, a0 a0Var, c cVar) {
        }

        public int o0() {
            return this.q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i2, c cVar) {
        }

        public int p0() {
            return this.o;
        }

        public void p1(View view) {
            this.a.p(view);
        }

        public int q(a0 a0Var) {
            return 0;
        }

        public boolean q0() {
            int J = J();
            for (int i2 = 0; i2 < J; i2++) {
                ViewGroup.LayoutParams layoutParams = I(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i2) {
            if (I(i2) != null) {
                this.a.q(i2);
            }
        }

        public int r(a0 a0Var) {
            return 0;
        }

        public boolean r0() {
            return this.i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return s1(recyclerView, view, rect, z, false);
        }

        public int s(a0 a0Var) {
            return 0;
        }

        public boolean s0() {
            return this.j;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = L(view, rect);
            int i2 = L[0];
            int i3 = L[1];
            if ((z2 && !t0(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        public int t(a0 a0Var) {
            return 0;
        }

        public void t1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int u(a0 a0Var) {
            return 0;
        }

        public final boolean u0() {
            return this.l;
        }

        public void u1() {
            this.h = true;
        }

        public int v(a0 a0Var) {
            return 0;
        }

        public boolean v0(v vVar, a0 a0Var) {
            return false;
        }

        public void w(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                v1(vVar, J, I(J));
            }
        }

        public int w1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public void x(int i2) {
            y(i2, I(i2));
        }

        public boolean x0() {
            z zVar = this.g;
            return zVar != null && zVar.h();
        }

        public void x1(int i2) {
        }

        public boolean y0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int y1(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public void z(RecyclerView recyclerView) {
            this.i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class u {
        public SparseArray<a> a = new SparseArray<>();
        private int b = 0;

        /* access modifiers changed from: package-private */
        public static class a {
            public final ArrayList<d0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        private a g(int i) {
            a aVar = this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                this.a.valueAt(i).a.clear();
            }
        }

        public void c() {
            this.b--;
        }

        public void d(int i, long j) {
            a g = g(i);
            g.d = j(g.d, j);
        }

        public void e(int i, long j) {
            a g = g(i);
            g.c = j(g.c, j);
        }

        public d0 f(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int l = d0Var.l();
            ArrayList<d0> arrayList = g(l).a;
            if (this.a.get(l).b > arrayList.size()) {
                d0Var.D();
                arrayList.add(d0Var);
            }
        }

        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class v {
        public final ArrayList<d0> a = new ArrayList<>();
        public ArrayList<d0> b = null;
        public final ArrayList<d0> c = new ArrayList<>();
        private final List<d0> d = Collections.unmodifiableList(this.a);
        private int e = 2;
        public int f = 2;
        public u g;
        private b0 h;

        public v() {
        }

        private boolean H(d0 d0Var, int i2, int i3, long j) {
            d0Var.r = RecyclerView.this;
            int l = d0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.a(d0Var, i2);
            this.g.d(d0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.mState.e()) {
                return true;
            }
            d0Var.g = i3;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.a;
                if (k3.u(view) == 0) {
                    k3.q0(view, 1);
                }
                k kVar = RecyclerView.this.mAccessibilityDelegate;
                if (kVar != null) {
                    r2 n = kVar.n();
                    if (n instanceof k.a) {
                        ((k.a) n).o(view);
                    }
                    k3.h0(view, n);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void A(int i2) {
            a(this.c.get(i2), true);
            this.c.remove(i2);
        }

        public void B(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.w()) {
                childViewHolderInt.K();
            } else if (childViewHolderInt.L()) {
                childViewHolderInt.e();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.u()) {
                RecyclerView.this.mItemAnimator.j(childViewHolderInt);
            }
        }

        public void C(d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.w() || d0Var.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0201.m82(17816));
                sb.append(d0Var.w());
                sb.append(C0201.m82(17817));
                if (d0Var.a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.x()) {
                throw new IllegalArgumentException(C0201.m82(17815) + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.J()) {
                boolean h2 = d0Var.h();
                g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && h2 && gVar.n(d0Var)) || d0Var.u()) {
                    if (this.f <= 0 || d0Var.p(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(d0Var.c)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.d(this.c.get(i2).c)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.q(d0Var);
                        if (!z2 && !z3 && h2) {
                            d0Var.r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(17814) + RecyclerView.this.exceptionLabel());
            }
        }

        public void D(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.p(12) && childViewHolderInt.y() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                childViewHolderInt.H(this, true);
                this.b.add(childViewHolderInt);
            } else if (!childViewHolderInt.t() || childViewHolderInt.v() || RecyclerView.this.mAdapter.g()) {
                childViewHolderInt.H(this, false);
                this.a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException(C0201.m82(17818) + RecyclerView.this.exceptionLabel());
            }
        }

        public void E(u uVar) {
            u uVar2 = this.g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }

        public void F(b0 b0Var) {
            this.h = b0Var;
        }

        public void G(int i2) {
            this.e = i2;
            K();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01de  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0225  */
        public d0 I(int i2, boolean z, long j) {
            boolean z2;
            d0 d0Var;
            d0 d0Var2;
            boolean z3;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            RecyclerView findNestedRecyclerView;
            b0 b0Var;
            View a2;
            if (i2 < 0 || i2 >= RecyclerView.this.mState.b()) {
                throw new IndexOutOfBoundsException(C0201.m82(17824) + i2 + C0201.m82(17825) + i2 + C0201.m82(17826) + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            }
            boolean z4 = true;
            if (RecyclerView.this.mState.e()) {
                d0Var = h(i2);
                if (d0Var != null) {
                    z2 = true;
                    if (d0Var == null && (d0Var = m(i2, z)) != null) {
                        if (L(d0Var)) {
                            if (!z) {
                                d0Var.b(4);
                                if (d0Var.w()) {
                                    RecyclerView.this.removeDetachedView(d0Var.a, false);
                                    d0Var.K();
                                } else if (d0Var.L()) {
                                    d0Var.e();
                                }
                                C(d0Var);
                            }
                            d0Var = null;
                        } else {
                            z2 = true;
                        }
                    }
                    if (d0Var == null) {
                        int m = RecyclerView.this.mAdapterHelper.m(i2);
                        if (m < 0 || m >= RecyclerView.this.mAdapter.c()) {
                            throw new IndexOutOfBoundsException(C0201.m82(17821) + i2 + C0201.m82(17822) + m + C0201.m82(17823) + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
                        }
                        int e2 = RecyclerView.this.mAdapter.e(m);
                        if (RecyclerView.this.mAdapter.g() && (d0Var = l(RecyclerView.this.mAdapter.d(m), e2, z)) != null) {
                            d0Var.c = m;
                            z2 = true;
                        }
                        if (!(d0Var != null || (b0Var = this.h) == null || (a2 = b0Var.a(this, i2, e2)) == null)) {
                            d0Var = RecyclerView.this.getChildViewHolder(a2);
                            if (d0Var == null) {
                                throw new IllegalArgumentException(C0201.m82(17820) + RecyclerView.this.exceptionLabel());
                            } else if (d0Var.J()) {
                                throw new IllegalArgumentException(C0201.m82(17819) + RecyclerView.this.exceptionLabel());
                            }
                        }
                        if (d0Var == null) {
                            d0 f2 = i().f(e2);
                            if (f2 != null) {
                                f2.D();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    r(f2);
                                }
                            }
                            d0Var = f2;
                        }
                        if (d0Var == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j != Long.MAX_VALUE && !this.g.l(e2, nanoTime, j)) {
                                return null;
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            d0 b2 = recyclerView.mAdapter.b(recyclerView, e2);
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(b2.a)) != null) {
                                b2.b = new WeakReference<>(findNestedRecyclerView);
                            }
                            this.g.e(e2, RecyclerView.this.getNanoTime() - nanoTime);
                            d0Var2 = b2;
                            if (z2 && !RecyclerView.this.mState.e() && d0Var2.p(8192)) {
                                d0Var2.F(0, 8192);
                                if (RecyclerView.this.mState.k) {
                                    RecyclerView recyclerView2 = RecyclerView.this;
                                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(d0Var2, recyclerView2.mItemAnimator.t(recyclerView2.mState, d0Var2, l.e(d0Var2) | 4096, d0Var2.o()));
                                }
                            }
                            if (!RecyclerView.this.mState.e() && d0Var2.s()) {
                                d0Var2.g = i2;
                            } else if (!d0Var2.s() || d0Var2.z() || d0Var2.t()) {
                                z3 = H(d0Var2, RecyclerView.this.mAdapterHelper.m(i2), i2, j);
                                layoutParams = d0Var2.a.getLayoutParams();
                                if (layoutParams != null) {
                                    pVar = (p) RecyclerView.this.generateDefaultLayoutParams();
                                    d0Var2.a.setLayoutParams(pVar);
                                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                    pVar = (p) RecyclerView.this.generateLayoutParams(layoutParams);
                                    d0Var2.a.setLayoutParams(pVar);
                                } else {
                                    pVar = (p) layoutParams;
                                }
                                pVar.a = d0Var2;
                                if (!z2 || !z3) {
                                    z4 = false;
                                }
                                pVar.d = z4;
                                return d0Var2;
                            }
                            z3 = false;
                            layoutParams = d0Var2.a.getLayoutParams();
                            if (layoutParams != null) {
                            }
                            pVar.a = d0Var2;
                            z4 = false;
                            pVar.d = z4;
                            return d0Var2;
                        }
                    }
                    d0Var2 = d0Var;
                    d0Var2.F(0, 8192);
                    if (RecyclerView.this.mState.k) {
                    }
                    if (!RecyclerView.this.mState.e()) {
                    }
                    z3 = H(d0Var2, RecyclerView.this.mAdapterHelper.m(i2), i2, j);
                    layoutParams = d0Var2.a.getLayoutParams();
                    if (layoutParams != null) {
                    }
                    pVar.a = d0Var2;
                    z4 = false;
                    pVar.d = z4;
                    return d0Var2;
                }
            } else {
                d0Var = null;
            }
            z2 = false;
            if (L(d0Var)) {
            }
            if (d0Var == null) {
            }
            d0Var2 = d0Var;
            d0Var2.F(0, 8192);
            if (RecyclerView.this.mState.k) {
            }
            if (!RecyclerView.this.mState.e()) {
            }
            z3 = H(d0Var2, RecyclerView.this.mAdapterHelper.m(i2), i2, j);
            layoutParams = d0Var2.a.getLayoutParams();
            if (layoutParams != null) {
            }
            pVar.a = d0Var2;
            z4 = false;
            pVar.d = z4;
            return d0Var2;
        }

        public void J(d0 d0Var) {
            if (d0Var.o) {
                this.b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.n = null;
            d0Var.o = false;
            d0Var.e();
        }

        public void K() {
            o oVar = RecyclerView.this.mLayout;
            this.f = this.e + (oVar != null ? oVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        public boolean L(d0 d0Var) {
            if (d0Var.v()) {
                return RecyclerView.this.mState.e();
            }
            int i2 = d0Var.c;
            if (i2 < 0 || i2 >= RecyclerView.this.mAdapter.c()) {
                throw new IndexOutOfBoundsException(C0201.m82(17827) + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.e() && RecyclerView.this.mAdapter.e(d0Var.c) != d0Var.l()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.g() || d0Var.k() == RecyclerView.this.mAdapter.d(d0Var.c)) {
                    return true;
                }
                return false;
            }
        }

        public void M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.c.get(size);
                if (d0Var != null && (i4 = d0Var.c) >= i2 && i4 < i5) {
                    d0Var.b(2);
                    A(size);
                }
            }
        }

        public void a(d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.a;
            k kVar = RecyclerView.this.mAccessibilityDelegate;
            if (kVar != null) {
                r2 n = kVar.n();
                k3.h0(view, n instanceof k.a ? ((k.a) n).n(view) : null);
            }
            if (z) {
                g(d0Var);
            }
            d0Var.r = null;
            i().i(d0Var);
        }

        public void c() {
            this.a.clear();
            z();
        }

        public void d() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.c.get(i2).c();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.get(i3).c();
            }
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.b.get(i4).c();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList<d0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.mState.b()) {
                throw new IndexOutOfBoundsException(C0201.m82(17828) + i2 + C0201.m82(17829) + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.e()) {
                return i2;
            } else {
                return RecyclerView.this.mAdapterHelper.m(i2);
            }
        }

        public void g(d0 d0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.q(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(d0Var);
            }
        }

        public d0 h(int i2) {
            int size;
            int m;
            ArrayList<d0> arrayList = this.b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i3 = 0; i3 < size; i3++) {
                    d0 d0Var = this.b.get(i3);
                    if (!d0Var.L() && d0Var.m() == i2) {
                        d0Var.b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.g() && (m = RecyclerView.this.mAdapterHelper.m(i2)) > 0 && m < RecyclerView.this.mAdapter.c()) {
                    long d2 = RecyclerView.this.mAdapter.d(m);
                    for (int i4 = 0; i4 < size; i4++) {
                        d0 d0Var2 = this.b.get(i4);
                        if (!d0Var2.L() && d0Var2.k() == d2) {
                            d0Var2.b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public u i() {
            if (this.g == null) {
                this.g = new u();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List<d0> k() {
            return this.d;
        }

        public d0 l(long j, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.a.get(size);
                if (d0Var.k() == j && !d0Var.L()) {
                    if (i2 == d0Var.l()) {
                        d0Var.b(32);
                        if (d0Var.v() && !RecyclerView.this.mState.e()) {
                            d0Var.F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.a, false);
                        y(d0Var.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.c.get(size2);
                if (d0Var2.k() == j && !d0Var2.r()) {
                    if (i2 == d0Var2.l()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public d0 m(int i2, boolean z) {
            View e2;
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.a.get(i3);
                if (!d0Var.L() && d0Var.m() == i2 && !d0Var.t() && (RecyclerView.this.mState.h || !d0Var.v())) {
                    d0Var.b(32);
                    return d0Var;
                }
            }
            if (z || (e2 = RecyclerView.this.mChildHelper.e(i2)) == null) {
                int size2 = this.c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    d0 d0Var2 = this.c.get(i4);
                    if (!d0Var2.t() && d0Var2.m() == i2 && !d0Var2.r()) {
                        if (!z) {
                            this.c.remove(i4);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e2);
            RecyclerView.this.mChildHelper.s(e2);
            int m = RecyclerView.this.mChildHelper.m(e2);
            if (m != -1) {
                RecyclerView.this.mChildHelper.d(m);
                D(e2);
                childViewHolderInt.b(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException(C0201.m82(17830) + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        public View n(int i2) {
            return this.a.get(i2).a;
        }

        public View o(int i2) {
            return p(i2, false);
        }

        public View p(int i2, boolean z) {
            return I(i2, z, Long.MAX_VALUE).a;
        }

        public void s() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) this.c.get(i2).a.getLayoutParams();
                if (pVar != null) {
                    pVar.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.c.get(i2);
                if (d0Var != null) {
                    d0Var.b(6);
                    d0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        public void u(int i2, int i3) {
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                d0 d0Var = this.c.get(i4);
                if (d0Var != null && d0Var.c >= i2) {
                    d0Var.A(i3, true);
                }
            }
        }

        public void v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i6 = -1;
                i5 = i2;
                i4 = i3;
            } else {
                i6 = 1;
                i4 = i2;
                i5 = i3;
            }
            int size = this.c.size();
            for (int i8 = 0; i8 < size; i8++) {
                d0 d0Var = this.c.get(i8);
                if (d0Var != null && (i7 = d0Var.c) >= i5 && i7 <= i4) {
                    if (i7 == i2) {
                        d0Var.A(i3 - i2, false);
                    } else {
                        d0Var.A(i6, false);
                    }
                }
            }
        }

        public void w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.c.get(size);
                if (d0Var != null) {
                    int i5 = d0Var.c;
                    if (i5 >= i4) {
                        d0Var.A(-i3, z);
                    } else if (i5 >= i2) {
                        d0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        public void y(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.n = null;
            childViewHolderInt.o = false;
            childViewHolderInt.e();
            C(childViewHolderInt);
        }

        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    /* access modifiers changed from: private */
    public class x extends i {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    public static abstract class z {
        private int a = -1;
        private RecyclerView b;
        private o c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);
        private boolean h;

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, C0188.f23, null);
            }

            private void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException(C0201.m82(17930));
                } else if (this.c < 1) {
                    throw new IllegalStateException(C0201.m82(17931));
                }
            }

            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    e();
                    recyclerView.mViewFlinger.f(this.a, this.b, this.c, this.e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e(C0201.m82(17932), C0201.m82(17933));
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            o e2 = e();
            if (e2 instanceof b) {
                return ((b) e2).a(i);
            }
            Log.w(C0201.m82(17525), C0201.m82(17524) + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.mLayout.C(i);
        }

        public int c() {
            return this.b.mLayout.J();
        }

        public int d(View view) {
            return this.b.getChildLayoutPosition(view);
        }

        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (!(!this.d || this.f != null || this.c == null || (a2 = a(this.a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(a2.x), (int) Math.signum(a2.y), null);
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.mState, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    Log.e(C0201.m82(17526), C0201.m82(17527));
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.mState, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.e();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void l(int i, int i2, a0 a0Var, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i) {
            this.a = i;
        }

        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.g();
            if (this.h) {
                Log.w(C0201.m82(17531), C0201.m82(17528) + getClass().getSimpleName() + C0201.m82(17529) + getClass().getSimpleName() + C0201.m82(17530));
            }
            this.b = recyclerView;
            this.c = oVar;
            int i = this.a;
            if (i != -1) {
                recyclerView.mState.a = i;
                this.e = true;
                this.d = true;
                this.f = b(f());
                m();
                this.b.mViewFlinger.e();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException(C0201.m82(17532));
        }

        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.mState.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.f1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    static {
        C0201.m83(RecyclerView.class, 281);
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 18 || i2 == 19 || i2 == 20;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.a;
        boolean z2 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (d0Var.x()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.G(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.h = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.J(d0Var);
            d0Var2.G(false);
            d0Var2.i = d0Var;
        }
        if (this.mItemAnimator.b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView != d0Var.a) {
                    ViewParent parent = recyclerView.getParent();
                    recyclerView = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        String r0 = C0201.m82(13743);
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + C0201.m82(13744) + fullClassName, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + C0201.m82(13747) + fullClassName, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + r0 + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + r0 + fullClassName, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + C0201.m82(13746) + fullClassName, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + C0201.m82(13745) + fullClassName, e8);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            v3.b(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z2 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        if (!a0Var.k || !this.mItemsChanged) {
            z2 = false;
        }
        a0Var.i = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0 a0Var2 = this.mState;
        a0Var2.h = a0Var2.l;
        a0Var2.f = this.mAdapter.c();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.k) {
            int g2 = this.mChildHelper.g();
            for (int i2 = 0; i2 < g2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
                if (!childViewHolderInt.J() && (!childViewHolderInt.t() || this.mAdapter.g())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.t(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.o()));
                    if (this.mState.i && childViewHolderInt.y() && !childViewHolderInt.v() && !childViewHolderInt.J() && !childViewHolderInt.t()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.l) {
            saveOldPositions();
            a0 a0Var3 = this.mState;
            boolean z3 = a0Var3.g;
            a0Var3.g = false;
            this.mLayout.X0(this.mRecycler, a0Var3);
            this.mState.g = z3;
            for (int i3 = 0; i3 < this.mChildHelper.g(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i3));
                if (!childViewHolderInt2.J() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e2 = l.e(childViewHolderInt2);
                    boolean p2 = childViewHolderInt2.p(8192);
                    if (!p2) {
                        e2 |= 4096;
                    }
                    l.c t2 = this.mItemAnimator.t(this.mState, childViewHolderInt2, e2, childViewHolderInt2.o());
                    if (p2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t2);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, t2);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f = this.mAdapter.c();
        a0 a0Var = this.mState;
        a0Var.d = 0;
        a0Var.h = false;
        this.mLayout.X0(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.g = false;
        this.mPendingSavedState = null;
        a0Var2.k = a0Var2.k && this.mItemAnimator != null;
        this.mState.e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.e = 1;
        if (a0Var.k) {
            for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g2));
                if (!childViewHolderInt.J()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c s2 = this.mItemAnimator.s(this.mState, childViewHolderInt);
                    d0 g3 = this.mViewInfoStore.g(changedHolderKey);
                    if (g3 == null || g3.J()) {
                        this.mViewInfoStore.d(childViewHolderInt, s2);
                    } else {
                        boolean h2 = this.mViewInfoStore.h(g3);
                        boolean h3 = this.mViewInfoStore.h(childViewHolderInt);
                        if (!h2 || g3 != childViewHolderInt) {
                            l.c n2 = this.mViewInfoStore.n(g3);
                            this.mViewInfoStore.d(childViewHolderInt, s2);
                            l.c m2 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g3);
                            } else {
                                animateChange(g3, childViewHolderInt, n2, m2, h2, h3);
                            }
                        } else {
                            this.mViewInfoStore.d(childViewHolderInt, s2);
                        }
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.l1(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.c = a0Var2.f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.mLayout.h = false;
        ArrayList<d0> arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.mRecycler.K();
        }
        this.mLayout.Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g2 = this.mChildHelper.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = C0188.f24;
        int i3 = C0188.f23;
        for (int i4 = 0; i4 < g2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (!childViewHolderInt.J()) {
                int m2 = childViewHolderInt.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        int i2 = this.mState.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = this.mState.b();
        for (int i3 = i2; i3 < b2; i3++) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.a;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.a.hasFocusable()) {
                return findViewHolderForAdapterPosition.a;
            }
        }
    }

    public static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(C0201.m82(13748))) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private b3 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new b3(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                String r8 = C0201.m82(13749);
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException(C0201.m82(13751) + childViewHolderInt + r8 + d0Var + exceptionLabel());
                }
                throw new IllegalStateException(C0201.m82(13750) + childViewHolderInt + r8 + d0Var + exceptionLabel());
            }
        }
        Log.e(C0201.m82(13754), C0201.m82(13752) + d0Var2 + C0201.m82(13753) + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i2));
            if (!(childViewHolderInt == null || childViewHolderInt.J() || !childViewHolderInt.y())) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (k3.v(this) == 0) {
            k3.r0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.Z() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        int i6 = this.mTempRect2.left;
        if ((i5 < i6 || rect.right <= i6) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.mTempRect;
            int i7 = rect2.right;
            int i8 = this.mTempRect2.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        Rect rect3 = this.mTempRect;
        int i9 = rect3.top;
        int i10 = this.mTempRect2.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.mTempRect;
            int i11 = rect4.bottom;
            int i12 = this.mTempRect2.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.mTempRect.top <= this.mTempRect2.top) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                throw new IllegalArgumentException(C0201.m82(13755) + i2 + exceptionLabel());
                            } else if (c2 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c2 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c2 > 0 || (c2 == 0 && i3 * i4 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c2 < 0 || (c2 == 0 && i3 * i4 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.L1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.u();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.s();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z3 || this.mLayout.h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.g());
        a0 a0Var = this.mState;
        if (a0Var.k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    private void pullGlows(float f2, float f3, float f4, float f5) {
        boolean z2;
        boolean z3 = true;
        if (f3 < 0.0f) {
            ensureLeftGlow();
            androidx.core.widget.d.a(this.mLeftGlow, (-f3) / ((float) getWidth()), 1.0f - (f4 / ((float) getHeight())));
        } else if (f3 > 0.0f) {
            ensureRightGlow();
            androidx.core.widget.d.a(this.mRightGlow, f3 / ((float) getWidth()), f4 / ((float) getHeight()));
        } else {
            z2 = false;
            if (f5 >= 0.0f) {
                ensureTopGlow();
                androidx.core.widget.d.a(this.mTopGlow, (-f5) / ((float) getHeight()), f2 / ((float) getWidth()));
            } else if (f5 > 0.0f) {
                ensureBottomGlow();
                androidx.core.widget.d.a(this.mBottomGlow, f5 / ((float) getHeight()), 1.0f - (f2 / ((float) getWidth())));
            } else {
                z3 = z2;
            }
            if (!z3 || f3 != 0.0f || f5 != 0.0f) {
                k3.Z(this);
            }
            return;
        }
        z2 = true;
        if (f5 >= 0.0f) {
        }
        if (!z3) {
        }
        k3.Z(this);
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                d0 findViewHolderForItemId = (this.mState.n == -1 || !this.mAdapter.g()) ? null : findViewHolderForItemId(this.mState.n);
                if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.a) && findViewHolderForItemId.a.hasFocusable()) {
                    view = findViewHolderForItemId.a;
                } else if (this.mChildHelper.g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.o;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            k3.Z(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.s1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.n = -1;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i2;
        d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.n = this.mAdapter.g() ? d0Var.k() : -1;
        a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i2 = -1;
        } else if (d0Var.v()) {
            i2 = d0Var.d;
        } else {
            i2 = d0Var.j();
        }
        a0Var.m = i2;
        this.mState.o = getDeepestFocusedViewWithId(d0Var.a);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.t(this.mObserver);
            this.mAdapter.m(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.u();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.r(this.mObserver);
            gVar.i(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.E0(gVar3, this.mAdapter);
        }
        this.mRecycler.x(gVar3, this.mAdapter, z2);
        this.mState.g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.g();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.K1();
        }
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            k3.Z(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.F0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g(C0201.m82(13756));
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.G(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.G(false);
        if (this.mItemAnimator.c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(C0201.m82(13757) + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(C0201.m82(13758) + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(C0201.m82(13760), C0201.m82(13761), new IllegalStateException(C0201.m82(13759) + exceptionLabel()));
        }
    }

    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.g(d0Var, d0Var.o());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.m((p) layoutParams);
    }

    public void clearOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.J()) {
                childViewHolderInt.c();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.k()) {
            return this.mLayout.q(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.k()) {
            return this.mLayout.r(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.k()) {
            return this.mLayout.s(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.t(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.u(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.l()) {
            return this.mLayout.v(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            k3.Z(this);
        }
    }

    public void consumePendingUpdateOperations() {
        boolean z2 = this.mFirstLayoutComplete;
        String r1 = C0201.m82(13762);
        if (!z2 || this.mDataSetHasChangedAfterLayout) {
            g2.a(r1);
            dispatchLayout();
            g2.b();
        } else if (this.mAdapterHelper.p()) {
            if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                g2.a(C0201.m82(13763));
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.s();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                g2.b();
            } else if (this.mAdapterHelper.p()) {
                g2.a(r1);
                dispatchLayout();
                g2.b();
            }
        }
    }

    public void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(o.n(i2, getPaddingLeft() + getPaddingRight(), k3.y(this)), o.n(i3, getPaddingTop() + getPaddingBottom(), k3.x(this)));
    }

    public void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.o(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.p(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    public void dispatchLayout() {
        g gVar = this.mAdapter;
        String r1 = C0201.m82(13764);
        if (gVar == null) {
            Log.e(r1, C0201.m82(13765));
        } else if (this.mLayout == null) {
            Log.e(r1, C0201.m82(13766));
        } else {
            a0 a0Var = this.mState;
            a0Var.j = false;
            if (a0Var.e == 1) {
                dispatchLayoutStep1();
                this.mLayout.z1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && this.mLayout.o0() == getWidth() && this.mLayout.W() == getHeight()) {
                this.mLayout.z1(this);
            } else {
                this.mLayout.z1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.e1(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.a.getParent() == this && !d0Var.J() && (i2 = d0Var.q) != -1) {
                k3.q0(d0Var.a, i2);
                d0Var.q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) {
            z4 = z2;
        }
        if (z4) {
            k3.Z(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 3);
            this.mBottomGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 0);
            this.mLeftGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 2);
            this.mRightGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 1);
            this.mTopGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        return C0201.m82(13767) + super.toString() + C0201.m82(13768) + this.mAdapter + C0201.m82(13769) + this.mLayout + C0201.m82(13770) + getContext();
    }

    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.c;
            a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.p = 0;
        a0Var.q = 0;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int g2 = this.mChildHelper.g() - 1; g2 >= 0; g2--) {
            View f4 = this.mChildHelper.f(g2);
            float translationX = f4.getTranslationX();
            float translationY = f4.getTranslationY();
            if (f2 >= ((float) f4.getLeft()) + translationX && f2 <= ((float) f4.getRight()) + translationX && f3 >= ((float) f4.getTop()) + translationY && f3 <= ((float) f4.getBottom()) + translationY) {
                return f4;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j2 = this.mChildHelper.j();
        for (int i3 = 0; i3 < j2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.v() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.n(childViewHolderInt.a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.g()) {
            int j3 = this.mChildHelper.j();
            for (int i2 = 0; i2 < j3; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
                if (childViewHolderInt != null && !childViewHolderInt.v() && childViewHolderInt.k() == j2) {
                    if (!this.mChildHelper.n(childViewHolderInt.a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public boolean fling(int i2, int i3) {
        o oVar = this.mLayout;
        int i4 = 0;
        if (oVar == null) {
            Log.e(C0201.m82(13771), C0201.m82(13772));
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean k2 = oVar.k();
            boolean l2 = this.mLayout.l();
            if (!k2 || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (!l2 || Math.abs(i3) < this.mMinFlingVelocity) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = k2 || l2;
                dispatchNestedFling(f2, f3, z2);
                r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (k2) {
                        i4 = 1;
                    }
                    if (l2) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                    int i5 = this.mMaxFlingVelocity;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.mMaxFlingVelocity;
                    this.mViewFlinger.c(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View Q0 = this.mLayout.Q0(view, i2);
        if (Q0 != null) {
            return Q0;
        }
        boolean z3 = true;
        boolean z4 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.J0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.l()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.k()) {
                int i4 = (this.mLayout.Z() == 1) ^ (i2 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.J0(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException(C0201.m82(13773) + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0201.m82(13774) + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return C0201.m82(13776);
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(d0 d0Var) {
        if (d0Var.p(524) || !d0Var.s()) {
            return -1;
        }
        return this.mAdapterHelper.e(d0Var.c);
    }

    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.G();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.g() ? d0Var.k() : (long) d0Var.c;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.j();
        }
        return -1;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return jVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.g() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.k();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException(C0201.m82(13777) + view + C0201.m82(13778) + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.c) {
            return pVar.b;
        }
        if (this.mState.e() && (pVar.b() || pVar.d())) {
            return pVar.b;
        }
        Rect rect = pVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).e(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.c = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + C0201.m82(13779) + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(C0201.m82(13780) + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(b5.fastscroll_default_thickness), resources.getDimensionPixelSize(b5.fastscroll_minimum_range), resources.getDimensionPixelOffset(b5.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            o oVar = this.mLayout;
            if (oVar != null) {
                oVar.g(C0201.m82(13781));
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.p();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // defpackage.a3
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.x1(i2);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.mChildHelper.i(i2).getLayoutParams()).c = true;
        }
        this.mRecycler.s();
    }

    public void markKnownViewsInvalid() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.J()) {
                childViewHolderInt.b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void offsetChildrenHorizontal(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int g2 = this.mChildHelper.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.mChildHelper.f(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int j2 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.J() && childViewHolderInt.c >= i2) {
                childViewHolderInt.A(i3, false);
                this.mState.g = true;
            }
        }
        this.mRecycler.u(i2, i3);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.mChildHelper.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.A(i3 - i2, false);
                } else {
                    childViewHolderInt.A(i6, false);
                }
                this.mState.g = true;
            }
        }
        this.mRecycler.v(i2, i3);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.mChildHelper.j();
        for (int i5 = 0; i5 < j2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.J()) {
                int i6 = childViewHolderInt.c;
                if (i6 >= i4) {
                    childViewHolderInt.A(-i3, z2);
                    this.mState.g = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.i(i2 - 1, -i3, z2);
                    this.mState.g = true;
                }
            }
        }
        this.mRecycler.w(i2, i3, z2);
        requestLayout();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z2 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            e eVar = e.e.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new e();
                Display q2 = k3.q(this);
                float f2 = 60.0f;
                if (!isInEditMode() && q2 != null) {
                    float refreshRate = q2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                e eVar2 = this.mGapWorker;
                eVar2.c = (long) (1.0E9f / f2);
                e.e.set(eVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (ALLOW_THREAD_GAP_WORK && (eVar = this.mGapWorker) != null) {
            eVar.j(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).g(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.mLayout.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.k()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.l()) {
                        f3 = -axisValue;
                    } else if (this.mLayout.k()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean k2 = oVar.k();
        boolean l2 = this.mLayout.l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = k2 ? 1 : 0;
            if (l2) {
                i2 |= 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(C0201.m82(13784), C0201.m82(13782) + this.mScrollPointerId + C0201.m82(13783));
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (!k2 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (l2 && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        g2.a(C0201.m82(13785));
        dispatchLayout();
        g2.b();
        this.mFirstLayoutComplete = true;
    }

    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.Z0(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.mAdapter != null) {
                if (this.mState.e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.A1(i2, i3);
                this.mState.j = true;
                dispatchLayoutStep2();
                this.mLayout.D1(i2, i3);
                if (this.mLayout.G1()) {
                    this.mLayout.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.j = true;
                    dispatchLayoutStep2();
                    this.mLayout.D1(i2, i3);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.Z0(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.l) {
                    a0Var.h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f = gVar.c();
            } else {
                this.mState.f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.Z0(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.h = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.a());
        o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.c) != null) {
            oVar.c1(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.b(yVar2);
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                yVar.c = oVar.d1();
            } else {
                yVar.c = null;
            }
        }
        return yVar;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean k2 = oVar.k();
        boolean l2 = this.mLayout.l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            int i2 = k2 ? 1 : 0;
            if (l2) {
                i2 |= 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(obtain);
            this.mVelocityTracker.computeCurrentVelocity(C0188.f18, (float) this.mMaxFlingVelocity);
            float f2 = k2 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f3 = l2 ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !fling((int) f2, (int) f3)) {
                setScrollState(0);
            }
            resetScroll();
            z3 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(C0201.m82(13788), C0201.m82(13786) + this.mScrollPointerId + C0201.m82(13787));
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i3 = this.mLastTouchX - x3;
            int i4 = this.mLastTouchY - y3;
            if (this.mScrollState != 1) {
                if (k2) {
                    if (i3 > 0) {
                        i3 = Math.max(0, i3 - this.mTouchSlop);
                    } else {
                        i3 = Math.min(0, i3 + this.mTouchSlop);
                    }
                    if (i3 != 0) {
                        z2 = true;
                        if (l2) {
                            if (i4 > 0) {
                                i4 = Math.max(0, i4 - this.mTouchSlop);
                            } else {
                                i4 = Math.min(0, i4 + this.mTouchSlop);
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                }
                z2 = false;
                if (l2) {
                }
                if (z2) {
                }
            }
            int i5 = i3;
            int i6 = i4;
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (dispatchNestedPreScroll(k2 ? i5 : 0, l2 ? i6 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    i5 -= iArr4[0];
                    i6 -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i7 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i7 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x3 - iArr7[0];
                this.mLastTouchY = y3 - iArr7[1];
                if (scrollByInternal(k2 ? i5 : 0, l2 ? i6 : 0, motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.mGapWorker == null || (i5 == 0 && i6 == 0))) {
                    this.mGapWorker.f(this, i5, i6);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z3) {
            this.mVelocityTracker.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            k3.a0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        d0Var.F(0, 8192);
        if (this.mState.i && d0Var.y() && !d0Var.v() && !d0Var.J()) {
            this.mViewInfoStore.c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.e(d0Var, cVar);
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.k1(this.mRecycler);
            this.mLayout.l1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r2 = this.mChildHelper.r(view);
        if (r2) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r2);
        return r2;
    }

    public void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.x()) {
                childViewHolderInt.f();
            } else if (!childViewHolderInt.J()) {
                throw new IllegalArgumentException(C0201.m82(13789) + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g(C0201.m82(13790));
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + C0201.m82(13791) + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i2));
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void repositionShadowingViews() {
        d0 d0Var;
        int g2 = this.mChildHelper.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.mChildHelper.f(i2);
            d0 childViewHolder = getChildViewHolder(f2);
            if (!(childViewHolder == null || (d0Var = childViewHolder.i) == null)) {
                View view = d0Var.a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.b1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.r1(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int j2 = this.mChildHelper.j();
        for (int i2 = 0; i2 < j2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i2));
            if (!childViewHolderInt.J()) {
                childViewHolderInt.E();
            }
        }
    }

    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(C0201.m82(13792), C0201.m82(13793));
        } else if (!this.mLayoutSuppressed) {
            boolean k2 = oVar.k();
            boolean l2 = this.mLayout.l();
            if (k2 || l2) {
                if (!k2) {
                    i2 = 0;
                }
                if (!l2) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, null);
            }
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i7 = i9;
            i6 = i8;
            i5 = i2 - i8;
            i4 = i3 - i9;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = i5 - iArr4[0];
        int i11 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i12 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !z2.g(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), (float) i10, motionEvent.getY(), (float) i11);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        g2.a(C0201.m82(13794));
        fillRemainingScrollValues(this.mState);
        int w1 = i2 != 0 ? this.mLayout.w1(i2, this.mRecycler, this.mState) : 0;
        int y1 = i3 != 0 ? this.mLayout.y1(i3, this.mRecycler, this.mState) : 0;
        g2.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w(C0201.m82(13795), C0201.m82(13796));
    }

    public void scrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(C0201.m82(13797), C0201.m82(13798));
                return;
            }
            oVar.x1(i2);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(k kVar) {
        this.mAccessibilityDelegate = kVar;
        k3.h0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (isComputingLayout()) {
            d0Var.q = i2;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        k3.q0(d0Var.a, i2);
        return true;
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.g.c(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.k();
            this.mItemAnimator.v(null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.k();
                }
                this.mLayout.k1(this.mRecycler);
                this.mLayout.l1(this.mRecycler);
                this.mRecycler.c();
                if (this.mIsAttached) {
                    this.mLayout.A(this, this.mRecycler);
                }
                this.mLayout.E1(null);
                this.mLayout = null;
            } else {
                this.mRecycler.c();
            }
            this.mChildHelper.o();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.b == null) {
                    oVar.E1(this);
                    if (this.mIsAttached) {
                        this.mLayout.z(this);
                    }
                } else {
                    throw new IllegalArgumentException(C0201.m82(13799) + oVar + C0201.m82(13800) + oVar.b.exceptionLabel());
                }
            }
            this.mRecycler.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(13801));
    }

    @Override // defpackage.a3
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().n(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.mRecycler.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    public void setScrollState(int i2) {
        if (i2 != this.mScrollState) {
            this.mScrollState = i2;
            if (i2 != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(C0201.m82(13804), C0201.m82(13802) + i2 + C0201.m82(13803));
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.F(b0Var);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? v3.a(accessibilityEvent) : 0;
        if (a2 != 0) {
            i2 = a2;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(C0201.m82(13807), C0201.m82(13808));
            } else {
                oVar.I1(this, this.mState, i2);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().p(i2);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // defpackage.a3
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll(C0201.m82(13809));
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.mChildHelper.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.mChildHelper.i(i6);
            d0 childViewHolderInt = getChildViewHolderInt(i7);
            if (childViewHolderInt != null && !childViewHolderInt.J() && (i4 = childViewHolderInt.c) >= i2 && i4 < i5) {
                childViewHolderInt.b(2);
                childViewHolderInt.a(obj);
                ((p) i7.getLayoutParams()).c = true;
            }
        }
        this.mRecycler.M(i2, i3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a5.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    public d0 findViewHolderForPosition(int i2, boolean z2) {
        int j2 = this.mChildHelper.j();
        d0 d0Var = null;
        for (int i3 = 0; i3 < j2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.v()) {
                if (z2) {
                    if (childViewHolderInt.c != i2) {
                        continue;
                    }
                } else if (childViewHolderInt.m() != i2) {
                    continue;
                }
                if (!this.mChildHelper.n(childViewHolderInt.a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, C0188.f23);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().q(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().s(i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new p();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = l3.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = l3.d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (k3.u(this) == 0) {
            k3.q0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService(C0201.m82(13742));
        setAccessibilityDelegateCompat(new k(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c5.RecyclerView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, c5.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(c5.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(c5.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(c5.RecyclerView_android_clipToPadding, true);
        boolean z3 = obtainStyledAttributes.getBoolean(c5.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(c5.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(c5.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(c5.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(c5.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i2, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public static class p extends ViewGroup.MarginLayoutParams {
        public d0 a;
        public final Rect b = new Rect();
        public boolean c = true;
        public boolean d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.a.m();
        }

        public boolean b() {
            return this.a.y();
        }

        public boolean c() {
            return this.a.v();
        }

        public boolean d() {
            return this.a.t();
        }

        public p(int i, int i2) {
            super(i, i2);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
        }
    }

    public static class y extends f4 {
        public static final Parcelable.Creator<y> CREATOR = new a();
        public Parcelable c;

        static class a implements Parcelable.ClassLoaderCreator<y> {
            /* renamed from: a */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            /* renamed from: b */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            /* renamed from: c */
            public y[] newArray(int i) {
                return new y[i];
            }
        }

        public y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void b(y yVar) {
            this.c = yVar.c;
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        public y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException(C0201.m82(13775) + exceptionLabel());
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(C0201.m82(13805), C0201.m82(13806));
        } else if (!this.mLayoutSuppressed) {
            int i5 = 0;
            if (!oVar.k()) {
                i2 = 0;
            }
            if (!this.mLayout.l()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        startNestedScroll(i5, 1);
                    }
                    this.mViewFlinger.f(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }
}
