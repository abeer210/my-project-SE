package defpackage;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: sx2  reason: default package */
/* compiled from: DefaultOnDoubleTapListener */
public class sx2 implements GestureDetector.OnDoubleTapListener {
    private rx2 a;

    public sx2(rx2 rx2) {
        a(rx2);
    }

    public void a(rx2 rx2) {
        this.a = rx2;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        rx2 rx2 = this.a;
        if (rx2 == null) {
            return false;
        }
        try {
            float y = rx2.y();
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (y < this.a.u()) {
                this.a.N(this.a.u(), x, y2, true);
            } else if (y < this.a.u() || y >= this.a.t()) {
                this.a.N(this.a.v(), x, y2, true);
            } else {
                this.a.N(this.a.t(), x, y2, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        oa0<ba0> r;
        RectF o;
        rx2 rx2 = this.a;
        if (rx2 == null || (r = rx2.r()) == null) {
            return false;
        }
        if (!(this.a.w() == null || (o = this.a.o()) == null)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (o.contains(x, y)) {
                this.a.w().a(r, (x - o.left) / o.width(), (y - o.top) / o.height());
                return true;
            }
        }
        if (this.a.x() == null) {
            return false;
        }
        this.a.x().a(r, motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
