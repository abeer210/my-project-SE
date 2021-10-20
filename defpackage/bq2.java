package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import vigqyno.C0201;

/* renamed from: bq2  reason: default package */
/* compiled from: LongPressGestureHandler */
public class bq2 extends wp2<bq2> {
    private static float G;
    private long B = 500;
    private float C;
    private float D;
    private float E;
    private Handler F;

    /* renamed from: bq2$a */
    /* compiled from: LongPressGestureHandler */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            bq2.this.a();
        }
    }

    static {
        C0201.m83(bq2.class, 662);
    }

    public bq2(Context context) {
        L(true);
        this.C = G * context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        if (p() == 0) {
            c();
            this.D = motionEvent.getRawX();
            this.E = motionEvent.getRawY();
            Handler handler = new Handler();
            this.F = handler;
            long j = this.B;
            if (j > 0) {
                handler.postDelayed(new a(), this.B);
            } else if (j == 0) {
                a();
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler2 = this.F;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.F = null;
            }
            if (p() == 4) {
                g();
            } else {
                h();
            }
        } else {
            float rawX = motionEvent.getRawX() - this.D;
            float rawY = motionEvent.getRawY() - this.E;
            if ((rawX * rawX) + (rawY * rawY) <= this.C) {
                return;
            }
            if (p() == 4) {
                d();
            } else {
                h();
            }
        }
    }

    @Override // defpackage.wp2
    public void E(int i, int i2) {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.F = null;
        }
    }

    public bq2 U(float f) {
        this.C = f * f;
        return this;
    }

    public void V(long j) {
        this.B = j;
    }
}
