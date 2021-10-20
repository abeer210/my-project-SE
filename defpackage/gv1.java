package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gv1  reason: default package */
public class gv1 implements hv1 {
    private di1 a;
    private List<fv1> b;

    public gv1(di1 di1) {
        this.a = di1;
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
        if (this.a.a.length == 0) {
            return new ArrayList(0);
        }
        if (this.b == null) {
            this.b = new ArrayList(this.a.a.length);
            for (mi1 mi1 : this.a.a) {
                this.b.add(new fv1(mi1));
            }
        }
        return this.b;
    }

    @Override // defpackage.hv1
    public String getValue() {
        return this.a.e;
    }
}
