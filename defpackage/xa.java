package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.nb;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: xa  reason: default package */
/* compiled from: ContentGroup */
public class xa implements ya, gb, nb.b, kc {
    private Paint a;
    private RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<wa> h;
    private final ga i;
    private List<gb> j;
    private bc k;

    public xa(ga gaVar, td tdVar, pd pdVar) {
        this(gaVar, tdVar, pdVar.c(), pdVar.d(), f(gaVar, tdVar, pdVar.b()), i(pdVar.b()));
    }

    private static List<wa> f(ga gaVar, td tdVar, List<dd> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            wa a2 = list.get(i2).a(gaVar, tdVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static zc i(List<dd> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            dd ddVar = list.get(i2);
            if (ddVar instanceof zc) {
                return (zc) ddVar;
            }
        }
        return null;
    }

    private boolean l() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            if ((this.h.get(i3) instanceof ya) && (i2 = i2 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gb
    public Path a() {
        this.c.reset();
        bc bcVar = this.k;
        if (bcVar != null) {
            this.c.set(bcVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            wa waVar = this.h.get(size);
            if (waVar instanceof gb) {
                this.d.addPath(((gb) waVar).a(), this.c);
            }
        }
        return this.d;
    }

    @Override // defpackage.nb.b
    public void b() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            wa waVar = this.h.get(size);
            waVar.c(arrayList, this.h.subList(0, size));
            arrayList.add(waVar);
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        if (jcVar.g(getName(), i2)) {
            if (!C0201.m82(16805).equals(getName())) {
                jcVar2 = jcVar2.a(getName());
                if (jcVar.c(getName(), i2)) {
                    list.add(jcVar2.i(this));
                }
            }
            if (jcVar.h(getName(), i2)) {
                int e2 = i2 + jcVar.e(getName(), i2);
                for (int i3 = 0; i3 < this.h.size(); i3++) {
                    wa waVar = this.h.get(i3);
                    if (waVar instanceof kc) {
                        ((kc) waVar).d(jcVar, e2, list, jcVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        bc bcVar = this.k;
        if (bcVar != null) {
            this.c.preConcat(bcVar.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            wa waVar = this.h.get(size);
            if (waVar instanceof ya) {
                ((ya) waVar).e(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // defpackage.ya
    public void g(Canvas canvas, Matrix matrix, int i2) {
        if (!this.g) {
            this.c.set(matrix);
            bc bcVar = this.k;
            if (bcVar != null) {
                this.c.preConcat(bcVar.f());
                i2 = (int) ((((((float) (this.k.h() == null ? 100 : this.k.h().h().intValue())) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
            }
            boolean z = this.i.G() && l() && i2 != 255;
            if (z) {
                this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
                e(this.b, this.c, true);
                this.a.setAlpha(i2);
                ag.m(canvas, this.b, this.a);
            }
            if (z) {
                i2 = 255;
            }
            for (int size = this.h.size() - 1; size >= 0; size--) {
                wa waVar = this.h.get(size);
                if (waVar instanceof ya) {
                    ((ya) waVar).g(canvas, this.c, i2);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.f;
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        bc bcVar = this.k;
        if (bcVar != null) {
            bcVar.c(t, dgVar);
        }
    }

    public List<gb> j() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                wa waVar = this.h.get(i2);
                if (waVar instanceof gb) {
                    this.j.add((gb) waVar);
                }
            }
        }
        return this.j;
    }

    public Matrix k() {
        bc bcVar = this.k;
        if (bcVar != null) {
            return bcVar.f();
        }
        this.c.reset();
        return this.c;
    }

    public xa(ga gaVar, td tdVar, String str, boolean z, List<wa> list, zc zcVar) {
        this.a = new ta();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = gaVar;
        this.g = z;
        this.h = list;
        if (zcVar != null) {
            bc b2 = zcVar.b();
            this.k = b2;
            b2.a(tdVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            wa waVar = list.get(size);
            if (waVar instanceof db) {
                arrayList.add((db) waVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((db) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
