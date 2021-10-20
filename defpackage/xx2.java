package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import vigqyno.C0188;

/* renamed from: xx2  reason: default package */
/* compiled from: ScaleDragDetector */
public class xx2 implements ScaleGestureDetector.OnScaleGestureListener {
    private final float a;
    private final float b;
    private final ScaleGestureDetector c;
    private final vx2 d;
    private VelocityTracker e;
    private boolean f;
    public float g;
    public float h;
    private int i = -1;
    private int j = 0;

    public xx2(Context context, vx2 vx2) {
        this.c = new ScaleGestureDetector(context, this);
        this.d = vx2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.a = (float) viewConfiguration.getScaledTouchSlop();
    }

    private float a(MotionEvent motionEvent) {
        try {
            return z2.e(motionEvent, this.j);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float b(MotionEvent motionEvent) {
        try {
            return z2.f(motionEvent, this.j);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private void e(int i2, MotionEvent motionEvent) {
        int i3 = 0;
        if (i2 != 0) {
            int i4 = 1;
            if (i2 == 1 || i2 == 3) {
                this.i = -1;
            } else if (i2 == 6) {
                int b2 = z2.b(motionEvent);
                if (z2.d(motionEvent, b2) == this.i) {
                    if (b2 != 0) {
                        i4 = 0;
                    }
                    this.i = z2.d(motionEvent, i4);
                    this.g = z2.e(motionEvent, i4);
                    this.h = z2.f(motionEvent, i4);
                }
            }
        } else {
            this.i = motionEvent.getPointerId(0);
        }
        int i5 = this.i;
        if (i5 != -1) {
            i3 = i5;
        }
        this.j = z2.a(motionEvent, i3);
    }

    private void f(int i2, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z = false;
        if (i2 == 0) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.e = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.g = a(motionEvent);
            this.h = b(motionEvent);
            this.f = false;
        } else if (i2 == 1) {
            if (this.f && this.e != null) {
                this.g = a(motionEvent);
                this.h = b(motionEvent);
                this.e.addMovement(motionEvent);
                this.e.computeCurrentVelocity(C0188.f18);
                float xVelocity = this.e.getXVelocity();
                float yVelocity = this.e.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.b) {
                    this.d.b(this.g, this.h, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.e;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.e = null;
            }
        } else if (i2 == 2) {
            float a2 = a(motionEvent);
            float b2 = b(motionEvent);
            float f2 = a2 - this.g;
            float f3 = b2 - this.h;
            if (!this.f) {
                if (Math.sqrt((double) ((f2 * f2) + (f3 * f3))) >= ((double) this.a)) {
                    z = true;
                }
                this.f = z;
            }
            if (this.f) {
                this.d.c(f2, f3);
                this.g = a2;
                this.h = b2;
                VelocityTracker velocityTracker3 = this.e;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (i2 == 3 && (velocityTracker = this.e) != null) {
            velocityTracker.recycle();
            this.e = null;
        }
    }

    public boolean c() {
        return this.f;
    }

    public boolean d() {
        return this.c.isInProgress();
    }

    public boolean g(MotionEvent motionEvent) {
        this.c.onTouchEvent(motionEvent);
        int c2 = z2.c(motionEvent);
        e(c2, motionEvent);
        f(c2, motionEvent);
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.d.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.d.d();
    }
}
