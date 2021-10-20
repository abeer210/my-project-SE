package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: i4  reason: default package */
/* compiled from: ViewDragHelper */
public class i4 {
    private static final Interpolator w = new a();
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private OverScroller q;
    private final c r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable v = new b();

    /* renamed from: i4$a */
    /* compiled from: ViewDragHelper */
    static class a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: i4$b */
    /* compiled from: ViewDragHelper */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            i4.this.J(0);
        }
    }

    /* renamed from: i4$c */
    /* compiled from: ViewDragHelper */
    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(int i) {
            return i;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i, int i2) {
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
        }

        public void i(View view, int i) {
        }

        public abstract void j(int i);

        public abstract void k(View view, int i, int i2, int i3, int i4);

        public abstract void l(View view, float f, float f2);

        public abstract boolean m(View view, int i);
    }

    private i4(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException(C0201.m82(18029));
        } else if (cVar != null) {
            this.u = viewGroup;
            this.r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, w);
        } else {
            throw new IllegalArgumentException(C0201.m82(18028));
        }
    }

    private boolean C(int i2) {
        if (B(i2)) {
            return true;
        }
        Log.e(C0201.m82(18034), C0201.m82(18030) + i2 + C0201.m82(18031) + C0201.m82(18032) + C0201.m82(18033));
        return false;
    }

    private void F() {
        this.l.computeCurrentVelocity(C0188.f18, this.m);
        p(g(this.l.getXVelocity(this.c), this.n, this.m), g(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private void G(float f2, float f3, int i2) {
        int i3 = 1;
        if (!c(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = iArr[i2] | i3;
            this.r.f(i3, i2);
        }
    }

    private void H(float f2, float f3, int i2) {
        s(i2);
        float[] fArr = this.d;
        this.f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.e;
        this.g[i2] = f3;
        fArr2[i2] = f3;
        this.h[i2] = x((int) f2, (int) f3);
        this.k |= 1 << i2;
    }

    private void I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (C(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (this.p & i3) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.r.g(i3)) {
            int[] iArr = this.j;
            iArr[i2] = iArr[i2] | i3;
            return false;
        } else if ((this.i[i2] & i3) != 0 || abs <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.d(view) > 0;
        boolean z2 = this.r.e(view) > 0;
        if (z && z2) {
            int i2 = this.b;
            if ((f2 * f2) + (f3 * f3) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f2) > ((float) this.b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f3) <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private float g(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 > 0.0f ? f4 : -f4;
        }
        return f2;
    }

    private int h(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 > 0 ? i4 : -i4;
        }
        return i2;
    }

    private void i() {
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void j(int i2) {
        if (this.d != null && B(i2)) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k = ((1 << i2) ^ -1) & this.k;
        }
    }

    private int k(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f2 = (float) (width / 2);
        float q2 = f2 + (q(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(q2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    private int l(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int h2 = h(i4, (int) this.n, (int) this.m);
        int h3 = h(i5, (int) this.n, (int) this.m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(h2);
        int abs4 = Math.abs(h3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (h2 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f6 = f3 / f2;
        if (h3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f7 = f5 / f4;
        return (int) ((((float) k(i2, h2, this.r.d(view))) * f6) + (((float) k(i3, h3, this.r.e(view))) * f7));
    }

    public static i4 n(ViewGroup viewGroup, float f2, c cVar) {
        i4 o2 = o(viewGroup, cVar);
        o2.b = (int) (((float) o2.b) * (1.0f / f2));
        return o2;
    }

    public static i4 o(ViewGroup viewGroup, c cVar) {
        return new i4(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f2, float f3) {
        this.t = true;
        this.r.l(this.s, f2, f3);
        this.t = false;
        if (this.a == 1) {
            J(0);
        }
    }

    private float q(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private void r(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i4 != 0) {
            i2 = this.r.a(this.s, i2, i4);
            k3.T(this.s, i2 - left);
        }
        if (i5 != 0) {
            i3 = this.r.b(this.s, i3, i5);
            k3.U(this.s, i3 - top);
        }
        if (i4 != 0 || i5 != 0) {
            this.r.k(this.s, i2, i3, i2 - left, i3 - top);
        }
    }

    private void s(int i2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private boolean u(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.q.abortAnimation();
            J(0);
            return false;
        }
        this.q.startScroll(left, top, i6, i7, l(this.s, i6, i7, i4, i5));
        J(2);
        return true;
    }

    private int x(int i2, int i3) {
        int i4 = i2 < this.u.getLeft() + this.o ? 1 : 0;
        if (i3 < this.u.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.u.getRight() - this.o) {
            i4 |= 2;
        }
        return i3 > this.u.getBottom() - this.o ? i4 | 8 : i4;
    }

    public boolean A(int i2, int i3) {
        return D(this.s, i2, i3);
    }

    public boolean B(int i2) {
        return ((1 << i2) & this.k) != 0;
    }

    public boolean D(View view, int i2, int i3) {
        if (view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void E(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t2 = t((int) x, (int) y);
            H(x, y, pointerId);
            P(t2, pointerId);
            int i4 = this.h[pointerId];
            int i5 = this.p;
            if ((i4 & i5) != 0) {
                this.r.h(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                F();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    p(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                H(x2, y2, pointerId2);
                if (this.a == 0) {
                    P(t((int) x2, (int) y2), pointerId2);
                    int i6 = this.h[pointerId2];
                    int i7 = this.p;
                    if ((i6 & i7) != 0) {
                        this.r.h(i6 & i7, pointerId2);
                    }
                } else if (A((int) x2, (int) y2)) {
                    P(this.s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId3 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.c) {
                            View t3 = t((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.s;
                            if (t3 == view && P(view, pointerId4)) {
                                i2 = this.c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        F();
                    }
                }
                j(pointerId3);
            }
        } else if (this.a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (C(pointerId5)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.d[pointerId5];
                    float f3 = y3 - this.e[pointerId5];
                    G(f2, f3, pointerId5);
                    if (this.a != 1) {
                        View t4 = t((int) x3, (int) y3);
                        if (f(t4, f2, f3) && P(t4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            I(motionEvent);
        } else if (C(this.c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f;
            int i8 = this.c;
            int i9 = (int) (x4 - fArr[i8]);
            int i10 = (int) (y4 - this.g[i8]);
            r(this.s.getLeft() + i9, this.s.getTop() + i10, i9, i10);
            I(motionEvent);
        }
    }

    public void J(int i2) {
        this.u.removeCallbacks(this.v);
        if (this.a != i2) {
            this.a = i2;
            this.r.j(i2);
            if (this.a == 0) {
                this.s = null;
            }
        }
    }

    public void K(int i2) {
        this.p = i2;
    }

    public void L(float f2) {
        this.n = f2;
    }

    public boolean M(int i2, int i3) {
        if (this.t) {
            return u(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException(C0201.m82(18035));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    public boolean N(MotionEvent motionEvent) {
        boolean z;
        View t2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            H(x, y, pointerId);
                            int i2 = this.a;
                            if (i2 == 0) {
                                int i3 = this.h[pointerId];
                                int i4 = this.p;
                                if ((i3 & i4) != 0) {
                                    this.r.h(i3 & i4, pointerId);
                                }
                            } else if (i2 == 2 && (t2 = t((int) x, (int) y)) == this.s) {
                                P(t2, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            j(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (!(this.d == null || this.e == null)) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        if (C(pointerId2)) {
                            float x2 = motionEvent.getX(i5);
                            float y2 = motionEvent.getY(i5);
                            float f2 = x2 - this.d[pointerId2];
                            float f3 = y2 - this.e[pointerId2];
                            View t3 = t((int) x2, (int) y2);
                            boolean z2 = t3 != null && f(t3, f2, f3);
                            if (z2) {
                                int left = t3.getLeft();
                                int i6 = (int) f2;
                                int a2 = this.r.a(t3, left + i6, i6);
                                int top = t3.getTop();
                                int i7 = (int) f3;
                                int b2 = this.r.b(t3, top + i7, i7);
                                int d2 = this.r.d(t3);
                                int e2 = this.r.e(t3);
                                if (d2 != 0) {
                                    if (d2 > 0) {
                                    }
                                }
                                if (e2 != 0) {
                                    if (e2 > 0 && b2 == top) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            G(f2, f3, pointerId2);
                            if (this.a != 1) {
                                if (z2 && P(t3, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    I(motionEvent);
                }
                z = false;
            }
            a();
            z = false;
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            z = false;
            int pointerId3 = motionEvent.getPointerId(0);
            H(x3, y3, pointerId3);
            View t4 = t((int) x3, (int) y3);
            if (t4 == this.s && this.a == 2) {
                P(t4, pointerId3);
            }
            int i8 = this.h[pointerId3];
            int i9 = this.p;
            if ((i8 & i9) != 0) {
                this.r.h(i8 & i9, pointerId3);
            }
        }
        if (this.a == 1) {
            return true;
        }
        return z;
    }

    public boolean O(View view, int i2, int i3) {
        this.s = view;
        this.c = -1;
        boolean u2 = u(i2, i3, 0, 0);
        if (!u2 && this.a == 0 && this.s != null) {
            this.s = null;
        }
        return u2;
    }

    public boolean P(View view, int i2) {
        if (view == this.s && this.c == i2) {
            return true;
        }
        if (view == null || !this.r.m(view, i2)) {
            return false;
        }
        this.c = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.c = -1;
        i();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.u) {
            this.s = view;
            this.c = i2;
            this.r.i(view, i2);
            J(1);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(18036) + this.u + C0201.m82(18037));
    }

    public boolean d(int i2) {
        int length = this.d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (e(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i2, int i3) {
        if (!B(i3)) {
            return false;
        }
        boolean z = (i2 & 1) == 1;
        boolean z2 = (i2 & 2) == 2;
        float f2 = this.f[i3] - this.d[i3];
        float f3 = this.g[i3] - this.e[i3];
        if (z && z2) {
            int i4 = this.b;
            if ((f2 * f2) + (f3 * f3) > ((float) (i4 * i4))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f2) > ((float) this.b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f3) <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean m(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                k3.T(this.s, left);
            }
            if (top != 0) {
                k3.U(this.s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.k(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.v);
                } else {
                    J(0);
                }
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public View t(int i2, int i3) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.u;
            this.r.c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.s;
    }

    public int w() {
        return this.o;
    }

    public int y() {
        return this.b;
    }

    public int z() {
        return this.a;
    }
}
