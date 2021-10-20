package defpackage;

import vigqyno.C0201;

/* renamed from: qd  reason: default package */
/* compiled from: ShapePath */
public class qd implements dd {
    private final String a;
    private final int b;
    private final vc c;
    private final boolean d;

    public qd(String str, int i, vc vcVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = vcVar;
        this.d = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new kb(gaVar, tdVar, this);
    }

    public String b() {
        return this.a;
    }

    public vc c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return C0201.m82(196) + this.a + C0201.m82(197) + this.b + '}';
    }
}
