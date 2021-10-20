package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: sc  reason: default package */
/* compiled from: AnimatablePathValue */
public class sc implements ad<PointF, PointF> {
    private final List<bg<PointF>> a;

    public sc(List<bg<PointF>> list) {
        this.a = list;
    }

    @Override // defpackage.ad
    public nb<PointF, PointF> a() {
        if (this.a.get(0).h()) {
            return new wb(this.a);
        }
        return new vb(this.a);
    }

    @Override // defpackage.ad
    public List<bg<PointF>> b() {
        return this.a;
    }

    @Override // defpackage.ad
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).h();
    }
}
