package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: vd  reason: default package */
/* compiled from: ImageLayer */
public class vd extends td {
    private nb<ColorFilter, ColorFilter> A;
    private final Paint x = new ta(3);
    private final Rect y = new Rect();
    private final Rect z = new Rect();

    public vd(ga gaVar, wd wdVar) {
        super(gaVar, wdVar);
    }

    private Bitmap K() {
        return this.n.r(this.o.k());
    }

    @Override // defpackage.td, defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        Bitmap K = K();
        if (K != null) {
            rectF.set(0.0f, 0.0f, ((float) K.getWidth()) * ag.e(), ((float) K.getHeight()) * ag.e());
            this.m.mapRect(rectF);
        }
    }

    @Override // defpackage.td, defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        super.h(t, dgVar);
        if (t != la.C) {
            return;
        }
        if (dgVar == null) {
            this.A = null;
        } else {
            this.A = new cc(dgVar);
        }
    }

    @Override // defpackage.td
    public void u(Canvas canvas, Matrix matrix, int i) {
        Bitmap K = K();
        if (K != null && !K.isRecycled()) {
            float e = ag.e();
            this.x.setAlpha(i);
            nb<ColorFilter, ColorFilter> nbVar = this.A;
            if (nbVar != null) {
                this.x.setColorFilter(nbVar.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.y.set(0, 0, K.getWidth(), K.getHeight());
            this.z.set(0, 0, (int) (((float) K.getWidth()) * e), (int) (((float) K.getHeight()) * e));
            canvas.drawBitmap(K, this.y, this.z, this.x);
            canvas.restore();
        }
    }
}
