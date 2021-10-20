package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {
    private static final int u = ViewConfiguration.getTapTimeout();
    public final C0016a a = new C0016a();
    private final Interpolator b = new AccelerateInterpolator();
    public final View c;
    private Runnable d;
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int g;
    private int h;
    private float[] i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    private boolean p;
    private boolean q;

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    public static class C0016a {
        private int a;
        private int b;
        private float c;
        private float d;
        private long e = Long.MIN_VALUE;
        private long f = 0;
        private int g = 0;
        private int h = 0;
        private long i = -1;
        private float j;
        private int k;

        private float e(long j2) {
            if (j2 < this.e) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j2 < j3) {
                return a.e(((float) (j2 - this.e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.e(((float) j4) / ((float) this.k), 0.0f, 1.0f));
        }

        private float g(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f)) * g2;
                this.g = (int) (this.c * f2);
                this.h = (int) (f2 * this.d);
                return;
            }
            throw new RuntimeException(C0201.m82(25193));
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.c = f2;
            this.d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AutoScrollHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.o) {
                if (aVar.m) {
                    aVar.m = false;
                    aVar.a.m();
                }
                C0016a aVar2 = a.this.a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.o = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.n) {
                    aVar3.n = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                k3.a0(a.this.c, this);
            }
        }
    }

    public a(View view) {
        this.c = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float) ((int) ((1575.0f * f2) + 0.5f));
        o(f3, f3);
        float f4 = (float) ((int) ((f2 * 315.0f) + 0.5f));
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(u);
        r(C0188.f21);
        q(C0188.f21);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.e[i2], f3, this.f[i2], f2);
        if (h2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.i[i2];
        float f6 = this.j[i2];
        float f7 = this.k[i2];
        float f8 = f5 * f4;
        if (h2 > 0.0f) {
            return e(h2 * f8, f6, f7);
        }
        return -e((-h2) * f8, f6, f7);
    }

    public static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                return (!this.o || this.g != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.b.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.b.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.m) {
            this.o = false;
        } else {
            this.a.i();
        }
    }

    private void v() {
        int i2;
        if (this.d == null) {
            this.d = new b();
        }
        this.o = true;
        this.m = true;
        if (this.l || (i2 = this.h) <= 0) {
            this.d.run();
        } else {
            k3.b0(this.c, this.d, (long) i2);
        }
        this.l = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.h = i2;
        return this;
    }

    public a l(int i2) {
        this.g = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.p && !z) {
            i();
        }
        this.p = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            i();
            if (!this.q && this.o) {
                return true;
            }
        }
        this.n = true;
        this.l = false;
        this.a.l(d(0, motionEvent.getX(), (float) view.getWidth(), (float) this.c.getWidth()), d(1, motionEvent.getY(), (float) view.getHeight(), (float) this.c.getHeight()));
        if (!this.o && u()) {
            v();
        }
        return !this.q ? false : false;
    }

    public a p(float f2, float f3) {
        float[] fArr = this.j;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.a.j(i2);
        return this;
    }

    public a r(int i2) {
        this.a.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.e;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.i;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0016a aVar = this.a;
        int f2 = aVar.f();
        int d2 = aVar.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
