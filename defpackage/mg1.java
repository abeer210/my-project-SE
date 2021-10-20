package defpackage;

/* renamed from: mg1  reason: default package */
public final class mg1 implements o71<lg1> {
    private static mg1 b = new mg1();
    private final o71<lg1> a;

    private mg1(o71<lg1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((lg1) b.get()).b();
    }

    public static boolean b() {
        return ((lg1) b.get()).c();
    }

    public static boolean c() {
        return ((lg1) b.get()).d();
    }

    public static boolean d() {
        return ((lg1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ lg1 get() {
        return this.a.get();
    }

    public mg1() {
        this(n71.b(new og1()));
    }
}
