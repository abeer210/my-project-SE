package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: yd  reason: default package */
/* compiled from: ShapeLayer */
public class yd extends td {
    private final xa x;

    public yd(ga gaVar, wd wdVar) {
        super(gaVar, wdVar);
        xa xaVar = new xa(gaVar, this, new pd(C0201.m82(19708), wdVar.l(), false));
        this.x = xaVar;
        xaVar.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.td
    public void E(jc jcVar, int i, List<jc> list, jc jcVar2) {
        this.x.d(jcVar, i, list, jcVar2);
    }

    @Override // defpackage.td, defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.x.e(rectF, this.m, z);
    }

    @Override // defpackage.td
    public void u(Canvas canvas, Matrix matrix, int i) {
        this.x.g(canvas, matrix, i);
    }
}
