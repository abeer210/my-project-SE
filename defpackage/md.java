package defpackage;

/* renamed from: md  reason: default package */
/* compiled from: Repeater */
public class md implements dd {
    private final String a;
    private final pc b;
    private final pc c;
    private final zc d;
    private final boolean e;

    public md(String str, pc pcVar, pc pcVar2, zc zcVar, boolean z) {
        this.a = str;
        this.b = pcVar;
        this.c = pcVar2;
        this.d = zcVar;
        this.e = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new jb(gaVar, tdVar, this);
    }

    public pc b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public pc d() {
        return this.c;
    }

    public zc e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}
