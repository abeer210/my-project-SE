package defpackage;

import android.graphics.Path;
import vigqyno.C0201;

/* renamed from: od  reason: default package */
/* compiled from: ShapeFill */
public class od implements dd {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final oc d;
    private final rc e;
    private final boolean f;

    public od(String str, boolean z, Path.FillType fillType, oc ocVar, rc rcVar, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = ocVar;
        this.e = rcVar;
        this.f = z2;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new ab(gaVar, tdVar, this);
    }

    public oc b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public rc e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return C0201.m82(35228) + this.a + '}';
    }
}
