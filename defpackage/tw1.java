package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import defpackage.sw1;

/* renamed from: tw1  reason: default package */
/* compiled from: CircularRevealCardView */
public class tw1 extends mw1 implements sw1 {
    private final rw1 n;

    @Override // defpackage.sw1
    public void a() {
        this.n.a();
        throw null;
    }

    @Override // defpackage.sw1
    public void b() {
        this.n.b();
        throw null;
    }

    public void draw(Canvas canvas) {
        rw1 rw1 = this.n;
        if (rw1 == null) {
            super.draw(canvas);
        } else {
            rw1.c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.n.d();
        throw null;
    }

    @Override // defpackage.sw1
    public int getCircularRevealScrimColor() {
        this.n.e();
        throw null;
    }

    @Override // defpackage.sw1
    public sw1.e getRevealInfo() {
        this.n.f();
        throw null;
    }

    public boolean isOpaque() {
        rw1 rw1 = this.n;
        if (rw1 == null) {
            return super.isOpaque();
        }
        rw1.g();
        throw null;
    }

    @Override // defpackage.sw1
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.n.h(drawable);
        throw null;
    }

    @Override // defpackage.sw1
    public void setCircularRevealScrimColor(int i) {
        this.n.i(i);
        throw null;
    }

    @Override // defpackage.sw1
    public void setRevealInfo(sw1.e eVar) {
        this.n.j(eVar);
        throw null;
    }
}
