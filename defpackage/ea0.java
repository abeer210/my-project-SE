package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: ea0  reason: default package */
/* compiled from: RootDrawable */
public class ea0 extends l90 implements z90 {
    public Drawable e = null;
    private aa0 f;

    public ea0(Drawable drawable) {
        super(drawable);
    }

    @Override // defpackage.l90
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            aa0 aa0 = this.f;
            if (aa0 != null) {
                aa0.a();
            }
            super.draw(canvas);
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.e.draw(canvas);
            }
        }
    }

    @Override // defpackage.l90
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.l90
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.z90
    public void k(aa0 aa0) {
        this.f = aa0;
    }

    public void r(Drawable drawable) {
        this.e = drawable;
        invalidateSelf();
    }

    @Override // defpackage.l90
    public boolean setVisible(boolean z, boolean z2) {
        aa0 aa0 = this.f;
        if (aa0 != null) {
            aa0.b(z);
        }
        return super.setVisible(z, z2);
    }
}
