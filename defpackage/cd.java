package defpackage;

import android.graphics.PointF;

/* renamed from: cd  reason: default package */
/* compiled from: CircleShape */
public class cd implements dd {
    private final String a;
    private final ad<PointF, PointF> b;
    private final tc c;
    private final boolean d;
    private final boolean e;

    public cd(String str, ad<PointF, PointF> adVar, tc tcVar, boolean z, boolean z2) {
        this.a = str;
        this.b = adVar;
        this.c = tcVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new za(gaVar, tdVar, this);
    }

    public String b() {
        return this.a;
    }

    public ad<PointF, PointF> c() {
        return this.b;
    }

    public tc d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
