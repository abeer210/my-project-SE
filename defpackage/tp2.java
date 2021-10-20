package defpackage;

import android.view.ViewParent;

/* renamed from: tp2  reason: default package */
/* compiled from: NonInterceptableAttacher */
public class tp2 extends rx2 {
    private ux2 v;

    public tp2(oa0<ba0> oa0) {
        super(oa0);
    }

    @Override // defpackage.rx2
    public void B() {
        super.B();
    }

    public void S(ux2 ux2) {
        this.v = ux2;
    }

    @Override // defpackage.vx2, defpackage.rx2
    public void a(float f, float f2, float f3) {
        super.a(f, f2, f3);
        ux2 ux2 = this.v;
        if (ux2 != null) {
            ux2.a(f, f2, f3);
        }
    }

    @Override // defpackage.vx2
    public void c(float f, float f2) {
        oa0<ba0> r = r();
        if (r != null) {
            q().postTranslate(f, f2);
            k();
            ViewParent parent = r.getParent();
            if (parent != null) {
                if (y() == 1.0f) {
                    parent.requestDisallowInterceptTouchEvent(false);
                } else {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
    }
}
