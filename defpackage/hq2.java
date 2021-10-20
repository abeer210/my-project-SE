package defpackage;

import android.view.MotionEvent;

/* renamed from: hq2  reason: default package */
/* compiled from: RotationGestureDetector */
public class hq2 {
    private long a;
    private long b;
    private double c;
    private double d;
    private float e;
    private float f;
    private boolean g;
    private int[] h = new int[2];
    private a i;

    /* renamed from: hq2$a */
    /* compiled from: RotationGestureDetector */
    public interface a {
        void a(hq2 hq2);

        boolean b(hq2 hq2);

        boolean c(hq2 hq2);
    }

    public hq2(a aVar) {
        this.i = aVar;
    }

    private void a() {
        if (this.g) {
            this.g = false;
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(this);
            }
        }
    }

    private void g(MotionEvent motionEvent) {
        this.b = this.a;
        this.a = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.h[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.h[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        float f2 = y2 - y;
        this.e = (x + x2) * 0.5f;
        this.f = (y + y2) * 0.5f;
        double d2 = -Math.atan2((double) f2, (double) (x2 - x));
        if (Double.isNaN(this.c)) {
            this.d = 0.0d;
        } else {
            this.d = this.c - d2;
        }
        this.c = d2;
        double d3 = this.d;
        if (d3 > 3.141592653589793d) {
            this.d = d3 - 3.141592653589793d;
        } else if (d3 < -3.141592653589793d) {
            this.d = d3 + 3.141592653589793d;
        }
        double d4 = this.d;
        if (d4 > 1.5707963267948966d) {
            this.d = d4 - 3.141592653589793d;
        } else if (d4 < -1.5707963267948966d) {
            this.d = d4 + 3.141592653589793d;
        }
    }

    public float b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }

    public double d() {
        return this.d;
    }

    public long e() {
        return this.a - this.b;
    }

    public boolean f(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            this.h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.h[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.g) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int[] iArr = this.h;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        a();
                    }
                }
            } else if (!this.g) {
                this.h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.g = true;
                this.b = motionEvent.getEventTime();
                this.c = Double.NaN;
                g(motionEvent);
                a aVar = this.i;
                if (aVar != null) {
                    aVar.c(this);
                }
            }
        } else if (this.g) {
            g(motionEvent);
            a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.b(this);
            }
        }
        return true;
    }
}
