package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: nd  reason: default package */
/* compiled from: ShapeData */
public class nd {
    private final List<fc> a;
    private PointF b;
    private boolean c;

    public nd(PointF pointF, boolean z, List<fc> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    private void e(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public List<fc> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(nd ndVar, nd ndVar2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = ndVar.d() || ndVar2.d();
        if (ndVar.a().size() != ndVar2.a().size()) {
            wf.c(C0201.m82(33142) + ndVar.a().size() + C0201.m82(33143) + ndVar2.a().size());
        }
        int min = Math.min(ndVar.a().size(), ndVar2.a().size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new fc());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List<fc> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF b2 = ndVar.b();
        PointF b3 = ndVar2.b();
        e(zf.j(b2.x, b3.x, f), zf.j(b2.y, b3.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            fc fcVar = ndVar.a().get(size3);
            fc fcVar2 = ndVar2.a().get(size3);
            PointF a2 = fcVar.a();
            PointF b4 = fcVar.b();
            PointF c2 = fcVar.c();
            PointF a3 = fcVar2.a();
            PointF b5 = fcVar2.b();
            PointF c3 = fcVar2.c();
            this.a.get(size3).d(zf.j(a2.x, a3.x, f), zf.j(a2.y, a3.y, f));
            this.a.get(size3).e(zf.j(b4.x, b5.x, f), zf.j(b4.y, b5.y, f));
            this.a.get(size3).f(zf.j(c2.x, c3.x, f), zf.j(c2.y, c3.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return C0201.m82(33144) + this.a.size() + C0201.m82(33145) + this.c + '}';
    }

    public nd() {
        this.a = new ArrayList();
    }
}
