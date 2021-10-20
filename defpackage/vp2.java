package defpackage;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: vp2  reason: default package */
/* compiled from: FlingGestureHandler */
public class vp2 extends wp2<vp2> {
    private long B = 800;
    private long C = 160;
    private int D = 1;
    private int E = 1;
    private float F;
    private float G;
    private Handler H;
    private int I;
    private final Runnable J = new a();

    /* renamed from: vp2$a */
    /* compiled from: FlingGestureHandler */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            vp2.this.h();
        }
    }

    private void U(MotionEvent motionEvent) {
        if (!Y(motionEvent)) {
            h();
        }
    }

    private void X(MotionEvent motionEvent) {
        this.F = motionEvent.getRawX();
        this.G = motionEvent.getRawY();
        c();
        this.I = 1;
        Handler handler = this.H;
        if (handler == null) {
            this.H = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.H.postDelayed(this.J, this.B);
    }

    private boolean Y(MotionEvent motionEvent) {
        if (this.I != this.E) {
            return false;
        }
        if (((this.D & 1) == 0 || motionEvent.getRawX() - this.F <= ((float) this.C)) && (((this.D & 2) == 0 || this.F - motionEvent.getRawX() <= ((float) this.C)) && (((this.D & 4) == 0 || this.G - motionEvent.getRawY() <= ((float) this.C)) && ((this.D & 8) == 0 || motionEvent.getRawY() - this.G <= ((float) this.C))))) {
            return false;
        }
        this.H.removeCallbacksAndMessages(null);
        a();
        g();
        return true;
    }

    @Override // defpackage.wp2
    public void B() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        int p = p();
        if (p == 0) {
            X(motionEvent);
        }
        if (p == 2) {
            Y(motionEvent);
            if (motionEvent.getPointerCount() > this.I) {
                this.I = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                U(motionEvent);
            }
        }
    }

    @Override // defpackage.wp2
    public void D() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void V(int i) {
        this.D = i;
    }

    public void W(int i) {
        this.E = i;
    }
}
