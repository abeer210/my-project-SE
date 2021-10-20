package defpackage;

import android.graphics.PointF;
import java.util.List;
import vigqyno.C0201;

/* renamed from: wc  reason: default package */
/* compiled from: AnimatableSplitDimensionPathValue */
public class wc implements ad<PointF, PointF> {
    private final pc a;
    private final pc b;

    public wc(pc pcVar, pc pcVar2) {
        this.a = pcVar;
        this.b = pcVar2;
    }

    @Override // defpackage.ad
    public nb<PointF, PointF> a() {
        return new zb(this.a.a(), this.b.a());
    }

    @Override // defpackage.ad
    public List<bg<PointF>> b() {
        throw new UnsupportedOperationException(C0201.m82(14196));
    }

    @Override // defpackage.ad
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
