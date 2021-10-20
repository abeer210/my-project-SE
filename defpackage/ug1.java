package defpackage;

/* renamed from: ug1  reason: default package */
public final class ug1 implements o71<xg1> {
    private static ug1 b = new ug1();
    private final o71<xg1> a;

    private ug1(o71<xg1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((xg1) b.get()).a();
    }

    public static boolean b() {
        return ((xg1) b.get()).b();
    }

    public static boolean c() {
        return ((xg1) b.get()).c();
    }

    public static boolean d() {
        return ((xg1) b.get()).d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ xg1 get() {
        return this.a.get();
    }

    public ug1() {
        this(n71.b(new wg1()));
    }
}
