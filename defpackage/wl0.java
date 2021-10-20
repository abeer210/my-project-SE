package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.shockwave.pdfium.a;
import com.shockwave.pdfium.util.a;
import defpackage.tm0;

/* renamed from: wl0  reason: default package */
/* compiled from: DragPinchManager */
public class wl0 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    private xl0 a;
    private tl0 b;
    private GestureDetector c;
    private ScaleGestureDetector d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    public wl0(xl0 xl0, tl0 tl0) {
        this.a = xl0;
        this.b = tl0;
        this.c = new GestureDetector(xl0.getContext(), this);
        this.d = new ScaleGestureDetector(xl0.getContext(), this);
        xl0.setOnTouchListener(this);
    }

    private boolean a(float f2, float f3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if (this.a.H()) {
            if (abs2 > abs) {
                return true;
            }
        } else if (abs > abs2) {
            return true;
        }
        return false;
    }

    private boolean b(float f2, float f3) {
        int i;
        int i2;
        xl0 xl0 = this.a;
        zl0 zl0 = xl0.g;
        float f4 = (-xl0.getCurrentXOffset()) + f2;
        float f5 = (-this.a.getCurrentYOffset()) + f3;
        int j = zl0.j(this.a.H() ? f5 : f4, this.a.getZoom());
        a q = zl0.q(j, this.a.getZoom());
        if (this.a.H()) {
            i2 = (int) zl0.r(j, this.a.getZoom());
            i = (int) zl0.m(j, this.a.getZoom());
        } else {
            i = (int) zl0.r(j, this.a.getZoom());
            i2 = (int) zl0.m(j, this.a.getZoom());
        }
        for (a.b bVar : zl0.l(j)) {
            RectF s = zl0.s(j, i2, i, (int) q.b(), (int) q.a(), bVar.a());
            s.sort();
            if (s.contains(f4, f5)) {
                this.a.u.a(new om0(f2, f3, f4, f5, s, bVar));
                return true;
            }
        }
        return false;
    }

    private void e() {
        qm0 scrollHandle = this.a.getScrollHandle();
        if (scrollHandle != null && scrollHandle.g()) {
            scrollHandle.d();
        }
    }

    private void f(float f2, float f3) {
        float f4;
        float f5;
        int currentXOffset = (int) this.a.getCurrentXOffset();
        int currentYOffset = (int) this.a.getCurrentYOffset();
        xl0 xl0 = this.a;
        zl0 zl0 = xl0.g;
        float f6 = -zl0.m(xl0.getCurrentPage(), this.a.getZoom());
        float k = f6 - zl0.k(this.a.getCurrentPage(), this.a.getZoom());
        float f7 = 0.0f;
        if (this.a.H()) {
            f5 = -(this.a.e0(zl0.h()) - ((float) this.a.getWidth()));
            f4 = k + ((float) this.a.getHeight());
            f7 = f6;
            f6 = 0.0f;
        } else {
            float width = k + ((float) this.a.getWidth());
            f4 = -(this.a.e0(zl0.f()) - ((float) this.a.getHeight()));
            f5 = width;
        }
        this.b.g(currentXOffset, currentYOffset, (int) f2, (int) f3, (int) f5, (int) f6, (int) f4, (int) f7);
    }

    private void g(MotionEvent motionEvent) {
        this.a.Q();
        e();
        if (!this.b.f()) {
            this.a.X();
        }
    }

    private void h(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float f4;
        float f5;
        if (a(f2, f3)) {
            int i = -1;
            if (!this.a.H() ? f2 <= 0.0f : f3 <= 0.0f) {
                i = 1;
            }
            if (this.a.H()) {
                f4 = motionEvent2.getY();
                f5 = motionEvent.getY();
            } else {
                f4 = motionEvent2.getX();
                f5 = motionEvent.getX();
            }
            float f6 = f4 - f5;
            int max = Math.max(0, Math.min(this.a.getPageCount() - 1, this.a.z(this.a.getCurrentXOffset() - (this.a.getZoom() * f6), this.a.getCurrentYOffset() - (f6 * this.a.getZoom())) + i));
            this.b.h(-this.a.d0(max, this.a.A(max)));
        }
    }

    public void c() {
        this.g = false;
    }

    public void d() {
        this.g = true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.a.E()) {
            return false;
        }
        if (this.a.getZoom() < this.a.getMidZoom()) {
            this.a.j0(motionEvent.getX(), motionEvent.getY(), this.a.getMidZoom());
            return true;
        } else if (this.a.getZoom() < this.a.getMaxZoom()) {
            this.a.j0(motionEvent.getX(), motionEvent.getY(), this.a.getMaxZoom());
            return true;
        } else {
            this.a.a0();
            return true;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.b.m();
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float f4;
        float f5;
        int i;
        if (!this.a.G()) {
            return false;
        }
        if (this.a.r()) {
            if (this.a.W()) {
                f(f2, f3);
            } else {
                h(motionEvent, motionEvent2, f2, f3);
            }
            return true;
        }
        int currentXOffset = (int) this.a.getCurrentXOffset();
        int currentYOffset = (int) this.a.getCurrentYOffset();
        xl0 xl0 = this.a;
        zl0 zl0 = xl0.g;
        if (xl0.H()) {
            f5 = -(this.a.e0(zl0.h()) - ((float) this.a.getWidth()));
            f4 = zl0.e(this.a.getZoom());
            i = this.a.getHeight();
        } else {
            f5 = -(zl0.e(this.a.getZoom()) - ((float) this.a.getWidth()));
            f4 = this.a.e0(zl0.f());
            i = this.a.getHeight();
        }
        this.b.g(currentXOffset, currentYOffset, (int) f2, (int) f3, (int) f5, 0, (int) (-(f4 - ((float) i))), 0);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.a.u.c(motionEvent);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float zoom;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom2 = this.a.getZoom() * scaleFactor;
        float f2 = tm0.b.b;
        if (zoom2 < f2) {
            zoom = this.a.getZoom();
        } else {
            f2 = tm0.b.a;
            if (zoom2 > f2) {
                zoom = this.a.getZoom();
            }
            this.a.f0(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
            return true;
        }
        scaleFactor = f2 / zoom;
        this.a.f0(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.a.Q();
        e();
        this.f = false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        this.e = true;
        if (this.a.I() || this.a.G()) {
            this.a.R(-f2, -f3);
        }
        if (!this.f || this.a.s()) {
            this.a.P();
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qm0 scrollHandle;
        boolean h = this.a.u.h(motionEvent);
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        if (!h && !b2 && (scrollHandle = this.a.getScrollHandle()) != null && !this.a.t()) {
            if (!scrollHandle.g()) {
                scrollHandle.a();
            } else {
                scrollHandle.b();
            }
        }
        this.a.performClick();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.g) {
            return false;
        }
        boolean z = this.c.onTouchEvent(motionEvent) || this.d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.e) {
            this.e = false;
            g(motionEvent);
        }
        return z;
    }
}
