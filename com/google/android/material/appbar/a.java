package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import vigqyno.C0188;

/* compiled from: HeaderBehavior */
public abstract class a<V extends View> extends c<V> {
    private Runnable d;
    public OverScroller e;
    private boolean f;
    private int g = -1;
    private int h;
    private int i = -1;
    private VelocityTracker j;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    /* compiled from: HeaderBehavior */
    public class RunnableC0065a implements Runnable {
        private final CoordinatorLayout a;
        private final V b;

        public RunnableC0065a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.google.android.material.appbar.a */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.google.android.material.appbar.a */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.b != null && (overScroller = a.this.e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.P(this.a, this.b, aVar.e.getCurrY());
                    k3.a0(this.b, this);
                    return;
                }
                a.this.N(this.a, this.b);
            }
        }
    }

    public a() {
    }

    private void I() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.g);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                this.h = y;
                O(coordinatorLayout, v, this.h - y, K(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.g = motionEvent.getPointerId(i2);
                    this.h = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (!this.f && !z) {
                return false;
            }
        }
        VelocityTracker velocityTracker3 = this.j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.j.computeCurrentVelocity(C0188.f18);
            J(coordinatorLayout, v, -L(v), 0, this.j.getYVelocity(this.g));
            z = true;
            this.f = false;
            this.g = -1;
            velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.j = null;
            }
            velocityTracker = this.j;
            if (velocityTracker != null) {
            }
            return !this.f ? true : true;
        }
        z = false;
        this.f = false;
        this.g = -1;
        velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
        }
        velocityTracker = this.j;
        if (velocityTracker != null) {
        }
        if (!this.f) {
        }
    }

    public abstract boolean H(V v);

    public final boolean J(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        Runnable runnable = this.d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, E(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.e.computeScrollOffset()) {
            RunnableC0065a aVar = new RunnableC0065a(coordinatorLayout, v);
            this.d = aVar;
            k3.a0(v, aVar);
            return true;
        }
        N(coordinatorLayout, v);
        return false;
    }

    public abstract int K(V v);

    public abstract int L(V v);

    public abstract int M();

    public abstract void N(CoordinatorLayout coordinatorLayout, V v);

    public final int O(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return Q(coordinatorLayout, v, M() - i2, i3, i4);
    }

    public int P(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return Q(coordinatorLayout, v, i2, C0188.f23, C0188.f24);
    }

    public abstract int Q(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            int i2 = this.g;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.h) > this.i) {
                this.h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = H(v) && coordinatorLayout.G(v, x, y2);
            this.f = z;
            if (z) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
