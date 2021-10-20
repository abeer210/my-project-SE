package defpackage;

/* renamed from: we1  reason: default package */
public final class we1 implements o71<ze1> {
    private static we1 b = new we1();
    private final o71<ze1> a;

    private we1(o71<ze1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((ze1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ ze1 get() {
        return this.a.get();
    }

    public we1() {
        this(n71.b(new ye1()));
    }
}
