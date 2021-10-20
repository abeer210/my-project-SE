package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.w90;

/* renamed from: v90  reason: default package */
/* compiled from: ScaleTypeDrawable */
public class v90 extends l90 {
    public w90.c e;
    public Object f;
    public PointF g = null;
    public int h = 0;
    public int i = 0;
    public Matrix j;
    private Matrix k = new Matrix();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v90(Drawable drawable, w90.c cVar) {
        super(drawable);
        z50.g(drawable);
        this.e = cVar;
    }

    private void s() {
        boolean z;
        w90.c cVar = this.e;
        boolean z2 = true;
        if (cVar instanceof w90.m) {
            Object state = ((w90.m) cVar).getState();
            z = state == null || !state.equals(this.f);
            this.f = state;
        } else {
            z = false;
        }
        if (this.h == getCurrent().getIntrinsicWidth() && this.i == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            r();
        }
    }

    @Override // defpackage.y90, defpackage.l90
    public void d(Matrix matrix) {
        n(matrix);
        s();
        Matrix matrix2 = this.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.l90
    public void draw(Canvas canvas) {
        s();
        if (this.j != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.j);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // defpackage.l90
    public void onBoundsChange(Rect rect) {
        r();
    }

    @Override // defpackage.l90
    public Drawable p(Drawable drawable) {
        Drawable p = super.p(drawable);
        r();
        return p;
    }

    public void r() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.j = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.j = null;
        } else if (this.e == w90.c.a) {
            current.setBounds(bounds);
            this.j = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            w90.c cVar = this.e;
            Matrix matrix = this.k;
            PointF pointF = this.g;
            float f2 = pointF != null ? pointF.x : 0.5f;
            PointF pointF2 = this.g;
            cVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f2, pointF2 != null ? pointF2.y : 0.5f);
            this.j = this.k;
        }
    }

    public w90.c t() {
        return this.e;
    }

    public void u(PointF pointF) {
        if (!y50.a(this.g, pointF)) {
            if (this.g == null) {
                this.g = new PointF();
            }
            this.g.set(pointF);
            r();
            invalidateSelf();
        }
    }

    public void v(w90.c cVar) {
        if (!y50.a(this.e, cVar)) {
            this.e = cVar;
            this.f = null;
            r();
            invalidateSelf();
        }
    }
}
