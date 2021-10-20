package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import defpackage.sw1;

/* renamed from: qw1  reason: default package */
/* compiled from: CircularRevealFrameLayout */
public class qw1 extends FrameLayout implements sw1 {
    private final rw1 a;

    @Override // defpackage.sw1
    public void a() {
        this.a.a();
        throw null;
    }

    @Override // defpackage.sw1
    public void b() {
        this.a.b();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        rw1 rw1 = this.a;
        if (rw1 == null) {
            super.draw(canvas);
        } else {
            rw1.c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.a.d();
        throw null;
    }

    @Override // defpackage.sw1
    public int getCircularRevealScrimColor() {
        this.a.e();
        throw null;
    }

    @Override // defpackage.sw1
    public sw1.e getRevealInfo() {
        this.a.f();
        throw null;
    }

    public boolean isOpaque() {
        rw1 rw1 = this.a;
        if (rw1 == null) {
            return super.isOpaque();
        }
        rw1.g();
        throw null;
    }

    @Override // defpackage.sw1
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.a.h(drawable);
        throw null;
    }

    @Override // defpackage.sw1
    public void setCircularRevealScrimColor(int i) {
        this.a.i(i);
        throw null;
    }

    @Override // defpackage.sw1
    public void setRevealInfo(sw1.e eVar) {
        this.a.j(eVar);
        throw null;
    }
}
