package defpackage;

import defpackage.nb;
import defpackage.sd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mb  reason: default package */
/* compiled from: TrimPathContent */
public class mb implements wa, nb.b {
    private final String a;
    private final boolean b;
    private final List<nb.b> c = new ArrayList();
    private final sd.a d;
    private final nb<?, Float> e;
    private final nb<?, Float> f;
    private final nb<?, Float> g;

    public mb(td tdVar, sd sdVar) {
        this.a = sdVar.c();
        this.b = sdVar.g();
        this.d = sdVar.f();
        this.e = sdVar.e().a();
        this.f = sdVar.b().a();
        this.g = sdVar.d().a();
        tdVar.j(this.e);
        tdVar.j(this.f);
        tdVar.j(this.g);
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
    }

    @Override // defpackage.nb.b
    public void b() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).b();
        }
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
    }

    public void d(nb.b bVar) {
        this.c.add(bVar);
    }

    public nb<?, Float> f() {
        return this.f;
    }

    @Override // defpackage.wa
    public String getName() {
        return this.a;
    }

    public nb<?, Float> h() {
        return this.g;
    }

    public nb<?, Float> i() {
        return this.e;
    }

    public sd.a j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }
}
