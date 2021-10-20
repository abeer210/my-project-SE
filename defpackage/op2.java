package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: op2  reason: default package */
/* compiled from: OverlayTouchDelegate */
public class op2 {
    private final Rect a = new Rect();
    private gl2 b;
    private sf2 c = new zf2();

    /* access modifiers changed from: private */
    /* renamed from: op2$a */
    /* compiled from: OverlayTouchDelegate */
    public enum a {
        Outside,
        Inside
    }

    public op2(gl2 gl2) {
        this.b = gl2;
    }

    private a a(MotionEvent motionEvent) {
        b((ViewGroup) this.b.a()).getHitRect(this.a);
        return this.a.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) ? a.Inside : a.Outside;
    }

    private View b(ViewGroup viewGroup) {
        return viewGroup.getChildCount() > 0 ? viewGroup.getChildAt(0) : viewGroup;
    }

    public boolean c(MotionEvent motionEvent) {
        if (a(motionEvent) != a.Inside) {
            return this.c.h();
        }
        this.b.f(motionEvent);
        return false;
    }

    public boolean d(MotionEvent motionEvent) {
        if (this.c instanceof zf2) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            return c(motionEvent);
        }
        this.b.f(motionEvent);
        return false;
    }

    public void e(sf2 sf2) {
        this.c = sf2;
    }
}
