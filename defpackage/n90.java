package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: n90  reason: default package */
/* compiled from: OrientedDrawable */
public class n90 extends l90 {
    public final Matrix e = new Matrix();
    private int f;
    private int g;
    private final Matrix h = new Matrix();
    private final RectF i = new RectF();

    public n90(Drawable drawable, int i2, int i3) {
        super(drawable);
        this.f = i2 - (i2 % 90);
        this.g = (i3 < 0 || i3 > 8) ? 0 : i3;
    }

    @Override // defpackage.y90, defpackage.l90
    public void d(Matrix matrix) {
        n(matrix);
        if (!this.e.isIdentity()) {
            matrix.preConcat(this.e);
        }
    }

    @Override // defpackage.l90
    public void draw(Canvas canvas) {
        int i2;
        if (this.f > 0 || !((i2 = this.g) == 0 || i2 == 1)) {
            int save = canvas.save();
            canvas.concat(this.e);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // defpackage.l90
    public int getIntrinsicHeight() {
        int i2 = this.g;
        if (i2 == 5 || i2 == 7 || this.f % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // defpackage.l90
    public int getIntrinsicWidth() {
        int i2 = this.g;
        if (i2 == 5 || i2 == 7 || this.f % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // defpackage.l90
    public void onBoundsChange(Rect rect) {
        int i2;
        Drawable current = getCurrent();
        if (this.f > 0 || !((i2 = this.g) == 0 || i2 == 1)) {
            int i3 = this.g;
            if (i3 == 2) {
                this.e.setScale(-1.0f, 1.0f);
            } else if (i3 == 7) {
                this.e.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.e.postScale(-1.0f, 1.0f);
            } else if (i3 == 4) {
                this.e.setScale(1.0f, -1.0f);
            } else if (i3 != 5) {
                this.e.setRotate((float) this.f, (float) rect.centerX(), (float) rect.centerY());
            } else {
                this.e.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.e.postScale(1.0f, -1.0f);
            }
            this.h.reset();
            this.e.invert(this.h);
            this.i.set(rect);
            this.h.mapRect(this.i);
            RectF rectF = this.i;
            current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            return;
        }
        current.setBounds(rect);
    }
}
