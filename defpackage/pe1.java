package defpackage;

/* renamed from: pe1  reason: default package */
public final class pe1 implements o71<te1> {
    private static pe1 b = new pe1();
    private final o71<te1> a;

    private pe1(o71<te1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((te1) b.get()).a();
    }

    public static boolean b() {
        return ((te1) b.get()).c();
    }

    public static boolean c() {
        return ((te1) b.get()).b();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ te1 get() {
        return this.a.get();
    }

    public pe1() {
        this(n71.b(new se1()));
    }
}
