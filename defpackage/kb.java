package defpackage;

import android.graphics.Path;
import defpackage.nb;
import defpackage.sd;
import java.util.List;

/* renamed from: kb  reason: default package */
/* compiled from: ShapeContent */
public class kb implements gb, nb.b {
    private final Path a = new Path();
    private final String b;
    private final boolean c;
    private final ga d;
    private final nb<?, Path> e;
    private boolean f;
    private va g = new va();

    public kb(ga gaVar, td tdVar, qd qdVar) {
        this.b = qdVar.b();
        this.c = qdVar.d();
        this.d = gaVar;
        nb<nd, Path> a2 = qdVar.c().a();
        this.e = a2;
        tdVar.j(a2);
        this.e.a(this);
    }

    private void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.gb
    public Path a() {
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.f = true;
            return this.a;
        }
        this.a.set(this.e.h());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(this.a);
        this.f = true;
        return this.a;
    }

    @Override // defpackage.nb.b
    public void b() {
        d();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i = 0; i < list.size(); i++) {
            wa waVar = list.get(i);
            if (waVar instanceof mb) {
                mb mbVar = (mb) waVar;
                if (mbVar.j() == sd.a.SIMULTANEOUSLY) {
                    this.g.a(mbVar);
                    mbVar.d(this);
                }
            }
        }
    }

    @Override // defpackage.wa
    public String getName() {
        return this.b;
    }
}
