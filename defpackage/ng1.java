package defpackage;

/* renamed from: ng1  reason: default package */
public final class ng1 implements o71<qg1> {
    private static ng1 b = new ng1();
    private final o71<qg1> a;

    private ng1(o71<qg1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((qg1) b.get()).a();
    }

    public static boolean b() {
        return ((qg1) b.get()).b();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ qg1 get() {
        return this.a.get();
    }

    public ng1() {
        this(n71.b(new pg1()));
    }
}
