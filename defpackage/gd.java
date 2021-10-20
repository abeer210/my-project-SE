package defpackage;

import defpackage.rd;
import java.util.List;

/* renamed from: gd  reason: default package */
/* compiled from: GradientStroke */
public class gd implements dd {
    private final String a;
    private final hd b;
    private final qc c;
    private final rc d;
    private final tc e;
    private final tc f;
    private final pc g;
    private final rd.b h;
    private final rd.c i;
    private final float j;
    private final List<pc> k;
    private final pc l;
    private final boolean m;

    public gd(String str, hd hdVar, qc qcVar, rc rcVar, tc tcVar, tc tcVar2, pc pcVar, rd.b bVar, rd.c cVar, float f2, List<pc> list, pc pcVar2, boolean z) {
        this.a = str;
        this.b = hdVar;
        this.c = qcVar;
        this.d = rcVar;
        this.e = tcVar;
        this.f = tcVar2;
        this.g = pcVar;
        this.h = bVar;
        this.i = cVar;
        this.j = f2;
        this.k = list;
        this.l = pcVar2;
        this.m = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new cb(gaVar, tdVar, this);
    }

    public rd.b b() {
        return this.h;
    }

    public pc c() {
        return this.l;
    }

    public tc d() {
        return this.f;
    }

    public qc e() {
        return this.c;
    }

    public hd f() {
        return this.b;
    }

    public rd.c g() {
        return this.i;
    }

    public List<pc> h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public rc k() {
        return this.d;
    }

    public tc l() {
        return this.e;
    }

    public pc m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}
