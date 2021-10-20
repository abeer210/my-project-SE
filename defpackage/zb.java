package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: zb  reason: default package */
/* compiled from: SplitDimensionPathKeyframeAnimation */
public class zb extends nb<PointF, PointF> {
    private final PointF i = new PointF();
    private final nb<Float, Float> j;
    private final nb<Float, Float> k;

    public zb(nb<Float, Float> nbVar, nb<Float, Float> nbVar2) {
        super(Collections.emptyList());
        this.j = nbVar;
        this.k = nbVar2;
        l(f());
    }

    @Override // defpackage.nb
    public void l(float f) {
        this.j.l(f);
        this.k.l(f);
        this.i.set(this.j.h().floatValue(), this.k.h().floatValue());
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.get(i2).b();
        }
    }

    /* renamed from: o */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* renamed from: p */
    public PointF i(bg<PointF> bgVar, float f) {
        return this.i;
    }
}
