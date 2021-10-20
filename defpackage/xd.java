package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: xd  reason: default package */
/* compiled from: NullLayer */
public class xd extends td {
    public xd(ga gaVar, wd wdVar) {
        super(gaVar, wdVar);
    }

    @Override // defpackage.td, defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.td
    public void u(Canvas canvas, Matrix matrix, int i) {
    }
}
