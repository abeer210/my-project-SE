package defpackage;

import android.graphics.PointF;
import java.util.List;
import vigqyno.C0201;

/* renamed from: wb  reason: default package */
/* compiled from: PointKeyframeAnimation */
public class wb extends sb<PointF> {
    private final PointF i = new PointF();

    public wb(List<bg<PointF>> list) {
        super(list);
    }

    /* renamed from: o */
    public PointF i(bg<PointF> bgVar, float f) {
        T t;
        A b;
        T t2 = bgVar.b;
        if (t2 == null || (t = bgVar.c) == null) {
            throw new IllegalStateException(C0201.m82(14234));
        }
        T t3 = t2;
        T t4 = t;
        dg<A> dgVar = this.e;
        if (dgVar != null && (b = dgVar.b(bgVar.e, bgVar.f.floatValue(), t3, t4, f, e(), f())) != null) {
            return b;
        }
        PointF pointF = this.i;
        float f2 = ((PointF) t3).x;
        float f3 = ((PointF) t3).y;
        pointF.set(f2 + ((((PointF) t4).x - f2) * f), f3 + (f * (((PointF) t4).y - f3)));
        return this.i;
    }
}
