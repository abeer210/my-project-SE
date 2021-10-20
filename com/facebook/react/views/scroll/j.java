package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* compiled from: VelocityHelper */
public class j {
    private VelocityTracker a;
    private float b;
    private float c;

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.a == null) {
            this.a = VelocityTracker.obtain();
        }
        this.a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.a.computeCurrentVelocity(1);
            this.b = this.a.getXVelocity();
            this.c = this.a.getYVelocity();
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a = null;
            }
        }
    }

    public float b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }
}
