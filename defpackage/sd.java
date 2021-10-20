package defpackage;

import vigqyno.C0201;

/* renamed from: sd  reason: default package */
/* compiled from: ShapeTrimPath */
public class sd implements dd {
    private final String a;
    private final a b;
    private final pc c;
    private final pc d;
    private final pc e;
    private final boolean f;

    /* renamed from: sd$a */
    /* compiled from: ShapeTrimPath */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public sd(String str, a aVar, pc pcVar, pc pcVar2, pc pcVar3, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = pcVar;
        this.d = pcVar2;
        this.e = pcVar3;
        this.f = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new mb(tdVar, this);
    }

    public pc b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public pc d() {
        return this.e;
    }

    public pc e() {
        return this.c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return C0201.m82(4949) + this.c + C0201.m82(4950) + this.d + C0201.m82(4951) + this.e + C0201.m82(4952);
    }
}
