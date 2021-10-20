package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: SwipeDirectionDetector */
public abstract class f {
    private int a;
    private float b;
    private float c;
    private boolean d;

    /* compiled from: SwipeDirectionDetector */
    public enum a {
        NOT_DETECTED,
        UP,
        DOWN,
        LEFT,
        RIGHT;

        public static a b(double d) {
            if (d(d, 45.0f, 135.0f)) {
                return UP;
            }
            if (d(d, 0.0f, 45.0f) || d(d, 315.0f, 360.0f)) {
                return RIGHT;
            }
            if (d(d, 225.0f, 315.0f)) {
                return DOWN;
            }
            return LEFT;
        }

        private static boolean d(double d, float f2, float f3) {
            return d >= ((double) f2) && d < ((double) f3);
        }
    }

    public f(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private float c(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - this.b;
        float y = motionEvent.getY(0) - this.c;
        double d2 = (double) 0.0f;
        double sqrt = Math.sqrt((double) ((x * x) + (y * y)));
        Double.isNaN(d2);
        return (float) (d2 + sqrt);
    }

    public double a(float f, float f2, float f3, float f4) {
        return ((((Math.atan2((double) (f2 - f4), (double) (f3 - f)) + 3.141592653589793d) * 180.0d) / 3.141592653589793d) + 180.0d) % 360.0d;
    }

    public a b(float f, float f2, float f3, float f4) {
        return a.b(a(f, f2, f3, f4));
    }

    public abstract void d(a aVar);

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L_0x0053;
     */
    public boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.d && c(motionEvent) > ((float) this.a)) {
                        this.d = true;
                        d(b(this.b, this.c, motionEvent.getX(), motionEvent.getY()));
                    }
                }
            }
            if (!this.d) {
                d(a.NOT_DETECTED);
            }
            this.c = 0.0f;
            this.b = 0.0f;
            this.d = false;
        } else {
            this.b = motionEvent.getX();
            this.c = motionEvent.getY();
        }
        return false;
    }
}
