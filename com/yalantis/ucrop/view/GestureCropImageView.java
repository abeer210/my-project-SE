package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import defpackage.su2;

public class GestureCropImageView extends a {
    private ScaleGestureDetector G;
    private su2 H;
    private GestureDetector I;
    private float J;
    private float K;
    private boolean L;
    private boolean M;
    private int N;

    /* access modifiers changed from: private */
    public class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.B(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200);
            return super.onDoubleTap(motionEvent);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureCropImageView.this.m(-f, -f2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public class c extends su2.b {
        private c() {
        }

        @Override // defpackage.su2.a
        public boolean a(su2 su2) {
            GestureCropImageView.this.k(su2.c(), GestureCropImageView.this.J, GestureCropImageView.this.K);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private d() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.l(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.J, GestureCropImageView.this.K);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void I() {
        this.I = new GestureDetector(getContext(), new b(), null, true);
        this.G = new ScaleGestureDetector(getContext(), new d());
        this.H = new su2(new c());
    }

    public int getDoubleTapScaleSteps() {
        return this.N;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow((double) (getMaxScale() / getMinScale()), (double) (1.0f / ((float) this.N))));
    }

    @Override // com.yalantis.ucrop.view.b
    public void i() {
        super.i();
        I();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            t();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.J = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.K = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        this.I.onTouchEvent(motionEvent);
        if (this.M) {
            this.G.onTouchEvent(motionEvent);
        }
        if (this.L) {
            this.H.d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            z();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i) {
        this.N = i;
    }

    public void setRotateEnabled(boolean z) {
        this.L = z;
    }

    public void setScaleEnabled(boolean z) {
        this.M = z;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = true;
        this.M = true;
        this.N = 5;
    }
}
