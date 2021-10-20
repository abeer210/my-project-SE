package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: ub  reason: default package */
/* compiled from: PathKeyframe */
public class ub extends bg<PointF> {
    private Path o;
    private final bg<PointF> p;

    public ub(ea eaVar, bg<PointF> bgVar) {
        super(eaVar, bgVar.b, bgVar.c, bgVar.d, bgVar.e, bgVar.f);
        this.p = bgVar;
        i();
    }

    public void i() {
        T t;
        T t2 = this.c;
        boolean z = (t2 == null || (t = this.b) == null || !t.equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.c;
        if (t3 != null && !z) {
            bg<PointF> bgVar = this.p;
            this.o = ag.d(this.b, t3, bgVar.m, bgVar.n);
        }
    }

    public Path j() {
        return this.o;
    }
}
