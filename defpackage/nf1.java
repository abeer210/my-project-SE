package defpackage;

/* renamed from: nf1  reason: default package */
public final class nf1 implements o71<mf1> {
    private static nf1 b = new nf1();
    private final o71<mf1> a;

    private nf1(o71<mf1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((mf1) b.get()).b();
    }

    public static boolean b() {
        return ((mf1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ mf1 get() {
        return this.a.get();
    }

    public nf1() {
        this(n71.b(new pf1()));
    }
}
