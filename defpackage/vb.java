package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: vb  reason: default package */
/* compiled from: PathKeyframeAnimation */
public class vb extends sb<PointF> {
    private final PointF i = new PointF();
    private final float[] j = new float[2];
    private ub k;
    private PathMeasure l = new PathMeasure();

    public vb(List<? extends bg<PointF>> list) {
        super(list);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object] */
    /* renamed from: o */
    public PointF i(bg<PointF> bgVar, float f) {
        A b;
        ub ubVar = (ub) bgVar;
        Path j2 = ubVar.j();
        if (j2 == null) {
            return bgVar.b;
        }
        dg<A> dgVar = this.e;
        if (dgVar != null && (b = dgVar.b(ubVar.e, ubVar.f.floatValue(), ubVar.b, ubVar.c, e(), f, f())) != null) {
            return b;
        }
        if (this.k != ubVar) {
            this.l.setPath(j2, false);
            this.k = ubVar;
        }
        PathMeasure pathMeasure = this.l;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.j, null);
        PointF pointF = this.i;
        float[] fArr = this.j;
        pointF.set(fArr[0], fArr[1]);
        return this.i;
    }
}
