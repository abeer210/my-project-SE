package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import vigqyno.C0188;

/* compiled from: FastScroller */
public class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    public int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();
    private final int a;
    private final int b;
    public final StateListDrawable c;
    public final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    private int q = 0;
    private int r = 0;
    private RecyclerView s;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    public final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* compiled from: FastScroller */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.q(C0188.f21);
        }
    }

    /* compiled from: FastScroller */
    class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller */
    private class c extends AnimatorListenerAdapter {
        private boolean a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) d.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* compiled from: FastScroller */
    private class C0023d implements ValueAnimator.AnimatorUpdateListener {
        public C0023d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.c.setAlpha(floatValue);
            d.this.d.setAlpha(floatValue);
            d.this.v();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i2, drawable.getIntrinsicWidth());
        this.i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.b = i4;
        this.c.setAlpha(255);
        this.d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new C0023d());
        j(recyclerView);
    }

    private void C(float f2) {
        int[] p2 = p();
        float max = Math.max((float) p2[0], Math.min((float) p2[1], f2));
        if (Math.abs(((float) this.l) - max) >= 2.0f) {
            int x2 = x(this.m, max, p2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
            if (x2 != 0) {
                this.s.scrollBy(0, x2);
            }
            this.m = max;
        }
    }

    private void k() {
        this.s.removeCallbacks(this.B);
    }

    private void l() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i2 = this.r;
        int i3 = this.i;
        int i4 = i2 - i3;
        int i5 = this.o;
        int i6 = this.n;
        int i7 = i5 - (i6 / 2);
        this.g.setBounds(0, 0, i6, i3);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float) i4);
        this.h.draw(canvas);
        canvas.translate((float) i7, 0.0f);
        this.g.draw(canvas);
        canvas.translate((float) (-i7), (float) (-i4));
    }

    private void n(Canvas canvas) {
        int i2 = this.q;
        int i3 = this.e;
        int i4 = i2 - i3;
        int i5 = this.l;
        int i6 = this.k;
        int i7 = i5 - (i6 / 2);
        this.c.setBounds(0, 0, i3, i6);
        this.d.setBounds(0, 0, this.f, this.r);
        if (s()) {
            this.d.draw(canvas);
            canvas.translate((float) this.e, (float) i7);
            canvas.scale(-1.0f, 1.0f);
            this.c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.e), (float) (-i7));
            return;
        }
        canvas.translate((float) i4, 0.0f);
        this.d.draw(canvas);
        canvas.translate(0.0f, (float) i7);
        this.c.draw(canvas);
        canvas.translate((float) (-i4), (float) (-i7));
    }

    private int[] o() {
        int[] iArr = this.y;
        int i2 = this.b;
        iArr[0] = i2;
        iArr[1] = this.q - i2;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.x;
        int i2 = this.b;
        iArr[0] = i2;
        iArr[1] = this.r - i2;
        return iArr;
    }

    private void r(float f2) {
        int[] o2 = o();
        float max = Math.max((float) o2[0], Math.min((float) o2[1], f2));
        if (Math.abs(((float) this.o) - max) >= 2.0f) {
            int x2 = x(this.p, max, o2, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
            if (x2 != 0) {
                this.s.scrollBy(x2, 0);
            }
            this.p = max;
        }
    }

    private boolean s() {
        return k3.w(this.s) == 1;
    }

    private void w(int i2) {
        k();
        this.s.postDelayed(this.B, (long) i2);
    }

    private int x(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void z() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    public void A() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0);
        this.z.start();
    }

    public void B(int i2, int i3) {
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i4 = this.r;
        this.t = computeVerticalScrollRange - i4 > 0 && i4 >= this.a;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i5 = this.q;
        boolean z2 = computeHorizontalScrollRange - i5 > 0 && i5 >= this.a;
        this.u = z2;
        if (this.t || z2) {
            if (this.t) {
                float f2 = (float) i4;
                this.l = (int) ((f2 * (((float) i3) + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (this.u) {
                float f3 = (float) i5;
                this.o = (int) ((f3 * (((float) i2) + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = this.v;
            if (i6 == 0 || i6 == 1) {
                y(1);
            }
        } else if (this.v != 0) {
            y(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u2 = u(motionEvent.getX(), motionEvent.getY());
                boolean t2 = t(motionEvent.getX(), motionEvent.getY());
                if (u2 || t2) {
                    if (t2) {
                        this.w = 1;
                        this.p = (float) ((int) motionEvent.getX());
                    } else if (u2) {
                        this.w = 2;
                        this.m = (float) ((int) motionEvent.getY());
                    }
                    y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                y(1);
                this.w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                A();
                if (this.w == 1) {
                    r(motionEvent.getX());
                }
                if (this.w == 2) {
                    C(motionEvent.getY());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 == 1) {
            boolean u2 = u(motionEvent.getX(), motionEvent.getY());
            boolean t2 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u2 && !t2) {
                return false;
            }
            if (t2) {
                this.w = 1;
                this.p = (float) ((int) motionEvent.getX());
            } else if (u2) {
                this.w = 2;
                this.m = (float) ((int) motionEvent.getY());
            }
            y(2);
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.t) {
                n(canvas);
            }
            if (this.u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    public void q(int i2) {
        int i3 = this.A;
        if (i3 == 1) {
            this.z.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration((long) i2);
        this.z.start();
    }

    public boolean t(float f2, float f3) {
        if (f3 >= ((float) (this.r - this.i))) {
            int i2 = this.o;
            int i3 = this.n;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    public boolean u(float f2, float f3) {
        if (!s() ? f2 >= ((float) (this.q - this.e)) : f2 <= ((float) (this.e / 2))) {
            int i2 = this.l;
            int i3 = this.k;
            return f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)));
        }
    }

    public void v() {
        this.s.invalidate();
    }

    public void y(int i2) {
        if (i2 == 2 && this.v != 2) {
            this.c.setState(D);
            k();
        }
        if (i2 == 0) {
            v();
        } else {
            A();
        }
        if (this.v == 2 && i2 != 2) {
            this.c.setState(E);
            w(1200);
        } else if (i2 == 1) {
            w(1500);
        }
        this.v = i2;
    }
}
