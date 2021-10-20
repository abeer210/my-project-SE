package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: g90  reason: default package */
/* compiled from: AutoRotateDrawable */
public class g90 extends l90 implements Runnable {
    private int e;
    private boolean f;
    public float g;
    private boolean h;

    public g90(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    private int r() {
        return (int) ((20.0f / ((float) this.e)) * 360.0f);
    }

    private void s() {
        if (!this.h) {
            this.h = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    @Override // defpackage.l90
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f2 = this.g;
        if (!this.f) {
            f2 = 360.0f - f2;
        }
        canvas.rotate(f2, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        s();
    }

    public void run() {
        this.h = false;
        this.g += (float) r();
        invalidateSelf();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g90(Drawable drawable, int i, boolean z) {
        super(drawable);
        z50.g(drawable);
        this.g = 0.0f;
        this.h = false;
        this.e = i;
        this.f = z;
    }
}
