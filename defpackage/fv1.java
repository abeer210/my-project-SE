package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fv1  reason: default package */
public class fv1 implements hv1 {
    private mi1 a;

    public fv1(mi1 mi1) {
        this.a = mi1;
    }

    @Override // defpackage.hv1
    public Rect a() {
        return lv1.a(this);
    }

    @Override // defpackage.hv1
    public Point[] b() {
        return lv1.b(this.a.b);
    }

    @Override // defpackage.hv1
    public List<? extends hv1> getComponents() {
        return new ArrayList();
    }

    @Override // defpackage.hv1
    public String getValue() {
        return this.a.d;
    }
}
