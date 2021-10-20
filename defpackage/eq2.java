package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: eq2  reason: default package */
/* compiled from: PanGestureHandler */
public class eq2 extends wp2<eq2> {
    private static float Z;
    private static float a0;
    private static int b0;
    private static int c0;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N = b0;
    private int O = c0;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    private VelocityTracker X;
    private boolean Y;

    static {
        C0201.m83(eq2.class, 543);
    }

    public eq2(Context context) {
        float f = a0;
        this.B = f;
        float f2 = Z;
        this.C = f2;
        this.D = f;
        this.E = f;
        this.F = f2;
        this.G = f2;
        this.H = f;
        this.I = f;
        this.J = f2;
        this.K = f2;
        this.L = f2;
        this.M = f2;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.B = (float) (scaledTouchSlop * scaledTouchSlop);
    }

    private static void U(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0 >= r1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        if (r0 >= r2) goto L_0x0091;
     */
    private boolean o0() {
        float f = (this.T - this.P) + this.R;
        float f2 = this.C;
        if (f2 != Z && f < f2) {
            return true;
        }
        float f3 = this.D;
        if (f3 != a0 && f > f3) {
            return true;
        }
        float f4 = (this.U - this.Q) + this.S;
        float f5 = this.G;
        if (f5 != Z && f4 < f5) {
            return true;
        }
        float f6 = this.H;
        if (f6 != a0 && f4 > f6) {
            return true;
        }
        float f7 = (f * f) + (f4 * f4);
        float f8 = this.B;
        if (f8 != Z && f7 >= f8) {
            return true;
        }
        float f9 = this.V;
        float f10 = this.K;
        if (f10 != Z) {
            if (f10 >= 0.0f || f9 > f10) {
                float f11 = this.K;
                if (f11 >= 0.0f) {
                }
            }
            return true;
        }
        float f12 = this.W;
        float f13 = this.L;
        if (f13 != Z) {
            if (f13 >= 0.0f || f9 > f13) {
                float f14 = this.L;
                if (f14 >= 0.0f) {
                }
            }
            return true;
        }
        float f15 = (f9 * f9) + (f12 * f12);
        float f16 = this.M;
        if (f16 == Z || f15 < f16) {
            return false;
        }
        return true;
    }

    private boolean p0() {
        float f = (this.T - this.P) + this.R;
        float f2 = this.E;
        if (f2 != a0 && f < f2) {
            return true;
        }
        float f3 = this.F;
        if (f3 != Z && f > f3) {
            return true;
        }
        float f4 = (this.U - this.Q) + this.S;
        float f5 = this.I;
        if (f5 != a0 && f4 < f5) {
            return true;
        }
        float f6 = this.J;
        if (f6 == Z || f4 <= f6) {
            return false;
        }
        return true;
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        int p = p();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.R += this.T - this.P;
            this.S += this.U - this.Q;
            this.T = aq2.a(motionEvent, this.Y);
            float b = aq2.b(motionEvent, this.Y);
            this.U = b;
            this.P = this.T;
            this.Q = b;
        } else {
            this.T = aq2.a(motionEvent, this.Y);
            this.U = aq2.b(motionEvent, this.Y);
        }
        if (p != 0 || motionEvent.getPointerCount() < this.N) {
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                U(velocityTracker, motionEvent);
                this.X.computeCurrentVelocity(C0188.f18);
                this.V = this.X.getXVelocity();
                this.W = this.X.getYVelocity();
            }
        } else {
            this.P = this.T;
            this.Q = this.U;
            this.R = 0.0f;
            this.S = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.X = obtain;
            U(obtain, motionEvent);
            c();
        }
        if (actionMasked == 1) {
            if (p == 4 || p == 2) {
                g();
            } else {
                h();
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.O) {
            if (actionMasked == 6 && p == 4 && motionEvent.getPointerCount() < this.N) {
                h();
            } else if (p != 2) {
            } else {
                if (p0()) {
                    h();
                } else if (o0()) {
                    this.P = this.T;
                    this.Q = this.U;
                    a();
                }
            }
        } else if (p == 4) {
            d();
        } else {
            h();
        }
    }

    @Override // defpackage.wp2
    public void D() {
        VelocityTracker velocityTracker = this.X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.X = null;
        }
    }

    public float V() {
        return (this.T - this.P) + this.R;
    }

    public float W() {
        return (this.U - this.Q) + this.S;
    }

    public float X() {
        return this.V;
    }

    public float Y() {
        return this.W;
    }

    public eq2 Z(float f) {
        this.D = f;
        return this;
    }

    public eq2 a0(float f) {
        this.C = f;
        return this;
    }

    public eq2 b0(float f) {
        this.H = f;
        return this;
    }

    public eq2 c0(float f) {
        this.G = f;
        return this;
    }

    public eq2 d0(boolean z) {
        this.Y = z;
        return this;
    }

    public eq2 e0(float f) {
        this.F = f;
        return this;
    }

    public eq2 f0(float f) {
        this.E = f;
        return this;
    }

    public eq2 g0(float f) {
        this.J = f;
        return this;
    }

    public eq2 h0(float f) {
        this.I = f;
        return this;
    }

    public eq2 i0(int i) {
        this.O = i;
        return this;
    }

    public eq2 j0(float f) {
        this.B = f * f;
        return this;
    }

    public eq2 k0(int i) {
        this.N = i;
        return this;
    }

    public eq2 l0(float f) {
        this.M = f * f;
        return this;
    }

    public eq2 m0(float f) {
        this.K = f;
        return this;
    }

    public eq2 n0(float f) {
        this.L = f;
        return this;
    }
}
