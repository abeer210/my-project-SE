package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: cq2  reason: default package */
/* compiled from: NativeViewGestureHandler */
public class cq2 extends wp2<cq2> {
    private boolean B;
    private boolean C;

    public cq2() {
        L(true);
    }

    private static boolean W(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.wp2
    public void B() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        r().onTouchEvent(obtain);
    }

    @Override // defpackage.wp2
    public void C(MotionEvent motionEvent) {
        View r = r();
        int p = p();
        if (motionEvent.getActionMasked() == 1) {
            r.onTouchEvent(motionEvent);
            if ((p == 0 || p == 2) && r.isPressed()) {
                a();
            }
            g();
        } else if (p == 0 || p == 2) {
            if (this.B) {
                W(r, motionEvent);
                r.onTouchEvent(motionEvent);
                a();
            } else if (W(r, motionEvent)) {
                r.onTouchEvent(motionEvent);
                a();
            } else if (p != 2) {
                c();
            }
        } else if (p == 4) {
            r.onTouchEvent(motionEvent);
        }
    }

    @Override // defpackage.wp2
    public boolean N(wp2 wp2) {
        return !this.C;
    }

    @Override // defpackage.wp2
    public boolean O(wp2 wp2) {
        if (wp2 instanceof cq2) {
            cq2 cq2 = (cq2) wp2;
            if (cq2.p() == 4 && cq2.C) {
                return false;
            }
        }
        boolean z = !this.C;
        int p = p();
        int p2 = wp2.p();
        if ((p != 4 || p2 != 4 || !z) && p == 4 && z) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wp2
    public boolean P(wp2 wp2) {
        return super.P(wp2);
    }

    public cq2 U(boolean z) {
        this.C = z;
        return this;
    }

    public cq2 V(boolean z) {
        this.B = z;
        return this;
    }
}
