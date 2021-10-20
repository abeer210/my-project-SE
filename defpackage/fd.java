package defpackage;

import android.graphics.Path;

/* renamed from: fd  reason: default package */
/* compiled from: GradientFill */
public class fd implements dd {
    private final hd a;
    private final Path.FillType b;
    private final qc c;
    private final rc d;
    private final tc e;
    private final tc f;
    private final String g;
    private final boolean h;

    public fd(String str, hd hdVar, Path.FillType fillType, qc qcVar, rc rcVar, tc tcVar, tc tcVar2, pc pcVar, pc pcVar2, boolean z) {
        this.a = hdVar;
        this.b = fillType;
        this.c = qcVar;
        this.d = rcVar;
        this.e = tcVar;
        this.f = tcVar2;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new bb(gaVar, tdVar, this);
    }

    public tc b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public qc d() {
        return this.c;
    }

    public hd e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public rc g() {
        return this.d;
    }

    public tc h() {
        return this.e;
    }

    public boolean i() {
        return this.h;
    }
}
