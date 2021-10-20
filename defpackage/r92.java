package defpackage;

/* renamed from: r92  reason: default package */
/* compiled from: CurrentParsingState */
public final class r92 {
    private int a = 0;
    private a b = a.NUMERIC;

    /* access modifiers changed from: private */
    /* renamed from: r92$a */
    /* compiled from: CurrentParsingState */
    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.a;
    }

    public void b(int i) {
        this.a += i;
    }

    public boolean c() {
        return this.b == a.ALPHA;
    }

    public boolean d() {
        return this.b == a.ISO_IEC_646;
    }

    public void e() {
        this.b = a.ALPHA;
    }

    public void f() {
        this.b = a.ISO_IEC_646;
    }

    public void g() {
        this.b = a.NUMERIC;
    }

    public void h(int i) {
        this.a = i;
    }
}
