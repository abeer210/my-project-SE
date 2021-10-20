package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import vigqyno.C0201;

/* renamed from: jq2  reason: default package */
/* compiled from: TapGestureHandler */
public class jq2 extends wp2<jq2> {
    private static float S;
    private float B;
    private float C;
    private float D;
    private long E = 500;
    private long F = 500;
    private int G = 1;
    private int H = 1;
    private int I = 1;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private Handler P;
    private int Q;
    private final Runnable R = new a();

    /* renamed from: jq2$a */
    /* compiled from: TapGestureHandler */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            jq2.this.h();
        }
    }

    static {
        C0201.m83(jq2.class, 666);
    }

    public jq2() {
        float f = S;
        this.B = f;
        this.C = f;
        this.D = f;
        L(true);
    }

    private void U() {
        Handler handler = this.P;
        if (handler == null) {
            this.P = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.Q + 1;
        this.Q = i;
        if (i != this.G || this.I < this.H) {
            this.P.postDelayed(this.R, this.F);
            return;
        }
        a();
        g();
    }

    private boolean c0() {
        float f = (this.N - this.J) + this.L;
        if (this.B != S && Math.abs(f) > this.B) {
            return true;
        }
        float f2 = (this.O - this.K) + this.M;
        if (this.C != S && Math.abs(f2) > this.C) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.D;
        if (f4 == S || f3 <= f4) {
            return false;
        }
        return true;
    }

    private void d0() {
        Handler handler = this.P;
        if (handler == null) {
            this.P = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.P.postDelayed(this.R, this.E);
    }

    @Override // defpackage.wp2
    public void B() {
        Handler handler = this.P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        int p = p();
        int actionMasked = motionEvent.getActionMasked();
        if (p == 0) {
            this.L = 0.0f;
            this.M = 0.0f;
            this.J = motionEvent.getRawX();
            this.K = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.L += this.N - this.J;
            this.M += this.O - this.K;
            this.N = aq2.a(motionEvent, true);
            float b = aq2.b(motionEvent, true);
            this.O = b;
            this.J = this.N;
            this.K = b;
        } else {
            this.N = aq2.a(motionEvent, true);
            this.O = aq2.b(motionEvent, true);
        }
        if (this.I < motionEvent.getPointerCount()) {
            this.I = motionEvent.getPointerCount();
        }
        if (c0()) {
            h();
        } else if (p == 0) {
            if (actionMasked == 0) {
                c();
            }
            d0();
        } else if (p != 2) {
        } else {
            if (actionMasked == 1) {
                U();
            } else if (actionMasked == 0) {
                d0();
            }
        }
    }

    @Override // defpackage.wp2
    public void D() {
        this.Q = 0;
        this.I = 0;
        Handler handler = this.P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public jq2 V(long j) {
        this.F = j;
        return this;
    }

    public jq2 W(float f) {
        this.D = f * f;
        return this;
    }

    public jq2 X(long j) {
        this.E = j;
        return this;
    }

    public jq2 Y(float f) {
        this.B = f;
        return this;
    }

    public jq2 Z(float f) {
        this.C = f;
        return this;
    }

    public jq2 a0(int i) {
        this.H = i;
        return this;
    }

    public jq2 b0(int i) {
        this.G = i;
        return this;
    }
}
