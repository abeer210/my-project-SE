package defpackage;

import android.graphics.PointF;
import vigqyno.C0201;

/* renamed from: ld  reason: default package */
/* compiled from: RectangleShape */
public class ld implements dd {
    private final String a;
    private final ad<PointF, PointF> b;
    private final tc c;
    private final pc d;
    private final boolean e;

    public ld(String str, ad<PointF, PointF> adVar, tc tcVar, pc pcVar, boolean z) {
        this.a = str;
        this.b = adVar;
        this.c = tcVar;
        this.d = pcVar;
        this.e = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new ib(gaVar, tdVar, this);
    }

    public pc b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public ad<PointF, PointF> d() {
        return this.b;
    }

    public tc e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return C0201.m82(28829) + this.b + C0201.m82(28830) + this.c + '}';
    }
}
