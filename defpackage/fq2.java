package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* renamed from: fq2  reason: default package */
/* compiled from: PinchGestureHandler */
public class fq2 extends wp2<fq2> {
    private ScaleGestureDetector B;
    private double C;
    private double D;
    private float E;
    private float F;
    private ScaleGestureDetector.OnScaleGestureListener G = new a();

    /* renamed from: fq2$a */
    /* compiled from: PinchGestureHandler */
    class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d = fq2.this.C;
            fq2 fq2 = fq2.this;
            double d2 = fq2.C;
            double scaleFactor = (double) scaleGestureDetector.getScaleFactor();
            Double.isNaN(scaleFactor);
            fq2.C = d2 * scaleFactor;
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                fq2 fq22 = fq2.this;
                double d3 = fq22.C - d;
                double d4 = (double) timeDelta;
                Double.isNaN(d4);
                fq22.D = d3 / d4;
            }
            if (Math.abs(fq2.this.E - scaleGestureDetector.getCurrentSpan()) < fq2.this.F || fq2.this.p() != 2) {
                return true;
            }
            fq2.this.a();
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            fq2.this.E = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public fq2() {
        L(false);
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        if (p() == 0) {
            Context context = r().getContext();
            this.D = 0.0d;
            this.C = 1.0d;
            this.B = new ScaleGestureDetector(context, this.G);
            this.F = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            c();
        }
        ScaleGestureDetector scaleGestureDetector = this.B;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (p() == 4 && pointerCount < 2) {
            g();
        } else if (motionEvent.getActionMasked() == 1) {
            h();
        }
    }

    @Override // defpackage.wp2
    public void D() {
        this.B = null;
        this.D = 0.0d;
        this.C = 1.0d;
    }

    public float a0() {
        ScaleGestureDetector scaleGestureDetector = this.B;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    public float b0() {
        ScaleGestureDetector scaleGestureDetector = this.B;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    public double c0() {
        return this.C;
    }

    public double d0() {
        return this.D;
    }
}
