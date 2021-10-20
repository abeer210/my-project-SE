package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: m90  reason: default package */
/* compiled from: MatrixDrawable */
public class m90 extends l90 {
    private Matrix e;
    private Matrix f;
    private int g;
    private int h;

    private void r() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f = this.e;
    }

    private void s() {
        if (this.g != getCurrent().getIntrinsicWidth() || this.h != getCurrent().getIntrinsicHeight()) {
            r();
        }
    }

    @Override // defpackage.y90, defpackage.l90
    public void d(Matrix matrix) {
        super.d(matrix);
        Matrix matrix2 = this.f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.l90
    public void draw(Canvas canvas) {
        s();
        if (this.f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // defpackage.l90
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        r();
    }

    @Override // defpackage.l90
    public Drawable p(Drawable drawable) {
        Drawable p = super.p(drawable);
        r();
        return p;
    }
}
