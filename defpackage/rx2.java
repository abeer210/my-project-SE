package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.widget.i;
import defpackage.w90;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: rx2  reason: default package */
/* compiled from: Attacher */
public class rx2 implements View.OnTouchListener, vx2 {
    private final float[] a = new float[9];
    private final RectF b = new RectF();
    private final Interpolator c = new AccelerateDecelerateInterpolator();
    private float d = 1.0f;
    private float e = 1.75f;
    private float f = 3.0f;
    private long g = 200;
    private xx2 h;
    private t2 i;
    private final Matrix j = new Matrix();
    private int k = -1;
    private int l = -1;
    private c m;
    private WeakReference<oa0<ba0>> n;
    private tx2 o;
    private wx2 p;
    private View.OnLongClickListener q;
    private ux2 u;

    /* renamed from: rx2$a */
    /* compiled from: Attacher */
    class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (rx2.this.q != null) {
                rx2.this.q.onLongClick(rx2.this.r());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: rx2$b */
    /* compiled from: Attacher */
    public class b implements Runnable {
        private final float a;
        private final float b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;

        public b(float f2, float f3, float f4, float f5) {
            this.a = f4;
            this.b = f5;
            this.d = f2;
            this.e = f3;
        }

        private float a() {
            return rx2.this.c.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / ((float) rx2.this.g)));
        }

        public void run() {
            oa0<ba0> r = rx2.this.r();
            if (r != null) {
                float a2 = a();
                float f2 = this.d;
                rx2.this.a((f2 + ((this.e - f2) * a2)) / rx2.this.y(), this.a, this.b);
                if (a2 < 1.0f) {
                    rx2.this.C(r, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: rx2$c */
    /* compiled from: Attacher */
    public class c implements Runnable {
        private final i a;
        private int b;
        private int c;

        public c(Context context) {
            this.a = i.c(context);
        }

        public void a() {
            this.a.a();
        }

        public void b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF o = rx2.this.o();
            if (o != null) {
                int round = Math.round(-o.left);
                float f = (float) i;
                if (f < o.width()) {
                    i5 = Math.round(o.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-o.top);
                float f2 = (float) i2;
                if (f2 < o.height()) {
                    i7 = Math.round(o.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.b = round;
                this.c = round2;
                if (round != i5 || round2 != i7) {
                    this.a.e(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        public void run() {
            oa0<ba0> r;
            if (!this.a.h() && (r = rx2.this.r()) != null && this.a.b()) {
                int f = this.a.f();
                int g = this.a.g();
                rx2.this.j.postTranslate((float) (this.b - f), (float) (this.c - g));
                r.invalidate();
                this.b = f;
                this.c = g;
                rx2.this.C(r, this);
            }
        }
    }

    public rx2(oa0<ba0> oa0) {
        this.n = new WeakReference<>(oa0);
        oa0.getHierarchy().u(w90.c.c);
        oa0.setOnTouchListener(this);
        this.h = new xx2(oa0.getContext(), this);
        t2 t2Var = new t2(oa0.getContext(), new a());
        this.i = t2Var;
        t2Var.b(new sx2(this));
    }

    private int A() {
        oa0<ba0> r = r();
        if (r != null) {
            return (r.getWidth() - r.getPaddingLeft()) - r.getPaddingRight();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void C(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    private void D() {
        this.j.reset();
        l();
        oa0<ba0> r = r();
        if (r != null) {
            r.invalidate();
        }
    }

    private void R() {
        if (this.l != -1 || this.k != -1) {
            D();
        }
    }

    private void j() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.a();
            this.m = null;
        }
    }

    private void m() {
        RectF o2;
        oa0<ba0> r = r();
        if (r != null && y() < this.d && (o2 = o()) != null) {
            r.post(new b(y(), this.d, o2.centerX(), o2.centerY()));
        }
    }

    private static void n(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException(C0201.m82(10558));
        } else if (f3 >= f4) {
            throw new IllegalArgumentException(C0201.m82(10557));
        }
    }

    private RectF p(Matrix matrix) {
        oa0<ba0> r = r();
        if (r == null) {
            return null;
        }
        if (this.l == -1 && this.k == -1) {
            return null;
        }
        this.b.set(0.0f, 0.0f, (float) this.l, (float) this.k);
        r.getHierarchy().m(this.b);
        matrix.mapRect(this.b);
        return this.b;
    }

    private float s(Matrix matrix, int i2) {
        matrix.getValues(this.a);
        return this.a[i2];
    }

    private int z() {
        oa0<ba0> r = r();
        if (r != null) {
            return (r.getHeight() - r.getPaddingTop()) - r.getPaddingBottom();
        }
        return 0;
    }

    public void B() {
        j();
    }

    public void E(boolean z) {
    }

    public void F(float f2) {
        n(this.d, this.e, f2);
        this.f = f2;
    }

    public void G(float f2) {
        n(this.d, f2, this.f);
        this.e = f2;
    }

    public void H(float f2) {
        n(f2, this.e, this.f);
        this.d = f2;
    }

    public void I(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.i.b(onDoubleTapListener);
        } else {
            this.i.b(new sx2(this));
        }
    }

    public void J(View.OnLongClickListener onLongClickListener) {
        this.q = onLongClickListener;
    }

    public void K(tx2 tx2) {
        this.o = tx2;
    }

    public void L(wx2 wx2) {
        this.p = wx2;
    }

    public void M(float f2) {
        O(f2, false);
    }

    public void N(float f2, float f3, float f4, boolean z) {
        oa0<ba0> r = r();
        if (r != null && f2 >= this.d && f2 <= this.f) {
            if (z) {
                r.post(new b(y(), f2, f3, f4));
                return;
            }
            this.j.setScale(f2, f2, f3, f4);
            k();
        }
    }

    public void O(float f2, boolean z) {
        oa0<ba0> r = r();
        if (r != null) {
            N(f2, (float) (r.getRight() / 2), (float) (r.getBottom() / 2), false);
        }
    }

    public void P(long j2) {
        if (j2 < 0) {
            j2 = 200;
        }
        this.g = j2;
    }

    public void Q(int i2, int i3) {
        this.l = i2;
        this.k = i3;
        R();
    }

    @Override // defpackage.vx2
    public void a(float f2, float f3, float f4) {
        if (y() < this.f || f2 < 1.0f) {
            ux2 ux2 = this.u;
            if (ux2 != null) {
                ux2.a(f2, f3, f4);
            }
            this.j.postScale(f2, f2, f3, f4);
            k();
        }
    }

    @Override // defpackage.vx2
    public void b(float f2, float f3, float f4, float f5) {
        oa0<ba0> r = r();
        if (r != null) {
            c cVar = new c(r.getContext());
            this.m = cVar;
            cVar.b(A(), z(), (int) f4, (int) f5);
            r.post(this.m);
        }
    }

    @Override // defpackage.vx2
    public void d() {
        m();
    }

    public void k() {
        oa0<ba0> r = r();
        if (r != null && l()) {
            r.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r0 < r1) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    public boolean l() {
        float f2;
        float A;
        float f3;
        float f4;
        RectF p2 = p(q());
        if (p2 == null) {
            return false;
        }
        float height = p2.height();
        float width = p2.width();
        float z = (float) z();
        float f5 = 0.0f;
        if (height <= z) {
            z = (z - height) / 2.0f;
            f4 = p2.top;
        } else {
            float f6 = p2.top;
            if (f6 > 0.0f) {
                f2 = -f6;
            } else {
                f4 = p2.bottom;
                if (f4 >= z) {
                    f2 = 0.0f;
                }
            }
            A = (float) A();
            if (width > A) {
                A = (A - width) / 2.0f;
                f3 = p2.left;
            } else {
                float f7 = p2.left;
                if (f7 > 0.0f) {
                    f5 = -f7;
                } else {
                    f3 = p2.right;
                }
                this.j.postTranslate(f5, f2);
                return true;
            }
            f5 = A - f3;
            this.j.postTranslate(f5, f2);
            return true;
        }
        f2 = z - f4;
        A = (float) A();
        if (width > A) {
        }
        f5 = A - f3;
        this.j.postTranslate(f5, f2);
        return true;
    }

    public RectF o() {
        l();
        return p(q());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        int c2 = z2.c(motionEvent);
        if (c2 == 0) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            j();
        } else if ((c2 == 1 || c2 == 3) && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        boolean d2 = this.h.d();
        boolean c3 = this.h.c();
        boolean g2 = this.h.g(motionEvent);
        if (d2 || this.h.d()) {
        }
        if (!c3 && !this.h.c()) {
        }
        if (this.i.a(motionEvent)) {
            return true;
        }
        return g2;
    }

    public Matrix q() {
        return this.j;
    }

    public oa0<ba0> r() {
        return this.n.get();
    }

    public float t() {
        return this.f;
    }

    public float u() {
        return this.e;
    }

    public float v() {
        return this.d;
    }

    public tx2 w() {
        return this.o;
    }

    public wx2 x() {
        return this.p;
    }

    public float y() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) s(this.j, 0), 2.0d)) + ((float) Math.pow((double) s(this.j, 3), 2.0d))));
    }
}
